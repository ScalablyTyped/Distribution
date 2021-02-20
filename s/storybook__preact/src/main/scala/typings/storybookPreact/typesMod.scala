package typings.storybookPreact

import typings.node.NodeModule
import typings.preact.jsxMod.JSXInternal.Element
import typings.std.Node
import typings.storybookAddons.typesMod.ClientStoryApi
import typings.storybookAddons.typesMod.DecoratorFunction
import typings.storybookAddons.typesMod.Loadable
import typings.storybookAddons.typesMod.Parameters
import typings.storybookAddons.typesMod.StoryApi
import typings.storybookAddons.typesMod.StoryKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  @js.native
  trait ClientApi extends ClientStoryApi[StoryFnPreactReturnType] {
    
    def clearDecorators(): Unit = js.native
    
    def configure(loader: Loadable, module: NodeModule): Unit = js.native
    
    def forceReRender(): Unit = js.native
    
    def getStorybook(): js.Array[IStorybookSection] = js.native
    
    def load(args: js.Any*): Unit = js.native
    
    def raw(): js.Any = js.native
    
    def setAddon(addon: js.Any): Unit = js.native
  }
  object ClientApi {
    
    @scala.inline
    def apply(
      addDecorator: DecoratorFunction[StoryFnPreactReturnType] => StoryApi[StoryFnPreactReturnType],
      addParameters: Parameters => StoryApi[StoryFnPreactReturnType],
      clearDecorators: () => Unit,
      configure: (Loadable, NodeModule) => Unit,
      forceReRender: () => Unit,
      getStorybook: () => js.Array[IStorybookSection],
      load: /* repeated */ js.Any => Unit,
      raw: () => js.Any,
      setAddon: js.Any => Unit,
      storiesOf: (StoryKind, NodeModule) => StoryApi[StoryFnPreactReturnType]
    ): ClientApi = {
      val __obj = js.Dynamic.literal(addDecorator = js.Any.fromFunction1(addDecorator), addParameters = js.Any.fromFunction1(addParameters), clearDecorators = js.Any.fromFunction0(clearDecorators), configure = js.Any.fromFunction2(configure), forceReRender = js.Any.fromFunction0(forceReRender), getStorybook = js.Any.fromFunction0(getStorybook), load = js.Any.fromFunction1(load), raw = js.Any.fromFunction0(raw), setAddon = js.Any.fromFunction1(setAddon), storiesOf = js.Any.fromFunction2(storiesOf))
      __obj.asInstanceOf[ClientApi]
    }
    
    @scala.inline
    implicit class ClientApiMutableBuilder[Self <: ClientApi] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClearDecorators(value: () => Unit): Self = StObject.set(x, "clearDecorators", js.Any.fromFunction0(value))
      
      @scala.inline
      def setConfigure(value: (Loadable, NodeModule) => Unit): Self = StObject.set(x, "configure", js.Any.fromFunction2(value))
      
      @scala.inline
      def setForceReRender(value: () => Unit): Self = StObject.set(x, "forceReRender", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetStorybook(value: () => js.Array[IStorybookSection]): Self = StObject.set(x, "getStorybook", js.Any.fromFunction0(value))
      
      @scala.inline
      def setLoad(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "load", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRaw(value: () => js.Any): Self = StObject.set(x, "raw", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSetAddon(value: js.Any => Unit): Self = StObject.set(x, "setAddon", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait IStorybookSection extends StObject {
    
    var kind: String = js.native
    
    var stories: js.Array[IStorybookStory] = js.native
  }
  object IStorybookSection {
    
    @scala.inline
    def apply(kind: String, stories: js.Array[IStorybookStory]): IStorybookSection = {
      val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], stories = stories.asInstanceOf[js.Any])
      __obj.asInstanceOf[IStorybookSection]
    }
    
    @scala.inline
    implicit class IStorybookSectionMutableBuilder[Self <: IStorybookSection] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStories(value: js.Array[IStorybookStory]): Self = StObject.set(x, "stories", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStoriesVarargs(value: IStorybookStory*): Self = StObject.set(x, "stories", js.Array(value :_*))
    }
  }
  
  @js.native
  trait IStorybookStory extends StObject {
    
    var name: String = js.native
    
    def render(): js.Any = js.native
  }
  object IStorybookStory {
    
    @scala.inline
    def apply(name: String, render: () => js.Any): IStorybookStory = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], render = js.Any.fromFunction0(render))
      __obj.asInstanceOf[IStorybookStory]
    }
    
    @scala.inline
    implicit class IStorybookStoryMutableBuilder[Self <: IStorybookStory] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRender(value: () => js.Any): Self = StObject.set(x, "render", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait ShowErrorArgs extends StObject {
    
    var description: String = js.native
    
    var title: String = js.native
  }
  object ShowErrorArgs {
    
    @scala.inline
    def apply(description: String, title: String): ShowErrorArgs = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[ShowErrorArgs]
    }
    
    @scala.inline
    implicit class ShowErrorArgsMutableBuilder[Self <: ShowErrorArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  type StoryFnPreactReturnType = String | Node | Element
}
