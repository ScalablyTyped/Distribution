package typings.storybookPreviewWeb

import typings.std.KeyboardEvent
import typings.storybookPreviewWeb.anon.Description
import typings.storybookPreviewWeb.anon.PersistedArgs
import typings.storybookPreviewWeb.anon.ShowError
import typings.storybookPreviewWeb.anon.ViewModeChanged
import typings.storybookPreviewWeb.anon.`1`
import typings.storybookPreviewWeb.distTs3Dot9PreviewMod.Preview
import typings.storybookPreviewWeb.distTs3Dot9StoryRenderMod.Render
import typings.storybookPreviewWeb.distTs3Dot9UrlStoreMod.UrlStore
import typings.storybookPreviewWeb.distTs3Dot9WebViewMod.WebView
import typings.storybookStore.distTs3Dot9TypesMod.Selection
import typings.storybookStore.distTs3Dot9TypesMod.StorySpecifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTs3Dot9PreviewWebMod {
  
  @JSImport("@storybook/preview-web/dist/ts3.9/PreviewWeb", "PreviewWeb")
  @js.native
  open class PreviewWeb[TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */] () extends Preview[TFramework] {
    
    var currentRender: Render[TFramework] = js.native
    
    var currentSelection: Selection = js.native
    
    def mainStoryCallbacks(
      storyId: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryId */ Any
    ): ShowError = js.native
    
    def onGetProjectAnnotationsChanged(hasGetProjectAnnotations: `1`): js.Promise[Unit] = js.native
    
    def onKeydown(event: KeyboardEvent): Unit = js.native
    
    def onPreloadStories(ids: js.Array[String]): js.Promise[Unit] = js.native
    
    def onSetCurrentStory(selection: Selection): Unit = js.native
    
    def onUpdateQueryParams(queryParams: Any): Unit = js.native
    
    def renderError(
      storyId: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryId */ Any,
      hasTitleDescription: Description
    ): Unit = js.native
    
    def renderException(
      storyId: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryId */ Any,
      err: js.Error
    ): Unit = js.native
    
    def renderMissingStory(): Unit = js.native
    
    def renderSelection(): js.Promise[Unit] = js.native
    def renderSelection(hasPersistedArgs: PersistedArgs): js.Promise[Unit] = js.native
    
    def renderStoryLoadingException(storySpecifier: StorySpecifier, err: js.Error): Unit = js.native
    
    def selectSpecifiedStory(): js.Promise[Unit] = js.native
    
    def teardownRender(render: Render[TFramework]): js.Promise[Unit] = js.native
    def teardownRender(render: Render[TFramework], hasViewModeChanged: ViewModeChanged): js.Promise[Unit] = js.native
    
    var urlStore: UrlStore = js.native
    
    var view: WebView = js.native
  }
  
  type MaybePromise[T] = js.Promise[T] | T
}
