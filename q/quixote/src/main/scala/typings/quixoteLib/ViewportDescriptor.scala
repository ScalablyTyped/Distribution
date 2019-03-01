package typings
package quixoteLib

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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bottom")(bottom)
    __obj.updateDynamic("center")(center)
    __obj.updateDynamic("height")(height)
    __obj.updateDynamic("left")(left)
    __obj.updateDynamic("middle")(middle)
    __obj.updateDynamic("right")(right)
    __obj.updateDynamic("top")(top)
    __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[ViewportDescriptor]
  }
}

