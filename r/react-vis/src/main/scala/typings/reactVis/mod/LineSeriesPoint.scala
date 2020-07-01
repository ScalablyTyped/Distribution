package typings.reactVis.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineSeriesPoint extends AbstractSeriesPoint {
  var color: js.UndefOr[String | Double] = js.undefined
  var x: Double
  var y: Double
}

object LineSeriesPoint {
  @scala.inline
  def apply(
    x: Double,
    y: Double,
    StringDictionary: StringDictionary[js.Any] = null,
    color: String | Double = null
  ): LineSeriesPoint = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineSeriesPoint]
  }
}

