package typings.sharp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OutputOptions extends StObject {
  
  /** Force format output, otherwise attempt to use input format (optional, default true) */
  var force: js.UndefOr[Boolean] = js.undefined
  
  /** Quality, integer 1-100 (optional, default 80) */
  var quality: js.UndefOr[Double] = js.undefined
}
object OutputOptions {
  
  inline def apply(): OutputOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OutputOptions]
  }
  
  extension [Self <: OutputOptions](x: Self) {
    
    inline def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
    
    inline def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
    
    inline def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
    
    inline def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
  }
}
