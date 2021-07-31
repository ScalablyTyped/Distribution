package typings.reactNativeAppLink

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-app-link", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object default {
    
    @JSImport("react-native-app-link", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def maybeOpenURL(url: String, options: AppLinkOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("maybeOpenURL")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    
    @scala.inline
    def openInStore(options: AppLinkOptions): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("openInStore")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  }
  
  @scala.inline
  def maybeOpenURL(url: String, options: AppLinkOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("maybeOpenURL")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  @scala.inline
  def openInStore(options: AppLinkOptions): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("openInStore")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  trait AppLinkOptions extends StObject {
    
    val appName: String
    
    val appStoreId: Double
    
    val appStoreLocale: String
    
    val playStoreId: String
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
