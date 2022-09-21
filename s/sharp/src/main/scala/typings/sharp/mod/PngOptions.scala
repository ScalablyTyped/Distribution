package typings.sharp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PngOptions
  extends StObject
     with OutputOptions {
  
  /** Use adaptive row filtering (optional, default false) */
  var adaptiveFiltering: js.UndefOr[Boolean] = js.undefined
  
  /** Alternative Spelling of "colours". Maximum number of palette entries (optional, default 256) */
  var colors: js.UndefOr[Double] = js.undefined
  
  /** Maximum number of palette entries (optional, default 256) */
  var colours: js.UndefOr[Double] = js.undefined
  
  /** zlib compression level, 0-9 (optional, default 6) */
  var compressionLevel: js.UndefOr[Double] = js.undefined
  
  /**  Level of Floyd-Steinberg error diffusion (optional, default 1.0) */
  var dither: js.UndefOr[Double] = js.undefined
  
  /** Level of CPU effort to reduce file size, between 1 (fastest) and 10 (slowest), sets palette to true (optional, default 7) */
  var effort: js.UndefOr[Double] = js.undefined
  
  /** Quantise to a palette-based image with alpha transparency support (optional, default false) */
  var palette: js.UndefOr[Boolean] = js.undefined
  
  /** Use progressive (interlace) scan (optional, default false) */
  var progressive: js.UndefOr[Boolean] = js.undefined
  
  /** Use the lowest number of colours needed to achieve given quality (optional, default `100`) */
  var quality: js.UndefOr[Double] = js.undefined
}
object PngOptions {
  
  inline def apply(): PngOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PngOptions]
  }
  
  extension [Self <: PngOptions](x: Self) {
    
    inline def setAdaptiveFiltering(value: Boolean): Self = StObject.set(x, "adaptiveFiltering", value.asInstanceOf[js.Any])
    
    inline def setAdaptiveFilteringUndefined: Self = StObject.set(x, "adaptiveFiltering", js.undefined)
    
    inline def setColors(value: Double): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
    
    inline def setColours(value: Double): Self = StObject.set(x, "colours", value.asInstanceOf[js.Any])
    
    inline def setColoursUndefined: Self = StObject.set(x, "colours", js.undefined)
    
    inline def setCompressionLevel(value: Double): Self = StObject.set(x, "compressionLevel", value.asInstanceOf[js.Any])
    
    inline def setCompressionLevelUndefined: Self = StObject.set(x, "compressionLevel", js.undefined)
    
    inline def setDither(value: Double): Self = StObject.set(x, "dither", value.asInstanceOf[js.Any])
    
    inline def setDitherUndefined: Self = StObject.set(x, "dither", js.undefined)
    
    inline def setEffort(value: Double): Self = StObject.set(x, "effort", value.asInstanceOf[js.Any])
    
    inline def setEffortUndefined: Self = StObject.set(x, "effort", js.undefined)
    
    inline def setPalette(value: Boolean): Self = StObject.set(x, "palette", value.asInstanceOf[js.Any])
    
    inline def setPaletteUndefined: Self = StObject.set(x, "palette", js.undefined)
    
    inline def setProgressive(value: Boolean): Self = StObject.set(x, "progressive", value.asInstanceOf[js.Any])
    
    inline def setProgressiveUndefined: Self = StObject.set(x, "progressive", js.undefined)
    
    inline def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
    
    inline def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
  }
}
