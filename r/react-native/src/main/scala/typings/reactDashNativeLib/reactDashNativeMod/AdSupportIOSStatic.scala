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

