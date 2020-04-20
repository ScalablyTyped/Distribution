package typings.rotJs.cellularMod

import typings.rotJs.rotJsNumbers.`4`
import typings.rotJs.rotJsNumbers.`6`
import typings.rotJs.rotJsNumbers.`8`
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
    val __obj = js.Dynamic.literal(born = born.asInstanceOf[js.Any], survive = survive.asInstanceOf[js.Any], topology = topology.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

