package typings.reactNativeFbsdk.mod

import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoginButtonProps extends js.Object {
  
  /**
    * The default audience to target when attempting a login.
    */
  var defaultAudience: js.UndefOr[DefaultAudience] = js.native
  
  /**
    * The behavior to use when attempting a login.
    * @platform android
    */
  var loginBehaviorAndroid: js.UndefOr[LoginBehaviorAndroid] = js.native
  
  /**
    * The behavior to use when attempting a login.
    * @platform ios
    */
  var loginBehaviorIOS: js.UndefOr[LoginBehaviorIOS] = js.native
  
  /**
    * The callback invoked upon error/completion of a login request.
    */
  var onLoginFinished: js.UndefOr[js.Function2[/* error */ js.Object, /* result */ LoginResult, Unit]] = js.native
  
  /**
    * The callback invoked upon completion of a logout request.
    */
  var onLogoutFinished: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * Represents the permissions to request when the login button
    * is pressed.
    */
  var permissions: js.UndefOr[js.Array[Permissions]] = js.native
  
  /**
    * View style, if any.
    */
  var style: js.UndefOr[ViewStyle] = js.native
  
  /**
    * For iOS only, the desired tooltip behavior.
    * @platform ios
    */
  var tooltipBehaviorIOS: js.UndefOr[TooltipBehaviorIOS] = js.native
}
object LoginButtonProps {
  
  @scala.inline
  def apply(): LoginButtonProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoginButtonProps]
  }
  
  @scala.inline
  implicit class LoginButtonPropsOps[Self <: LoginButtonProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDefaultAudience(value: DefaultAudience): Self = this.set("defaultAudience", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultAudience: Self = this.set("defaultAudience", js.undefined)
    
    @scala.inline
    def setLoginBehaviorAndroid(value: LoginBehaviorAndroid): Self = this.set("loginBehaviorAndroid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoginBehaviorAndroid: Self = this.set("loginBehaviorAndroid", js.undefined)
    
    @scala.inline
    def setLoginBehaviorIOS(value: LoginBehaviorIOS): Self = this.set("loginBehaviorIOS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoginBehaviorIOS: Self = this.set("loginBehaviorIOS", js.undefined)
    
    @scala.inline
    def setOnLoginFinished(value: (/* error */ js.Object, /* result */ LoginResult) => Unit): Self = this.set("onLoginFinished", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnLoginFinished: Self = this.set("onLoginFinished", js.undefined)
    
    @scala.inline
    def setOnLogoutFinished(value: () => Unit): Self = this.set("onLogoutFinished", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnLogoutFinished: Self = this.set("onLogoutFinished", js.undefined)
    
    @scala.inline
    def setPermissionsVarargs(value: Permissions*): Self = this.set("permissions", js.Array(value :_*))
    
    @scala.inline
    def setPermissions(value: js.Array[Permissions]): Self = this.set("permissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePermissions: Self = this.set("permissions", js.undefined)
    
    @scala.inline
    def setStyle(value: ViewStyle): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setTooltipBehaviorIOS(value: TooltipBehaviorIOS): Self = this.set("tooltipBehaviorIOS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTooltipBehaviorIOS: Self = this.set("tooltipBehaviorIOS", js.undefined)
  }
}
