package typings
package rotDashJsLib.rotDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RogueOptions extends js.Object {
  var cellHeight: js.UndefOr[scala.Double] = js.undefined
  var cellWidth: js.UndefOr[scala.Double] = js.undefined
  var roomHeight: js.UndefOr[js.Tuple2[scala.Double, scala.Double]] = js.undefined
  var roomWidth: js.UndefOr[js.Tuple2[scala.Double, scala.Double]] = js.undefined
}

object RogueOptions {
  @scala.inline
  def apply(
    cellHeight: scala.Int | scala.Double = null,
    cellWidth: scala.Int | scala.Double = null,
    roomHeight: js.Tuple2[scala.Double, scala.Double] = null,
    roomWidth: js.Tuple2[scala.Double, scala.Double] = null
  ): RogueOptions = {
    val __obj = js.Dynamic.literal()
    if (cellHeight != null) __obj.updateDynamic("cellHeight")(cellHeight.asInstanceOf[js.Any])
    if (cellWidth != null) __obj.updateDynamic("cellWidth")(cellWidth.asInstanceOf[js.Any])
    if (roomHeight != null) __obj.updateDynamic("roomHeight")(roomHeight)
    if (roomWidth != null) __obj.updateDynamic("roomWidth")(roomWidth)
    __obj.asInstanceOf[RogueOptions]
  }
}

