package typings.prosemirrorHistory

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDepth extends js.Object {
  var depth: js.UndefOr[Double | Null] = js.undefined
  var newGroupDelay: js.UndefOr[Double | Null] = js.undefined
}

object AnonDepth {
  @scala.inline
  def apply(depth: Int | Double = null, newGroupDelay: Int | Double = null): AnonDepth = {
    val __obj = js.Dynamic.literal()
    if (depth != null) __obj.updateDynamic("depth")(depth.asInstanceOf[js.Any])
    if (newGroupDelay != null) __obj.updateDynamic("newGroupDelay")(newGroupDelay.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDepth]
  }
}

