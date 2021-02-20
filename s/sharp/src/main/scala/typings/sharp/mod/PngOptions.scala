package typings.sharp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PngOptions extends StObject {
  
  /** use adaptive row filtering (optional, default false) */
  var adaptiveFiltering: js.UndefOr[Boolean] = js.native
  
  /** Alternative Spelling of "colours". Maximum number of palette entries, requires libimagequant (optional, default 256) */
  var colors: js.UndefOr[Double] = js.native
  
  /** Maximum number of palette entries, requires libimagequant (optional, default 256) */
  var colours: js.UndefOr[Double] = js.native
  
  /** zlib compression level, 0-9 (optional, default 9) */
  var compressionLevel: js.UndefOr[Double] = js.native
  
  /**  Level of Floyd-Steinberg error diffusion, requires libimagequant (optional, default 1.0) */
  var dither: js.UndefOr[Double] = js.native
  
  /** Force PNG output, otherwise attempt to use input format (optional, default  true) */
  var force: js.UndefOr[Boolean] = js.native
  
  /** Quantise to a palette-based image with alpha transparency support, requires libimagequant (optional, default false) */
  var palette: js.UndefOr[Boolean] = js.native
  
  /** Use progressive (interlace) scan (optional, default false) */
  var progressive: js.UndefOr[Boolean] = js.native
  
  /** use the lowest number of colours needed to achieve given quality, requires libimagequant (optional, default `100`) */
  var quality: js.UndefOr[Double] = js.native
}
object PngOptions {
  
  @scala.inline
  def apply(): PngOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PngOptions]
  }
  
  @scala.inline
  implicit class PngOptionsMutableBuilder[Self <: PngOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdaptiveFiltering(value: Boolean): Self = StObject.set(x, "adaptiveFiltering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdaptiveFilteringUndefined: Self = StObject.set(x, "adaptiveFiltering", js.undefined)
    
    @scala.inline
    def setColors(value: Double): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
    
    @scala.inline
    def setColours(value: Double): Self = StObject.set(x, "colours", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColoursUndefined: Self = StObject.set(x, "colours", js.undefined)
    
    @scala.inline
    def setCompressionLevel(value: Double): Self = StObject.set(x, "compressionLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompressionLevelUndefined: Self = StObject.set(x, "compressionLevel", js.undefined)
    
    @scala.inline
    def setDither(value: Double): Self = StObject.set(x, "dither", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDitherUndefined: Self = StObject.set(x, "dither", js.undefined)
    
    @scala.inline
    def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
    
    @scala.inline
    def setPalette(value: Boolean): Self = StObject.set(x, "palette", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaletteUndefined: Self = StObject.set(x, "palette", js.undefined)
    
    @scala.inline
    def setProgressive(value: Boolean): Self = StObject.set(x, "progressive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgressiveUndefined: Self = StObject.set(x, "progressive", js.undefined)
    
    @scala.inline
    def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
  }
}
