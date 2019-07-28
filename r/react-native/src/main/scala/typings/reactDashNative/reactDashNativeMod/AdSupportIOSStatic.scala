package typings.reactDashNative.reactDashNativeMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdSupportIOSStatic extends js.Object {
  def getAdvertisingId(
    onSuccess: js.Function1[/* deviceId */ String, Unit],
    onFailure: js.Function1[/* err */ Error, Unit]
  ): Unit
  def getAdvertisingTrackingEnabled(
    onSuccess: js.Function1[/* hasTracking */ Boolean, Unit],
    onFailure: js.Function1[/* err */ Error, Unit]
  ): Unit
}

object AdSupportIOSStatic {
  @scala.inline
  def apply(
    getAdvertisingId: (js.Function1[/* deviceId */ String, Unit], js.Function1[/* err */ Error, Unit]) => Unit,
    getAdvertisingTrackingEnabled: (js.Function1[/* hasTracking */ Boolean, Unit], js.Function1[/* err */ Error, Unit]) => Unit
  ): AdSupportIOSStatic = {
    val __obj = js.Dynamic.literal(getAdvertisingId = js.Any.fromFunction2(getAdvertisingId), getAdvertisingTrackingEnabled = js.Any.fromFunction2(getAdvertisingTrackingEnabled))
  
    __obj.asInstanceOf[AdSupportIOSStatic]
  }
}

