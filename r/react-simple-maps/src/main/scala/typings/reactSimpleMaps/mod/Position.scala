package typings.reactSimpleMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Position extends js.Object {
  var dragging: Boolean
  var last: Point
  var x: Double
  var y: Double
  var zoom: Double
  var zooming: Boolean
}

object Position {
  @scala.inline
  def apply(dragging: Boolean, last: Point, x: Double, y: Double, zoom: Double, zooming: Boolean): Position = {
    val __obj = js.Dynamic.literal(dragging = dragging.asInstanceOf[js.Any], last = last.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any], zooming = zooming.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Position]
  }
}

