package typings.reactCountdownCircleTimer.mod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Props extends js.Object {
  var colors: ColorType = js.native
  var durationSeconds: Double = js.native
  var gradientUniqueKey: js.UndefOr[String] = js.native
  var isLinearGradient: js.UndefOr[Boolean] = js.native
  var isPlaying: js.UndefOr[Boolean] = js.native
  var onComplete: js.UndefOr[OnCompleteFunctionType] = js.native
  var renderTime: js.UndefOr[RenderTimeFunctionType] = js.native
  var size: js.UndefOr[Double] = js.native
  var strokeLinecap: js.UndefOr[StrokeLinecapType] = js.native
  var strokeWidth: js.UndefOr[Double] = js.native
  var trailColor: js.UndefOr[String] = js.native
}

object Props {
  @scala.inline
  def apply(colors: ColorType, durationSeconds: Double): Props = {
    val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any], durationSeconds = durationSeconds.asInstanceOf[js.Any])
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
    def setColorsVarargs(value: (js.Tuple2[String, js.UndefOr[Double]])*): Self = this.set("colors", js.Array(value :_*))
    @scala.inline
    def setColors(value: ColorType): Self = this.set("colors", value.asInstanceOf[js.Any])
    @scala.inline
    def setDurationSeconds(value: Double): Self = this.set("durationSeconds", value.asInstanceOf[js.Any])
    @scala.inline
    def setGradientUniqueKey(value: String): Self = this.set("gradientUniqueKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGradientUniqueKey: Self = this.set("gradientUniqueKey", js.undefined)
    @scala.inline
    def setIsLinearGradient(value: Boolean): Self = this.set("isLinearGradient", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsLinearGradient: Self = this.set("isLinearGradient", js.undefined)
    @scala.inline
    def setIsPlaying(value: Boolean): Self = this.set("isPlaying", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsPlaying: Self = this.set("isPlaying", js.undefined)
    @scala.inline
    def setOnComplete(value: () => js.UndefOr[(js.Tuple2[Boolean, Double]) | Unit]): Self = this.set("onComplete", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnComplete: Self = this.set("onComplete", js.undefined)
    @scala.inline
    def setRenderTime(
      value: (/* remainingTime */ Double, /* elapsedTime */ Double, /* isPlaying */ Boolean) => ReactNode
    ): Self = this.set("renderTime", js.Any.fromFunction3(value))
    @scala.inline
    def deleteRenderTime: Self = this.set("renderTime", js.undefined)
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setStrokeLinecap(value: StrokeLinecapType): Self = this.set("strokeLinecap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrokeLinecap: Self = this.set("strokeLinecap", js.undefined)
    @scala.inline
    def setStrokeWidth(value: Double): Self = this.set("strokeWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrokeWidth: Self = this.set("strokeWidth", js.undefined)
    @scala.inline
    def setTrailColor(value: String): Self = this.set("trailColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrailColor: Self = this.set("trailColor", js.undefined)
  }
  
}

