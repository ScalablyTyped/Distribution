package typings.seleniumDashWebdriver.chromeMod

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
    val __obj = js.Dynamic.literal(bufferUsageReportingInterval = bufferUsageReportingInterval, enableNetwork = enableNetwork, enablePage = enablePage, enableTimeline = enableTimeline, tracingCategories = tracingCategories)
  
    __obj.asInstanceOf[IPerfLoggingPrefs]
  }
}

