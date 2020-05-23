package typings.rotJs.anon

import org.scalablytyped.runtime.StringDictionary
import typings.rotJs.typesMod.LayoutType
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import typings.std.HTMLVideoElement
import typings.std.ImageBitmap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<rot-js.rot-js/lib/display/types.DisplayOptions> */
trait PartialDisplayOptions extends js.Object {
  var bg: js.UndefOr[String] = js.undefined
  var border: js.UndefOr[Double] = js.undefined
  var fg: js.UndefOr[String] = js.undefined
  var fontFamily: js.UndefOr[String] = js.undefined
  var fontSize: js.UndefOr[Double] = js.undefined
  var fontStyle: js.UndefOr[String] = js.undefined
  var forceSquareRatio: js.UndefOr[Boolean] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var layout: js.UndefOr[LayoutType] = js.undefined
  var spacing: js.UndefOr[Double] = js.undefined
  var tileColorize: js.UndefOr[Boolean] = js.undefined
  var tileHeight: js.UndefOr[Double] = js.undefined
  var tileMap: js.UndefOr[StringDictionary[js.Tuple2[Double, Double]]] = js.undefined
  var tileSet: js.UndefOr[HTMLCanvasElement | HTMLImageElement | HTMLVideoElement | ImageBitmap] = js.undefined
  var tileWidth: js.UndefOr[Double] = js.undefined
  var transpose: js.UndefOr[Boolean] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object PartialDisplayOptions {
  @scala.inline
  def apply(
    bg: String = null,
    border: js.UndefOr[Double] = js.undefined,
    fg: String = null,
    fontFamily: String = null,
    fontSize: js.UndefOr[Double] = js.undefined,
    fontStyle: String = null,
    forceSquareRatio: js.UndefOr[Boolean] = js.undefined,
    height: js.UndefOr[Double] = js.undefined,
    layout: LayoutType = null,
    spacing: js.UndefOr[Double] = js.undefined,
    tileColorize: js.UndefOr[Boolean] = js.undefined,
    tileHeight: js.UndefOr[Double] = js.undefined,
    tileMap: StringDictionary[js.Tuple2[Double, Double]] = null,
    tileSet: HTMLCanvasElement | HTMLImageElement | HTMLVideoElement | ImageBitmap = null,
    tileWidth: js.UndefOr[Double] = js.undefined,
    transpose: js.UndefOr[Boolean] = js.undefined,
    width: js.UndefOr[Double] = js.undefined
  ): PartialDisplayOptions = {
    val __obj = js.Dynamic.literal()
    if (bg != null) __obj.updateDynamic("bg")(bg.asInstanceOf[js.Any])
    if (!js.isUndefined(border)) __obj.updateDynamic("border")(border.get.asInstanceOf[js.Any])
    if (fg != null) __obj.updateDynamic("fg")(fg.asInstanceOf[js.Any])
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily.asInstanceOf[js.Any])
    if (!js.isUndefined(fontSize)) __obj.updateDynamic("fontSize")(fontSize.get.asInstanceOf[js.Any])
    if (fontStyle != null) __obj.updateDynamic("fontStyle")(fontStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(forceSquareRatio)) __obj.updateDynamic("forceSquareRatio")(forceSquareRatio.get.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (!js.isUndefined(spacing)) __obj.updateDynamic("spacing")(spacing.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tileColorize)) __obj.updateDynamic("tileColorize")(tileColorize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tileHeight)) __obj.updateDynamic("tileHeight")(tileHeight.get.asInstanceOf[js.Any])
    if (tileMap != null) __obj.updateDynamic("tileMap")(tileMap.asInstanceOf[js.Any])
    if (tileSet != null) __obj.updateDynamic("tileSet")(tileSet.asInstanceOf[js.Any])
    if (!js.isUndefined(tileWidth)) __obj.updateDynamic("tileWidth")(tileWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(transpose)) __obj.updateDynamic("transpose")(transpose.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialDisplayOptions]
  }
}

