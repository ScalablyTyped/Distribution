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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object clientApiMod {
  
  @JSImport("@storybook/client-api/dist/client_api", JSImport.Default)
  @js.native
  class default protected () extends ClientApi {
    def this(hasStoryStoreDecorateStoryNoStoryModuleAddMethodHotDispose: ClientApiParams) = this()
  }
  
  @JSImport("@storybook/client-api/dist/client_api", "addArgTypesEnhancer")
  @js.native
  def addArgTypesEnhancer(enhancer: ArgTypesEnhancer): Unit = js.native
  
  @JSImport("@storybook/client-api/dist/client_api", "addDecorator")
  @js.native
  def addDecorator(decorator: DecoratorFunction[_]): Unit = js.native
  @JSImport("@storybook/client-api/dist/client_api", "addDecorator")
  @js.native
  def addDecorator(decorator: DecoratorFunction[_], deprecationWarning: Boolean): Unit = js.native
  
  @JSImport("@storybook/client-api/dist/client_api", "addLoader")
  @js.native
  def addLoader(loader: LoaderFunction): Unit = js.native
  @JSImport("@storybook/client-api/dist/client_api", "addLoader")
  @js.native
  def addLoader(loader: LoaderFunction, deprecationWarning: Boolean): Unit = js.native
  
  @JSImport("@storybook/client-api/dist/client_api", "addParameters")
  @js.native
  def addParameters(parameters: Parameters): Unit = js.native
  @JSImport("@storybook/client-api/dist/client_api", "addParameters")
  @js.native
  def addParameters(parameters: Parameters, deprecationWarning: Boolean): Unit = js.native
  
  @js.native
  trait ClientApi extends StObject {
    
    var _addons: js.Any = js.native
    
    var _decorateStory: js.Any = js.native
    
    var _noStoryModuleAddMethodHotDispose: js.Any = js.native
    
    var _storyStore: js.Any = js.native
    
    def addArgTypesEnhancer(enhancer: ArgTypesEnhancer): Unit = js.native
    
    def addDecorator(decorator: DecoratorFunction[_]): Unit = js.native
    
    def addLoader(loader: LoaderFunction): Unit = js.native
    
    def addParameters(parameters: Parameters): Unit = js.native
    
    def clearDecorators(): Unit = js.native
    
    def getStorybook(): js.Array[GetStorybookKind] = js.native
    
    def raw(): js.Array[PublishedStoreItem] = js.native
    
    def setAddon(addon: js.Any): Unit = js.native
    
    def store(): typings.storybookClientApi.storyStoreMod.default = js.native
    
    def storiesOf[StoryFnReturnType](kind: String, m: NodeModule): StoryApi[StoryFnReturnType] = js.native
  }
  object ClientApi {
    
    @scala.inline
    def apply(
      _addons: js.Any,
      _decorateStory: js.Any,
      _noStoryModuleAddMethodHotDispose: js.Any,
      _storyStore: js.Any,
      addArgTypesEnhancer: ArgTypesEnhancer => Unit,
      addDecorator: DecoratorFunction[_] => Unit,
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
    
    @scala.inline
    implicit class ClientApiMutableBuilder[Self <: ClientApi] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddArgTypesEnhancer(value: ArgTypesEnhancer => Unit): Self = StObject.set(x, "addArgTypesEnhancer", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAddDecorator(value: DecoratorFunction[_] => Unit): Self = StObject.set(x, "addDecorator", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAddLoader(value: LoaderFunction => Unit): Self = StObject.set(x, "addLoader", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAddParameters(value: Parameters => Unit): Self = StObject.set(x, "addParameters", js.Any.fromFunction1(value))
      
      @scala.inline
      def setClearDecorators(value: () => Unit): Self = StObject.set(x, "clearDecorators", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetStorybook(value: () => js.Array[GetStorybookKind]): Self = StObject.set(x, "getStorybook", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRaw(value: () => js.Array[PublishedStoreItem]): Self = StObject.set(x, "raw", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSetAddon(value: js.Any => Unit): Self = StObject.set(x, "setAddon", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStore(value: () => typings.storybookClientApi.storyStoreMod.default): Self = StObject.set(x, "store", js.Any.fromFunction0(value))
      
      @scala.inline
      def setStoriesOf(value: (String, NodeModule) => StoryApi[js.Any]): Self = StObject.set(x, "storiesOf", js.Any.fromFunction2(value))
      
      @scala.inline
      def set_addons(value: js.Any): Self = StObject.set(x, "_addons", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_decorateStory(value: js.Any): Self = StObject.set(x, "_decorateStory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_noStoryModuleAddMethodHotDispose(value: js.Any): Self = StObject.set(x, "_noStoryModuleAddMethodHotDispose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_storyStore(value: js.Any): Self = StObject.set(x, "_storyStore", value.asInstanceOf[js.Any])
    }
  }
}
