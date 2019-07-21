package typings
package reactDashNativeDashModalDashPopoverLib.libPopoverGeometryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Geometry extends js.Object {
  var anchor: Point
  var origin: Point
  var placement: Placement
}

object Geometry {
  @scala.inline
  def apply(anchor: Point, origin: Point, placement: Placement): Geometry = {
    val __obj = js.Dynamic.literal(anchor = anchor, origin = origin, placement = placement)
  
    __obj.asInstanceOf[Geometry]
  }
}

