package typings.prosemirrorHistory.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Depth extends js.Object {
  var depth: js.UndefOr[Double | Null] = js.undefined
  var newGroupDelay: js.UndefOr[Double | Null] = js.undefined
}

object Depth {
  @scala.inline
  def apply(
    depth: js.UndefOr[Null | Double] = js.undefined,
    newGroupDelay: js.UndefOr[Null | Double] = js.undefined
  ): Depth = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(depth)) __obj.updateDynamic("depth")(depth.asInstanceOf[js.Any])
    if (!js.isUndefined(newGroupDelay)) __obj.updateDynamic("newGroupDelay")(newGroupDelay.asInstanceOf[js.Any])
    __obj.asInstanceOf[Depth]
  }
}

