package typings.rotJs.typesMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import typings.std.HTMLVideoElement
import typings.std.ImageBitmap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisplayOptions extends js.Object {
  var bg: String = js.native
  var border: Double = js.native
  var fg: String = js.native
  var fontFamily: String = js.native
  var fontSize: Double = js.native
  var fontStyle: String = js.native
  var forceSquareRatio: Boolean = js.native
  var height: Double = js.native
  var layout: LayoutType = js.native
  var spacing: Double = js.native
  var tileColorize: Boolean = js.native
  var tileHeight: Double = js.native
  var tileMap: StringDictionary[js.Tuple2[Double, Double]] = js.native
  var tileSet: Null | HTMLCanvasElement | HTMLImageElement | HTMLVideoElement | ImageBitmap = js.native
  var tileWidth: Double = js.native
  var transpose: Boolean = js.native
  var width: Double = js.native
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
    width: Double
  ): DisplayOptions = {
    val __obj = js.Dynamic.literal(bg = bg.asInstanceOf[js.Any], border = border.asInstanceOf[js.Any], fg = fg.asInstanceOf[js.Any], fontFamily = fontFamily.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], fontStyle = fontStyle.asInstanceOf[js.Any], forceSquareRatio = forceSquareRatio.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], spacing = spacing.asInstanceOf[js.Any], tileColorize = tileColorize.asInstanceOf[js.Any], tileHeight = tileHeight.asInstanceOf[js.Any], tileMap = tileMap.asInstanceOf[js.Any], tileWidth = tileWidth.asInstanceOf[js.Any], transpose = transpose.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisplayOptions]
  }
  @scala.inline
  implicit class DisplayOptionsOps[Self <: DisplayOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBg(value: String): Self = this.set("bg", value.asInstanceOf[js.Any])
    @scala.inline
    def setBorder(value: Double): Self = this.set("border", value.asInstanceOf[js.Any])
    @scala.inline
    def setFg(value: String): Self = this.set("fg", value.asInstanceOf[js.Any])
    @scala.inline
    def setFontFamily(value: String): Self = this.set("fontFamily", value.asInstanceOf[js.Any])
    @scala.inline
    def setFontSize(value: Double): Self = this.set("fontSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setFontStyle(value: String): Self = this.set("fontStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def setForceSquareRatio(value: Boolean): Self = this.set("forceSquareRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setLayout(value: LayoutType): Self = this.set("layout", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpacing(value: Double): Self = this.set("spacing", value.asInstanceOf[js.Any])
    @scala.inline
    def setTileColorize(value: Boolean): Self = this.set("tileColorize", value.asInstanceOf[js.Any])
    @scala.inline
    def setTileHeight(value: Double): Self = this.set("tileHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def setTileMap(value: StringDictionary[js.Tuple2[Double, Double]]): Self = this.set("tileMap", value.asInstanceOf[js.Any])
    @scala.inline
    def setTileWidth(value: Double): Self = this.set("tileWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setTranspose(value: Boolean): Self = this.set("transpose", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def setTileSet(value: HTMLCanvasElement | HTMLImageElement | HTMLVideoElement | ImageBitmap): Self = this.set("tileSet", value.asInstanceOf[js.Any])
    @scala.inline
    def setTileSetNull: Self = this.set("tileSet", null)
  }
  
}

