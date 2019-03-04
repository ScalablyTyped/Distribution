package typings
package reactDashNativeDashHuaweiDashProtectedDashAppsLib.reactDashNativeDashHuaweiDashProtectedDashAppsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HuaweiProtectedAppsConfig extends js.Object {
  var doNotShowAgainText: java.lang.String
  var negativeText: java.lang.String
  var positiveText: java.lang.String
  var text: java.lang.String
  var title: java.lang.String
}

object HuaweiProtectedAppsConfig {
  @scala.inline
  def apply(
    doNotShowAgainText: java.lang.String,
    negativeText: java.lang.String,
    positiveText: java.lang.String,
    text: java.lang.String,
    title: java.lang.String
  ): HuaweiProtectedAppsConfig = {
    val __obj = js.Dynamic.literal(doNotShowAgainText = doNotShowAgainText, negativeText = negativeText, positiveText = positiveText, text = text, title = title)
  
    __obj.asInstanceOf[HuaweiProtectedAppsConfig]
  }
}

