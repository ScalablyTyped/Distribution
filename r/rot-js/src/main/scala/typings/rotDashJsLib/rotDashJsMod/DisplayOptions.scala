package typings
package rotDashJsLib.rotDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisplayOptions extends js.Object {
  var bg: js.UndefOr[java.lang.String] = js.undefined
  var border: js.UndefOr[scala.Double] = js.undefined
  var fg: js.UndefOr[java.lang.String] = js.undefined
  var fontFamily: js.UndefOr[java.lang.String] = js.undefined
  var fontSize: js.UndefOr[scala.Double] = js.undefined
  var fontStyle: js.UndefOr[java.lang.String] = js.undefined
  var forceSquareRatio: js.UndefOr[scala.Boolean] = js.undefined
  var height: js.UndefOr[scala.Double] = js.undefined
  var layout: js.UndefOr[java.lang.String] = js.undefined
  var spacing: js.UndefOr[scala.Double] = js.undefined
  var termColor: js.UndefOr[java.lang.String] = js.undefined
  var tileColorize: js.UndefOr[scala.Boolean] = js.undefined
  var tileHeight: js.UndefOr[scala.Double] = js.undefined
  var tileMap: js.UndefOr[js.Any] = js.undefined
  var tileSet: js.UndefOr[js.Any] = js.undefined
  var tileWidth: js.UndefOr[scala.Double] = js.undefined
  var transpose: js.UndefOr[scala.Boolean] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
}

object DisplayOptions {
  @scala.inline
  def apply(
    bg: java.lang.String = null,
    border: scala.Int | scala.Double = null,
    fg: java.lang.String = null,
    fontFamily: java.lang.String = null,
    fontSize: scala.Int | scala.Double = null,
    fontStyle: java.lang.String = null,
    forceSquareRatio: js.UndefOr[scala.Boolean] = js.undefined,
    height: scala.Int | scala.Double = null,
    layout: java.lang.String = null,
    spacing: scala.Int | scala.Double = null,
    termColor: java.lang.String = null,
    tileColorize: js.UndefOr[scala.Boolean] = js.undefined,
    tileHeight: scala.Int | scala.Double = null,
    tileMap: js.Any = null,
    tileSet: js.Any = null,
    tileWidth: scala.Int | scala.Double = null,
    transpose: js.UndefOr[scala.Boolean] = js.undefined,
    width: scala.Int | scala.Double = null
  ): DisplayOptions = {
    val __obj = js.Dynamic.literal()
    if (bg != null) __obj.updateDynamic("bg")(bg)
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (fg != null) __obj.updateDynamic("fg")(fg)
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily)
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (fontStyle != null) __obj.updateDynamic("fontStyle")(fontStyle)
    if (!js.isUndefined(forceSquareRatio)) __obj.updateDynamic("forceSquareRatio")(forceSquareRatio)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout)
    if (spacing != null) __obj.updateDynamic("spacing")(spacing.asInstanceOf[js.Any])
    if (termColor != null) __obj.updateDynamic("termColor")(termColor)
    if (!js.isUndefined(tileColorize)) __obj.updateDynamic("tileColorize")(tileColorize)
    if (tileHeight != null) __obj.updateDynamic("tileHeight")(tileHeight.asInstanceOf[js.Any])
    if (tileMap != null) __obj.updateDynamic("tileMap")(tileMap)
    if (tileSet != null) __obj.updateDynamic("tileSet")(tileSet)
    if (tileWidth != null) __obj.updateDynamic("tileWidth")(tileWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(transpose)) __obj.updateDynamic("transpose")(transpose)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisplayOptions]
  }
}

