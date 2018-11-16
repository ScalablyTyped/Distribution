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

