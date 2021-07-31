package typings.reactNativeSharedGroupPreferences

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    @JSImport("react-native-shared-group-preferences", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def getItem(key: String, appGroup: String): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getItem")(key.asInstanceOf[js.Any], appGroup.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
    @scala.inline
    def getItem(key: String, appGroup: String, options: SharedGroupPreferenceOptions): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getItem")(key.asInstanceOf[js.Any], appGroup.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
    
    @scala.inline
    def isAppInstalledAndroid(packageName: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("isAppInstalledAndroid")(packageName.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    
    @scala.inline
    def setItem(key: String, value: js.Any, appGroup: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("setItem")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any], appGroup.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    @scala.inline
    def setItem(key: String, value: js.Any, appGroup: String, options: SharedGroupPreferenceOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("setItem")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any], appGroup.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  }
  
  object SharedGroupPreferences {
    
    @JSImport("react-native-shared-group-preferences", "SharedGroupPreferences")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def getItem(key: String, appGroup: String): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getItem")(key.asInstanceOf[js.Any], appGroup.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
    @scala.inline
    def getItem(key: String, appGroup: String, options: SharedGroupPreferenceOptions): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getItem")(key.asInstanceOf[js.Any], appGroup.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
    
    @scala.inline
    def isAppInstalledAndroid(packageName: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("isAppInstalledAndroid")(packageName.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    
    @scala.inline
    def setItem(key: String, value: js.Any, appGroup: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("setItem")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any], appGroup.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    @scala.inline
    def setItem(key: String, value: js.Any, appGroup: String, options: SharedGroupPreferenceOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("setItem")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any], appGroup.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  }
  
  trait SharedGroupPreferenceOptions extends StObject {
    
    var useAndroidSharedPreferences: js.UndefOr[Boolean] = js.undefined
  }
  object SharedGroupPreferenceOptions {
    
    @scala.inline
    def apply(): SharedGroupPreferenceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SharedGroupPreferenceOptions]
    }
    
    @scala.inline
    implicit class SharedGroupPreferenceOptionsMutableBuilder[Self <: SharedGroupPreferenceOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUseAndroidSharedPreferences(value: Boolean): Self = StObject.set(x, "useAndroidSharedPreferences", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseAndroidSharedPreferencesUndefined: Self = StObject.set(x, "useAndroidSharedPreferences", js.undefined)
    }
  }
}
