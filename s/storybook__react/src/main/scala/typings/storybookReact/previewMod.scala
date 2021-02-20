package typings.storybookReact

import typings.node.NodeModule
import typings.storybookAddons.typesMod.ClientStoryApi
import typings.storybookAddons.typesMod.DecoratorFunction
import typings.storybookAddons.typesMod.Loadable
import typings.storybookAddons.typesMod.Parameters
import typings.storybookAddons.typesMod.StoryApi
import typings.storybookAddons.typesMod.StoryKind
import typings.storybookReact.typesMod.IStorybookSection
import typings.storybookReact.typesMod.StoryFnReactReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object previewMod {
  
  @JSImport("@storybook/react/dist/client/preview", "addDecorator")
  @js.native
  val addDecorator: js.Function1[
    /* decorator */ DecoratorFunction[StoryFnReactReturnType], 
    StoryApi[StoryFnReactReturnType]
  ] = js.native
  
  @JSImport("@storybook/react/dist/client/preview", "addParameters")
  @js.native
  val addParameters: js.Function1[/* parameter */ Parameters, StoryApi[StoryFnReactReturnType]] = js.native
  
  @JSImport("@storybook/react/dist/client/preview", "clearDecorators")
  @js.native
  val clearDecorators: js.Function0[Unit] = js.native
  
  @JSImport("@storybook/react/dist/client/preview", "configure")
  @js.native
  val configure: js.Function2[/* loader */ Loadable, /* module */ NodeModule, Unit] = js.native
  
  @JSImport("@storybook/react/dist/client/preview", "forceReRender")
  @js.native
  val forceReRender: js.Function0[Unit] = js.native
  
  @JSImport("@storybook/react/dist/client/preview", "getStorybook")
  @js.native
  val getStorybook: js.Function0[js.Array[IStorybookSection]] = js.native
  
  @JSImport("@storybook/react/dist/client/preview", "raw")
  @js.native
  val raw: js.Function0[js.Any] = js.native
  
  @JSImport("@storybook/react/dist/client/preview", "setAddon")
  @js.native
  val setAddon: js.Function1[/* addon */ js.Any, Unit] = js.native
  
  @JSImport("@storybook/react/dist/client/preview", "storiesOf")
  @js.native
  val storiesOf: js.Function2[/* kind */ StoryKind, /* module */ NodeModule, StoryApi[StoryFnReactReturnType]] = js.native
  
  @js.native
  trait ClientApi extends ClientStoryApi[StoryFnReactReturnType] {
    
    def clearDecorators(): Unit = js.native
    
    def configure(loader: Loadable, module: NodeModule): Unit = js.native
    
    def forceReRender(): Unit = js.native
    
    def getStorybook(): js.Array[IStorybookSection] = js.native
    
    def raw(): js.Any = js.native
    
    def setAddon(addon: js.Any): Unit = js.native
  }
  object ClientApi {
    
    @scala.inline
    def apply(
      addDecorator: DecoratorFunction[StoryFnReactReturnType] => StoryApi[StoryFnReactReturnType],
      addParameters: Parameters => StoryApi[StoryFnReactReturnType],
      clearDecorators: () => Unit,
      configure: (Loadable, NodeModule) => Unit,
      forceReRender: () => Unit,
      getStorybook: () => js.Array[IStorybookSection],
      raw: () => js.Any,
      setAddon: js.Any => Unit,
      storiesOf: (StoryKind, NodeModule) => StoryApi[StoryFnReactReturnType]
    ): ClientApi = {
      val __obj = js.Dynamic.literal(addDecorator = js.Any.fromFunction1(addDecorator), addParameters = js.Any.fromFunction1(addParameters), clearDecorators = js.Any.fromFunction0(clearDecorators), configure = js.Any.fromFunction2(configure), forceReRender = js.Any.fromFunction0(forceReRender), getStorybook = js.Any.fromFunction0(getStorybook), raw = js.Any.fromFunction0(raw), setAddon = js.Any.fromFunction1(setAddon), storiesOf = js.Any.fromFunction2(storiesOf))
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
      def setRaw(value: () => js.Any): Self = StObject.set(x, "raw", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSetAddon(value: js.Any => Unit): Self = StObject.set(x, "setAddon", js.Any.fromFunction1(value))
    }
  }
  
  type DecoratorFn = /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(decorator : @storybook/addons.@storybook/addons/dist/types.DecoratorFunction<@storybook/react.@storybook/react/dist/client/preview/types.StoryFnReactReturnType>): @storybook/addons.@storybook/addons/dist/types.StoryApi<@storybook/react.@storybook/react/dist/client/preview/types.StoryFnReactReturnType>>[0] */ js.Any
}
