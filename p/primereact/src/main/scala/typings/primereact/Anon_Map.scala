package typings.primereact

import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Map extends js.Object {
  var map: js.Any
  var originalEvent: Event
  var overlay: js.Any
}

object Anon_Map {
  @scala.inline
  def apply(map: js.Any, originalEvent: Event, overlay: js.Any): Anon_Map = {
    val __obj = js.Dynamic.literal(map = map, originalEvent = originalEvent, overlay = overlay)
  
    __obj.asInstanceOf[Anon_Map]
  }
}

