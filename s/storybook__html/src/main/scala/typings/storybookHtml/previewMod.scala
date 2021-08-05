package typings.storybookHtml

import typings.node.NodeModule
import typings.storybookAddons.typesMod.ClientStoryApi
import typings.storybookAddons.typesMod.DecoratorFunction
import typings.storybookAddons.typesMod.Loadable
import typings.storybookAddons.typesMod.Parameters
import typings.storybookAddons.typesMod.StoryApi
import typings.storybookAddons.typesMod.StoryKind
import typings.storybookHtml.typesMod.IStorybookSection
import typings.storybookHtml.typesMod.StoryFnHtmlReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object previewMod {
  
  @JSImport("@storybook/html/dist/client/preview", "addDecorator")
  @js.native
  val addDecorator: js.Function1[
    /* decorator */ DecoratorFunction[StoryFnHtmlReturnType], 
    StoryApi[StoryFnHtmlReturnType]
  ] = js.native
  
  @JSImport("@storybook/html/dist/client/preview", "addParameters")
  @js.native
  val addParameters: js.Function1[/* parameter */ Parameters, StoryApi[StoryFnHtmlReturnType]] = js.native
  
  @JSImport("@storybook/html/dist/client/preview", "clearDecorators")
  @js.native
  val clearDecorators: js.Function0[Unit] = js.native
  
  @JSImport("@storybook/html/dist/client/preview", "configure")
  @js.native
  val configure: js.Function2[/* loader */ Loadable, /* module */ NodeModule, Unit] = js.native
  
  @JSImport("@storybook/html/dist/client/preview", "forceReRender")
  @js.native
  val forceReRender: js.Function0[Unit] = js.native
  
  @JSImport("@storybook/html/dist/client/preview", "getStorybook")
  @js.native
  val getStorybook: js.Function0[js.Array[IStorybookSection]] = js.native
  
  @JSImport("@storybook/html/dist/client/preview", "raw")
  @js.native
  val raw: js.Function0[js.Any] = js.native
  
  @JSImport("@storybook/html/dist/client/preview", "setAddon")
  @js.native
  val setAddon: js.Function1[/* addon */ js.Any, Unit] = js.native
  
  @JSImport("@storybook/html/dist/client/preview", "storiesOf")
  @js.native
  val storiesOf: js.Function2[/* kind */ StoryKind, /* module */ NodeModule, StoryApi[StoryFnHtmlReturnType]] = js.native
  
  trait ClientApi
    extends StObject
       with ClientStoryApi[StoryFnHtmlReturnType] {
    
    def clearDecorators(): Unit
    
    def configure(loader: Loadable, module: NodeModule): Unit
    
    def forceReRender(): Unit
    
    def getStorybook(): js.Array[IStorybookSection]
    
    def raw(): js.Any
    
    def setAddon(addon: js.Any): Unit
  }
  object ClientApi {
    
    inline def apply(
      addDecorator: DecoratorFunction[StoryFnHtmlReturnType] => StoryApi[StoryFnHtmlReturnType],
      addParameters: Parameters => StoryApi[StoryFnHtmlReturnType],
      clearDecorators: () => Unit,
      configure: (Loadable, NodeModule) => Unit,
      forceReRender: () => Unit,
      getStorybook: () => js.Array[IStorybookSection],
      raw: () => js.Any,
      setAddon: js.Any => Unit,
      storiesOf: (StoryKind, NodeModule) => StoryApi[StoryFnHtmlReturnType]
    ): ClientApi = {
      val __obj = js.Dynamic.literal(addDecorator = js.Any.fromFunction1(addDecorator), addParameters = js.Any.fromFunction1(addParameters), clearDecorators = js.Any.fromFunction0(clearDecorators), configure = js.Any.fromFunction2(configure), forceReRender = js.Any.fromFunction0(forceReRender), getStorybook = js.Any.fromFunction0(getStorybook), raw = js.Any.fromFunction0(raw), setAddon = js.Any.fromFunction1(setAddon), storiesOf = js.Any.fromFunction2(storiesOf))
      __obj.asInstanceOf[ClientApi]
    }
    
    extension [Self <: ClientApi](x: Self) {
      
      inline def setClearDecorators(value: () => Unit): Self = StObject.set(x, "clearDecorators", js.Any.fromFunction0(value))
      
      inline def setConfigure(value: (Loadable, NodeModule) => Unit): Self = StObject.set(x, "configure", js.Any.fromFunction2(value))
      
      inline def setForceReRender(value: () => Unit): Self = StObject.set(x, "forceReRender", js.Any.fromFunction0(value))
      
      inline def setGetStorybook(value: () => js.Array[IStorybookSection]): Self = StObject.set(x, "getStorybook", js.Any.fromFunction0(value))
      
      inline def setRaw(value: () => js.Any): Self = StObject.set(x, "raw", js.Any.fromFunction0(value))
      
      inline def setSetAddon(value: js.Any => Unit): Self = StObject.set(x, "setAddon", js.Any.fromFunction1(value))
    }
  }
}
