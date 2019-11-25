package typings.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventItem[T /* <: EventConstant */] extends js.Object {
  var data: /* import warning: importer.ImportType#apply Failed type conversion: screeps.EventData[T] */ js.Any
  var event: T
  var objectId: String
}

object EventItem {
  @scala.inline
  def apply[T /* <: EventConstant */](
    data: /* import warning: importer.ImportType#apply Failed type conversion: screeps.EventData[T] */ js.Any,
    event: T,
    objectId: String
  ): EventItem[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], objectId = objectId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EventItem[T]]
  }
}

