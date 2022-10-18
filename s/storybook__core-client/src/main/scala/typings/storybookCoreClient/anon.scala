package typings.storybookCoreClient

import typings.node.NodeModule
import typings.std.Element
import typings.std.Map
import typings.std.Record
import typings.storybookCoreClient.distTs3Dot9PreviewTypesMod.Loadable
import typings.storybookStore.distTs3Dot9TypesMod.RenderContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AddDecorator extends StObject {
    
    def addDecorator(): scala.Nothing
    
    def addLoader(): scala.Nothing
    
    def addParameters(): scala.Nothing
    
    def clearDecorators(): scala.Nothing
    
    def getStorybook(): scala.Nothing
    
    def raw(): scala.Nothing
    
    def setAddon(): scala.Nothing
    
    def storiesOf(): scala.Nothing
  }
  object AddDecorator {
    
    inline def apply(
      addDecorator: () => scala.Nothing,
      addLoader: () => scala.Nothing,
      addParameters: () => scala.Nothing,
      clearDecorators: () => scala.Nothing,
      getStorybook: () => scala.Nothing,
      raw: () => scala.Nothing,
      setAddon: () => scala.Nothing,
      storiesOf: () => scala.Nothing
    ): AddDecorator = {
      val __obj = js.Dynamic.literal(addDecorator = js.Any.fromFunction0(addDecorator), addLoader = js.Any.fromFunction0(addLoader), addParameters = js.Any.fromFunction0(addParameters), clearDecorators = js.Any.fromFunction0(clearDecorators), getStorybook = js.Any.fromFunction0(getStorybook), raw = js.Any.fromFunction0(raw), setAddon = js.Any.fromFunction0(setAddon), storiesOf = js.Any.fromFunction0(storiesOf))
      __obj.asInstanceOf[AddDecorator]
    }
    
    extension [Self <: AddDecorator](x: Self) {
      
      inline def setAddDecorator(value: () => scala.Nothing): Self = StObject.set(x, "addDecorator", js.Any.fromFunction0(value))
      
      inline def setAddLoader(value: () => scala.Nothing): Self = StObject.set(x, "addLoader", js.Any.fromFunction0(value))
      
      inline def setAddParameters(value: () => scala.Nothing): Self = StObject.set(x, "addParameters", js.Any.fromFunction0(value))
      
      inline def setClearDecorators(value: () => scala.Nothing): Self = StObject.set(x, "clearDecorators", js.Any.fromFunction0(value))
      
      inline def setGetStorybook(value: () => scala.Nothing): Self = StObject.set(x, "getStorybook", js.Any.fromFunction0(value))
      
      inline def setRaw(value: () => scala.Nothing): Self = StObject.set(x, "raw", js.Any.fromFunction0(value))
      
      inline def setSetAddon(value: () => scala.Nothing): Self = StObject.set(x, "setAddon", js.Any.fromFunction0(value))
      
      inline def setStoriesOf(value: () => scala.Nothing): Self = StObject.set(x, "storiesOf", js.Any.fromFunction0(value))
    }
  }
  
  trait Added extends StObject {
    
    var added: Map[String, Record[String, Any]]
    
    var removed: Map[String, Record[String, Any]]
  }
  object Added {
    
    inline def apply(added: Map[String, Record[String, Any]], removed: Map[String, Record[String, Any]]): Added = {
      val __obj = js.Dynamic.literal(added = added.asInstanceOf[js.Any], removed = removed.asInstanceOf[js.Any])
      __obj.asInstanceOf[Added]
    }
    
    extension [Self <: Added](x: Self) {
      
      inline def setAdded(value: Map[String, Record[String, Any]]): Self = StObject.set(x, "added", value.asInstanceOf[js.Any])
      
      inline def setRemoved(value: Map[String, Record[String, Any]]): Self = StObject.set(x, "removed", value.asInstanceOf[js.Any])
    }
  }
  
  trait ClientApi extends StObject {
    
    var clientApi: AddDecorator
    
    def configure(): scala.Nothing
    
    def forceReRender(): scala.Nothing
    
    def getStorybook(): scala.Nothing
    
    var raw: Unit
  }
  object ClientApi {
    
    inline def apply(
      clientApi: AddDecorator,
      configure: () => scala.Nothing,
      forceReRender: () => scala.Nothing,
      getStorybook: () => scala.Nothing,
      raw: Unit
    ): ClientApi = {
      val __obj = js.Dynamic.literal(clientApi = clientApi.asInstanceOf[js.Any], configure = js.Any.fromFunction0(configure), forceReRender = js.Any.fromFunction0(forceReRender), getStorybook = js.Any.fromFunction0(getStorybook), raw = raw.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClientApi]
    }
    
    extension [Self <: ClientApi](x: Self) {
      
      inline def setClientApi(value: AddDecorator): Self = StObject.set(x, "clientApi", value.asInstanceOf[js.Any])
      
      inline def setConfigure(value: () => scala.Nothing): Self = StObject.set(x, "configure", js.Any.fromFunction0(value))
      
      inline def setForceReRender(value: () => scala.Nothing): Self = StObject.set(x, "forceReRender", js.Any.fromFunction0(value))
      
      inline def setGetStorybook(value: () => scala.Nothing): Self = StObject.set(x, "getStorybook", js.Any.fromFunction0(value))
      
      inline def setRaw(value: Unit): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Configure[TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */] extends StObject {
    
    var clientApi: typings.storybookClientApi.mod.ClientApi[TFramework] = js.native
    
    def configure(framework: String, loadable: Loadable): Unit = js.native
    def configure(framework: String, loadable: Loadable, m: Unit, showDeprecationWarning: Boolean): Unit = js.native
    def configure(framework: String, loadable: Loadable, m: NodeModule): Unit = js.native
    def configure(framework: String, loadable: Loadable, m: NodeModule, showDeprecationWarning: Boolean): Unit = js.native
    
    def forceReRender(): Unit = js.native
    
    def getStorybook(): js.Array[Unit] = js.native
    
    def raw(): Unit = js.native
  }
  
  trait DecorateStory[TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */] extends StObject {
    
    var decorateStory: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: @storybook/store.@storybook/store/dist/ts3.9/types.WebProjectAnnotations<TFramework>['applyDecorators'] */ js.Any
      ] = js.undefined
    
    var render: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ArgsStoryFn<TFramework> */ Any
      ] = js.undefined
  }
  object DecorateStory {
    
    inline def apply[TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */](): DecorateStory[TFramework] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DecorateStory[TFramework]]
    }
    
    extension [Self <: DecorateStory[?], TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */](x: Self & DecorateStory[TFramework]) {
      
      inline def setDecorateStory(
        value: /* import warning: importer.ImportType#apply Failed type conversion: @storybook/store.@storybook/store/dist/ts3.9/types.WebProjectAnnotations<TFramework>['applyDecorators'] */ js.Any
      ): Self = StObject.set(x, "decorateStory", value.asInstanceOf[js.Any])
      
      inline def setDecorateStoryUndefined: Self = StObject.set(x, "decorateStory", js.undefined)
      
      inline def setRender(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ArgsStoryFn<TFramework> */ Any
      ): Self = StObject.set(x, "render", value.asInstanceOf[js.Any])
      
      inline def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
    }
  }
  
  @js.native
  trait FnCall extends StObject {
    
    def apply[TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */](): ClientApi | Configure[TFramework] = js.native
    def apply[TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */](
      renderToDOM: js.Function2[
          /* context */ RenderContext[TFramework], 
          /* element */ Element, 
          js.Promise[Unit] | Unit
        ]
    ): ClientApi | Configure[TFramework] = js.native
    def apply[TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */](
      renderToDOM: js.Function2[
          /* context */ RenderContext[TFramework], 
          /* element */ Element, 
          js.Promise[Unit] | Unit
        ],
      hasDecorateStoryRender: DecorateStory[TFramework]
    ): ClientApi | Configure[TFramework] = js.native
    def apply[TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */](renderToDOM: Unit, hasDecorateStoryRender: DecorateStory[TFramework]): ClientApi | Configure[TFramework] = js.native
  }
}
