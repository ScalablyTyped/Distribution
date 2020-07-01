package typings.reactVis.mod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SunburstPoint extends AbstractSeriesPoint {
  var children: js.UndefOr[js.Array[SunburstPoint]] = js.undefined
  var color: js.UndefOr[Double] = js.undefined
  var dontRotateLabel: js.UndefOr[Boolean] = js.undefined
  var label: js.UndefOr[String] = js.undefined
  var labelStyle: js.UndefOr[CSSProperties] = js.undefined
  var size: Double
  var title: String
}

object SunburstPoint {
  @scala.inline
  def apply(
    size: Double,
    title: String,
    StringDictionary: StringDictionary[js.Any] = null,
    children: js.Array[SunburstPoint] = null,
    color: js.UndefOr[Double] = js.undefined,
    dontRotateLabel: js.UndefOr[Boolean] = js.undefined,
    label: String = null,
    labelStyle: CSSProperties = null
  ): SunburstPoint = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(color)) __obj.updateDynamic("color")(color.get.asInstanceOf[js.Any])
    if (!js.isUndefined(dontRotateLabel)) __obj.updateDynamic("dontRotateLabel")(dontRotateLabel.get.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (labelStyle != null) __obj.updateDynamic("labelStyle")(labelStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[SunburstPoint]
  }
}

