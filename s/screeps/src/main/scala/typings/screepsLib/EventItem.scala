package typings
package screepsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventItem[T /* <: EventConstant */] extends js.Object {
  var data: /* import warning: ImportType.apply Failed type conversion: screeps.EventData[T] */ js.Any
  var event: T
  var objectId: java.lang.String
}

object EventItem {
  @scala.inline
  def apply[T /* <: EventConstant */](
    data: /* import warning: ImportType.apply Failed type conversion: screeps.EventData[T] */ js.Any,
    event: T,
    objectId: java.lang.String
  ): EventItem[T] = {
    val __obj = js.Dynamic.literal(data = data, event = event.asInstanceOf[js.Any], objectId = objectId)
  
    __obj.asInstanceOf[EventItem[T]]
  }
}

