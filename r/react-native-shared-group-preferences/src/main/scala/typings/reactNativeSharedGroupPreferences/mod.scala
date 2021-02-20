package typings.reactNativeSharedGroupPreferences

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    @JSImport("react-native-shared-group-preferences", "default.getItem")
    @js.native
    def getItem(key: String, appGroup: String): js.Promise[_] = js.native
    @JSImport("react-native-shared-group-preferences", "default.getItem")
    @js.native
    def getItem(key: String, appGroup: String, options: SharedGroupPreferenceOptions): js.Promise[_] = js.native
    
    @JSImport("react-native-shared-group-preferences", "default.isAppInstalledAndroid")
    @js.native
    def isAppInstalledAndroid(packageName: String): js.Promise[Unit] = js.native
    
    @JSImport("react-native-shared-group-preferences", "default.setItem")
    @js.native
    def setItem(key: String, value: js.Any, appGroup: String): js.Promise[Unit] = js.native
    @JSImport("react-native-shared-group-preferences", "default.setItem")
    @js.native
    def setItem(key: String, value: js.Any, appGroup: String, options: SharedGroupPreferenceOptions): js.Promise[Unit] = js.native
  }
  
  object SharedGroupPreferences {
    
    @JSImport("react-native-shared-group-preferences", "SharedGroupPreferences.getItem")
    @js.native
    def getItem(key: String, appGroup: String): js.Promise[_] = js.native
    @JSImport("react-native-shared-group-preferences", "SharedGroupPreferences.getItem")
    @js.native
    def getItem(key: String, appGroup: String, options: SharedGroupPreferenceOptions): js.Promise[_] = js.native
    
    @JSImport("react-native-shared-group-preferences", "SharedGroupPreferences.isAppInstalledAndroid")
    @js.native
    def isAppInstalledAndroid(packageName: String): js.Promise[Unit] = js.native
    
    @JSImport("react-native-shared-group-preferences", "SharedGroupPreferences.setItem")
    @js.native
    def setItem(key: String, value: js.Any, appGroup: String): js.Promise[Unit] = js.native
    @JSImport("react-native-shared-group-preferences", "SharedGroupPreferences.setItem")
    @js.native
    def setItem(key: String, value: js.Any, appGroup: String, options: SharedGroupPreferenceOptions): js.Promise[Unit] = js.native
  }
  
  @js.native
  trait SharedGroupPreferenceOptions extends StObject {
    
    var useAndroidSharedPreferences: js.UndefOr[Boolean] = js.native
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
