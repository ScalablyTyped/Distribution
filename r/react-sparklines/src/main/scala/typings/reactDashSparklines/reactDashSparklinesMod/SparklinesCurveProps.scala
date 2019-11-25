package typings.reactDashSparklines.reactDashSparklinesMod

import typings.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SparklinesCurveProps extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object SparklinesCurveProps {
  @scala.inline
  def apply(color: String = null, style: CSSProperties = null): SparklinesCurveProps = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[SparklinesCurveProps]
  }
}

