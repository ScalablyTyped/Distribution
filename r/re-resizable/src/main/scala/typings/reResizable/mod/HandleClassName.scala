package typings.reResizable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HandleClassName extends js.Object {
  var bottom: js.UndefOr[String] = js.undefined
  var bottomLeft: js.UndefOr[String] = js.undefined
  var bottomRight: js.UndefOr[String] = js.undefined
  var left: js.UndefOr[String] = js.undefined
  var right: js.UndefOr[String] = js.undefined
  var top: js.UndefOr[String] = js.undefined
  var topLeft: js.UndefOr[String] = js.undefined
  var topRight: js.UndefOr[String] = js.undefined
}

object HandleClassName {
  @scala.inline
  def apply(
    bottom: String = null,
    bottomLeft: String = null,
    bottomRight: String = null,
    left: String = null,
    right: String = null,
    top: String = null,
    topLeft: String = null,
    topRight: String = null
  ): HandleClassName = {
    val __obj = js.Dynamic.literal()
    if (bottom != null) __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    if (bottomLeft != null) __obj.updateDynamic("bottomLeft")(bottomLeft.asInstanceOf[js.Any])
    if (bottomRight != null) __obj.updateDynamic("bottomRight")(bottomRight.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    if (topLeft != null) __obj.updateDynamic("topLeft")(topLeft.asInstanceOf[js.Any])
    if (topRight != null) __obj.updateDynamic("topRight")(topRight.asInstanceOf[js.Any])
    __obj.asInstanceOf[HandleClassName]
  }
}

