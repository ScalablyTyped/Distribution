package typings.reactDashMapDashGl.reactDashMapDashGlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseMapController extends js.Object {
  var events: js.Array[String]
  def handleEvent(event: MapControlEvent): Unit
}

object BaseMapController {
  @scala.inline
  def apply(events: js.Array[String], handleEvent: MapControlEvent => Unit): BaseMapController = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], handleEvent = js.Any.fromFunction1(handleEvent))
  
    __obj.asInstanceOf[BaseMapController]
  }
}

