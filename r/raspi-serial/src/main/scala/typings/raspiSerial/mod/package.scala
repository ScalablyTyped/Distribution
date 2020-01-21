package typings.raspiSerial

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Callback = js.Function0[scala.Unit]
  type ErrorCallback = js.Function1[/* err */ typings.std.Error | java.lang.String, scala.Unit]
}
