package typings.rotDashJs.libMapCellularMod

import typings.rotDashJs.rotDashJsNumbers.`4`
import typings.rotDashJs.rotDashJsNumbers.`6`
import typings.rotDashJs.rotDashJsNumbers.`8`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var born: js.Array[Double]
  var survive: js.Array[Double]
  var topology: `4` | `6` | `8`
}

object Options {
  @scala.inline
  def apply(born: js.Array[Double], survive: js.Array[Double], topology: `4` | `6` | `8`): Options = {
    val __obj = js.Dynamic.literal(born = born, survive = survive, topology = topology.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Options]
  }
}

