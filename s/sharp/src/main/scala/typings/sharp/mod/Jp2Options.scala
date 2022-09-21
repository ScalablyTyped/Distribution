package typings.sharp.mod

import typings.sharp.sharpStrings.`4Colon2Colon0`
import typings.sharp.sharpStrings.`4Colon4Colon4`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Jp2Options
  extends StObject
     with OutputOptions {
  
  /** Set to '4:2:0' to enable chroma subsampling (optional, default '4:4:4') */
  var chromaSubsampling: js.UndefOr[`4Colon4Colon4` | `4Colon2Colon0`] = js.undefined
  
  /** Use lossless compression mode (optional, default false) */
  var lossless: js.UndefOr[Boolean] = js.undefined
  
  /** Quality, integer 1-100 (optional, default 80) */
  var quality: js.UndefOr[Double] = js.undefined
  
  /** Vertical tile size (optional, default 512) */
  var tileHeight: js.UndefOr[Double] = js.undefined
  
  /** Horizontal tile size (optional, default 512) */
  var tileWidth: js.UndefOr[Double] = js.undefined
}
object Jp2Options {
  
  inline def apply(): Jp2Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Jp2Options]
  }
  
  extension [Self <: Jp2Options](x: Self) {
    
    inline def setChromaSubsampling(value: `4Colon4Colon4` | `4Colon2Colon0`): Self = StObject.set(x, "chromaSubsampling", value.asInstanceOf[js.Any])
    
    inline def setChromaSubsamplingUndefined: Self = StObject.set(x, "chromaSubsampling", js.undefined)
    
    inline def setLossless(value: Boolean): Self = StObject.set(x, "lossless", value.asInstanceOf[js.Any])
    
    inline def setLosslessUndefined: Self = StObject.set(x, "lossless", js.undefined)
    
    inline def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
    
    inline def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
    
    inline def setTileHeight(value: Double): Self = StObject.set(x, "tileHeight", value.asInstanceOf[js.Any])
    
    inline def setTileHeightUndefined: Self = StObject.set(x, "tileHeight", js.undefined)
    
    inline def setTileWidth(value: Double): Self = StObject.set(x, "tileWidth", value.asInstanceOf[js.Any])
    
    inline def setTileWidthUndefined: Self = StObject.set(x, "tileWidth", js.undefined)
  }
}
