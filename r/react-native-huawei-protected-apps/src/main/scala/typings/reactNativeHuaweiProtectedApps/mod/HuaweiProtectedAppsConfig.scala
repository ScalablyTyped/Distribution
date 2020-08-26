package typings.reactNativeHuaweiProtectedApps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HuaweiProtectedAppsConfig extends js.Object {
  var doNotShowAgainText: String = js.native
  var negativeText: String = js.native
  var positiveText: String = js.native
  var text: String = js.native
  var title: String = js.native
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
  @scala.inline
  implicit class HuaweiProtectedAppsConfigOps[Self <: HuaweiProtectedAppsConfig] (val x: Self) extends AnyVal {
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
    def setDoNotShowAgainText(value: String): Self = this.set("doNotShowAgainText", value.asInstanceOf[js.Any])
    @scala.inline
    def setNegativeText(value: String): Self = this.set("negativeText", value.asInstanceOf[js.Any])
    @scala.inline
    def setPositiveText(value: String): Self = this.set("positiveText", value.asInstanceOf[js.Any])
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
  }
  
}

