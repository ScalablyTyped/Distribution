package typings.reactBeautifulDnd.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DroppableProvidedProps extends js.Object {
  // used for shared global styles
  var `data-react-beautiful-dnd-droppable`: String
}

object DroppableProvidedProps {
  @scala.inline
  def apply(`data-react-beautiful-dnd-droppable`: String): DroppableProvidedProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("data-react-beautiful-dnd-droppable")(`data-react-beautiful-dnd-droppable`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DroppableProvidedProps]
  }
}

