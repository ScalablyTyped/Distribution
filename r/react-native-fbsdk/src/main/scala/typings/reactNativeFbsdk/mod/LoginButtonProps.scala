package typings.reactNativeFbsdk.mod

import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoginButtonProps extends StObject {
  
  /**
    * The default audience to target when attempting a login.
    */
  var defaultAudience: js.UndefOr[DefaultAudience] = js.undefined
  
  /**
    * The behavior to use when attempting a login.
    * @platform android
    */
  var loginBehaviorAndroid: js.UndefOr[LoginBehaviorAndroid] = js.undefined
  
  /**
    * The behavior to use when attempting a login.
    * @platform ios
    */
  var loginBehaviorIOS: js.UndefOr[LoginBehaviorIOS] = js.undefined
  
  /**
    * The callback invoked upon error/completion of a login request.
    */
  var onLoginFinished: js.UndefOr[js.Function2[/* error */ js.Object, /* result */ LoginResult, Unit]] = js.undefined
  
  /**
    * The callback invoked upon completion of a logout request.
    */
  var onLogoutFinished: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * Represents the permissions to request when the login button
    * is pressed.
    */
  var permissions: js.UndefOr[js.Array[Permissions]] = js.undefined
  
  /**
    * View style, if any.
    */
  var style: js.UndefOr[ViewStyle] = js.undefined
  
  /**
    * For iOS only, the desired tooltip behavior.
    * @platform ios
    */
  var tooltipBehaviorIOS: js.UndefOr[TooltipBehaviorIOS] = js.undefined
}
object LoginButtonProps {
  
  @scala.inline
  def apply(): LoginButtonProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoginButtonProps]
  }
  
  @scala.inline
  implicit class LoginButtonPropsMutableBuilder[Self <: LoginButtonProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultAudience(value: DefaultAudience): Self = StObject.set(x, "defaultAudience", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultAudienceUndefined: Self = StObject.set(x, "defaultAudience", js.undefined)
    
    @scala.inline
    def setLoginBehaviorAndroid(value: LoginBehaviorAndroid): Self = StObject.set(x, "loginBehaviorAndroid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoginBehaviorAndroidUndefined: Self = StObject.set(x, "loginBehaviorAndroid", js.undefined)
    
    @scala.inline
    def setLoginBehaviorIOS(value: LoginBehaviorIOS): Self = StObject.set(x, "loginBehaviorIOS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoginBehaviorIOSUndefined: Self = StObject.set(x, "loginBehaviorIOS", js.undefined)
    
    @scala.inline
    def setOnLoginFinished(value: (/* error */ js.Object, /* result */ LoginResult) => Unit): Self = StObject.set(x, "onLoginFinished", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnLoginFinishedUndefined: Self = StObject.set(x, "onLoginFinished", js.undefined)
    
    @scala.inline
    def setOnLogoutFinished(value: () => Unit): Self = StObject.set(x, "onLogoutFinished", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnLogoutFinishedUndefined: Self = StObject.set(x, "onLogoutFinished", js.undefined)
    
    @scala.inline
    def setPermissions(value: js.Array[Permissions]): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissionsUndefined: Self = StObject.set(x, "permissions", js.undefined)
    
    @scala.inline
    def setPermissionsVarargs(value: Permissions*): Self = StObject.set(x, "permissions", js.Array(value :_*))
    
    @scala.inline
    def setStyle(value: ViewStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setTooltipBehaviorIOS(value: TooltipBehaviorIOS): Self = StObject.set(x, "tooltipBehaviorIOS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltipBehaviorIOSUndefined: Self = StObject.set(x, "tooltipBehaviorIOS", js.undefined)
  }
}
