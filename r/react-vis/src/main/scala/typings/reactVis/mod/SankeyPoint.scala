package typings.reactVis.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SankeyPoint extends AbstractSeriesPoint {
  var color: js.UndefOr[String] = js.undefined
  var key: js.UndefOr[String] = js.undefined
  var name: String
  var opacity: js.UndefOr[Double] = js.undefined
}

object SankeyPoint {
  @scala.inline
  def apply(
    name: String,
    StringDictionary: StringDictionary[js.Any] = null,
    color: String = null,
    key: String = null,
    opacity: js.UndefOr[Double] = js.undefined
  ): SankeyPoint = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SankeyPoint]
  }
}

