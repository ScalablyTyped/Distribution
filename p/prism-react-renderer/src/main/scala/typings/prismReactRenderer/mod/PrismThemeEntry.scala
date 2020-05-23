package typings.prismReactRenderer.mod

import org.scalablytyped.runtime.StringDictionary
import typings.prismReactRenderer.prismReactRendererStrings.`100`
import typings.prismReactRenderer.prismReactRendererStrings.`200`
import typings.prismReactRenderer.prismReactRendererStrings.`300`
import typings.prismReactRenderer.prismReactRendererStrings.`400`
import typings.prismReactRenderer.prismReactRendererStrings.`500`
import typings.prismReactRenderer.prismReactRendererStrings.`600`
import typings.prismReactRenderer.prismReactRendererStrings.`700`
import typings.prismReactRenderer.prismReactRendererStrings.`800`
import typings.prismReactRenderer.prismReactRendererStrings.`900`
import typings.prismReactRenderer.prismReactRendererStrings.`line-through`
import typings.prismReactRenderer.prismReactRendererStrings.`underline line-through`
import typings.prismReactRenderer.prismReactRendererStrings.bold
import typings.prismReactRenderer.prismReactRendererStrings.italic
import typings.prismReactRenderer.prismReactRendererStrings.none
import typings.prismReactRenderer.prismReactRendererStrings.normal
import typings.prismReactRenderer.prismReactRendererStrings.underline
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
    opacity: js.UndefOr[Double] = js.undefined,
    textDecorationLine: none | underline | `line-through` | (`underline line-through`) = null
  ): PrismThemeEntry = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (fontStyle != null) __obj.updateDynamic("fontStyle")(fontStyle.asInstanceOf[js.Any])
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight.asInstanceOf[js.Any])
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    if (textDecorationLine != null) __obj.updateDynamic("textDecorationLine")(textDecorationLine.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrismThemeEntry]
  }
}

