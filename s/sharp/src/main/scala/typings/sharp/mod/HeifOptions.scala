package typings.sharp.mod

import typings.sharp.sharpStrings.av1
import typings.sharp.sharpStrings.hevc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HeifOptions
  extends StObject
     with OutputOptions {
  
  /** compression format: av1, hevc (optional, default 'av1') */
  var compression: js.UndefOr[av1 | hevc] = js.undefined
  
  /** Level of CPU effort to reduce file size, between 0 (fastest) and 9 (slowest) (optional, default 4) */
  var effort: js.UndefOr[Double] = js.undefined
  
  /** use lossless compression (optional, default false) */
  var lossless: js.UndefOr[Boolean] = js.undefined
  
  /** quality, integer 1-100 (optional, default 50) */
  var quality: js.UndefOr[Double] = js.undefined
}
object HeifOptions {
  
  inline def apply(): HeifOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HeifOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HeifOptions] (val x: Self) extends AnyVal {
    
    inline def setCompression(value: av1 | hevc): Self = StObject.set(x, "compression", value.asInstanceOf[js.Any])
    
    inline def setCompressionUndefined: Self = StObject.set(x, "compression", js.undefined)
    
    inline def setEffort(value: Double): Self = StObject.set(x, "effort", value.asInstanceOf[js.Any])
    
    inline def setEffortUndefined: Self = StObject.set(x, "effort", js.undefined)
    
    inline def setLossless(value: Boolean): Self = StObject.set(x, "lossless", value.asInstanceOf[js.Any])
    
    inline def setLosslessUndefined: Self = StObject.set(x, "lossless", js.undefined)
    
    inline def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
    
    inline def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
  }
}
