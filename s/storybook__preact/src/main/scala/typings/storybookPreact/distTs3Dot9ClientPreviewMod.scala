package typings.storybookPreact

import typings.node.NodeModule
import typings.storybookAddons.distTs3Dot9TypesMod.ClientStoryApi
import typings.storybookAddons.distTs3Dot9TypesMod.DecoratorFunction
import typings.storybookAddons.distTs3Dot9TypesMod.Loadable
import typings.storybookAddons.distTs3Dot9TypesMod.Parameters
import typings.storybookAddons.distTs3Dot9TypesMod.StoryApi
import typings.storybookPreact.distTs3Dot9ClientPreviewTypesMod.IStorybookSection
import typings.storybookPreact.distTs3Dot9ClientPreviewTypesMod.StoryFnPreactReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTs3Dot9ClientPreviewMod {
  
  @JSImport("@storybook/preact/dist/ts3.9/client/preview", "addDecorator")
  @js.native
  val addDecorator: js.Function1[
    /* decorator */ DecoratorFunction[
      /* import warning: importer.ImportType#apply Failed type conversion: @storybook/preact.@storybook/preact/dist/ts3.9/client/preview/types-6-0.PreactFramework['storyResult'] */ js.Any
    ], 
    StoryApi[
      /* import warning: importer.ImportType#apply Failed type conversion: @storybook/preact.@storybook/preact/dist/ts3.9/client/preview/types-6-0.PreactFramework['storyResult'] */ js.Any
    ]
  ] = js.native
  
  @JSImport("@storybook/preact/dist/ts3.9/client/preview", "addParameters")
  @js.native
  val addParameters: js.Function1[
    /* parameter */ Parameters, 
    StoryApi[
      /* import warning: importer.ImportType#apply Failed type conversion: @storybook/preact.@storybook/preact/dist/ts3.9/client/preview/types-6-0.PreactFramework['storyResult'] */ js.Any
    ]
  ] = js.native
  
  @JSImport("@storybook/preact/dist/ts3.9/client/preview", "clearDecorators")
  @js.native
  val clearDecorators: js.Function0[Unit] = js.native
  
  @JSImport("@storybook/preact/dist/ts3.9/client/preview", "configure")
  @js.native
  val configure: js.Function2[/* loader */ Loadable, /* module */ NodeModule, Unit] = js.native
  
  @JSImport("@storybook/preact/dist/ts3.9/client/preview", "forceReRender")
  @js.native
  val forceReRender: js.Function0[Unit] = js.native
  
  @JSImport("@storybook/preact/dist/ts3.9/client/preview", "getStorybook")
  @js.native
  val getStorybook: js.Function0[js.Array[IStorybookSection]] = js.native
  
  @JSImport("@storybook/preact/dist/ts3.9/client/preview", "raw")
  @js.native
  val raw: js.Function0[Any] = js.native
  
  @JSImport("@storybook/preact/dist/ts3.9/client/preview", "setAddon")
  @js.native
  val setAddon: js.Function1[/* addon */ Any, Unit] = js.native
  
  @JSImport("@storybook/preact/dist/ts3.9/client/preview", "storiesOf")
  @js.native
  val storiesOf: js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryKind */ /* kind */ Any, 
    /* module */ NodeModule, 
    StoryApi[
      /* import warning: importer.ImportType#apply Failed type conversion: @storybook/preact.@storybook/preact/dist/ts3.9/client/preview/types-6-0.PreactFramework['storyResult'] */ js.Any
    ]
  ] = js.native
  
  trait ClientApi
    extends StObject
       with ClientStoryApi[StoryFnPreactReturnType] {
    
    def clearDecorators(): Unit
    
    def configure(loader: Loadable, module: NodeModule): Unit
    
    def forceReRender(): Unit
    
    def getStorybook(): js.Array[IStorybookSection]
    
    def load(args: Any*): Unit
    
    def raw(): Any
    
    def setAddon(addon: Any): Unit
  }
  object ClientApi {
    
    inline def apply(
      addDecorator: DecoratorFunction[StoryFnPreactReturnType] => StoryApi[StoryFnPreactReturnType],
      addParameters: Parameters => StoryApi[StoryFnPreactReturnType],
      clearDecorators: () => Unit,
      configure: (Loadable, NodeModule) => Unit,
      forceReRender: () => Unit,
      getStorybook: () => js.Array[IStorybookSection],
      load: /* repeated */ Any => Unit,
      raw: () => Any,
      setAddon: Any => Unit,
      storiesOf: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryKind */ Any, NodeModule) => StoryApi[StoryFnPreactReturnType]
    ): ClientApi = {
      val __obj = js.Dynamic.literal(addDecorator = js.Any.fromFunction1(addDecorator), addParameters = js.Any.fromFunction1(addParameters), clearDecorators = js.Any.fromFunction0(clearDecorators), configure = js.Any.fromFunction2(configure), forceReRender = js.Any.fromFunction0(forceReRender), getStorybook = js.Any.fromFunction0(getStorybook), load = js.Any.fromFunction1(load), raw = js.Any.fromFunction0(raw), setAddon = js.Any.fromFunction1(setAddon), storiesOf = js.Any.fromFunction2(storiesOf))
      __obj.asInstanceOf[ClientApi]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ClientApi] (val x: Self) extends AnyVal {
      
      inline def setClearDecorators(value: () => Unit): Self = StObject.set(x, "clearDecorators", js.Any.fromFunction0(value))
      
      inline def setConfigure(value: (Loadable, NodeModule) => Unit): Self = StObject.set(x, "configure", js.Any.fromFunction2(value))
      
      inline def setForceReRender(value: () => Unit): Self = StObject.set(x, "forceReRender", js.Any.fromFunction0(value))
      
      inline def setGetStorybook(value: () => js.Array[IStorybookSection]): Self = StObject.set(x, "getStorybook", js.Any.fromFunction0(value))
      
      inline def setLoad(value: /* repeated */ Any => Unit): Self = StObject.set(x, "load", js.Any.fromFunction1(value))
      
      inline def setRaw(value: () => Any): Self = StObject.set(x, "raw", js.Any.fromFunction0(value))
      
      inline def setSetAddon(value: Any => Unit): Self = StObject.set(x, "setAddon", js.Any.fromFunction1(value))
    }
  }
}
