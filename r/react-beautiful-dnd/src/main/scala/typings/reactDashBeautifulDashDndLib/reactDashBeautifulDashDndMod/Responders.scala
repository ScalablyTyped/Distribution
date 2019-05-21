package typings
package reactDashBeautifulDashDndLib.reactDashBeautifulDashDndMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Responders extends js.Object {
  var onBeforeDragStart: js.UndefOr[OnBeforeDragStartResponder] = js.undefined
  var onDragEnd: OnDragEndResponder
  var onDragStart: js.UndefOr[OnDragStartResponder] = js.undefined
  var onDragUpdate: js.UndefOr[OnDragUpdateResponder] = js.undefined
}

object Responders {
  @scala.inline
  def apply(
    onDragEnd: OnDragEndResponder,
    onBeforeDragStart: OnBeforeDragStartResponder = null,
    onDragStart: OnDragStartResponder = null,
    onDragUpdate: OnDragUpdateResponder = null
  ): Responders = {
    val __obj = js.Dynamic.literal(onDragEnd = onDragEnd)
    if (onBeforeDragStart != null) __obj.updateDynamic("onBeforeDragStart")(onBeforeDragStart)
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(onDragStart)
    if (onDragUpdate != null) __obj.updateDynamic("onDragUpdate")(onDragUpdate)
    __obj.asInstanceOf[Responders]
  }
}

