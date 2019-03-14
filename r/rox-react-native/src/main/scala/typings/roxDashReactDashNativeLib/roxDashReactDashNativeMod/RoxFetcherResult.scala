package typings
package roxDashReactDashNativeLib.roxDashReactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RoxFetcherResult extends js.Object {
  var creationDate: stdLib.Date
  var errorDetails: js.UndefOr[java.lang.String] = js.undefined
  var fetcherStatus: roxDashReactDashNativeLib.roxDashReactDashNativeLibStrings.APPLIED_FROM_EMBEDDED | roxDashReactDashNativeLib.roxDashReactDashNativeLibStrings.APPLIED_FROM_CACHE | roxDashReactDashNativeLib.roxDashReactDashNativeLibStrings.APPLIED_FROM_NETWORK | roxDashReactDashNativeLib.roxDashReactDashNativeLibStrings.ERROR_FETCH_FAILED
  var hasChanges: scala.Boolean
}

object RoxFetcherResult {
  @scala.inline
  def apply(
    creationDate: stdLib.Date,
    fetcherStatus: roxDashReactDashNativeLib.roxDashReactDashNativeLibStrings.APPLIED_FROM_EMBEDDED | roxDashReactDashNativeLib.roxDashReactDashNativeLibStrings.APPLIED_FROM_CACHE | roxDashReactDashNativeLib.roxDashReactDashNativeLibStrings.APPLIED_FROM_NETWORK | roxDashReactDashNativeLib.roxDashReactDashNativeLibStrings.ERROR_FETCH_FAILED,
    hasChanges: scala.Boolean,
    errorDetails: java.lang.String = null
  ): RoxFetcherResult = {
    val __obj = js.Dynamic.literal(creationDate = creationDate, fetcherStatus = fetcherStatus.asInstanceOf[js.Any], hasChanges = hasChanges)
    if (errorDetails != null) __obj.updateDynamic("errorDetails")(errorDetails)
    __obj.asInstanceOf[RoxFetcherResult]
  }
}

