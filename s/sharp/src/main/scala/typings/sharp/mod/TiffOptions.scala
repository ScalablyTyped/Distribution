package typings.sharp.mod

import typings.sharp.sharpNumbers.`1`
import typings.sharp.sharpNumbers.`2`
import typings.sharp.sharpNumbers.`4`
import typings.sharp.sharpNumbers.`8`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TiffOptions extends OutputOptions {
  
  /** Reduce bitdepth to 1, 2 or 4 bit (optional, default 8) */
  var bitdepth: js.UndefOr[`1` | `2` | `4` | `8`] = js.native
  
  /** Compression options: lzw, deflate, jpeg, ccittfax4 (optional, default 'jpeg') */
  var compression: js.UndefOr[String] = js.native
  
  /** Compression predictor options: none, horizontal, float (optional, default 'horizontal') */
  var predictor: js.UndefOr[String] = js.native
  
  /** Write an image pyramid (optional, default false) */
  var pyramid: js.UndefOr[Boolean] = js.native
  
  /** Write a tiled tiff (optional, default false) */
  var tile: js.UndefOr[Boolean] = js.native
  
  /** Vertical tile size (optional, default 256) */
  var tileHeight: js.UndefOr[Boolean] = js.native
  
  /** Horizontal tile size (optional, default 256) */
  var tileWidth: js.UndefOr[Boolean] = js.native
  
  /** Horizontal resolution in pixels/mm (optional, default 1.0) */
  var xres: js.UndefOr[Double] = js.native
  
  /** Vertical resolution in pixels/mm (optional, default 1.0) */
  var yres: js.UndefOr[Double] = js.native
}
object TiffOptions {
  
  @scala.inline
  def apply(): TiffOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TiffOptions]
  }
  
  @scala.inline
  implicit class TiffOptionsOps[Self <: TiffOptions] (val x: Self) extends AnyVal {
    
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
    def setBitdepth(value: `1` | `2` | `4` | `8`): Self = this.set("bitdepth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBitdepth: Self = this.set("bitdepth", js.undefined)
    
    @scala.inline
    def setCompression(value: String): Self = this.set("compression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompression: Self = this.set("compression", js.undefined)
    
    @scala.inline
    def setPredictor(value: String): Self = this.set("predictor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePredictor: Self = this.set("predictor", js.undefined)
    
    @scala.inline
    def setPyramid(value: Boolean): Self = this.set("pyramid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePyramid: Self = this.set("pyramid", js.undefined)
    
    @scala.inline
    def setTile(value: Boolean): Self = this.set("tile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTile: Self = this.set("tile", js.undefined)
    
    @scala.inline
    def setTileHeight(value: Boolean): Self = this.set("tileHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTileHeight: Self = this.set("tileHeight", js.undefined)
    
    @scala.inline
    def setTileWidth(value: Boolean): Self = this.set("tileWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTileWidth: Self = this.set("tileWidth", js.undefined)
    
    @scala.inline
    def setXres(value: Double): Self = this.set("xres", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXres: Self = this.set("xres", js.undefined)
    
    @scala.inline
    def setYres(value: Double): Self = this.set("yres", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYres: Self = this.set("yres", js.undefined)
  }
}
