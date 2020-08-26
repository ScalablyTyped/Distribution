package typings.reactDnd.dragPreviewImageMod

import typings.react.mod.ReactElement
import typings.reactDnd.connectorsMod.ConnectDragPreview
import typings.reactDnd.connectorsMod.ConnectableElement
import typings.reactDnd.optionsMod.DragPreviewOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DragPreviewImageProps extends js.Object {
  var connect: ConnectDragPreview = js.native
  var src: String = js.native
}

object DragPreviewImageProps {
  @scala.inline
  def apply(
    connect: (/* elementOrNode */ ConnectableElement, /* options */ js.UndefOr[DragPreviewOptions]) => ReactElement | Null,
    src: String
  ): DragPreviewImageProps = {
    val __obj = js.Dynamic.literal(connect = js.Any.fromFunction2(connect), src = src.asInstanceOf[js.Any])
    __obj.asInstanceOf[DragPreviewImageProps]
  }
  @scala.inline
  implicit class DragPreviewImagePropsOps[Self <: DragPreviewImageProps] (val x: Self) extends AnyVal {
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
    def setConnect(
      value: (/* elementOrNode */ ConnectableElement, /* options */ js.UndefOr[DragPreviewOptions]) => ReactElement | Null
    ): Self = this.set("connect", js.Any.fromFunction2(value))
    @scala.inline
    def setSrc(value: String): Self = this.set("src", value.asInstanceOf[js.Any])
  }
  
}

