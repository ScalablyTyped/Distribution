package typings
package quixoteLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Element positions and sizes are available on all QElement instances.

trait ElementDescriptor extends js.Object {
  // The bottom edge of the element
  var bottom: js.UndefOr[PositionDescriptor] = js.undefined
  // Horizontal center: midway between the right and left edges.
  var center: js.UndefOr[PositionDescriptor] = js.undefined
  // Height of the element.
  var height: js.UndefOr[SizeDescriptor] = js.undefined
  // The left edge of the element
  var left: js.UndefOr[PositionDescriptor] = js.undefined
  // Vertical middle: midway between the top and bottom edges.
  var middle: js.UndefOr[PositionDescriptor] = js.undefined
  // The right edge of the element
  var right: js.UndefOr[PositionDescriptor] = js.undefined
  // The top edge of the element
  var top: js.UndefOr[PositionDescriptor] = js.undefined
  // Width of the element.
  var width: js.UndefOr[SizeDescriptor] = js.undefined
}

