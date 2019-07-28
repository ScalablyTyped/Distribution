package typings.rotDashJs.rotDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RogueOptions extends js.Object {
  var cellHeight: js.UndefOr[Double] = js.undefined
  var cellWidth: js.UndefOr[Double] = js.undefined
  var roomHeight: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
  var roomWidth: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
}

object RogueOptions {
  @scala.inline
  def apply(
    cellHeight: Int | Double = null,
    cellWidth: Int | Double = null,
    roomHeight: js.Tuple2[Double, Double] = null,
    roomWidth: js.Tuple2[Double, Double] = null
  ): RogueOptions = {
    val __obj = js.Dynamic.literal()
    if (cellHeight != null) __obj.updateDynamic("cellHeight")(cellHeight.asInstanceOf[js.Any])
    if (cellWidth != null) __obj.updateDynamic("cellWidth")(cellWidth.asInstanceOf[js.Any])
    if (roomHeight != null) __obj.updateDynamic("roomHeight")(roomHeight)
    if (roomWidth != null) __obj.updateDynamic("roomWidth")(roomWidth)
    __obj.asInstanceOf[RogueOptions]
  }
}

