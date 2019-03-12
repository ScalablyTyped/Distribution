package typings
package reactDashMapDashGlLib.reactDashMapDashGlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseMapController extends js.Object {
  var events: js.Array[java.lang.String]
  def handleEvent(event: MapControlEvent): scala.Unit
}

object BaseMapController {
  @scala.inline
  def apply(events: js.Array[java.lang.String], handleEvent: MapControlEvent => scala.Unit): BaseMapController = {
    val __obj = js.Dynamic.literal(events = events, handleEvent = js.Any.fromFunction1(handleEvent))
  
    __obj.asInstanceOf[BaseMapController]
  }
}

