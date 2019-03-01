package typings
package rotDashJsLib.rotDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PathOptions extends js.Object {
  var topology: js.UndefOr[scala.Double] = js.undefined
}

object PathOptions {
  @scala.inline
  def apply(topology: scala.Int | scala.Double = null): PathOptions = {
    val __obj = js.Dynamic.literal()
    if (topology != null) __obj.updateDynamic("topology")(topology.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathOptions]
  }
}

