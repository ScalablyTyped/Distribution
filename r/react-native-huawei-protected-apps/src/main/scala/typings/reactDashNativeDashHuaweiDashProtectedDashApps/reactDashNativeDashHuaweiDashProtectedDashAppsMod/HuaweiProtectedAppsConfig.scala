package typings.reactDashNativeDashHuaweiDashProtectedDashApps.reactDashNativeDashHuaweiDashProtectedDashAppsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HuaweiProtectedAppsConfig extends js.Object {
  var doNotShowAgainText: String
  var negativeText: String
  var positiveText: String
  var text: String
  var title: String
}

object HuaweiProtectedAppsConfig {
  @scala.inline
  def apply(
    doNotShowAgainText: String,
    negativeText: String,
    positiveText: String,
    text: String,
    title: String
  ): HuaweiProtectedAppsConfig = {
    val __obj = js.Dynamic.literal(doNotShowAgainText = doNotShowAgainText, negativeText = negativeText, positiveText = positiveText, text = text, title = title)
  
    __obj.asInstanceOf[HuaweiProtectedAppsConfig]
  }
}

