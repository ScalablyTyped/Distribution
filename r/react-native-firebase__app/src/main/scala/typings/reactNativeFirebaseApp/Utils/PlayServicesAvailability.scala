package typings.reactNativeFirebaseApp.Utils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlayServicesAvailability extends js.Object {
  /**
    * A human readable error string
    *
    * ```js
    * firebase.utils().playServicesAvailability.error;
    * ```
    * @android Android only - iOS returns undefined
    */
  var error: js.UndefOr[String] = js.native
  /**
    * If Play Services is not available on the device, hasResolution indicates
    * whether it is possible to do something about it (e.g. install Play Services).
    *
    * ```js
    * firebase.utils().playServicesAvailability.hasResolution;
    * ```
    * @android Android only - iOS returns undefined
    */
  var hasResolution: js.UndefOr[Boolean] = js.native
  /**
    * Returns a boolean indicating whether Play Store is available on the device
    *
    * ```js
    * firebase.utils().playServicesAvailability.isAvailable;
    * ```
    *
    * @android Android only - iOS returns true
    */
  var isAvailable: Boolean = js.native
  /**
    * If an error was received, this indicates whether the error is resolvable
    *
    * ```js
    * firebase.utils().playServicesAvailability.isUserResolvableError;
    * ```
    * @android Android only - iOS returns undefined
    */
  var isUserResolvableError: js.UndefOr[Boolean] = js.native
  /**
    * Returns a numeric status code. Please refer to Android documentation
    * for further information:
    * https://developers.google.com/android/reference/com/google/android/gms/common/ConnectionResult
    *
    * ```js
    * firebase.utils().playServicesAvailability.status;
    * ```
    *
    * @android Android only - iOS returns 0
    */
  var status: PlayServicesAvailabilityStatusCodes = js.native
}

object PlayServicesAvailability {
  @scala.inline
  def apply(isAvailable: Boolean, status: PlayServicesAvailabilityStatusCodes): PlayServicesAvailability = {
    val __obj = js.Dynamic.literal(isAvailable = isAvailable.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlayServicesAvailability]
  }
  @scala.inline
  implicit class PlayServicesAvailabilityOps[Self <: PlayServicesAvailability] (val x: Self) extends AnyVal {
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
    def setIsAvailable(value: Boolean): Self = this.set("isAvailable", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: PlayServicesAvailabilityStatusCodes): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def setError(value: String): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setHasResolution(value: Boolean): Self = this.set("hasResolution", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHasResolution: Self = this.set("hasResolution", js.undefined)
    @scala.inline
    def setIsUserResolvableError(value: Boolean): Self = this.set("isUserResolvableError", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsUserResolvableError: Self = this.set("isUserResolvableError", js.undefined)
  }
  
}

