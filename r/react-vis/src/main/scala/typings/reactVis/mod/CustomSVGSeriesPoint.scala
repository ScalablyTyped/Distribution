package typings.reactVis.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomSVGSeriesPoint extends AbstractSeriesPoint {
  var x: Double
  var y: Double
}

object CustomSVGSeriesPoint {
  @scala.inline
  def apply(x: Double, y: Double, StringDictionary: StringDictionary[js.Any] = null): CustomSVGSeriesPoint = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[CustomSVGSeriesPoint]
  }
}

