package typings
package prismDashReactDashRendererLib.prismDashReactDashRendererMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrismThemeEntry
  extends /* styleKey */ org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double | scala.Unit] {
  var backgroundColor: js.UndefOr[java.lang.String] = js.undefined
  var color: js.UndefOr[java.lang.String] = js.undefined
  var fontStyle: js.UndefOr[
    prismDashReactDashRendererLib.prismDashReactDashRendererLibStrings.normal | prismDashReactDashRendererLib.prismDashReactDashRendererLibStrings.italic
  ] = js.undefined
  var fontWeight: js.UndefOr[
    prismDashReactDashRendererLib.prismDashReactDashRendererLibStrings.normal | prismDashReactDashRendererLib.prismDashReactDashRendererLibStrings.bold | prismDashReactDashRendererLib.prismDashReactDashRendererLibStrings.`100` | prismDashReactDashRendererLib.prismDashReactDashRendererLibStrings.`200` | prismDashReactDashRendererLib.prismDashReactDashRendererLibStrings.`300` | prismDashReactDashRendererLib.prismDashReactDashRendererLibStrings.`400` | prismDashReactDashRendererLib.prismDashReactDashRendererLibStrings.`500` | prismDashReactDashRendererLib.prismDashReactDashRendererLibStrings.`600` | prismDashReactDashRendererLib.prismDashReactDashRendererLibStrings.`700` | prismDashReactDashRendererLib.prismDashReactDashRendererLibStrings.`800` | prismDashReactDashRendererLib.prismDashReactDashRendererLibStrings.`900`
  ] = js.undefined
  var opacity: js.UndefOr[scala.Double] = js.undefined
  var textDecorationLine: js.UndefOr[
    prismDashReactDashRendererLib.prismDashReactDashRendererLibStrings.none | prismDashReactDashRendererLib.prismDashReactDashRendererLibStrings.underline | prismDashReactDashRendererLib.prismDashReactDashRendererLibStrings.`line-through` | (prismDashReactDashRendererLib.prismDashReactDashRendererLibStrings.`underline line-through`)
  ] = js.undefined
}

object PrismThemeEntry {
  @scala.inline
  def apply(
    StringDictionary: /* styleKey */ org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double | scala.Unit] = null,
    backgroundColor: java.lang.String = null,
    color: java.lang.String = null,
    fontStyle: prismDashReactDashRendererLib.prismDashReactDashRendererLibStrings.normal | prismDashReactDashRendererLib.prismDashReactDashRendererLibStrings.italic = null,
    fontWeight: prismDashReactDashRendererLib.prismDashReactDashRendererLibStrings.normal | prismDashReactDashRendererLib.prismDashReactDashRendererLibStrings.bold | prismDashReactDashRendererLib.prismDashReactDashRendererLibStrings.`100` | prismDashReactDashRendererLib.prismDashReactDashRendererLibStrings.`200` | prismDashReactDashRendererLib.prismDashReactDashRendererLibStrings.`300` | prismDashReactDashRendererLib.prismDashReactDashRendererLibStrings.`400` | prismDashReactDashRendererLib.prismDashReactDashRendererLibStrings.`500` | prismDashReactDashRendererLib.prismDashReactDashRendererLibStrings.`600` | prismDashReactDashRendererLib.prismDashReactDashRendererLibStrings.`700` | prismDashReactDashRendererLib.prismDashReactDashRendererLibStrings.`800` | prismDashReactDashRendererLib.prismDashReactDashRendererLibStrings.`900` = null,
    opacity: scala.Int | scala.Double = null,
    textDecorationLine: prismDashReactDashRendererLib.prismDashReactDashRendererLibStrings.none | prismDashReactDashRendererLib.prismDashReactDashRendererLibStrings.underline | prismDashReactDashRendererLib.prismDashReactDashRendererLibStrings.`line-through` | (prismDashReactDashRendererLib.prismDashReactDashRendererLibStrings.`underline line-through`) = null
  ): PrismThemeEntry = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor)
    if (color != null) __obj.updateDynamic("color")(color)
    if (fontStyle != null) __obj.updateDynamic("fontStyle")(fontStyle.asInstanceOf[js.Any])
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (textDecorationLine != null) __obj.updateDynamic("textDecorationLine")(textDecorationLine.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrismThemeEntry]
  }
}

