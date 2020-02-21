package typings.reactBeautifulDnd.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiftRequest extends js.Object {
  var draggableId: DraggableId
  var scrollOptions: ScrollOptions
}

object LiftRequest {
  @scala.inline
  def apply(draggableId: DraggableId, scrollOptions: ScrollOptions): LiftRequest = {
    val __obj = js.Dynamic.literal(draggableId = draggableId.asInstanceOf[js.Any], scrollOptions = scrollOptions.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LiftRequest]
  }
}

