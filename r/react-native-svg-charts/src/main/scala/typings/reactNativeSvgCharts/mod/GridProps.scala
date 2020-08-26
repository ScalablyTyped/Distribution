package typings.reactNativeSvgCharts.mod

import typings.reactNativeSvgCharts.anon.PartialLineProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridProps[T] extends js.Object {
  var belowChart: js.UndefOr[Boolean] = js.native
  var direction: js.UndefOr[GridDirection] = js.native
  var svg: js.UndefOr[PartialLineProps] = js.native
  var ticks: js.UndefOr[js.Array[T]] = js.native
  var x: js.UndefOr[js.Function1[/* t */ T, Double]] = js.native
  var y: js.UndefOr[js.Function1[/* t */ T, Double]] = js.native
}

object GridProps {
  @scala.inline
  def apply[T](): GridProps[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridProps[T]]
  }
  @scala.inline
  implicit class GridPropsOps[Self <: GridProps[_], T] (val x: Self with GridProps[T]) extends AnyVal {
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
    def setBelowChart(value: Boolean): Self = this.set("belowChart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBelowChart: Self = this.set("belowChart", js.undefined)
    @scala.inline
    def setDirection(value: GridDirection): Self = this.set("direction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    @scala.inline
    def setSvg(value: PartialLineProps): Self = this.set("svg", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSvg: Self = this.set("svg", js.undefined)
    @scala.inline
    def setTicksVarargs(value: T*): Self = this.set("ticks", js.Array(value :_*))
    @scala.inline
    def setTicks(value: js.Array[T]): Self = this.set("ticks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTicks: Self = this.set("ticks", js.undefined)
    @scala.inline
    def setX(value: /* t */ T => Double): Self = this.set("x", js.Any.fromFunction1(value))
    @scala.inline
    def deleteX: Self = this.set("x", js.undefined)
    @scala.inline
    def setY(value: /* t */ T => Double): Self = this.set("y", js.Any.fromFunction1(value))
    @scala.inline
    def deleteY: Self = this.set("y", js.undefined)
  }
  
}

