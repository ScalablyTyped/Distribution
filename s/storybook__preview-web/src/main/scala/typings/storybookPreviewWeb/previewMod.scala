package typings.storybookPreviewWeb

import typings.std.Element
import typings.std.HTMLElement
import typings.std.Record
import typings.storybookAddons.mod.Channel
import typings.storybookPreviewWeb.anon.ArgNames
import typings.storybookPreviewWeb.anon.GetProjectAnnotations
import typings.storybookPreviewWeb.anon.Globals
import typings.storybookPreviewWeb.anon.ImportFn
import typings.storybookPreviewWeb.anon.IncludeDocsOnly
import typings.storybookPreviewWeb.anon.ShowError
import typings.storybookPreviewWeb.anon.StoryId
import typings.storybookPreviewWeb.anon.StoryIdAny
import typings.storybookPreviewWeb.anon.ViewModeChanged
import typings.storybookPreviewWeb.anon.`0`
import typings.storybookPreviewWeb.docsRenderMod.DocsRender
import typings.storybookPreviewWeb.storyRenderMod.StoryRender
import typings.storybookStore.mod.StoryStore
import typings.storybookStore.ts39TypesMod.ModuleImportFn
import typings.storybookStore.ts39TypesMod.PromiseLike
import typings.storybookStore.ts39TypesMod.RenderContext
import typings.storybookStore.ts39TypesMod.Story
import typings.storybookStore.ts39TypesMod.StoryIndex
import typings.storybookStore.ts39TypesMod.WebProjectAnnotations
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object previewMod {
  
  @JSImport("@storybook/preview-web/dist/ts3.9/Preview", "Preview")
  @js.native
  open class Preview[TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */] () extends StObject {
    
    var channel: Channel = js.native
    
    def emitGlobals(): Unit = js.native
    
    def extract(): js.Promise[
        Record[
          String, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_csf.StoryContextForEnhancers<TFramework, Args> */ Any
        ]
      ] = js.native
    def extract(options: IncludeDocsOnly): js.Promise[
        Record[
          String, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_csf.StoryContextForEnhancers<TFramework, Args> */ Any
        ]
      ] = js.native
    
    def getProjectAnnotationsOrRenderError(getProjectAnnotations: js.Function0[MaybePromise[WebProjectAnnotations[TFramework]]]): PromiseLike[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ProjectAnnotations<TFramework> */ Any
      ] = js.native
    
    var getStoryIndex: js.UndefOr[js.Function0[StoryIndex]] = js.native
    
    def getStoryIndexFromServer(): js.Promise[StoryIndex] = js.native
    
    var importFn: js.UndefOr[ModuleImportFn] = js.native
    
    def initialize(hasGetStoryIndexImportFnGetProjectAnnotations: GetProjectAnnotations[TFramework]): js.Promise[Unit] = js.native
    
    def initializeWithProjectAnnotations(projectAnnotations: WebProjectAnnotations[TFramework]): js.Promise[Unit] = js.native
    
    def initializeWithStoryIndex(storyIndex: StoryIndex): PromiseLike[Unit] = js.native
    
    def inlineStoryCallbacks(
      storyId: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryId */ Any
    ): ShowError = js.native
    
    def onForceReRender(): js.Promise[Unit] = js.native
    
    def onForceRemount(hasStoryId: StoryIdAny): js.Promise[Unit] = js.native
    
    def onGetProjectAnnotationsChanged(hasGetProjectAnnotations: `0`): js.Promise[Unit] = js.native
    
    def onResetArgs(hasStoryIdArgNames: ArgNames): js.Promise[Unit] = js.native
    
    def onStoriesChanged(hasImportFnStoryIndex: ImportFn): js.Promise[Unit] = js.native
    
    def onStoryIndexChanged(): js.Promise[Unit] = js.native
    
    def onUpdateArgs(hasStoryIdUpdatedArgs: StoryId): js.Promise[Unit] = js.native
    
    def onUpdateGlobals(hasGlobals: Globals): js.Promise[Unit] = js.native
    
    var previewEntryError: js.UndefOr[js.Error] = js.native
    
    def renderPreviewEntryError(reason: String, err: js.Error): Unit = js.native
    
    def renderStoryToElement(story: Story[TFramework], element: HTMLElement): js.Function0[js.Promise[Unit]] = js.native
    
    var renderToDOM: js.UndefOr[
        js.Function2[
          /* context */ RenderContext[TFramework], 
          /* element */ Element, 
          js.Promise[Unit] | Unit
        ]
      ] = js.native
    
    var serverChannel: js.UndefOr[Channel] = js.native
    
    def setInitialGlobals(): js.Promise[Unit] = js.native
    
    def setupListeners(): Unit = js.native
    
    var storyRenders: js.Array[StoryRender[TFramework]] = js.native
    
    var storyStore: StoryStore[TFramework] = js.native
    
    def teardownRender(render: DocsRender[TFramework]): js.Promise[Unit] = js.native
    def teardownRender(render: DocsRender[TFramework], hasViewModeChanged: ViewModeChanged): js.Promise[Unit] = js.native
    def teardownRender(render: StoryRender[TFramework]): js.Promise[Unit] = js.native
    def teardownRender(render: StoryRender[TFramework], hasViewModeChanged: ViewModeChanged): js.Promise[Unit] = js.native
  }
  
  type MaybePromise[T] = js.Promise[T] | T
}
