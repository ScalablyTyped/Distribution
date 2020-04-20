package typings.reactNativeModalPopover.popoverTouchableMod

import typings.reactNativeModalPopover.popoverGeometryMod.Rect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait State extends js.Object {
  var popoverAnchor: Rect
  var showPopover: Boolean
}

object State {
  @scala.inline
  def apply(popoverAnchor: Rect, showPopover: Boolean): State = {
    val __obj = js.Dynamic.literal(popoverAnchor = popoverAnchor.asInstanceOf[js.Any], showPopover = showPopover.asInstanceOf[js.Any])
    __obj.asInstanceOf[State]
  }
}

