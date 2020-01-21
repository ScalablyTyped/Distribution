package typings.primereact

import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMap extends js.Object {
  var map: js.Any
  var originalEvent: Event_
  var overlay: js.Any
}

object AnonMap {
  @scala.inline
  def apply(map: js.Any, originalEvent: Event_, overlay: js.Any): AnonMap = {
    val __obj = js.Dynamic.literal(map = map.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any], overlay = overlay.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonMap]
  }
}

