package typings
package reactDashSparklinesLib.reactDashSparklinesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SparklinesLineProps extends js.Object {
  var color: js.UndefOr[java.lang.String] = js.undefined
  var onMouseMove: js.UndefOr[
    js.Function3[
      /* event */ reactDashSparklinesLib.reactDashSparklinesLibStrings.enter | reactDashSparklinesLib.reactDashSparklinesLibStrings.click, 
      /* value */ scala.Double, 
      /* point */ Point, 
      scala.Unit
    ]
  ] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
}

object SparklinesLineProps {
  @scala.inline
  def apply(
    color: java.lang.String = null,
    onMouseMove: js.Function3[
      /* event */ reactDashSparklinesLib.reactDashSparklinesLibStrings.enter | reactDashSparklinesLib.reactDashSparklinesLibStrings.click, 
      /* value */ scala.Double, 
      /* point */ Point, 
      scala.Unit
    ] = null,
    style: reactLib.reactMod.ReactNs.CSSProperties = null
  ): SparklinesLineProps = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(onMouseMove)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[SparklinesLineProps]
  }
}

