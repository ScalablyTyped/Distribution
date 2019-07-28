package typings.rotDashJs.rotDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisplayOptions extends js.Object {
  var bg: js.UndefOr[String] = js.undefined
  var border: js.UndefOr[Double] = js.undefined
  var fg: js.UndefOr[String] = js.undefined
  var fontFamily: js.UndefOr[String] = js.undefined
  var fontSize: js.UndefOr[Double] = js.undefined
  var fontStyle: js.UndefOr[String] = js.undefined
  var forceSquareRatio: js.UndefOr[Boolean] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var layout: js.UndefOr[String] = js.undefined
  var spacing: js.UndefOr[Double] = js.undefined
  var termColor: js.UndefOr[String] = js.undefined
  var tileColorize: js.UndefOr[Boolean] = js.undefined
  var tileHeight: js.UndefOr[Double] = js.undefined
  var tileMap: js.UndefOr[js.Any] = js.undefined
  var tileSet: js.UndefOr[js.Any] = js.undefined
  var tileWidth: js.UndefOr[Double] = js.undefined
  var transpose: js.UndefOr[Boolean] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object DisplayOptions {
  @scala.inline
  def apply(
    bg: String = null,
    border: Int | Double = null,
    fg: String = null,
    fontFamily: String = null,
    fontSize: Int | Double = null,
    fontStyle: String = null,
    forceSquareRatio: js.UndefOr[Boolean] = js.undefined,
    height: Int | Double = null,
    layout: String = null,
    spacing: Int | Double = null,
    termColor: String = null,
    tileColorize: js.UndefOr[Boolean] = js.undefined,
    tileHeight: Int | Double = null,
    tileMap: js.Any = null,
    tileSet: js.Any = null,
    tileWidth: Int | Double = null,
    transpose: js.UndefOr[Boolean] = js.undefined,
    width: Int | Double = null
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

