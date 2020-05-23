package typings.sarif.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Rectangle extends js.Object {
  /**
    * The Y coordinate of the bottom edge of the rectangle, measured in the image's natural units.
    */
  var bottom: js.UndefOr[Double] = js.undefined
  /**
    * The X coordinate of the left edge of the rectangle, measured in the image's natural units.
    */
  var left: js.UndefOr[Double] = js.undefined
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
  var right: js.UndefOr[Double] = js.undefined
  /**
    * The Y coordinate of the top edge of the rectangle, measured in the image's natural units.
    */
  var top: js.UndefOr[Double] = js.undefined
}

object Rectangle {
  @scala.inline
  def apply(
    bottom: js.UndefOr[Double] = js.undefined,
    left: js.UndefOr[Double] = js.undefined,
    message: Message = null,
    properties: PropertyBag = null,
    right: js.UndefOr[Double] = js.undefined,
    top: js.UndefOr[Double] = js.undefined
  ): Rectangle = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bottom)) __obj.updateDynamic("bottom")(bottom.get.asInstanceOf[js.Any])
    if (!js.isUndefined(left)) __obj.updateDynamic("left")(left.get.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    if (!js.isUndefined(right)) __obj.updateDynamic("right")(right.get.asInstanceOf[js.Any])
    if (!js.isUndefined(top)) __obj.updateDynamic("top")(top.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rectangle]
  }
}

