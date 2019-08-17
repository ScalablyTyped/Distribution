package typings.raspiDashSerial

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object raspiDashSerialMod {
  import typings.std.Error

  type Callback = js.Function0[Unit]
  type ErrorCallback = js.Function1[/* err */ Error | String, Unit]
}
