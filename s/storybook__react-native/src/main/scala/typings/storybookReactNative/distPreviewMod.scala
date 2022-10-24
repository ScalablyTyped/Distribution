package typings.storybookReactNative

import typings.storybookClientApi.mod.ClientApi
import typings.storybookClientApi.mod.StoryStore
import typings.storybookReactNative.anon.BackgroundColor
import typings.storybookReactNative.anon.Instantiable
import typings.storybookReactNative.anon.PartialParams
import typings.storybookReactNative.anon.StoryId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPreviewMod {
  
  @JSImport("@storybook/react-native/dist/preview", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with Preview
  
  trait AsyncStorage extends StObject {
    
    def getItem(key: String): js.Promise[String | Null]
    
    def setItem(key: String, value: String): js.Promise[Unit]
  }
  object AsyncStorage {
    
    inline def apply(getItem: String => js.Promise[String | Null], setItem: (String, String) => js.Promise[Unit]): AsyncStorage = {
      val __obj = js.Dynamic.literal(getItem = js.Any.fromFunction1(getItem), setItem = js.Any.fromFunction2(setItem))
      __obj.asInstanceOf[AsyncStorage]
    }
    
    extension [Self <: AsyncStorage](x: Self) {
      
      inline def setGetItem(value: String => js.Promise[String | Null]): Self = StObject.set(x, "getItem", js.Any.fromFunction1(value))
      
      inline def setSetItem(value: (String, String) => js.Promise[Unit]): Self = StObject.set(x, "setItem", js.Any.fromFunction2(value))
    }
  }
  
  trait Params extends StObject {
    
    var asyncStorage: js.UndefOr[AsyncStorage | Null] = js.undefined
    
    var disableWebsockets: Boolean
    
    var host: String
    
    var initialSelection: Any
    
    var isUIHidden: Boolean
    
    var keyboardAvoidingViewVerticalOffset: Double
    
    var onDeviceUI: Boolean
    
    var port: Double
    
    var query: String
    
    var resetStorybook: Boolean
    
    var secured: Boolean
    
    var shouldDisableKeyboardAvoidingView: Boolean
    
    var shouldPersistSelection: Boolean
    
    var tabOpen: Double
    
    var theme: BackgroundColor
  }
  object Params {
    
    inline def apply(
      disableWebsockets: Boolean,
      host: String,
      initialSelection: Any,
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
    
    extension [Self <: Params](x: Self) {
      
      inline def setAsyncStorage(value: AsyncStorage): Self = StObject.set(x, "asyncStorage", value.asInstanceOf[js.Any])
      
      inline def setAsyncStorageNull: Self = StObject.set(x, "asyncStorage", null)
      
      inline def setAsyncStorageUndefined: Self = StObject.set(x, "asyncStorage", js.undefined)
      
      inline def setDisableWebsockets(value: Boolean): Self = StObject.set(x, "disableWebsockets", value.asInstanceOf[js.Any])
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setInitialSelection(value: Any): Self = StObject.set(x, "initialSelection", value.asInstanceOf[js.Any])
      
      inline def setIsUIHidden(value: Boolean): Self = StObject.set(x, "isUIHidden", value.asInstanceOf[js.Any])
      
      inline def setKeyboardAvoidingViewVerticalOffset(value: Double): Self = StObject.set(x, "keyboardAvoidingViewVerticalOffset", value.asInstanceOf[js.Any])
      
      inline def setOnDeviceUI(value: Boolean): Self = StObject.set(x, "onDeviceUI", value.asInstanceOf[js.Any])
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setResetStorybook(value: Boolean): Self = StObject.set(x, "resetStorybook", value.asInstanceOf[js.Any])
      
      inline def setSecured(value: Boolean): Self = StObject.set(x, "secured", value.asInstanceOf[js.Any])
      
      inline def setShouldDisableKeyboardAvoidingView(value: Boolean): Self = StObject.set(x, "shouldDisableKeyboardAvoidingView", value.asInstanceOf[js.Any])
      
      inline def setShouldPersistSelection(value: Boolean): Self = StObject.set(x, "shouldPersistSelection", value.asInstanceOf[js.Any])
      
      inline def setTabOpen(value: Double): Self = StObject.set(x, "tabOpen", value.asInstanceOf[js.Any])
      
      inline def setTheme(value: BackgroundColor): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Preview extends StObject {
    
    var _addons: Any = js.native
    
    var _asyncStorage: AsyncStorage | Null = js.native
    
    var _asyncStorageStoryId: String = js.native
    
    def _checkStory(storyId: String): Any = js.native
    
    var _clientApi: ClientApi[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any
      ] = js.native
    
    var _decorators: js.Array[Any] = js.native
    
    def _getInitialStory(initialSelection: Any): js.Function0[
        js.Promise[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_types.StoreItem */ Any
        ]
      ] = js.native
    def _getInitialStory(initialSelection: Any, shouldPersistSelection: Boolean): js.Function0[
        js.Promise[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_types.StoreItem */ Any
        ]
      ] = js.native
    
    def _getStory(storyId: String): Any = js.native
    
    def _selectStory(story: Any): Unit = js.native
    
    def _selectStoryEvent(param0: StoryId): Unit = js.native
    
    def _sendSetStories(): Unit = js.native
    
    def _setInitialStory(initialSelection: Any): js.Promise[Unit] = js.native
    def _setInitialStory(initialSelection: Any, shouldPersistSelection: Boolean): js.Promise[Unit] = js.native
    
    var _stories: StoryStore[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any
      ] = js.native
    
    def api(): ClientApi[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any
      ] = js.native
    
    def configure(loadStories: js.Function0[Unit], module: Any): Unit = js.native
    
    def getStorybookUI(): Instantiable = js.native
    def getStorybookUI(params: PartialParams): Instantiable = js.native
  }
}
