package typings.reactSparklines.mod

import typings.react.mod.CSSProperties
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactSVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SparklinesBarsProps extends js.Object {
  var barWidth: js.UndefOr[Double] = js.native
  var height: js.UndefOr[Double] = js.native
  var margin: js.UndefOr[Double] = js.native
  var onMouseMove: js.UndefOr[
    js.Function2[/* p */ Point, /* event */ MouseEvent[ReactSVGElement, NativeMouseEvent], Unit]
  ] = js.native
  var points: js.UndefOr[js.Array[Point]] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
}

object SparklinesBarsProps {
  @scala.inline
  def apply(): SparklinesBarsProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SparklinesBarsProps]
  }
  @scala.inline
  implicit class SparklinesBarsPropsOps[Self <: SparklinesBarsProps] (val x: Self) extends AnyVal {
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
    def setBarWidth(value: Double): Self = this.set("barWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBarWidth: Self = this.set("barWidth", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setMargin(value: Double): Self = this.set("margin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMargin: Self = this.set("margin", js.undefined)
    @scala.inline
    def setOnMouseMove(value: (/* p */ Point, /* event */ MouseEvent[ReactSVGElement, NativeMouseEvent]) => Unit): Self = this.set("onMouseMove", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnMouseMove: Self = this.set("onMouseMove", js.undefined)
    @scala.inline
    def setPointsVarargs(value: Point*): Self = this.set("points", js.Array(value :_*))
    @scala.inline
    def setPoints(value: js.Array[Point]): Self = this.set("points", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePoints: Self = this.set("points", js.undefined)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
  
}

