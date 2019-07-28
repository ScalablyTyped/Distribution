package typings.roxDashReactDashNative.roxDashReactDashNativeMod

import typings.roxDashReactDashNative.roxDashReactDashNativeStrings.APPLIED_FROM_CACHE
import typings.roxDashReactDashNative.roxDashReactDashNativeStrings.APPLIED_FROM_EMBEDDED
import typings.roxDashReactDashNative.roxDashReactDashNativeStrings.APPLIED_FROM_NETWORK
import typings.roxDashReactDashNative.roxDashReactDashNativeStrings.ERROR_FETCH_FAILED
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RoxFetcherResult extends js.Object {
  var creationDate: Date
  var errorDetails: js.UndefOr[String] = js.undefined
  var fetcherStatus: APPLIED_FROM_EMBEDDED | APPLIED_FROM_CACHE | APPLIED_FROM_NETWORK | ERROR_FETCH_FAILED
  var hasChanges: Boolean
}

object RoxFetcherResult {
  @scala.inline
  def apply(
    creationDate: Date,
    fetcherStatus: APPLIED_FROM_EMBEDDED | APPLIED_FROM_CACHE | APPLIED_FROM_NETWORK | ERROR_FETCH_FAILED,
    hasChanges: Boolean,
    errorDetails: String = null
  ): RoxFetcherResult = {
    val __obj = js.Dynamic.literal(creationDate = creationDate, fetcherStatus = fetcherStatus.asInstanceOf[js.Any], hasChanges = hasChanges)
    if (errorDetails != null) __obj.updateDynamic("errorDetails")(errorDetails)
    __obj.asInstanceOf[RoxFetcherResult]
  }
}

