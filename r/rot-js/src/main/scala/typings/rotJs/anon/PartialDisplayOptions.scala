package typings.rotJs.anon

import org.scalablytyped.runtime.StringDictionary
import typings.rotJs.typesMod.LayoutType
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import typings.std.HTMLVideoElement
import typings.std.ImageBitmap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<rot-js.rot-js/lib/display/types.DisplayOptions> */
@js.native
trait PartialDisplayOptions extends js.Object {
  
  var bg: js.UndefOr[String] = js.native
  
  var border: js.UndefOr[Double] = js.native
  
  var fg: js.UndefOr[String] = js.native
  
  var fontFamily: js.UndefOr[String] = js.native
  
  var fontSize: js.UndefOr[Double] = js.native
  
  var fontStyle: js.UndefOr[String] = js.native
  
  var forceSquareRatio: js.UndefOr[Boolean] = js.native
  
  var height: js.UndefOr[Double] = js.native
  
  var layout: js.UndefOr[LayoutType] = js.native
  
  var spacing: js.UndefOr[Double] = js.native
  
  var tileColorize: js.UndefOr[Boolean] = js.native
  
  var tileHeight: js.UndefOr[Double] = js.native
  
  var tileMap: js.UndefOr[StringDictionary[js.Tuple2[Double, Double]]] = js.native
  
  var tileSet: js.UndefOr[Null | HTMLCanvasElement | HTMLImageElement | HTMLVideoElement | ImageBitmap] = js.native
  
  var tileWidth: js.UndefOr[Double] = js.native
  
  var transpose: js.UndefOr[Boolean] = js.native
  
  var width: js.UndefOr[Double] = js.native
}
object PartialDisplayOptions {
  
  @scala.inline
  def apply(): PartialDisplayOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialDisplayOptions]
  }
  
  @scala.inline
  implicit class PartialDisplayOptionsOps[Self <: PartialDisplayOptions] (val x: Self) extends AnyVal {
    
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
    def deleteBg: Self = this.set("bg", js.undefined)
    
    @scala.inline
    def setBorder(value: Double): Self = this.set("border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorder: Self = this.set("border", js.undefined)
    
    @scala.inline
    def setFg(value: String): Self = this.set("fg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFg: Self = this.set("fg", js.undefined)
    
    @scala.inline
    def setFontFamily(value: String): Self = this.set("fontFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontFamily: Self = this.set("fontFamily", js.undefined)
    
    @scala.inline
    def setFontSize(value: Double): Self = this.set("fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontSize: Self = this.set("fontSize", js.undefined)
    
    @scala.inline
    def setFontStyle(value: String): Self = this.set("fontStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontStyle: Self = this.set("fontStyle", js.undefined)
    
    @scala.inline
    def setForceSquareRatio(value: Boolean): Self = this.set("forceSquareRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForceSquareRatio: Self = this.set("forceSquareRatio", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setLayout(value: LayoutType): Self = this.set("layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLayout: Self = this.set("layout", js.undefined)
    
    @scala.inline
    def setSpacing(value: Double): Self = this.set("spacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpacing: Self = this.set("spacing", js.undefined)
    
    @scala.inline
    def setTileColorize(value: Boolean): Self = this.set("tileColorize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTileColorize: Self = this.set("tileColorize", js.undefined)
    
    @scala.inline
    def setTileHeight(value: Double): Self = this.set("tileHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTileHeight: Self = this.set("tileHeight", js.undefined)
    
    @scala.inline
    def setTileMap(value: StringDictionary[js.Tuple2[Double, Double]]): Self = this.set("tileMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTileMap: Self = this.set("tileMap", js.undefined)
    
    @scala.inline
    def setTileSet(value: HTMLCanvasElement | HTMLImageElement | HTMLVideoElement | ImageBitmap): Self = this.set("tileSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTileSet: Self = this.set("tileSet", js.undefined)
    
    @scala.inline
    def setTileSetNull: Self = this.set("tileSet", null)
    
    @scala.inline
    def setTileWidth(value: Double): Self = this.set("tileWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTileWidth: Self = this.set("tileWidth", js.undefined)
    
    @scala.inline
    def setTranspose(value: Boolean): Self = this.set("transpose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTranspose: Self = this.set("transpose", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
