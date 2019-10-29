package typings.rotDashJs.libDisplayTypesMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import typings.std.HTMLVideoElement
import typings.std.ImageBitmap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisplayOptions extends js.Object {
  var bg: String
  var border: Double
  var fg: String
  var fontFamily: String
  var fontSize: Double
  var fontStyle: String
  var forceSquareRatio: Boolean
  var height: Double
  var layout: LayoutType
  var spacing: Double
  var tileColorize: Boolean
  var tileHeight: Double
  var tileMap: StringDictionary[js.Tuple2[Double, Double]]
  var tileSet: Null | HTMLCanvasElement | HTMLImageElement | HTMLVideoElement | ImageBitmap
  var tileWidth: Double
  var transpose: Boolean
  var width: Double
}

object DisplayOptions {
  @scala.inline
  def apply(
    bg: String,
    border: Double,
    fg: String,
    fontFamily: String,
    fontSize: Double,
    fontStyle: String,
    forceSquareRatio: Boolean,
    height: Double,
    layout: LayoutType,
    spacing: Double,
    tileColorize: Boolean,
    tileHeight: Double,
    tileMap: StringDictionary[js.Tuple2[Double, Double]],
    tileWidth: Double,
    transpose: Boolean,
    width: Double,
    tileSet: HTMLCanvasElement | HTMLImageElement | HTMLVideoElement | ImageBitmap = null
  ): DisplayOptions = {
    val __obj = js.Dynamic.literal(bg = bg, border = border, fg = fg, fontFamily = fontFamily, fontSize = fontSize, fontStyle = fontStyle, forceSquareRatio = forceSquareRatio, height = height, layout = layout, spacing = spacing, tileColorize = tileColorize, tileHeight = tileHeight, tileMap = tileMap, tileWidth = tileWidth, transpose = transpose, width = width)
    if (tileSet != null) __obj.updateDynamic("tileSet")(tileSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisplayOptions]
  }
}

