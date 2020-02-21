package typings.reactBeautifulDnd.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DroppableProvidedProps extends js.Object {
  // used for shared global styles
  var `data-rbd-droppable-context-id`: String
  // Used to lookup. Currently not used for drag and drop lifecycle
  var `data-rbd-droppable-id`: DroppableId
}

object DroppableProvidedProps {
  @scala.inline
  def apply(`data-rbd-droppable-context-id`: String, `data-rbd-droppable-id`: DroppableId): DroppableProvidedProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("data-rbd-droppable-context-id")(`data-rbd-droppable-context-id`.asInstanceOf[js.Any])
    __obj.updateDynamic("data-rbd-droppable-id")(`data-rbd-droppable-id`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DroppableProvidedProps]
  }
}

