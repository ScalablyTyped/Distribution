package typings.reactNativeGoogleAnalyticsBridge.nativeBridgesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGoogleAnalyticsSettings extends js.Object {
  def setDispatchInterval(intervalInSeconds: js.Any): Unit = js.native
  def setDryRun(enabled: js.Any): Unit = js.native
  def setOptOut(enabled: js.Any): Unit = js.native
}

object IGoogleAnalyticsSettings {
  @scala.inline
  def apply(setDispatchInterval: js.Any => Unit, setDryRun: js.Any => Unit, setOptOut: js.Any => Unit): IGoogleAnalyticsSettings = {
    val __obj = js.Dynamic.literal(setDispatchInterval = js.Any.fromFunction1(setDispatchInterval), setDryRun = js.Any.fromFunction1(setDryRun), setOptOut = js.Any.fromFunction1(setOptOut))
    __obj.asInstanceOf[IGoogleAnalyticsSettings]
  }
  @scala.inline
  implicit class IGoogleAnalyticsSettingsOps[Self <: IGoogleAnalyticsSettings] (val x: Self) extends AnyVal {
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
    def setSetDispatchInterval(value: js.Any => Unit): Self = this.set("setDispatchInterval", js.Any.fromFunction1(value))
    @scala.inline
    def setSetDryRun(value: js.Any => Unit): Self = this.set("setDryRun", js.Any.fromFunction1(value))
    @scala.inline
    def setSetOptOut(value: js.Any => Unit): Self = this.set("setOptOut", js.Any.fromFunction1(value))
  }
  
}

