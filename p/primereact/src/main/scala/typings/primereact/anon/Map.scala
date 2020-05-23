package typings.primereact.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Map extends js.Object {
  var map: js.Any
  var originalEvent: typings.std.Event
  var overlay: js.Any
}

object Map {
  @scala.inline
  def apply(map: js.Any, originalEvent: typings.std.Event, overlay: js.Any): Map = {
    val __obj = js.Dynamic.literal(map = map.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any], overlay = overlay.asInstanceOf[js.Any])
    __obj.asInstanceOf[Map]
  }
}

