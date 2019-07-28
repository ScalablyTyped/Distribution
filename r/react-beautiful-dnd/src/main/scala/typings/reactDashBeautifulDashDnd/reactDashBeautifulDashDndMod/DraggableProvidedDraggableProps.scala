package typings.reactDashBeautifulDashDnd.reactDashBeautifulDashDndMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DraggableProvidedDraggableProps extends js.Object {
  // used for shared global styles
  var `data-react-beautiful-dnd-draggable`: String
  // inline style
  var style: js.UndefOr[DraggingStyle | NotDraggingStyle] = js.undefined
}

object DraggableProvidedDraggableProps {
  @scala.inline
  def apply(`data-react-beautiful-dnd-draggable`: String, style: DraggingStyle | NotDraggingStyle = null): DraggableProvidedDraggableProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("data-react-beautiful-dnd-draggable")(`data-react-beautiful-dnd-draggable`)
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[DraggableProvidedDraggableProps]
  }
}

