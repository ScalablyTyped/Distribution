package typings.reactNativeAppLink

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    @JSImport("react-native-app-link", "default.maybeOpenURL")
    @js.native
    def maybeOpenURL(url: String, options: AppLinkOptions): js.Promise[Unit] = js.native
    
    @JSImport("react-native-app-link", "default.openInStore")
    @js.native
    def openInStore(options: AppLinkOptions): js.Promise[Unit] = js.native
  }
  
  @JSImport("react-native-app-link", "maybeOpenURL")
  @js.native
  def maybeOpenURL(url: String, options: AppLinkOptions): js.Promise[Unit] = js.native
  
  @JSImport("react-native-app-link", "openInStore")
  @js.native
  def openInStore(options: AppLinkOptions): js.Promise[Unit] = js.native
  
  @js.native
  trait AppLinkOptions extends StObject {
    
    val appName: String = js.native
    
    val appStoreId: Double = js.native
    
    val appStoreLocale: String = js.native
    
    val playStoreId: String = js.native
  }
  object AppLinkOptions {
    
    @scala.inline
    def apply(appName: String, appStoreId: Double, appStoreLocale: String, playStoreId: String): AppLinkOptions = {
      val __obj = js.Dynamic.literal(appName = appName.asInstanceOf[js.Any], appStoreId = appStoreId.asInstanceOf[js.Any], appStoreLocale = appStoreLocale.asInstanceOf[js.Any], playStoreId = playStoreId.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppLinkOptions]
    }
    
    @scala.inline
    implicit class AppLinkOptionsMutableBuilder[Self <: AppLinkOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppName(value: String): Self = StObject.set(x, "appName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppStoreId(value: Double): Self = StObject.set(x, "appStoreId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppStoreLocale(value: String): Self = StObject.set(x, "appStoreLocale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlayStoreId(value: String): Self = StObject.set(x, "playStoreId", value.asInstanceOf[js.Any])
    }
  }
}
