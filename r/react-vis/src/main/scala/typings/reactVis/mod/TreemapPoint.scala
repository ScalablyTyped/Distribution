package typings.reactVis.mod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreemapPoint extends AbstractSeriesPoint {
  var children: js.Array[TreemapPoint]
  var color: js.UndefOr[String | Double] = js.undefined
  var opacity: js.UndefOr[Double] = js.undefined
  var size: Double
  var style: CSSProperties
  var title: String
}

object TreemapPoint {
  @scala.inline
  def apply(
    children: js.Array[TreemapPoint],
    size: Double,
    style: CSSProperties,
    title: String,
    StringDictionary: StringDictionary[js.Any] = null,
    color: String | Double = null,
    opacity: js.UndefOr[Double] = js.undefined
  ): TreemapPoint = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreemapPoint]
  }
}

