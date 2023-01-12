package typings.reactNativeFirebase.mod.RNFirebase

import typings.reactNativeFirebase.anon.BundleId
import typings.reactNativeFirebase.anon.InstallApp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionCodeSettings extends StObject {
  
  var android: InstallApp
  
  var handleCodeInApp: js.UndefOr[Boolean] = js.undefined
  
  var iOS: BundleId
  
  var url: String
}
object ActionCodeSettings {
  
  inline def apply(android: InstallApp, iOS: BundleId, url: String): ActionCodeSettings = {
    val __obj = js.Dynamic.literal(android = android.asInstanceOf[js.Any], iOS = iOS.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionCodeSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ActionCodeSettings] (val x: Self) extends AnyVal {
    
    inline def setAndroid(value: InstallApp): Self = StObject.set(x, "android", value.asInstanceOf[js.Any])
    
    inline def setHandleCodeInApp(value: Boolean): Self = StObject.set(x, "handleCodeInApp", value.asInstanceOf[js.Any])
    
    inline def setHandleCodeInAppUndefined: Self = StObject.set(x, "handleCodeInApp", js.undefined)
    
    inline def setIOS(value: BundleId): Self = StObject.set(x, "iOS", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
