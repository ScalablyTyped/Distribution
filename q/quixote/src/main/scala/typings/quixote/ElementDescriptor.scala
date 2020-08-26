package typings.quixote

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Element positions and sizes are available on all QElement instances.
@js.native
trait ElementDescriptor extends js.Object {
  // The bottom edge of the element
  var bottom: js.UndefOr[PositionDescriptor] = js.native
  // Horizontal center: midway between the right and left edges.
  var center: js.UndefOr[PositionDescriptor] = js.native
  // Height of the element.
  var height: js.UndefOr[SizeDescriptor] = js.native
  // The left edge of the element
  var left: js.UndefOr[PositionDescriptor] = js.native
  // Vertical middle: midway between the top and bottom edges.
  var middle: js.UndefOr[PositionDescriptor] = js.native
  // The right edge of the element
  var right: js.UndefOr[PositionDescriptor] = js.native
  // The top edge of the element
  var top: js.UndefOr[PositionDescriptor] = js.native
  // Width of the element.
  var width: js.UndefOr[SizeDescriptor] = js.native
}

object ElementDescriptor {
  @scala.inline
  def apply(): ElementDescriptor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ElementDescriptor]
  }
  @scala.inline
  implicit class ElementDescriptorOps[Self <: ElementDescriptor] (val x: Self) extends AnyVal {
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
    def setBottom(value: PositionDescriptor): Self = this.set("bottom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBottom: Self = this.set("bottom", js.undefined)
    @scala.inline
    def setCenter(value: PositionDescriptor): Self = this.set("center", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCenter: Self = this.set("center", js.undefined)
    @scala.inline
    def setHeight(value: SizeDescriptor): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setLeft(value: PositionDescriptor): Self = this.set("left", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeft: Self = this.set("left", js.undefined)
    @scala.inline
    def setMiddle(value: PositionDescriptor): Self = this.set("middle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMiddle: Self = this.set("middle", js.undefined)
    @scala.inline
    def setRight(value: PositionDescriptor): Self = this.set("right", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRight: Self = this.set("right", js.undefined)
    @scala.inline
    def setTop(value: PositionDescriptor): Self = this.set("top", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTop: Self = this.set("top", js.undefined)
    @scala.inline
    def setWidth(value: SizeDescriptor): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

