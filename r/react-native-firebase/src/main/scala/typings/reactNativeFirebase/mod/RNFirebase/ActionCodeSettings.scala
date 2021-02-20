package typings.reactNativeFirebase.mod.RNFirebase

import typings.reactNativeFirebase.anon.BundleId
import typings.reactNativeFirebase.anon.InstallApp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActionCodeSettings extends StObject {
  
  var android: InstallApp = js.native
  
  var handleCodeInApp: js.UndefOr[Boolean] = js.native
  
  var iOS: BundleId = js.native
  
  var url: String = js.native
}
object ActionCodeSettings {
  
  @scala.inline
  def apply(android: InstallApp, iOS: BundleId, url: String): ActionCodeSettings = {
    val __obj = js.Dynamic.literal(android = android.asInstanceOf[js.Any], iOS = iOS.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionCodeSettings]
  }
  
  @scala.inline
  implicit class ActionCodeSettingsMutableBuilder[Self <: ActionCodeSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAndroid(value: InstallApp): Self = StObject.set(x, "android", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHandleCodeInApp(value: Boolean): Self = StObject.set(x, "handleCodeInApp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHandleCodeInAppUndefined: Self = StObject.set(x, "handleCodeInApp", js.undefined)
    
    @scala.inline
    def setIOS(value: BundleId): Self = StObject.set(x, "iOS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
