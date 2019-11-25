package typings.roxDashBrowser.roxDashBrowserMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RoxFetcherResult extends js.Object {
  var creationDate: Date
  var errorDetails: js.UndefOr[String] = js.undefined
  var fetcherStatus: RoxFetcherStatus
  var hasChanges: Boolean
}

object RoxFetcherResult {
  @scala.inline
  def apply(
    creationDate: Date,
    fetcherStatus: RoxFetcherStatus,
    hasChanges: Boolean,
    errorDetails: String = null
  ): RoxFetcherResult = {
    val __obj = js.Dynamic.literal(creationDate = creationDate.asInstanceOf[js.Any], fetcherStatus = fetcherStatus.asInstanceOf[js.Any], hasChanges = hasChanges.asInstanceOf[js.Any])
    if (errorDetails != null) __obj.updateDynamic("errorDetails")(errorDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoxFetcherResult]
  }
}

