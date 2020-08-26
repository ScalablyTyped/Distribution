package typings.signaturePad.mod

import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SignaturePadOptions extends js.Object {
  /*
    * (string) Color used to clear the background. Can be any color format accepted by context.fillStyle. Defaults to "rgba(0,0,0,0)" (transparent black). Use a non-transparent color e.g. "rgb(255,255,255)" (opaque white) if you'd like to save signatures as JPEG images.
    */
  var backgroundColor: js.UndefOr[String] = js.native
  /*
    * (float or function) Radius of a single dot.
    */
  var dotSize: js.UndefOr[Double | js.Function0[Double]] = js.native
  /*
    * (float) Maximum width of a line. Defaults to 2.5.
    */
  var maxWidth: js.UndefOr[Double] = js.native
  /*
    * (integer) Add the next point only if the previous one is farther than x pixels. Defaults to 5.
    */
  var minDistance: js.UndefOr[Double] = js.native
  /*
    * (float) Minimum width of a line. Defaults to 0.5.
    */
  var minWidth: js.UndefOr[Double] = js.native
  /*
    * (function) Callback when stroke begin.
    */
  var onBegin: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.native
  /*
    * (function) Callback when stroke end.
    */
  var onEnd: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.native
  /*
    * (string) Color used to draw the lines. Can be any color format accepted by context.fillStyle. Defaults to "black".
    */
  var penColor: js.UndefOr[String] = js.native
  /*
    * (integer) Draw the next point at most once per every x milliseconds. Set it to 0 to turn off throttling. Defaults to 16.
    */
  var throttle: js.UndefOr[Double] = js.native
  /*
    * (float) Weight used to modify new velocity based on the previous velocity. Defaults to 0.7.
    */
  var velocityFilterWeight: js.UndefOr[Double] = js.native
}

object SignaturePadOptions {
  @scala.inline
  def apply(): SignaturePadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SignaturePadOptions]
  }
  @scala.inline
  implicit class SignaturePadOptionsOps[Self <: SignaturePadOptions] (val x: Self) extends AnyVal {
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
    def setBackgroundColor(value: String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    @scala.inline
    def setDotSizeFunction0(value: () => Double): Self = this.set("dotSize", js.Any.fromFunction0(value))
    @scala.inline
    def setDotSize(value: Double | js.Function0[Double]): Self = this.set("dotSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDotSize: Self = this.set("dotSize", js.undefined)
    @scala.inline
    def setMaxWidth(value: Double): Self = this.set("maxWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxWidth: Self = this.set("maxWidth", js.undefined)
    @scala.inline
    def setMinDistance(value: Double): Self = this.set("minDistance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinDistance: Self = this.set("minDistance", js.undefined)
    @scala.inline
    def setMinWidth(value: Double): Self = this.set("minWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinWidth: Self = this.set("minWidth", js.undefined)
    @scala.inline
    def setOnBegin(value: /* event */ MouseEvent => Unit): Self = this.set("onBegin", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnBegin: Self = this.set("onBegin", js.undefined)
    @scala.inline
    def setOnEnd(value: /* event */ MouseEvent => Unit): Self = this.set("onEnd", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnEnd: Self = this.set("onEnd", js.undefined)
    @scala.inline
    def setPenColor(value: String): Self = this.set("penColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePenColor: Self = this.set("penColor", js.undefined)
    @scala.inline
    def setThrottle(value: Double): Self = this.set("throttle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThrottle: Self = this.set("throttle", js.undefined)
    @scala.inline
    def setVelocityFilterWeight(value: Double): Self = this.set("velocityFilterWeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVelocityFilterWeight: Self = this.set("velocityFilterWeight", js.undefined)
  }
  
}

