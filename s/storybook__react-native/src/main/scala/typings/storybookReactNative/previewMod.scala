package typings.storybookReactNative

import typings.storybookClientApi.mod.ClientApi
import typings.storybookClientApi.mod.StoryStore
import typings.storybookClientApi.typesMod.StoreItem
import typings.storybookReactNative.anon.BackgroundColor
import typings.storybookReactNative.anon.Instantiable
import typings.storybookReactNative.anon.PartialParams
import typings.storybookReactNative.anon.StoryId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object previewMod {
  
  @JSImport("@storybook/react-native/dist/preview", JSImport.Default)
  @js.native
  class default () extends Preview
  
  @js.native
  trait AsyncStorage extends StObject {
    
    def getItem(key: String): js.Promise[String | Null] = js.native
    
    def setItem(key: String, value: String): js.Promise[Unit] = js.native
  }
  object AsyncStorage {
    
    @scala.inline
    def apply(getItem: String => js.Promise[String | Null], setItem: (String, String) => js.Promise[Unit]): AsyncStorage = {
      val __obj = js.Dynamic.literal(getItem = js.Any.fromFunction1(getItem), setItem = js.Any.fromFunction2(setItem))
      __obj.asInstanceOf[AsyncStorage]
    }
    
    @scala.inline
    implicit class AsyncStorageMutableBuilder[Self <: AsyncStorage] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetItem(value: String => js.Promise[String | Null]): Self = StObject.set(x, "getItem", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetItem(value: (String, String) => js.Promise[Unit]): Self = StObject.set(x, "setItem", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait Params extends StObject {
    
    var asyncStorage: js.UndefOr[AsyncStorage | Null] = js.native
    
    var disableWebsockets: Boolean = js.native
    
    var host: String = js.native
    
    var initialSelection: js.Any = js.native
    
    var isUIHidden: Boolean = js.native
    
    var keyboardAvoidingViewVerticalOffset: Double = js.native
    
    var onDeviceUI: Boolean = js.native
    
    var port: Double = js.native
    
    var query: String = js.native
    
    var resetStorybook: Boolean = js.native
    
    var secured: Boolean = js.native
    
    var shouldDisableKeyboardAvoidingView: Boolean = js.native
    
    var shouldPersistSelection: Boolean = js.native
    
    var tabOpen: Double = js.native
    
    var theme: BackgroundColor = js.native
  }
  object Params {
    
    @scala.inline
    def apply(
      disableWebsockets: Boolean,
      host: String,
      initialSelection: js.Any,
      isUIHidden: Boolean,
      keyboardAvoidingViewVerticalOffset: Double,
      onDeviceUI: Boolean,
      port: Double,
      query: String,
      resetStorybook: Boolean,
      secured: Boolean,
      shouldDisableKeyboardAvoidingView: Boolean,
      shouldPersistSelection: Boolean,
      tabOpen: Double,
      theme: BackgroundColor
    ): Params = {
      val __obj = js.Dynamic.literal(disableWebsockets = disableWebsockets.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], initialSelection = initialSelection.asInstanceOf[js.Any], isUIHidden = isUIHidden.asInstanceOf[js.Any], keyboardAvoidingViewVerticalOffset = keyboardAvoidingViewVerticalOffset.asInstanceOf[js.Any], onDeviceUI = onDeviceUI.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], resetStorybook = resetStorybook.asInstanceOf[js.Any], secured = secured.asInstanceOf[js.Any], shouldDisableKeyboardAvoidingView = shouldDisableKeyboardAvoidingView.asInstanceOf[js.Any], shouldPersistSelection = shouldPersistSelection.asInstanceOf[js.Any], tabOpen = tabOpen.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[Params]
    }
    
    @scala.inline
    implicit class ParamsMutableBuilder[Self <: Params] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAsyncStorage(value: AsyncStorage): Self = StObject.set(x, "asyncStorage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsyncStorageNull: Self = StObject.set(x, "asyncStorage", null)
      
      @scala.inline
      def setAsyncStorageUndefined: Self = StObject.set(x, "asyncStorage", js.undefined)
      
      @scala.inline
      def setDisableWebsockets(value: Boolean): Self = StObject.set(x, "disableWebsockets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialSelection(value: js.Any): Self = StObject.set(x, "initialSelection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsUIHidden(value: Boolean): Self = StObject.set(x, "isUIHidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyboardAvoidingViewVerticalOffset(value: Double): Self = StObject.set(x, "keyboardAvoidingViewVerticalOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnDeviceUI(value: Boolean): Self = StObject.set(x, "onDeviceUI", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResetStorybook(value: Boolean): Self = StObject.set(x, "resetStorybook", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecured(value: Boolean): Self = StObject.set(x, "secured", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShouldDisableKeyboardAvoidingView(value: Boolean): Self = StObject.set(x, "shouldDisableKeyboardAvoidingView", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShouldPersistSelection(value: Boolean): Self = StObject.set(x, "shouldPersistSelection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabOpen(value: Double): Self = StObject.set(x, "tabOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTheme(value: BackgroundColor): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Preview extends StObject {
    
    var _addons: js.Any = js.native
    
    var _asyncStorage: AsyncStorage | Null = js.native
    
    var _asyncStorageStoryId: String = js.native
    
    def _checkStory(storyId: String): StoreItem = js.native
    
    var _clientApi: ClientApi = js.native
    
    var _decorators: js.Array[_] = js.native
    
    def _getInitialStory(initialSelection: js.Any): js.Function0[js.Promise[StoreItem]] = js.native
    def _getInitialStory(initialSelection: js.Any, shouldPersistSelection: Boolean): js.Function0[js.Promise[StoreItem]] = js.native
    
    def _getStory(storyId: String): StoreItem = js.native
    
    def _selectStory(story: js.Any): Unit = js.native
    
    def _selectStoryEvent(hasStoryId: StoryId): Unit = js.native
    
    def _sendSetStories(): Unit = js.native
    
    def _setInitialStory(initialSelection: js.Any): js.Promise[Unit] = js.native
    def _setInitialStory(initialSelection: js.Any, shouldPersistSelection: Boolean): js.Promise[Unit] = js.native
    
    var _stories: StoryStore = js.native
    
    def api(): ClientApi = js.native
    
    def configure(loadStories: js.Function0[Unit], module: js.Any): Unit = js.native
    
    def getStorybookUI(): Instantiable = js.native
    def getStorybookUI(params: PartialParams): Instantiable = js.native
  }
}
