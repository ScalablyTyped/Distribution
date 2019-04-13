package typings
package reactDashSparklinesLib.reactDashSparklinesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SparklinesBarsProps extends js.Object {
  var barWidth: js.UndefOr[scala.Double] = js.undefined
  var height: js.UndefOr[scala.Double] = js.undefined
  var margin: js.UndefOr[scala.Double] = js.undefined
  var onMouseMove: js.UndefOr[
    js.Function2[
      /* p */ Point, 
      /* event */ reactLib.reactMod.MouseEvent[reactLib.reactMod.ReactSVGElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ]
  ] = js.undefined
  var points: js.UndefOr[js.Array[Point]] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
}

object SparklinesBarsProps {
  @scala.inline
  def apply(
    barWidth: scala.Int | scala.Double = null,
    height: scala.Int | scala.Double = null,
    margin: scala.Int | scala.Double = null,
    onMouseMove: (/* p */ Point, /* event */ reactLib.reactMod.MouseEvent[reactLib.reactMod.ReactSVGElement, reactLib.NativeMouseEvent]) => scala.Unit = null,
    points: js.Array[Point] = null,
    style: reactLib.reactMod.CSSProperties = null
  ): SparklinesBarsProps = {
    val __obj = js.Dynamic.literal()
    if (barWidth != null) __obj.updateDynamic("barWidth")(barWidth.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(js.Any.fromFunction2(onMouseMove))
    if (points != null) __obj.updateDynamic("points")(points)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[SparklinesBarsProps]
  }
}

