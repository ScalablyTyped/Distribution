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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  trait ClientApi
    extends StObject
       with ClientStoryApi[StoryFnPreactReturnType] {
    
    def clearDecorators(): Unit
    
    def configure(loader: Loadable, module: NodeModule): Unit
    
    def forceReRender(): Unit
    
    def getStorybook(): js.Array[IStorybookSection]
    
    def load(args: js.Any*): Unit
    
    def raw(): js.Any
    
    def setAddon(addon: js.Any): Unit
  }
  object ClientApi {
    
    inline def apply(
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
    
    extension [Self <: ClientApi](x: Self) {
      
      inline def setClearDecorators(value: () => Unit): Self = StObject.set(x, "clearDecorators", js.Any.fromFunction0(value))
      
      inline def setConfigure(value: (Loadable, NodeModule) => Unit): Self = StObject.set(x, "configure", js.Any.fromFunction2(value))
      
      inline def setForceReRender(value: () => Unit): Self = StObject.set(x, "forceReRender", js.Any.fromFunction0(value))
      
      inline def setGetStorybook(value: () => js.Array[IStorybookSection]): Self = StObject.set(x, "getStorybook", js.Any.fromFunction0(value))
      
      inline def setLoad(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "load", js.Any.fromFunction1(value))
      
      inline def setRaw(value: () => js.Any): Self = StObject.set(x, "raw", js.Any.fromFunction0(value))
      
      inline def setSetAddon(value: js.Any => Unit): Self = StObject.set(x, "setAddon", js.Any.fromFunction1(value))
    }
  }
  
  trait IStorybookSection extends StObject {
    
    var kind: String
    
    var stories: js.Array[IStorybookStory]
  }
  object IStorybookSection {
    
    inline def apply(kind: String, stories: js.Array[IStorybookStory]): IStorybookSection = {
      val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], stories = stories.asInstanceOf[js.Any])
      __obj.asInstanceOf[IStorybookSection]
    }
    
    extension [Self <: IStorybookSection](x: Self) {
      
      inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setStories(value: js.Array[IStorybookStory]): Self = StObject.set(x, "stories", value.asInstanceOf[js.Any])
      
      inline def setStoriesVarargs(value: IStorybookStory*): Self = StObject.set(x, "stories", js.Array(value :_*))
    }
  }
  
  trait IStorybookStory extends StObject {
    
    var name: String
    
    def render(): js.Any
  }
  object IStorybookStory {
    
    inline def apply(name: String, render: () => js.Any): IStorybookStory = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], render = js.Any.fromFunction0(render))
      __obj.asInstanceOf[IStorybookStory]
    }
    
    extension [Self <: IStorybookStory](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setRender(value: () => js.Any): Self = StObject.set(x, "render", js.Any.fromFunction0(value))
    }
  }
  
  trait ShowErrorArgs extends StObject {
    
    var description: String
    
    var title: String
  }
  object ShowErrorArgs {
    
    inline def apply(description: String, title: String): ShowErrorArgs = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[ShowErrorArgs]
    }
    
    extension [Self <: ShowErrorArgs](x: Self) {
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  type StoryFnPreactReturnType = String | Node | Element
}
