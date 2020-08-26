package typings.sarif.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Rectangle extends js.Object {
  /**
    * The Y coordinate of the bottom edge of the rectangle, measured in the image's natural units.
    */
  var bottom: js.UndefOr[Double] = js.native
  /**
    * The X coordinate of the left edge of the rectangle, measured in the image's natural units.
    */
  var left: js.UndefOr[Double] = js.native
  /**
    * A message relevant to the rectangle.
    */
  var message: js.UndefOr[Message] = js.native
  /**
    * Key/value pairs that provide additional information about the rectangle.
    */
  var properties: js.UndefOr[PropertyBag] = js.native
  /**
    * The X coordinate of the right edge of the rectangle, measured in the image's natural units.
    */
  var right: js.UndefOr[Double] = js.native
  /**
    * The Y coordinate of the top edge of the rectangle, measured in the image's natural units.
    */
  var top: js.UndefOr[Double] = js.native
}

object Rectangle {
  @scala.inline
  def apply(): Rectangle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Rectangle]
  }
  @scala.inline
  implicit class RectangleOps[Self <: Rectangle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBottom(value: Double): Self = this.set("bottom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBottom: Self = this.set("bottom", js.undefined)
    @scala.inline
    def setLeft(value: Double): Self = this.set("left", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeft: Self = this.set("left", js.undefined)
    @scala.inline
    def setMessage(value: Message): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    @scala.inline
    def setProperties(value: PropertyBag): Self = this.set("properties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
    @scala.inline
    def setRight(value: Double): Self = this.set("right", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRight: Self = this.set("right", js.undefined)
    @scala.inline
    def setTop(value: Double): Self = this.set("top", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTop: Self = this.set("top", js.undefined)
  }
  
}

