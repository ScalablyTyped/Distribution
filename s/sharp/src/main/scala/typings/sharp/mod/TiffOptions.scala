package typings.sharp.mod

import typings.sharp.sharpNumbers.`1`
import typings.sharp.sharpNumbers.`2`
import typings.sharp.sharpNumbers.`4`
import typings.sharp.sharpNumbers.`8`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TiffOptions
  extends StObject
     with OutputOptions {
  
  /** Reduce bitdepth to 1, 2 or 4 bit (optional, default 8) */
  var bitdepth: js.UndefOr[`1` | `2` | `4` | `8`] = js.undefined
  
  /** Compression options: lzw, deflate, jpeg, ccittfax4 (optional, default 'jpeg') */
  var compression: js.UndefOr[String] = js.undefined
  
  /** Compression predictor options: none, horizontal, float (optional, default 'horizontal') */
  var predictor: js.UndefOr[String] = js.undefined
  
  /** Write an image pyramid (optional, default false) */
  var pyramid: js.UndefOr[Boolean] = js.undefined
  
  /** Write a tiled tiff (optional, default false) */
  var tile: js.UndefOr[Boolean] = js.undefined
  
  /** Vertical tile size (optional, default 256) */
  var tileHeight: js.UndefOr[Boolean] = js.undefined
  
  /** Horizontal tile size (optional, default 256) */
  var tileWidth: js.UndefOr[Boolean] = js.undefined
  
  /** Horizontal resolution in pixels/mm (optional, default 1.0) */
  var xres: js.UndefOr[Double] = js.undefined
  
  /** Vertical resolution in pixels/mm (optional, default 1.0) */
  var yres: js.UndefOr[Double] = js.undefined
}
object TiffOptions {
  
  @scala.inline
  def apply(): TiffOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TiffOptions]
  }
  
  @scala.inline
  implicit class TiffOptionsMutableBuilder[Self <: TiffOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBitdepth(value: `1` | `2` | `4` | `8`): Self = StObject.set(x, "bitdepth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBitdepthUndefined: Self = StObject.set(x, "bitdepth", js.undefined)
    
    @scala.inline
    def setCompression(value: String): Self = StObject.set(x, "compression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompressionUndefined: Self = StObject.set(x, "compression", js.undefined)
    
    @scala.inline
    def setPredictor(value: String): Self = StObject.set(x, "predictor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPredictorUndefined: Self = StObject.set(x, "predictor", js.undefined)
    
    @scala.inline
    def setPyramid(value: Boolean): Self = StObject.set(x, "pyramid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPyramidUndefined: Self = StObject.set(x, "pyramid", js.undefined)
    
    @scala.inline
    def setTile(value: Boolean): Self = StObject.set(x, "tile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTileHeight(value: Boolean): Self = StObject.set(x, "tileHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTileHeightUndefined: Self = StObject.set(x, "tileHeight", js.undefined)
    
    @scala.inline
    def setTileUndefined: Self = StObject.set(x, "tile", js.undefined)
    
    @scala.inline
    def setTileWidth(value: Boolean): Self = StObject.set(x, "tileWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTileWidthUndefined: Self = StObject.set(x, "tileWidth", js.undefined)
    
    @scala.inline
    def setXres(value: Double): Self = StObject.set(x, "xres", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXresUndefined: Self = StObject.set(x, "xres", js.undefined)
    
    @scala.inline
    def setYres(value: Double): Self = StObject.set(x, "yres", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYresUndefined: Self = StObject.set(x, "yres", js.undefined)
  }
}
