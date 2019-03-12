package typings
package reactDashAvatarDashEditorLib.reactDashAvatarDashEditorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AvatarEditorProps extends js.Object {
  var border: js.UndefOr[scala.Double | js.Array[scala.Double]] = js.undefined
  var borderRadius: js.UndefOr[scala.Double] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var color: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var crossOrigin: js.UndefOr[java.lang.String] = js.undefined
  var disableDrop: js.UndefOr[scala.Boolean] = js.undefined
  var height: js.UndefOr[scala.Double] = js.undefined
  var image: java.lang.String | stdLib.File
  var onDropFile: js.UndefOr[js.Function1[/* event */ stdLib.DragEvent, scala.Unit]] = js.undefined
  var onImageChange: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onImageReady: js.UndefOr[js.Function1[/* event */ stdLib.Event, scala.Unit]] = js.undefined
  var onLoadFailure: js.UndefOr[js.Function1[/* event */ stdLib.Event, scala.Unit]] = js.undefined
  var onLoadSuccess: js.UndefOr[js.Function1[/* imgInfo */ ImageState, scala.Unit]] = js.undefined
  var onMouseMove: js.UndefOr[js.Function1[/* event */ stdLib.Event, scala.Unit]] = js.undefined
  var onMouseUp: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onPositionChange: js.UndefOr[js.Function1[/* position */ Position, scala.Unit]] = js.undefined
  var position: js.UndefOr[Position] = js.undefined
  var rotate: js.UndefOr[scala.Double] = js.undefined
  var scale: js.UndefOr[scala.Double] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
}

object AvatarEditorProps {
  @scala.inline
  def apply(
    image: java.lang.String | stdLib.File,
    border: scala.Double | js.Array[scala.Double] = null,
    borderRadius: scala.Int | scala.Double = null,
    className: java.lang.String = null,
    color: js.Array[scala.Double] = null,
    crossOrigin: java.lang.String = null,
    disableDrop: js.UndefOr[scala.Boolean] = js.undefined,
    height: scala.Int | scala.Double = null,
    onDropFile: /* event */ stdLib.DragEvent => scala.Unit = null,
    onImageChange: () => scala.Unit = null,
    onImageReady: /* event */ stdLib.Event => scala.Unit = null,
    onLoadFailure: /* event */ stdLib.Event => scala.Unit = null,
    onLoadSuccess: /* imgInfo */ ImageState => scala.Unit = null,
    onMouseMove: /* event */ stdLib.Event => scala.Unit = null,
    onMouseUp: () => scala.Unit = null,
    onPositionChange: /* position */ Position => scala.Unit = null,
    position: Position = null,
    rotate: scala.Int | scala.Double = null,
    scale: scala.Int | scala.Double = null,
    style: js.Object = null,
    width: scala.Int | scala.Double = null
  ): AvatarEditorProps = {
    val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any])
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (borderRadius != null) __obj.updateDynamic("borderRadius")(borderRadius.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (color != null) __obj.updateDynamic("color")(color)
    if (crossOrigin != null) __obj.updateDynamic("crossOrigin")(crossOrigin)
    if (!js.isUndefined(disableDrop)) __obj.updateDynamic("disableDrop")(disableDrop)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (onDropFile != null) __obj.updateDynamic("onDropFile")(js.Any.fromFunction1(onDropFile))
    if (onImageChange != null) __obj.updateDynamic("onImageChange")(js.Any.fromFunction0(onImageChange))
    if (onImageReady != null) __obj.updateDynamic("onImageReady")(js.Any.fromFunction1(onImageReady))
    if (onLoadFailure != null) __obj.updateDynamic("onLoadFailure")(js.Any.fromFunction1(onLoadFailure))
    if (onLoadSuccess != null) __obj.updateDynamic("onLoadSuccess")(js.Any.fromFunction1(onLoadSuccess))
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(js.Any.fromFunction1(onMouseMove))
    if (onMouseUp != null) __obj.updateDynamic("onMouseUp")(js.Any.fromFunction0(onMouseUp))
    if (onPositionChange != null) __obj.updateDynamic("onPositionChange")(js.Any.fromFunction1(onPositionChange))
    if (position != null) __obj.updateDynamic("position")(position)
    if (rotate != null) __obj.updateDynamic("rotate")(rotate.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[AvatarEditorProps]
  }
}

