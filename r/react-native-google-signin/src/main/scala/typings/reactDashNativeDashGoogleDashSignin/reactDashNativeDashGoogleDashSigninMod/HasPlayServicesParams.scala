package typings.reactDashNativeDashGoogleDashSignin.reactDashNativeDashGoogleDashSigninMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HasPlayServicesParams extends js.Object {
  /**
    * When showPlayServicesUpdateDialog is true, the user will be prompted to
    * install Play Services if on Android and they are not installed.
    * Default is true
    */
  var showPlayServicesUpdateDialog: js.UndefOr[Boolean] = js.undefined
}

object HasPlayServicesParams {
  @scala.inline
  def apply(showPlayServicesUpdateDialog: js.UndefOr[Boolean] = js.undefined): HasPlayServicesParams = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(showPlayServicesUpdateDialog)) __obj.updateDynamic("showPlayServicesUpdateDialog")(showPlayServicesUpdateDialog)
    __obj.asInstanceOf[HasPlayServicesParams]
  }
}

