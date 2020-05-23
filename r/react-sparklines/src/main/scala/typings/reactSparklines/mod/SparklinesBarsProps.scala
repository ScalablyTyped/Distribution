package typings.reactSparklines.mod

import typings.react.mod.CSSProperties
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactSVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SparklinesBarsProps extends js.Object {
  var barWidth: js.UndefOr[Double] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var margin: js.UndefOr[Double] = js.undefined
  var onMouseMove: js.UndefOr[
    js.Function2[/* p */ Point, /* event */ MouseEvent[ReactSVGElement, NativeMouseEvent], Unit]
  ] = js.undefined
  var points: js.UndefOr[js.Array[Point]] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object SparklinesBarsProps {
  @scala.inline
  def apply(
    barWidth: js.UndefOr[Double] = js.undefined,
    height: js.UndefOr[Double] = js.undefined,
    margin: js.UndefOr[Double] = js.undefined,
    onMouseMove: (/* p */ Point, /* event */ MouseEvent[ReactSVGElement, NativeMouseEvent]) => Unit = null,
    points: js.Array[Point] = null,
    style: CSSProperties = null
  ): SparklinesBarsProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(barWidth)) __obj.updateDynamic("barWidth")(barWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(margin)) __obj.updateDynamic("margin")(margin.get.asInstanceOf[js.Any])
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(js.Any.fromFunction2(onMouseMove))
    if (points != null) __obj.updateDynamic("points")(points.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[SparklinesBarsProps]
  }
}

