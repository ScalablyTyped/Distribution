package typings.reactDashSparklines.reactDashSparklinesMod

import typings.react.reactMod.CSSProperties
import typings.reactDashSparklines.reactDashSparklinesStrings.click
import typings.reactDashSparklines.reactDashSparklinesStrings.enter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SparklinesLineProps extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var onMouseMove: js.UndefOr[
    js.Function3[/* event */ enter | click, /* value */ Double, /* point */ Point, Unit]
  ] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object SparklinesLineProps {
  @scala.inline
  def apply(
    color: String = null,
    onMouseMove: (/* event */ enter | click, /* value */ Double, /* point */ Point) => Unit = null,
    style: CSSProperties = null
  ): SparklinesLineProps = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(js.Any.fromFunction3(onMouseMove))
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[SparklinesLineProps]
  }
}

