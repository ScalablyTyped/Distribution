package typings.rotDashJs.libPathPathMod

import typings.rotDashJs.rotDashJsNumbers.`4`
import typings.rotDashJs.rotDashJsNumbers.`6`
import typings.rotDashJs.rotDashJsNumbers.`8`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var topology: `4` | `6` | `8`
}

object Options {
  @scala.inline
  def apply(topology: `4` | `6` | `8`): Options = {
    val __obj = js.Dynamic.literal(topology = topology.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Options]
  }
}

