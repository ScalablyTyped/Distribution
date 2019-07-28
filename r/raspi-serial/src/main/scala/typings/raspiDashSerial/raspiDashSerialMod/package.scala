package typings.raspiDashSerial

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object raspiDashSerialMod {
  type Callback = js.Function0[Unit]
  type ErrorCallback = js.Function1[/* err */ Error | String, Unit]
}
