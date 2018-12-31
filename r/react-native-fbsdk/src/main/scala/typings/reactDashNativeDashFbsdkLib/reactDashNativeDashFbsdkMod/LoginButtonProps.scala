package typings
package reactDashNativeDashFbsdkLib.reactDashNativeDashFbsdkMod

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
  var onLoginFinished: js.UndefOr[js.Function2[/* error */ js.Object, /* result */ LoginResult, scala.Unit]] = js.undefined
  /**
    * The callback invoked upon completion of a logout request.
    */
  var onLogoutFinished: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
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
  var style: js.UndefOr[reactDashNativeLib.reactDashNativeMod.ViewStyle] = js.undefined
  /**
    * For iOS only, the desired tooltip behavior.
    * @platform ios
    */
  var tooltipBehaviorIOS: js.UndefOr[TooltipBehaviorIOS] = js.undefined
}

