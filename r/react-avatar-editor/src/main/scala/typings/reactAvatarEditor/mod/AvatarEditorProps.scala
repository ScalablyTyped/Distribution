package typings.reactAvatarEditor.mod

import typings.std.DragEvent
import typings.std.Event
import typings.std.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AvatarEditorProps extends js.Object {
  var border: js.UndefOr[Double | js.Array[Double]] = js.undefined
  var borderRadius: js.UndefOr[Double] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var color: js.UndefOr[js.Array[Double]] = js.undefined
  var crossOrigin: js.UndefOr[String] = js.undefined
  var disableBoundaryChecks: js.UndefOr[Boolean] = js.undefined
  var disableDrop: js.UndefOr[Boolean] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var image: String | File
  var onDropFile: js.UndefOr[js.Function1[/* event */ DragEvent, Unit]] = js.undefined
  var onImageChange: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onImageReady: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.undefined
  var onLoadFailure: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.undefined
  var onLoadSuccess: js.UndefOr[js.Function1[/* imgInfo */ ImageState, Unit]] = js.undefined
  var onMouseMove: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.undefined
  var onMouseUp: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onPositionChange: js.UndefOr[js.Function1[/* position */ Position, Unit]] = js.undefined
  var position: js.UndefOr[Position] = js.undefined
  var rotate: js.UndefOr[Double] = js.undefined
  var scale: js.UndefOr[Double] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object AvatarEditorProps {
  @scala.inline
  def apply(
    image: String | File,
    border: Double | js.Array[Double] = null,
    borderRadius: js.UndefOr[Double] = js.undefined,
    className: String = null,
    color: js.Array[Double] = null,
    crossOrigin: String = null,
    disableBoundaryChecks: js.UndefOr[Boolean] = js.undefined,
    disableDrop: js.UndefOr[Boolean] = js.undefined,
    height: js.UndefOr[Double] = js.undefined,
    onDropFile: /* event */ DragEvent => Unit = null,
    onImageChange: () => Unit = null,
    onImageReady: /* event */ Event => Unit = null,
    onLoadFailure: /* event */ Event => Unit = null,
    onLoadSuccess: /* imgInfo */ ImageState => Unit = null,
    onMouseMove: /* event */ Event => Unit = null,
    onMouseUp: () => Unit = null,
    onPositionChange: /* position */ Position => Unit = null,
    position: Position = null,
    rotate: js.UndefOr[Double] = js.undefined,
    scale: js.UndefOr[Double] = js.undefined,
    style: js.Object = null,
    width: js.UndefOr[Double] = js.undefined
  ): AvatarEditorProps = {
    val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any])
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (!js.isUndefined(borderRadius)) __obj.updateDynamic("borderRadius")(borderRadius.get.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (crossOrigin != null) __obj.updateDynamic("crossOrigin")(crossOrigin.asInstanceOf[js.Any])
    if (!js.isUndefined(disableBoundaryChecks)) __obj.updateDynamic("disableBoundaryChecks")(disableBoundaryChecks.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disableDrop)) __obj.updateDynamic("disableDrop")(disableDrop.get.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (onDropFile != null) __obj.updateDynamic("onDropFile")(js.Any.fromFunction1(onDropFile))
    if (onImageChange != null) __obj.updateDynamic("onImageChange")(js.Any.fromFunction0(onImageChange))
    if (onImageReady != null) __obj.updateDynamic("onImageReady")(js.Any.fromFunction1(onImageReady))
    if (onLoadFailure != null) __obj.updateDynamic("onLoadFailure")(js.Any.fromFunction1(onLoadFailure))
    if (onLoadSuccess != null) __obj.updateDynamic("onLoadSuccess")(js.Any.fromFunction1(onLoadSuccess))
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(js.Any.fromFunction1(onMouseMove))
    if (onMouseUp != null) __obj.updateDynamic("onMouseUp")(js.Any.fromFunction0(onMouseUp))
    if (onPositionChange != null) __obj.updateDynamic("onPositionChange")(js.Any.fromFunction1(onPositionChange))
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(rotate)) __obj.updateDynamic("rotate")(rotate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scale)) __obj.updateDynamic("scale")(scale.get.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AvatarEditorProps]
  }
}

