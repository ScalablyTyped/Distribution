package typings.quixote

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Viewport positions and sizes are available on QFrame.viewport()
trait ViewportDescriptor extends js.Object {
  // The lowest visible part of the page.
  var bottom: PositionDescriptor
  // Horizontal center: midway between right and left
  var center: PositionDescriptor
  // Height of the viewport.
  var height: SizeDescriptor
  // The leftmost visible part of the page.
  var left: PositionDescriptor
  // Vertical middle: midway between top and bottom.
  var middle: PositionDescriptor
  // The rightmost visible part of the page.
  var right: PositionDescriptor
  // The highest visible part of the page.
  var top: PositionDescriptor
  // Width of the viewport.
  var width: SizeDescriptor
}

object ViewportDescriptor {
  @scala.inline
  def apply(
    bottom: PositionDescriptor,
    center: PositionDescriptor,
    height: SizeDescriptor,
    left: PositionDescriptor,
    middle: PositionDescriptor,
    right: PositionDescriptor,
    top: PositionDescriptor,
    width: SizeDescriptor
  ): ViewportDescriptor = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], center = center.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], middle = middle.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ViewportDescriptor]
  }
}

