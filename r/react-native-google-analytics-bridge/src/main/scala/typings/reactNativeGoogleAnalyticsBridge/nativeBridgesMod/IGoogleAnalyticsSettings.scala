package typings.reactNativeGoogleAnalyticsBridge.nativeBridgesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGoogleAnalyticsSettings extends js.Object {
  def setDispatchInterval(intervalInSeconds: js.Any): Unit
  def setDryRun(enabled: js.Any): Unit
  def setOptOut(enabled: js.Any): Unit
}

object IGoogleAnalyticsSettings {
  @scala.inline
  def apply(setDispatchInterval: js.Any => Unit, setDryRun: js.Any => Unit, setOptOut: js.Any => Unit): IGoogleAnalyticsSettings = {
    val __obj = js.Dynamic.literal(setDispatchInterval = js.Any.fromFunction1(setDispatchInterval), setDryRun = js.Any.fromFunction1(setDryRun), setOptOut = js.Any.fromFunction1(setOptOut))
  
    __obj.asInstanceOf[IGoogleAnalyticsSettings]
  }
}

