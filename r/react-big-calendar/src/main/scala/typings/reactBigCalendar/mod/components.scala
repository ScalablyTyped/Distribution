package typings.reactBigCalendar.mod

import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait components extends js.Object {
  var dateCellWrapper: ComponentType[js.Object]
  var eventWrapper: ComponentType[Event]
}

object components {
  @scala.inline
  def apply(dateCellWrapper: ComponentType[js.Object], eventWrapper: ComponentType[Event]): components = {
    val __obj = js.Dynamic.literal(dateCellWrapper = dateCellWrapper.asInstanceOf[js.Any], eventWrapper = eventWrapper.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[components]
  }
}

