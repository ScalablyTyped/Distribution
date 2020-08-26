package typings.reactToolbox.mod.ReactToolbox

import typings.react.mod.Attributes
import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Props extends Attributes {
  /**
    * Set a class for the root component.
    */
  var className: js.UndefOr[String] = js.native
  /**
    * Callback called when the component is clicked.
    */
  var onClick: js.UndefOr[js.Function] = js.native
  var onContextMenu: js.UndefOr[js.Function] = js.native
  var onDoubleClick: js.UndefOr[js.Function] = js.native
  var onDrag: js.UndefOr[js.Function] = js.native
  var onDragEnd: js.UndefOr[js.Function] = js.native
  var onDragEnter: js.UndefOr[js.Function] = js.native
  var onDragExit: js.UndefOr[js.Function] = js.native
  var onDragLeave: js.UndefOr[js.Function] = js.native
  var onDragOver: js.UndefOr[js.Function] = js.native
  var onDragStart: js.UndefOr[js.Function] = js.native
  var onDrop: js.UndefOr[js.Function] = js.native
  /**
    * Callback called when the mouse press the Component.
    */
  var onMouseDown: js.UndefOr[js.Function] = js.native
  /**
    * Callback called when the mouse enters the Component.
    */
  var onMouseEnter: js.UndefOr[js.Function] = js.native
  /**
    * Callback called when the mouse leaves the Component.
    */
  var onMouseLeave: js.UndefOr[js.Function] = js.native
  var onMouseMove: js.UndefOr[js.Function] = js.native
  var onMouseOut: js.UndefOr[js.Function] = js.native
  var onMouseOver: js.UndefOr[js.Function] = js.native
  /**
    * Fires after the mouse is released from the Component.
    */
  var onMouseUp: js.UndefOr[js.Function] = js.native
  var onTouchCancel: js.UndefOr[js.Function] = js.native
  var onTouchEnd: js.UndefOr[js.Function] = js.native
  var onTouchMove: js.UndefOr[js.Function] = js.native
  var onTouchStart: js.UndefOr[js.Function] = js.native
  /**
    * Set inline style for the root component.
    */
  var style: js.UndefOr[CSSProperties] = js.native
}

object Props {
  @scala.inline
  def apply(): Props = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Props]
  }
  @scala.inline
  implicit class PropsOps[Self <: Props] (val x: Self) extends AnyVal {
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
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setOnClick(value: js.Function): Self = this.set("onClick", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    @scala.inline
    def setOnContextMenu(value: js.Function): Self = this.set("onContextMenu", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnContextMenu: Self = this.set("onContextMenu", js.undefined)
    @scala.inline
    def setOnDoubleClick(value: js.Function): Self = this.set("onDoubleClick", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnDoubleClick: Self = this.set("onDoubleClick", js.undefined)
    @scala.inline
    def setOnDrag(value: js.Function): Self = this.set("onDrag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnDrag: Self = this.set("onDrag", js.undefined)
    @scala.inline
    def setOnDragEnd(value: js.Function): Self = this.set("onDragEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnDragEnd: Self = this.set("onDragEnd", js.undefined)
    @scala.inline
    def setOnDragEnter(value: js.Function): Self = this.set("onDragEnter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnDragEnter: Self = this.set("onDragEnter", js.undefined)
    @scala.inline
    def setOnDragExit(value: js.Function): Self = this.set("onDragExit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnDragExit: Self = this.set("onDragExit", js.undefined)
    @scala.inline
    def setOnDragLeave(value: js.Function): Self = this.set("onDragLeave", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnDragLeave: Self = this.set("onDragLeave", js.undefined)
    @scala.inline
    def setOnDragOver(value: js.Function): Self = this.set("onDragOver", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnDragOver: Self = this.set("onDragOver", js.undefined)
    @scala.inline
    def setOnDragStart(value: js.Function): Self = this.set("onDragStart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnDragStart: Self = this.set("onDragStart", js.undefined)
    @scala.inline
    def setOnDrop(value: js.Function): Self = this.set("onDrop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnDrop: Self = this.set("onDrop", js.undefined)
    @scala.inline
    def setOnMouseDown(value: js.Function): Self = this.set("onMouseDown", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnMouseDown: Self = this.set("onMouseDown", js.undefined)
    @scala.inline
    def setOnMouseEnter(value: js.Function): Self = this.set("onMouseEnter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnMouseEnter: Self = this.set("onMouseEnter", js.undefined)
    @scala.inline
    def setOnMouseLeave(value: js.Function): Self = this.set("onMouseLeave", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnMouseLeave: Self = this.set("onMouseLeave", js.undefined)
    @scala.inline
    def setOnMouseMove(value: js.Function): Self = this.set("onMouseMove", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnMouseMove: Self = this.set("onMouseMove", js.undefined)
    @scala.inline
    def setOnMouseOut(value: js.Function): Self = this.set("onMouseOut", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnMouseOut: Self = this.set("onMouseOut", js.undefined)
    @scala.inline
    def setOnMouseOver(value: js.Function): Self = this.set("onMouseOver", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnMouseOver: Self = this.set("onMouseOver", js.undefined)
    @scala.inline
    def setOnMouseUp(value: js.Function): Self = this.set("onMouseUp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnMouseUp: Self = this.set("onMouseUp", js.undefined)
    @scala.inline
    def setOnTouchCancel(value: js.Function): Self = this.set("onTouchCancel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnTouchCancel: Self = this.set("onTouchCancel", js.undefined)
    @scala.inline
    def setOnTouchEnd(value: js.Function): Self = this.set("onTouchEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnTouchEnd: Self = this.set("onTouchEnd", js.undefined)
    @scala.inline
    def setOnTouchMove(value: js.Function): Self = this.set("onTouchMove", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnTouchMove: Self = this.set("onTouchMove", js.undefined)
    @scala.inline
    def setOnTouchStart(value: js.Function): Self = this.set("onTouchStart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnTouchStart: Self = this.set("onTouchStart", js.undefined)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
  
}

