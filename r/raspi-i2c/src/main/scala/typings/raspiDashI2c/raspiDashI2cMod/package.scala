package typings.raspiDashI2c

import typings.node.Buffer
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object raspiDashI2cMod {
  type ReadCallback = js.Function2[/* err */ Null | Error | String, /* data */ Null | Buffer | Double, Unit]
  type WriteCallback = js.Function1[/* err */ Null | Error | String, Unit]
}
