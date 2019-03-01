package typings
package reactDashSparklinesLib.reactDashSparklinesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SparklinesTextProps extends js.Object {
  var fontFamily: js.UndefOr[java.lang.String] = js.undefined
  var fontSize: js.UndefOr[scala.Double] = js.undefined
  var point: js.UndefOr[Point] = js.undefined
  var text: js.UndefOr[java.lang.String] = js.undefined
}

object SparklinesTextProps {
  @scala.inline
  def apply(
    fontFamily: java.lang.String = null,
    fontSize: scala.Int | scala.Double = null,
    point: Point = null,
    text: java.lang.String = null
  ): SparklinesTextProps = {
    val __obj = js.Dynamic.literal()
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily)
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (point != null) __obj.updateDynamic("point")(point)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[SparklinesTextProps]
  }
}

