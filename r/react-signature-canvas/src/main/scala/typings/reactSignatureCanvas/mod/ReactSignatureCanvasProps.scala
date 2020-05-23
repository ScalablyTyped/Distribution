package typings.reactSignatureCanvas.mod

import typings.react.mod.CanvasHTMLAttributes
import typings.signaturePad.mod.SignaturePadOptions
import typings.std.HTMLCanvasElement
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactSignatureCanvasProps extends SignaturePadOptions {
  var canvasProps: js.UndefOr[CanvasHTMLAttributes[HTMLCanvasElement]] = js.undefined
  var clearOnResize: js.UndefOr[Boolean] = js.undefined
}

object ReactSignatureCanvasProps {
  @scala.inline
  def apply(
    backgroundColor: String = null,
    canvasProps: CanvasHTMLAttributes[HTMLCanvasElement] = null,
    clearOnResize: js.UndefOr[Boolean] = js.undefined,
    dotSize: Double | js.Function0[Double] = null,
    maxWidth: js.UndefOr[Double] = js.undefined,
    minDistance: js.UndefOr[Double] = js.undefined,
    minWidth: js.UndefOr[Double] = js.undefined,
    onBegin: /* event */ MouseEvent => Unit = null,
    onEnd: /* event */ MouseEvent => Unit = null,
    penColor: String = null,
    throttle: js.UndefOr[Double] = js.undefined,
    velocityFilterWeight: js.UndefOr[Double] = js.undefined
  ): ReactSignatureCanvasProps = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (canvasProps != null) __obj.updateDynamic("canvasProps")(canvasProps.asInstanceOf[js.Any])
    if (!js.isUndefined(clearOnResize)) __obj.updateDynamic("clearOnResize")(clearOnResize.get.asInstanceOf[js.Any])
    if (dotSize != null) __obj.updateDynamic("dotSize")(dotSize.asInstanceOf[js.Any])
    if (!js.isUndefined(maxWidth)) __obj.updateDynamic("maxWidth")(maxWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minDistance)) __obj.updateDynamic("minDistance")(minDistance.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minWidth)) __obj.updateDynamic("minWidth")(minWidth.get.asInstanceOf[js.Any])
    if (onBegin != null) __obj.updateDynamic("onBegin")(js.Any.fromFunction1(onBegin))
    if (onEnd != null) __obj.updateDynamic("onEnd")(js.Any.fromFunction1(onEnd))
    if (penColor != null) __obj.updateDynamic("penColor")(penColor.asInstanceOf[js.Any])
    if (!js.isUndefined(throttle)) __obj.updateDynamic("throttle")(throttle.get.asInstanceOf[js.Any])
    if (!js.isUndefined(velocityFilterWeight)) __obj.updateDynamic("velocityFilterWeight")(velocityFilterWeight.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactSignatureCanvasProps]
  }
}

