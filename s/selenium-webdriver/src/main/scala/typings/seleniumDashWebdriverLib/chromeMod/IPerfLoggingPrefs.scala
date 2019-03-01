package typings
package seleniumDashWebdriverLib.chromeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPerfLoggingPrefs extends js.Object {
  var bufferUsageReportingInterval: scala.Double
  var enableNetwork: scala.Boolean
  var enablePage: scala.Boolean
  var enableTimeline: scala.Boolean
  var tracingCategories: java.lang.String
}

object IPerfLoggingPrefs {
  @scala.inline
  def apply(
    bufferUsageReportingInterval: scala.Double,
    enableNetwork: scala.Boolean,
    enablePage: scala.Boolean,
    enableTimeline: scala.Boolean,
    tracingCategories: java.lang.String
  ): IPerfLoggingPrefs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bufferUsageReportingInterval")(bufferUsageReportingInterval)
    __obj.updateDynamic("enableNetwork")(enableNetwork)
    __obj.updateDynamic("enablePage")(enablePage)
    __obj.updateDynamic("enableTimeline")(enableTimeline)
    __obj.updateDynamic("tracingCategories")(tracingCategories)
    __obj.asInstanceOf[IPerfLoggingPrefs]
  }
}

