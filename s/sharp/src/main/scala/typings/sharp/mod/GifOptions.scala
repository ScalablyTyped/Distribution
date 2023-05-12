package typings.sharp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GifOptions
  extends StObject
     with OutputOptions
     with AnimationOptions {
  
  /** Alternative spelling of "colours". Maximum number of palette entries, including transparency, between 2 and 256 (optional, default 256) */
  var colors: js.UndefOr[Double] = js.undefined
  
  /** Maximum number of palette entries, including transparency, between 2 and 256 (optional, default 256) */
  var colours: js.UndefOr[Double] = js.undefined
  
  /** Level of Floyd-Steinberg error diffusion, between 0 (least) and 1 (most) (optional, default 1.0) */
  var dither: js.UndefOr[Double] = js.undefined
  
  /** Level of CPU effort to reduce file size, between 1 (fastest) and 10 (slowest) (optional, default 7) */
  var effort: js.UndefOr[Double] = js.undefined
  
  /** Maximum inter-frame error for transparency, between 0 (lossless) and 32 (optional, default 0) */
  var interFrameMaxError: js.UndefOr[Double] = js.undefined
  
  /** Maximum inter-palette error for palette reuse, between 0 and 256 (optional, default 3) */
  var interPaletteMaxError: js.UndefOr[Double] = js.undefined
  
  /** Use progressive (interlace) scan */
  var progressive: js.UndefOr[Boolean] = js.undefined
  
  /** Re-use existing palette, otherwise generate new (slow) */
  var reuse: js.UndefOr[Boolean] = js.undefined
}
object GifOptions {
  
  inline def apply(): GifOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GifOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GifOptions] (val x: Self) extends AnyVal {
    
    inline def setColors(value: Double): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
    
    inline def setColours(value: Double): Self = StObject.set(x, "colours", value.asInstanceOf[js.Any])
    
    inline def setColoursUndefined: Self = StObject.set(x, "colours", js.undefined)
    
    inline def setDither(value: Double): Self = StObject.set(x, "dither", value.asInstanceOf[js.Any])
    
    inline def setDitherUndefined: Self = StObject.set(x, "dither", js.undefined)
    
    inline def setEffort(value: Double): Self = StObject.set(x, "effort", value.asInstanceOf[js.Any])
    
    inline def setEffortUndefined: Self = StObject.set(x, "effort", js.undefined)
    
    inline def setInterFrameMaxError(value: Double): Self = StObject.set(x, "interFrameMaxError", value.asInstanceOf[js.Any])
    
    inline def setInterFrameMaxErrorUndefined: Self = StObject.set(x, "interFrameMaxError", js.undefined)
    
    inline def setInterPaletteMaxError(value: Double): Self = StObject.set(x, "interPaletteMaxError", value.asInstanceOf[js.Any])
    
    inline def setInterPaletteMaxErrorUndefined: Self = StObject.set(x, "interPaletteMaxError", js.undefined)
    
    inline def setProgressive(value: Boolean): Self = StObject.set(x, "progressive", value.asInstanceOf[js.Any])
    
    inline def setProgressiveUndefined: Self = StObject.set(x, "progressive", js.undefined)
    
    inline def setReuse(value: Boolean): Self = StObject.set(x, "reuse", value.asInstanceOf[js.Any])
    
    inline def setReuseUndefined: Self = StObject.set(x, "reuse", js.undefined)
  }
}
