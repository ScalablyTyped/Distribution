package typings.rotDashJs.rotDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FOVOptions extends js.Object {
  var topology: js.UndefOr[Double] = js.undefined
}

object FOVOptions {
  @scala.inline
  def apply(topology: Int | Double = null): FOVOptions = {
    val __obj = js.Dynamic.literal()
    if (topology != null) __obj.updateDynamic("topology")(topology.asInstanceOf[js.Any])
    __obj.asInstanceOf[FOVOptions]
  }
}

