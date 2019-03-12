package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdSupportIOSStatic extends js.Object {
  def getAdvertisingId(
    onSuccess: js.Function1[/* deviceId */ java.lang.String, scala.Unit],
    onFailure: js.Function1[/* err */ stdLib.Error, scala.Unit]
  ): scala.Unit
  def getAdvertisingTrackingEnabled(
    onSuccess: js.Function1[/* hasTracking */ scala.Boolean, scala.Unit],
    onFailure: js.Function1[/* err */ stdLib.Error, scala.Unit]
  ): scala.Unit
}

object AdSupportIOSStatic {
  @scala.inline
  def apply(
    getAdvertisingId: (js.Function1[/* deviceId */ java.lang.String, scala.Unit], js.Function1[/* err */ stdLib.Error, scala.Unit]) => scala.Unit,
    getAdvertisingTrackingEnabled: (js.Function1[/* hasTracking */ scala.Boolean, scala.Unit], js.Function1[/* err */ stdLib.Error, scala.Unit]) => scala.Unit
  ): AdSupportIOSStatic = {
    val __obj = js.Dynamic.literal(getAdvertisingId = js.Any.fromFunction2(getAdvertisingId), getAdvertisingTrackingEnabled = js.Any.fromFunction2(getAdvertisingTrackingEnabled))
  
    __obj.asInstanceOf[AdSupportIOSStatic]
  }
}

