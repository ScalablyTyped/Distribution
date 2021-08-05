package typings.storybookCore

import typings.std.Error
import typings.storybookAddons.mod.Channel
import typings.storybookAddons.typesMod.StoryFn
import typings.storybookAddons.typesMod.StoryId
import typings.storybookAddons.typesMod.StoryKind
import typings.storybookAddons.typesMod.ViewMode
import typings.storybookCore.anon.Context
import typings.storybookCore.anon.ContextRenderContextWithoutStoryContext
import typings.storybookCore.anon.Description
import typings.storybookCore.anon.Message
import typings.storybookCore.anon.Render
import typings.storybookCore.anon.StoryStore
import typings.storybookCore.storybookCoreStrings.`sb-main-centered`
import typings.storybookCore.storybookCoreStrings.`sb-main-fullscreen`
import typings.storybookCore.storybookCoreStrings.`sb-main-padded`
import typings.storybookCore.storybookCoreStrings.centered
import typings.storybookCore.storybookCoreStrings.fullscreen
import typings.storybookCore.storybookCoreStrings.padded
import typings.storybookCore.typesMod.RenderStoryFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object storyRendererMod {
  
  @JSImport("@storybook/core/dist/client/preview/StoryRenderer", "StoryRenderer")
  @js.native
  class StoryRenderer protected () extends StObject {
    def this(hasRenderChannelStoryStore: Render) = this()
    
    def applyLayout(): Unit = js.native
    def applyLayout(layout: Layout): Unit = js.native
    
    var channel: js.UndefOr[Channel] = js.native
    
    def checkIfLayoutExists(layout: /* keyof @storybook/core.anon.Centered */ centered | fullscreen | padded): Unit = js.native
    
    def forceReRender(): Unit = js.native
    
    var previousLayoutClass: js.UndefOr[`sb-main-centered` | `sb-main-fullscreen` | `sb-main-padded` | Null] = js.native
    
    var previousMetadata: js.UndefOr[RenderMetadata] = js.native
    
    var render: RenderStoryFunction = js.native
    
    def renderCurrentStory(forceRender: Boolean): js.Promise[Unit] = js.native
    
    def renderDocs(hasContextStoryStore: StoryStore): Unit = js.native
    
    def renderError(hasTitleDescription: Description): Unit = js.native
    
    def renderException(err: Error): Unit = js.native
    
    def renderStory(hasContextHasIdGetDecorated: ContextRenderContextWithoutStoryContext): js.Promise[Unit] = js.native
    
    def renderStoryIfChanged(hasMetadataContext: Context): js.Promise[Unit] = js.native
    
    def setupListeners(): Unit = js.native
    
    def showDocs(): Unit = js.native
    
    def showErrorDisplay(hasMessageStack: Message): Unit = js.native
    
    def showMain(): Unit = js.native
    
    def showNoPreview(): Unit = js.native
    
    def showStory(): Unit = js.native
    
    var storyStore: typings.storybookClientApi.mod.StoryStore = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.storybookCore.storybookCoreStrings.centered
    - typings.storybookCore.storybookCoreStrings.fullscreen
    - typings.storybookCore.storybookCoreStrings.padded
    - typings.storybookCore.storybookCoreStrings.none
  */
  trait Layout extends StObject
  
  trait RenderMetadata extends StObject {
    
    def getDecorated(): StoryFn[js.Any]
    
    var id: StoryId
    
    var kind: StoryKind
    
    var viewMode: ViewMode
  }
  object RenderMetadata {
    
    inline def apply(getDecorated: () => StoryFn[js.Any], id: StoryId, kind: StoryKind, viewMode: ViewMode): RenderMetadata = {
      val __obj = js.Dynamic.literal(getDecorated = js.Any.fromFunction0(getDecorated), id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], viewMode = viewMode.asInstanceOf[js.Any])
      __obj.asInstanceOf[RenderMetadata]
    }
    
    extension [Self <: RenderMetadata](x: Self) {
      
      inline def setGetDecorated(value: () => StoryFn[js.Any]): Self = StObject.set(x, "getDecorated", js.Any.fromFunction0(value))
      
      inline def setId(value: StoryId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setKind(value: StoryKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setViewMode(value: ViewMode): Self = StObject.set(x, "viewMode", value.asInstanceOf[js.Any])
    }
  }
}
