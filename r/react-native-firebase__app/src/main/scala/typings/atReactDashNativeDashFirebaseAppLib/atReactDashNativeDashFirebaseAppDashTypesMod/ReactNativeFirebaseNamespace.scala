package typings
package atReactDashNativeDashFirebaseAppLib.atReactDashNativeDashFirebaseAppDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactNativeFirebaseNamespace extends js.Object {
  var utils: js.UndefOr[atReactDashNativeDashFirebaseAppLib.Fn_App] = js.undefined
}

object ReactNativeFirebaseNamespace {
  @scala.inline
  def apply(utils: atReactDashNativeDashFirebaseAppLib.Fn_App = null): ReactNativeFirebaseNamespace = {
    val __obj = js.Dynamic.literal()
    if (utils != null) __obj.updateDynamic("utils")(utils)
    __obj.asInstanceOf[ReactNativeFirebaseNamespace]
  }
}

