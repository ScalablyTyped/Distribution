package typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleApiAvailabilityType extends js.Object {
  var error: js.UndefOr[String] = js.undefined
  var isAvailable: Boolean
  var isUserResolvableError: js.UndefOr[Boolean] = js.undefined
  var status: Double
}

object GoogleApiAvailabilityType {
  @scala.inline
  def apply(
    isAvailable: Boolean,
    status: Double,
    error: String = null,
    isUserResolvableError: js.UndefOr[Boolean] = js.undefined
  ): GoogleApiAvailabilityType = {
    val __obj = js.Dynamic.literal(isAvailable = isAvailable, status = status)
    if (error != null) __obj.updateDynamic("error")(error)
    if (!js.isUndefined(isUserResolvableError)) __obj.updateDynamic("isUserResolvableError")(isUserResolvableError)
    __obj.asInstanceOf[GoogleApiAvailabilityType]
  }
}

