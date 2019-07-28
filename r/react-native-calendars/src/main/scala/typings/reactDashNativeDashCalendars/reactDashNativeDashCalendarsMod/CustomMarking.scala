package typings.reactDashNativeDashCalendars.reactDashNativeDashCalendarsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomMarking extends Marking {
  var customStyles: MarkedDateCustomStyles
}

object CustomMarking {
  @scala.inline
  def apply(customStyles: MarkedDateCustomStyles): CustomMarking = {
    val __obj = js.Dynamic.literal(customStyles = customStyles)
  
    __obj.asInstanceOf[CustomMarking]
  }
}

