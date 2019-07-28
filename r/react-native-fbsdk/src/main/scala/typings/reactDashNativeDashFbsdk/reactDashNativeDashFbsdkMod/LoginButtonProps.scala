package typings.reactDashNativeDashFbsdk.reactDashNativeDashFbsdkMod

import typings.reactDashNative.reactDashNativeMod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoginButtonProps extends js.Object {
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
    * Represents the publish permissions to request when the login
    * button is pressed.
    */
  var publishPermissions: js.UndefOr[js.Array[Permissions]] = js.undefined
  /**
    * Represents the read permissions to request when the login button
    * is pressed.
    */
  var readPermissions: js.UndefOr[js.Array[Permissions]] = js.undefined
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
  def apply(
    defaultAudience: DefaultAudience = null,
    loginBehaviorAndroid: LoginBehaviorAndroid = null,
    loginBehaviorIOS: LoginBehaviorIOS = null,
    onLoginFinished: (/* error */ js.Object, /* result */ LoginResult) => Unit = null,
    onLogoutFinished: () => Unit = null,
    publishPermissions: js.Array[Permissions] = null,
    readPermissions: js.Array[Permissions] = null,
    style: ViewStyle = null,
    tooltipBehaviorIOS: TooltipBehaviorIOS = null
  ): LoginButtonProps = {
    val __obj = js.Dynamic.literal()
    if (defaultAudience != null) __obj.updateDynamic("defaultAudience")(defaultAudience)
    if (loginBehaviorAndroid != null) __obj.updateDynamic("loginBehaviorAndroid")(loginBehaviorAndroid)
    if (loginBehaviorIOS != null) __obj.updateDynamic("loginBehaviorIOS")(loginBehaviorIOS)
    if (onLoginFinished != null) __obj.updateDynamic("onLoginFinished")(js.Any.fromFunction2(onLoginFinished))
    if (onLogoutFinished != null) __obj.updateDynamic("onLogoutFinished")(js.Any.fromFunction0(onLogoutFinished))
    if (publishPermissions != null) __obj.updateDynamic("publishPermissions")(publishPermissions)
    if (readPermissions != null) __obj.updateDynamic("readPermissions")(readPermissions)
    if (style != null) __obj.updateDynamic("style")(style)
    if (tooltipBehaviorIOS != null) __obj.updateDynamic("tooltipBehaviorIOS")(tooltipBehaviorIOS)
    __obj.asInstanceOf[LoginButtonProps]
  }
}

