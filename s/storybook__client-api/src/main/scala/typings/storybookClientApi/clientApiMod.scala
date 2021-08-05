package typings.storybookClientApi

import typings.node.NodeModule
import typings.storybookAddons.typesMod.DecoratorFunction
import typings.storybookAddons.typesMod.LoaderFunction
import typings.storybookAddons.typesMod.Parameters
import typings.storybookAddons.typesMod.StoryApi
import typings.storybookClientApi.typesMod.ArgTypesEnhancer
import typings.storybookClientApi.typesMod.ClientApiParams
import typings.storybookClientApi.typesMod.GetStorybookKind
import typings.storybookClientApi.typesMod.PublishedStoreItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object clientApiMod {
  
  @JSImport("@storybook/client-api/dist/client_api", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@storybook/client-api/dist/client_api", JSImport.Default)
  @js.native
  class default protected ()
    extends StObject
       with ClientApi {
    def this(hasStoryStoreDecorateStoryNoStoryModuleAddMethodHotDispose: ClientApiParams) = this()
    
    /* private */ /* CompleteClass */
    var _addons: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var _decorateStory: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var _noStoryModuleAddMethodHotDispose: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var _storyStore: js.Any = js.native
    
    /* CompleteClass */
    override def addArgTypesEnhancer(enhancer: ArgTypesEnhancer): Unit = js.native
    
    /* CompleteClass */
    override def addDecorator(decorator: DecoratorFunction[js.Any]): Unit = js.native
    
    /* CompleteClass */
    override def addLoader(loader: LoaderFunction): Unit = js.native
    
    /* CompleteClass */
    override def addParameters(parameters: Parameters): Unit = js.native
    
    /* CompleteClass */
    override def clearDecorators(): Unit = js.native
    
    /* CompleteClass */
    override def getStorybook(): js.Array[GetStorybookKind] = js.native
    
    /* CompleteClass */
    override def raw(): js.Array[PublishedStoreItem] = js.native
    
    /* CompleteClass */
    override def setAddon(addon: js.Any): Unit = js.native
    
    /* CompleteClass */
    override def store(): typings.storybookClientApi.storyStoreMod.default = js.native
    
    /* CompleteClass */
    override def storiesOf[StoryFnReturnType](kind: String, m: NodeModule): StoryApi[StoryFnReturnType] = js.native
  }
  
  inline def addArgTypesEnhancer(enhancer: ArgTypesEnhancer): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addArgTypesEnhancer")(enhancer.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def addDecorator(decorator: DecoratorFunction[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addDecorator")(decorator.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def addDecorator(decorator: DecoratorFunction[js.Any], deprecationWarning: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addDecorator")(decorator.asInstanceOf[js.Any], deprecationWarning.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def addLoader(loader: LoaderFunction): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addLoader")(loader.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def addLoader(loader: LoaderFunction, deprecationWarning: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addLoader")(loader.asInstanceOf[js.Any], deprecationWarning.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def addParameters(parameters: Parameters): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addParameters")(parameters.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def addParameters(parameters: Parameters, deprecationWarning: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addParameters")(parameters.asInstanceOf[js.Any], deprecationWarning.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait ClientApi extends StObject {
    
    /* private */ var _addons: js.Any
    
    /* private */ var _decorateStory: js.Any
    
    /* private */ var _noStoryModuleAddMethodHotDispose: js.Any
    
    /* private */ var _storyStore: js.Any
    
    def addArgTypesEnhancer(enhancer: ArgTypesEnhancer): Unit
    
    def addDecorator(decorator: DecoratorFunction[js.Any]): Unit
    
    def addLoader(loader: LoaderFunction): Unit
    
    def addParameters(parameters: Parameters): Unit
    
    def clearDecorators(): Unit
    
    def getStorybook(): js.Array[GetStorybookKind]
    
    def raw(): js.Array[PublishedStoreItem]
    
    def setAddon(addon: js.Any): Unit
    
    def store(): typings.storybookClientApi.storyStoreMod.default
    
    def storiesOf[StoryFnReturnType](kind: String, m: NodeModule): StoryApi[StoryFnReturnType]
  }
  object ClientApi {
    
    inline def apply(
      _addons: js.Any,
      _decorateStory: js.Any,
      _noStoryModuleAddMethodHotDispose: js.Any,
      _storyStore: js.Any,
      addArgTypesEnhancer: ArgTypesEnhancer => Unit,
      addDecorator: DecoratorFunction[js.Any] => Unit,
      addLoader: LoaderFunction => Unit,
      addParameters: Parameters => Unit,
      clearDecorators: () => Unit,
      getStorybook: () => js.Array[GetStorybookKind],
      raw: () => js.Array[PublishedStoreItem],
      setAddon: js.Any => Unit,
      store: () => typings.storybookClientApi.storyStoreMod.default,
      storiesOf: (String, NodeModule) => StoryApi[js.Any]
    ): ClientApi = {
      val __obj = js.Dynamic.literal(_addons = _addons.asInstanceOf[js.Any], _decorateStory = _decorateStory.asInstanceOf[js.Any], _noStoryModuleAddMethodHotDispose = _noStoryModuleAddMethodHotDispose.asInstanceOf[js.Any], _storyStore = _storyStore.asInstanceOf[js.Any], addArgTypesEnhancer = js.Any.fromFunction1(addArgTypesEnhancer), addDecorator = js.Any.fromFunction1(addDecorator), addLoader = js.Any.fromFunction1(addLoader), addParameters = js.Any.fromFunction1(addParameters), clearDecorators = js.Any.fromFunction0(clearDecorators), getStorybook = js.Any.fromFunction0(getStorybook), raw = js.Any.fromFunction0(raw), setAddon = js.Any.fromFunction1(setAddon), store = js.Any.fromFunction0(store), storiesOf = js.Any.fromFunction2(storiesOf))
      __obj.asInstanceOf[ClientApi]
    }
    
    extension [Self <: ClientApi](x: Self) {
      
      inline def setAddArgTypesEnhancer(value: ArgTypesEnhancer => Unit): Self = StObject.set(x, "addArgTypesEnhancer", js.Any.fromFunction1(value))
      
      inline def setAddDecorator(value: DecoratorFunction[js.Any] => Unit): Self = StObject.set(x, "addDecorator", js.Any.fromFunction1(value))
      
      inline def setAddLoader(value: LoaderFunction => Unit): Self = StObject.set(x, "addLoader", js.Any.fromFunction1(value))
      
      inline def setAddParameters(value: Parameters => Unit): Self = StObject.set(x, "addParameters", js.Any.fromFunction1(value))
      
      inline def setClearDecorators(value: () => Unit): Self = StObject.set(x, "clearDecorators", js.Any.fromFunction0(value))
      
      inline def setGetStorybook(value: () => js.Array[GetStorybookKind]): Self = StObject.set(x, "getStorybook", js.Any.fromFunction0(value))
      
      inline def setRaw(value: () => js.Array[PublishedStoreItem]): Self = StObject.set(x, "raw", js.Any.fromFunction0(value))
      
      inline def setSetAddon(value: js.Any => Unit): Self = StObject.set(x, "setAddon", js.Any.fromFunction1(value))
      
      inline def setStore(value: () => typings.storybookClientApi.storyStoreMod.default): Self = StObject.set(x, "store", js.Any.fromFunction0(value))
      
      inline def setStoriesOf(value: (String, NodeModule) => StoryApi[js.Any]): Self = StObject.set(x, "storiesOf", js.Any.fromFunction2(value))
      
      inline def set_addons(value: js.Any): Self = StObject.set(x, "_addons", value.asInstanceOf[js.Any])
      
      inline def set_decorateStory(value: js.Any): Self = StObject.set(x, "_decorateStory", value.asInstanceOf[js.Any])
      
      inline def set_noStoryModuleAddMethodHotDispose(value: js.Any): Self = StObject.set(x, "_noStoryModuleAddMethodHotDispose", value.asInstanceOf[js.Any])
      
      inline def set_storyStore(value: js.Any): Self = StObject.set(x, "_storyStore", value.asInstanceOf[js.Any])
    }
  }
}
