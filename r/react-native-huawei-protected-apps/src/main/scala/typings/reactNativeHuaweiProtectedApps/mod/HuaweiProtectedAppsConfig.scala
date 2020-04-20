package typings.reactNativeHuaweiProtectedApps.mod

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
    val __obj = js.Dynamic.literal(doNotShowAgainText = doNotShowAgainText.asInstanceOf[js.Any], negativeText = negativeText.asInstanceOf[js.Any], positiveText = positiveText.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[HuaweiProtectedAppsConfig]
  }
}

