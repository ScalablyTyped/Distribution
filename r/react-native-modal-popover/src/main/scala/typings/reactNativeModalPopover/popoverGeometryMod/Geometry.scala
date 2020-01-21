package typings.reactNativeModalPopover.popoverGeometryMod

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
    val __obj = js.Dynamic.literal(anchor = anchor.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Geometry]
  }
}

