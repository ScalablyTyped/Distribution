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
  
  /** Always generate new palettes (slow), re-use existing by default (optional, default false) */
  var reoptimise: js.UndefOr[Boolean] = js.undefined
  
  /** Alternative spelling of "reoptimise" (optional, default false) */
  var reoptimize: js.UndefOr[Boolean] = js.undefined
}
object GifOptions {
  
  inline def apply(): GifOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GifOptions]
  }
  
  extension [Self <: GifOptions](x: Self) {
    
    inline def setColors(value: Double): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
    
    inline def setColours(value: Double): Self = StObject.set(x, "colours", value.asInstanceOf[js.Any])
    
    inline def setColoursUndefined: Self = StObject.set(x, "colours", js.undefined)
    
    inline def setDither(value: Double): Self = StObject.set(x, "dither", value.asInstanceOf[js.Any])
    
    inline def setDitherUndefined: Self = StObject.set(x, "dither", js.undefined)
    
    inline def setEffort(value: Double): Self = StObject.set(x, "effort", value.asInstanceOf[js.Any])
    
    inline def setEffortUndefined: Self = StObject.set(x, "effort", js.undefined)
    
    inline def setReoptimise(value: Boolean): Self = StObject.set(x, "reoptimise", value.asInstanceOf[js.Any])
    
    inline def setReoptimiseUndefined: Self = StObject.set(x, "reoptimise", js.undefined)
    
    inline def setReoptimize(value: Boolean): Self = StObject.set(x, "reoptimize", value.asInstanceOf[js.Any])
    
    inline def setReoptimizeUndefined: Self = StObject.set(x, "reoptimize", js.undefined)
  }
}
