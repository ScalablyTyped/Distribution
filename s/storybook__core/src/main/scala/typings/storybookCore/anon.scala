package typings.storybookCore

import typings.node.NodeModule
import typings.storybookAddons.typesMod.DecorateStoryFunction
import typings.storybookAddons.typesMod.DecoratorFunction
import typings.storybookAddons.typesMod.StoryFn
import typings.storybookClientApi.mod.ConfigApi
import typings.storybookClientApi.typesMod.RenderContext
import typings.storybookClientApi.typesMod.RenderContextWithoutStoryContext
import typings.storybookCore.storyRendererMod.RenderMetadata
import typings.storybookCore.storybookCoreStrings.`sb-main-centered`
import typings.storybookCore.storybookCoreStrings.`sb-main-fullscreen`
import typings.storybookCore.storybookCoreStrings.`sb-main-padded`
import typings.storybookCore.typesMod.Loadable
import typings.storybookCore.typesMod.RenderStoryFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Centered extends StObject {
    
    val centered: `sb-main-centered`
    
    val fullscreen: `sb-main-fullscreen`
    
    val padded: `sb-main-padded`
  }
  object Centered {
    
    @scala.inline
    def apply(): Centered = {
      val __obj = js.Dynamic.literal(centered = "sb-main-centered", fullscreen = "sb-main-fullscreen", padded = "sb-main-padded")
      __obj.asInstanceOf[Centered]
    }
    
    @scala.inline
    implicit class CenteredMutableBuilder[Self <: Centered] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCentered(value: `sb-main-centered`): Self = StObject.set(x, "centered", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFullscreen(value: `sb-main-fullscreen`): Self = StObject.set(x, "fullscreen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPadded(value: `sb-main-padded`): Self = StObject.set(x, "padded", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Channel extends StObject {
    
    var channel: typings.storybookAddons.mod.Channel = js.native
    
    var clientApi: typings.storybookClientApi.mod.ClientApi = js.native
    
    var configApi: ConfigApi = js.native
    
    def configure(framework: String, loadable: Loadable, m: NodeModule): Unit = js.native
    def configure(framework: String, loadable: Loadable, m: NodeModule, showDeprecationWarning: Boolean): Unit = js.native
    
    def forceReRender(): Unit = js.native
  }
  
  trait ClientApi extends StObject {
    
    var clientApi: typings.storybookClientApi.mod.ClientApi
    
    var configApi: ConfigApi
    
    var storyStore: typings.storybookClientApi.mod.StoryStore
  }
  object ClientApi {
    
    @scala.inline
    def apply(
      clientApi: typings.storybookClientApi.mod.ClientApi,
      configApi: ConfigApi,
      storyStore: typings.storybookClientApi.mod.StoryStore
    ): ClientApi = {
      val __obj = js.Dynamic.literal(clientApi = clientApi.asInstanceOf[js.Any], configApi = configApi.asInstanceOf[js.Any], storyStore = storyStore.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClientApi]
    }
    
    @scala.inline
    implicit class ClientApiMutableBuilder[Self <: ClientApi] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClientApi(value: typings.storybookClientApi.mod.ClientApi): Self = StObject.set(x, "clientApi", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfigApi(value: ConfigApi): Self = StObject.set(x, "configApi", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStoryStore(value: typings.storybookClientApi.mod.StoryStore): Self = StObject.set(x, "storyStore", value.asInstanceOf[js.Any])
    }
  }
  
  trait Context extends StObject {
    
    var context: RenderContextWithoutStoryContext
    
    var metadata: RenderMetadata
  }
  object Context {
    
    @scala.inline
    def apply(context: RenderContextWithoutStoryContext, metadata: RenderMetadata): Context = {
      val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[Context]
    }
    
    @scala.inline
    implicit class ContextMutableBuilder[Self <: Context] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContext(value: RenderContextWithoutStoryContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadata(value: RenderMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    }
  }
  
  trait ContextRenderContextWithoutStoryContext extends StObject {
    
    var context: RenderContextWithoutStoryContext
  }
  object ContextRenderContextWithoutStoryContext {
    
    @scala.inline
    def apply(context: RenderContextWithoutStoryContext): ContextRenderContextWithoutStoryContext = {
      val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContextRenderContextWithoutStoryContext]
    }
    
    @scala.inline
    implicit class ContextRenderContextWithoutStoryContextMutableBuilder[Self <: ContextRenderContextWithoutStoryContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContext(value: RenderContextWithoutStoryContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    }
  }
  
  trait DecorateStory extends StObject {
    
    var decorateStory: js.UndefOr[DecorateStoryFunction[js.Any]] = js.undefined
  }
  object DecorateStory {
    
    @scala.inline
    def apply(): DecorateStory = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DecorateStory]
    }
    
    @scala.inline
    implicit class DecorateStoryMutableBuilder[Self <: DecorateStory] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDecorateStory(
        value: (/* storyFn */ StoryFn[js.Any], /* decorators */ js.Array[DecoratorFunction[js.Any]]) => StoryFn[js.Any]
      ): Self = StObject.set(x, "decorateStory", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDecorateStoryUndefined: Self = StObject.set(x, "decorateStory", js.undefined)
    }
  }
  
  trait Description extends StObject {
    
    var description: String
    
    var title: String
  }
  object Description {
    
    @scala.inline
    def apply(description: String, title: String): Description = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[Description]
    }
    
    @scala.inline
    implicit class DescriptionMutableBuilder[Self <: Description] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  trait Message extends StObject {
    
    var message: js.UndefOr[String] = js.undefined
    
    var stack: js.UndefOr[String] = js.undefined
  }
  object Message {
    
    @scala.inline
    def apply(): Message = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Message]
    }
    
    @scala.inline
    implicit class MessageMutableBuilder[Self <: Message] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      @scala.inline
      def setStack(value: String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
    }
  }
  
  trait Render extends StObject {
    
    var channel: js.UndefOr[typings.storybookAddons.mod.Channel] = js.undefined
    
    var render: RenderStoryFunction
    
    var storyStore: typings.storybookClientApi.mod.StoryStore
  }
  object Render {
    
    @scala.inline
    def apply(render: /* context */ RenderContext => Unit, storyStore: typings.storybookClientApi.mod.StoryStore): Render = {
      val __obj = js.Dynamic.literal(render = js.Any.fromFunction1(render), storyStore = storyStore.asInstanceOf[js.Any])
      __obj.asInstanceOf[Render]
    }
    
    @scala.inline
    implicit class RenderMutableBuilder[Self <: Render] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChannel(value: typings.storybookAddons.mod.Channel): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChannelUndefined: Self = StObject.set(x, "channel", js.undefined)
      
      @scala.inline
      def setRender(value: /* context */ RenderContext => Unit): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStoryStore(value: typings.storybookClientApi.mod.StoryStore): Self = StObject.set(x, "storyStore", value.asInstanceOf[js.Any])
    }
  }
  
  trait StoryStore extends StObject {
    
    var context: RenderContextWithoutStoryContext
    
    var storyStore: typings.storybookClientApi.mod.StoryStore
  }
  object StoryStore {
    
    @scala.inline
    def apply(context: RenderContextWithoutStoryContext, storyStore: typings.storybookClientApi.mod.StoryStore): StoryStore = {
      val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], storyStore = storyStore.asInstanceOf[js.Any])
      __obj.asInstanceOf[StoryStore]
    }
    
    @scala.inline
    implicit class StoryStoreMutableBuilder[Self <: StoryStore] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContext(value: RenderContextWithoutStoryContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStoryStore(value: typings.storybookClientApi.mod.StoryStore): Self = StObject.set(x, "storyStore", value.asInstanceOf[js.Any])
    }
  }
}
