package typings.seleniumWebdriver.chromeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPerfLoggingPrefs extends js.Object {
  var bufferUsageReportingInterval: Double
  var enableNetwork: Boolean
  var enablePage: Boolean
  var enableTimeline: Boolean
  var tracingCategories: String
}

object IPerfLoggingPrefs {
  @scala.inline
  def apply(
    bufferUsageReportingInterval: Double,
    enableNetwork: Boolean,
    enablePage: Boolean,
    enableTimeline: Boolean,
    tracingCategories: String
  ): IPerfLoggingPrefs = {
    val __obj = js.Dynamic.literal(bufferUsageReportingInterval = bufferUsageReportingInterval.asInstanceOf[js.Any], enableNetwork = enableNetwork.asInstanceOf[js.Any], enablePage = enablePage.asInstanceOf[js.Any], enableTimeline = enableTimeline.asInstanceOf[js.Any], tracingCategories = tracingCategories.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPerfLoggingPrefs]
  }
}

