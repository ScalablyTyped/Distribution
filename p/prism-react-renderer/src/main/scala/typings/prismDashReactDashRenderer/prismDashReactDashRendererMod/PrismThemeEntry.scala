package typings.prismDashReactDashRenderer.prismDashReactDashRendererMod

import org.scalablytyped.runtime.StringDictionary
import typings.prismDashReactDashRenderer.prismDashReactDashRendererStrings.`100`
import typings.prismDashReactDashRenderer.prismDashReactDashRendererStrings.`200`
import typings.prismDashReactDashRenderer.prismDashReactDashRendererStrings.`300`
import typings.prismDashReactDashRenderer.prismDashReactDashRendererStrings.`400`
import typings.prismDashReactDashRenderer.prismDashReactDashRendererStrings.`500`
import typings.prismDashReactDashRenderer.prismDashReactDashRendererStrings.`600`
import typings.prismDashReactDashRenderer.prismDashReactDashRendererStrings.`700`
import typings.prismDashReactDashRenderer.prismDashReactDashRendererStrings.`800`
import typings.prismDashReactDashRenderer.prismDashReactDashRendererStrings.`900`
import typings.prismDashReactDashRenderer.prismDashReactDashRendererStrings.`line-through`
import typings.prismDashReactDashRenderer.prismDashReactDashRendererStrings.`underline line-through`
import typings.prismDashReactDashRenderer.prismDashReactDashRendererStrings.bold
import typings.prismDashReactDashRenderer.prismDashReactDashRendererStrings.italic
import typings.prismDashReactDashRenderer.prismDashReactDashRendererStrings.none
import typings.prismDashReactDashRenderer.prismDashReactDashRendererStrings.normal
import typings.prismDashReactDashRenderer.prismDashReactDashRendererStrings.underline
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrismThemeEntry extends /* styleKey */ StringDictionary[String | Double | Unit] {
  var backgroundColor: js.UndefOr[String] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var fontStyle: js.UndefOr[normal | italic] = js.undefined
  var fontWeight: js.UndefOr[
    normal | bold | `100` | `200` | `300` | `400` | `500` | `600` | `700` | `800` | `900`
  ] = js.undefined
  var opacity: js.UndefOr[Double] = js.undefined
  var textDecorationLine: js.UndefOr[none | underline | `line-through` | (`underline line-through`)] = js.undefined
}

object PrismThemeEntry {
  @scala.inline
  def apply(
    StringDictionary: /* styleKey */ StringDictionary[String | Double | Unit] = null,
    backgroundColor: String = null,
    color: String = null,
    fontStyle: normal | italic = null,
    fontWeight: normal | bold | `100` | `200` | `300` | `400` | `500` | `600` | `700` | `800` | `900` = null,
    opacity: Int | Double = null,
    textDecorationLine: none | underline | `line-through` | (`underline line-through`) = null
  ): PrismThemeEntry = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (fontStyle != null) __obj.updateDynamic("fontStyle")(fontStyle.asInstanceOf[js.Any])
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (textDecorationLine != null) __obj.updateDynamic("textDecorationLine")(textDecorationLine.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrismThemeEntry]
  }
}

