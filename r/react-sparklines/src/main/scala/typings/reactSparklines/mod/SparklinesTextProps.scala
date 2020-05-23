package typings.reactSparklines.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SparklinesTextProps extends js.Object {
  var fontFamily: js.UndefOr[String] = js.undefined
  var fontSize: js.UndefOr[Double] = js.undefined
  var point: js.UndefOr[Point] = js.undefined
  var text: js.UndefOr[String] = js.undefined
}

object SparklinesTextProps {
  @scala.inline
  def apply(
    fontFamily: String = null,
    fontSize: js.UndefOr[Double] = js.undefined,
    point: Point = null,
    text: String = null
  ): SparklinesTextProps = {
    val __obj = js.Dynamic.literal()
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily.asInstanceOf[js.Any])
    if (!js.isUndefined(fontSize)) __obj.updateDynamic("fontSize")(fontSize.get.asInstanceOf[js.Any])
    if (point != null) __obj.updateDynamic("point")(point.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[SparklinesTextProps]
  }
}

