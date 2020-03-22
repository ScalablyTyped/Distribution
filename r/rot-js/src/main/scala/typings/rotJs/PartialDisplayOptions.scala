package typings.rotJs

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
    border: Int | Double = null,
    fg: String = null,
    fontFamily: String = null,
    fontSize: Int | Double = null,
    fontStyle: String = null,
    forceSquareRatio: js.UndefOr[Boolean] = js.undefined,
    height: Int | Double = null,
    layout: LayoutType = null,
    spacing: Int | Double = null,
    tileColorize: js.UndefOr[Boolean] = js.undefined,
    tileHeight: Int | Double = null,
    tileMap: StringDictionary[js.Tuple2[Double, Double]] = null,
    tileSet: HTMLCanvasElement | HTMLImageElement | HTMLVideoElement | ImageBitmap = null,
    tileWidth: Int | Double = null,
    transpose: js.UndefOr[Boolean] = js.undefined,
    width: Int | Double = null
  ): PartialDisplayOptions = {
    val __obj = js.Dynamic.literal()
    if (bg != null) __obj.updateDynamic("bg")(bg.asInstanceOf[js.Any])
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (fg != null) __obj.updateDynamic("fg")(fg.asInstanceOf[js.Any])
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily.asInstanceOf[js.Any])
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (fontStyle != null) __obj.updateDynamic("fontStyle")(fontStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(forceSquareRatio)) __obj.updateDynamic("forceSquareRatio")(forceSquareRatio.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (spacing != null) __obj.updateDynamic("spacing")(spacing.asInstanceOf[js.Any])
    if (!js.isUndefined(tileColorize)) __obj.updateDynamic("tileColorize")(tileColorize.asInstanceOf[js.Any])
    if (tileHeight != null) __obj.updateDynamic("tileHeight")(tileHeight.asInstanceOf[js.Any])
    if (tileMap != null) __obj.updateDynamic("tileMap")(tileMap.asInstanceOf[js.Any])
    if (tileSet != null) __obj.updateDynamic("tileSet")(tileSet.asInstanceOf[js.Any])
    if (tileWidth != null) __obj.updateDynamic("tileWidth")(tileWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(transpose)) __obj.updateDynamic("transpose")(transpose.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialDisplayOptions]
  }
}

