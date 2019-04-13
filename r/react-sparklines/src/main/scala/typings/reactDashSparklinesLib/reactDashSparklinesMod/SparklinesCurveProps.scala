package typings
package reactDashSparklinesLib.reactDashSparklinesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SparklinesCurveProps extends js.Object {
  var color: js.UndefOr[java.lang.String] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
}

object SparklinesCurveProps {
  @scala.inline
  def apply(color: java.lang.String = null, style: reactLib.reactMod.CSSProperties = null): SparklinesCurveProps = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[SparklinesCurveProps]
  }
}

