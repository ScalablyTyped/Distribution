package typings.reactAvatarEditor.mod

import typings.std.DragEvent
import typings.std.Event
import typings.std.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AvatarEditorProps extends js.Object {
  var border: js.UndefOr[Double | js.Array[Double]] = js.native
  var borderRadius: js.UndefOr[Double] = js.native
  var className: js.UndefOr[String] = js.native
  var color: js.UndefOr[js.Array[Double]] = js.native
  var crossOrigin: js.UndefOr[String] = js.native
  var disableBoundaryChecks: js.UndefOr[Boolean] = js.native
  var disableDrop: js.UndefOr[Boolean] = js.native
  var height: js.UndefOr[Double] = js.native
  var image: String | File = js.native
  var onDropFile: js.UndefOr[js.Function1[/* event */ DragEvent, Unit]] = js.native
  var onImageChange: js.UndefOr[js.Function0[Unit]] = js.native
  var onImageReady: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
  var onLoadFailure: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
  var onLoadSuccess: js.UndefOr[js.Function1[/* imgInfo */ ImageState, Unit]] = js.native
  var onMouseMove: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
  var onMouseUp: js.UndefOr[js.Function0[Unit]] = js.native
  var onPositionChange: js.UndefOr[js.Function1[/* position */ Position, Unit]] = js.native
  var position: js.UndefOr[Position] = js.native
  var rotate: js.UndefOr[Double] = js.native
  var scale: js.UndefOr[Double] = js.native
  var style: js.UndefOr[js.Object] = js.native
  var width: js.UndefOr[Double] = js.native
}

object AvatarEditorProps {
  @scala.inline
  def apply(image: String | File): AvatarEditorProps = {
    val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any])
    __obj.asInstanceOf[AvatarEditorProps]
  }
  @scala.inline
  implicit class AvatarEditorPropsOps[Self <: AvatarEditorProps] (val x: Self) extends AnyVal {
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
    def setImage(value: String | File): Self = this.set("image", value.asInstanceOf[js.Any])
    @scala.inline
    def setBorderVarargs(value: Double*): Self = this.set("border", js.Array(value :_*))
    @scala.inline
    def setBorder(value: Double | js.Array[Double]): Self = this.set("border", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorder: Self = this.set("border", js.undefined)
    @scala.inline
    def setBorderRadius(value: Double): Self = this.set("borderRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderRadius: Self = this.set("borderRadius", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setColorVarargs(value: Double*): Self = this.set("color", js.Array(value :_*))
    @scala.inline
    def setColor(value: js.Array[Double]): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setCrossOrigin(value: String): Self = this.set("crossOrigin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCrossOrigin: Self = this.set("crossOrigin", js.undefined)
    @scala.inline
    def setDisableBoundaryChecks(value: Boolean): Self = this.set("disableBoundaryChecks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableBoundaryChecks: Self = this.set("disableBoundaryChecks", js.undefined)
    @scala.inline
    def setDisableDrop(value: Boolean): Self = this.set("disableDrop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableDrop: Self = this.set("disableDrop", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setOnDropFile(value: /* event */ DragEvent => Unit): Self = this.set("onDropFile", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDropFile: Self = this.set("onDropFile", js.undefined)
    @scala.inline
    def setOnImageChange(value: () => Unit): Self = this.set("onImageChange", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnImageChange: Self = this.set("onImageChange", js.undefined)
    @scala.inline
    def setOnImageReady(value: /* event */ Event => Unit): Self = this.set("onImageReady", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnImageReady: Self = this.set("onImageReady", js.undefined)
    @scala.inline
    def setOnLoadFailure(value: /* event */ Event => Unit): Self = this.set("onLoadFailure", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnLoadFailure: Self = this.set("onLoadFailure", js.undefined)
    @scala.inline
    def setOnLoadSuccess(value: /* imgInfo */ ImageState => Unit): Self = this.set("onLoadSuccess", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnLoadSuccess: Self = this.set("onLoadSuccess", js.undefined)
    @scala.inline
    def setOnMouseMove(value: /* event */ Event => Unit): Self = this.set("onMouseMove", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMouseMove: Self = this.set("onMouseMove", js.undefined)
    @scala.inline
    def setOnMouseUp(value: () => Unit): Self = this.set("onMouseUp", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnMouseUp: Self = this.set("onMouseUp", js.undefined)
    @scala.inline
    def setOnPositionChange(value: /* position */ Position => Unit): Self = this.set("onPositionChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPositionChange: Self = this.set("onPositionChange", js.undefined)
    @scala.inline
    def setPosition(value: Position): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setRotate(value: Double): Self = this.set("rotate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRotate: Self = this.set("rotate", js.undefined)
    @scala.inline
    def setScale(value: Double): Self = this.set("scale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScale: Self = this.set("scale", js.undefined)
    @scala.inline
    def setStyle(value: js.Object): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

