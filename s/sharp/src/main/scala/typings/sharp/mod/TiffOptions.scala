package typings.sharp.mod

import typings.sharp.sharpNumbers.`1`
import typings.sharp.sharpNumbers.`2`
import typings.sharp.sharpNumbers.`4`
import typings.sharp.sharpNumbers.`8`
import typings.sharp.sharpStrings.cm
import typings.sharp.sharpStrings.inch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TiffOptions
  extends StObject
     with OutputOptions {
  
  /** Reduce bitdepth to 1, 2 or 4 bit (optional, default 8) */
  var bitdepth: js.UndefOr[`1` | `2` | `4` | `8`] = js.undefined
  
  /** Compression options: none, jpeg, deflate, packbits, ccittfax4, lzw, webp, zstd, jp2k (optional, default 'jpeg') */
  var compression: js.UndefOr[String] = js.undefined
  
  /** Compression predictor options: none, horizontal, float (optional, default 'horizontal') */
  var predictor: js.UndefOr[String] = js.undefined
  
  /** Write an image pyramid (optional, default false) */
  var pyramid: js.UndefOr[Boolean] = js.undefined
  
  /** Quality, integer 1-100 (optional, default 80) */
  var quality: js.UndefOr[Double] = js.undefined
  
  /** Resolution unit options: inch, cm (optional, default 'inch') */
  var resolutionUnit: js.UndefOr[inch | cm] = js.undefined
  
  /** Write a tiled tiff (optional, default false) */
  var tile: js.UndefOr[Boolean] = js.undefined
  
  /** Vertical tile size (optional, default 256) */
  var tileHeight: js.UndefOr[Double] = js.undefined
  
  /** Horizontal tile size (optional, default 256) */
  var tileWidth: js.UndefOr[Double] = js.undefined
  
  /** Horizontal resolution in pixels/mm (optional, default 1.0) */
  var xres: js.UndefOr[Double] = js.undefined
  
  /** Vertical resolution in pixels/mm (optional, default 1.0) */
  var yres: js.UndefOr[Double] = js.undefined
}
object TiffOptions {
  
  inline def apply(): TiffOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TiffOptions]
  }
  
  extension [Self <: TiffOptions](x: Self) {
    
    inline def setBitdepth(value: `1` | `2` | `4` | `8`): Self = StObject.set(x, "bitdepth", value.asInstanceOf[js.Any])
    
    inline def setBitdepthUndefined: Self = StObject.set(x, "bitdepth", js.undefined)
    
    inline def setCompression(value: String): Self = StObject.set(x, "compression", value.asInstanceOf[js.Any])
    
    inline def setCompressionUndefined: Self = StObject.set(x, "compression", js.undefined)
    
    inline def setPredictor(value: String): Self = StObject.set(x, "predictor", value.asInstanceOf[js.Any])
    
    inline def setPredictorUndefined: Self = StObject.set(x, "predictor", js.undefined)
    
    inline def setPyramid(value: Boolean): Self = StObject.set(x, "pyramid", value.asInstanceOf[js.Any])
    
    inline def setPyramidUndefined: Self = StObject.set(x, "pyramid", js.undefined)
    
    inline def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
    
    inline def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
    
    inline def setResolutionUnit(value: inch | cm): Self = StObject.set(x, "resolutionUnit", value.asInstanceOf[js.Any])
    
    inline def setResolutionUnitUndefined: Self = StObject.set(x, "resolutionUnit", js.undefined)
    
    inline def setTile(value: Boolean): Self = StObject.set(x, "tile", value.asInstanceOf[js.Any])
    
    inline def setTileHeight(value: Double): Self = StObject.set(x, "tileHeight", value.asInstanceOf[js.Any])
    
    inline def setTileHeightUndefined: Self = StObject.set(x, "tileHeight", js.undefined)
    
    inline def setTileUndefined: Self = StObject.set(x, "tile", js.undefined)
    
    inline def setTileWidth(value: Double): Self = StObject.set(x, "tileWidth", value.asInstanceOf[js.Any])
    
    inline def setTileWidthUndefined: Self = StObject.set(x, "tileWidth", js.undefined)
    
    inline def setXres(value: Double): Self = StObject.set(x, "xres", value.asInstanceOf[js.Any])
    
    inline def setXresUndefined: Self = StObject.set(x, "xres", js.undefined)
    
    inline def setYres(value: Double): Self = StObject.set(x, "yres", value.asInstanceOf[js.Any])
    
    inline def setYresUndefined: Self = StObject.set(x, "yres", js.undefined)
  }
}
