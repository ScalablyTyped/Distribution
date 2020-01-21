package typings.signaturePad.mod.SignaturePad

import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignaturePadOptions extends js.Object {
  /*
    * (string) Color used to clear the background. Can be any color format accepted by context.fillStyle. Defaults to "rgba(0,0,0,0)" (transparent black). Use a non-transparent color e.g. "rgb(255,255,255)" (opaque white) if you'd like to save signatures as JPEG images.
    */
  var backgroundColor: js.UndefOr[String] = js.undefined
  /*
    * (float or function) Radius of a single dot.
    */
  var dotSize: js.UndefOr[Double | js.Function0[Double]] = js.undefined
  /*
    * (float) Maximum width of a line. Defaults to 2.5.
    */
  var maxWidth: js.UndefOr[Double] = js.undefined
  /*
    * (integer) Add the next point only if the previous one is farther than x pixels. Defaults to 5.
    */
  var minDistance: js.UndefOr[Double] = js.undefined
  /*
    * (float) Minimum width of a line. Defaults to 0.5.
    */
  var minWidth: js.UndefOr[Double] = js.undefined
  /*
    * (function) Callback when stroke begin.
    */
  var onBegin: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.undefined
  /*
    * (function) Callback when stroke end.
    */
  var onEnd: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.undefined
  /*
    * (string) Color used to draw the lines. Can be any color format accepted by context.fillStyle. Defaults to "black".
    */
  var penColor: js.UndefOr[String] = js.undefined
  /*
    * (integer) Draw the next point at most once per every x milliseconds. Set it to 0 to turn off throttling. Defaults to 16.
    */
  var throttle: js.UndefOr[Double] = js.undefined
  /*
    * (float) Weight used to modify new velocity based on the previous velocity. Defaults to 0.7.
    */
  var velocityFilterWeight: js.UndefOr[Double] = js.undefined
}

object SignaturePadOptions {
  @scala.inline
  def apply(
    backgroundColor: String = null,
    dotSize: Double | js.Function0[Double] = null,
    maxWidth: Int | Double = null,
    minDistance: Int | Double = null,
    minWidth: Int | Double = null,
    onBegin: /* event */ MouseEvent => Unit = null,
    onEnd: /* event */ MouseEvent => Unit = null,
    penColor: String = null,
    throttle: Int | Double = null,
    velocityFilterWeight: Int | Double = null
  ): SignaturePadOptions = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (dotSize != null) __obj.updateDynamic("dotSize")(dotSize.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (minDistance != null) __obj.updateDynamic("minDistance")(minDistance.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (onBegin != null) __obj.updateDynamic("onBegin")(js.Any.fromFunction1(onBegin))
    if (onEnd != null) __obj.updateDynamic("onEnd")(js.Any.fromFunction1(onEnd))
    if (penColor != null) __obj.updateDynamic("penColor")(penColor.asInstanceOf[js.Any])
    if (throttle != null) __obj.updateDynamic("throttle")(throttle.asInstanceOf[js.Any])
    if (velocityFilterWeight != null) __obj.updateDynamic("velocityFilterWeight")(velocityFilterWeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignaturePadOptions]
  }
}

