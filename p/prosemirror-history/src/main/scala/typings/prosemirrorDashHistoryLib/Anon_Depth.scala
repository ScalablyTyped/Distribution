package typings
package prosemirrorDashHistoryLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Depth extends js.Object {
  var depth: js.UndefOr[scala.Double | scala.Null] = js.undefined
  var newGroupDelay: js.UndefOr[scala.Double | scala.Null] = js.undefined
}

object Anon_Depth {
  @scala.inline
  def apply(depth: scala.Int | scala.Double = null, newGroupDelay: scala.Int | scala.Double = null): Anon_Depth = {
    val __obj = js.Dynamic.literal()
    if (depth != null) __obj.updateDynamic("depth")(depth.asInstanceOf[js.Any])
    if (newGroupDelay != null) __obj.updateDynamic("newGroupDelay")(newGroupDelay.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Depth]
  }
}

