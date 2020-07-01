package typings.reactVis.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartLabelProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var includeMargin: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var text: String
  var xPercent: Double
  var yPercent: Double
}

object ChartLabelProps {
  @scala.inline
  def apply(
    text: String,
    xPercent: Double,
    yPercent: Double,
    className: String = null,
    includeMargin: js.UndefOr[Boolean] = js.undefined,
    style: StringDictionary[js.Any] = null
  ): ChartLabelProps = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any], xPercent = xPercent.asInstanceOf[js.Any], yPercent = yPercent.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(includeMargin)) __obj.updateDynamic("includeMargin")(includeMargin.get.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartLabelProps]
  }
}

