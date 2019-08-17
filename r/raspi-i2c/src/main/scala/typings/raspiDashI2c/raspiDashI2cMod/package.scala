package typings.raspiDashI2c

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object raspiDashI2cMod {
  import typings.node.Buffer
  import typings.std.Error

  type ReadCallback = js.Function2[/* err */ Null | Error | String, /* data */ Null | Buffer | Double, Unit]
  type WriteCallback = js.Function1[/* err */ Null | Error | String, Unit]
}
