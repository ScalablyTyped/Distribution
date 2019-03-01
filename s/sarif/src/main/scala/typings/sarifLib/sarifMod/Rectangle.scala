package typings
package sarifLib.sarifMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Rectangle extends js.Object {
  /**
    * The Y coordinate of the bottom edge of the rectangle, measured in the image's natural units.
    */
  var bottom: js.UndefOr[scala.Double] = js.undefined
  /**
    * The X coordinate of the left edge of the rectangle, measured in the image's natural units.
    */
  var left: js.UndefOr[scala.Double] = js.undefined
  /**
    * A message relevant to the rectangle.
    */
  var message: js.UndefOr[Message] = js.undefined
  /**
    * Key/value pairs that provide additional information about the rectangle.
    */
  var properties: js.UndefOr[PropertyBag] = js.undefined
  /**
    * The X coordinate of the right edge of the rectangle, measured in the image's natural units.
    */
  var right: js.UndefOr[scala.Double] = js.undefined
  /**
    * The Y coordinate of the top edge of the rectangle, measured in the image's natural units.
    */
  var top: js.UndefOr[scala.Double] = js.undefined
}

object Rectangle {
  @scala.inline
  def apply(
    bottom: scala.Int | scala.Double = null,
    left: scala.Int | scala.Double = null,
    message: Message = null,
    properties: PropertyBag = null,
    right: scala.Int | scala.Double = null,
    top: scala.Int | scala.Double = null
  ): Rectangle = {
    val __obj = js.Dynamic.literal()
    if (bottom != null) __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message)
    if (properties != null) __obj.updateDynamic("properties")(properties)
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rectangle]
  }
}

