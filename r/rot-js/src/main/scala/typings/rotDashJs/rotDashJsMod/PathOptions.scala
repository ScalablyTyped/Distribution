package typings.rotDashJs.rotDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PathOptions extends js.Object {
  var topology: js.UndefOr[Double] = js.undefined
}

object PathOptions {
  @scala.inline
  def apply(topology: Int | Double = null): PathOptions = {
    val __obj = js.Dynamic.literal()
    if (topology != null) __obj.updateDynamic("topology")(topology.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathOptions]
  }
}

