package typings.sharp.mod

import typings.sharp.sharpStrings.cubic
import typings.sharp.sharpStrings.lanczos2
import typings.sharp.sharpStrings.lanczos3
import typings.sharp.sharpStrings.mitchell
import typings.sharp.sharpStrings.nearest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KernelEnum extends StObject {
  
  var cubic: typings.sharp.sharpStrings.cubic
  
  var lanczos2: typings.sharp.sharpStrings.lanczos2
  
  var lanczos3: typings.sharp.sharpStrings.lanczos3
  
  var mitchell: typings.sharp.sharpStrings.mitchell
  
  var nearest: typings.sharp.sharpStrings.nearest
}
object KernelEnum {
  
  inline def apply(): KernelEnum = {
    val __obj = js.Dynamic.literal(cubic = "cubic", lanczos2 = "lanczos2", lanczos3 = "lanczos3", mitchell = "mitchell", nearest = "nearest")
    __obj.asInstanceOf[KernelEnum]
  }
  
  extension [Self <: KernelEnum](x: Self) {
    
    inline def setCubic(value: cubic): Self = StObject.set(x, "cubic", value.asInstanceOf[js.Any])
    
    inline def setLanczos2(value: lanczos2): Self = StObject.set(x, "lanczos2", value.asInstanceOf[js.Any])
    
    inline def setLanczos3(value: lanczos3): Self = StObject.set(x, "lanczos3", value.asInstanceOf[js.Any])
    
    inline def setMitchell(value: mitchell): Self = StObject.set(x, "mitchell", value.asInstanceOf[js.Any])
    
    inline def setNearest(value: nearest): Self = StObject.set(x, "nearest", value.asInstanceOf[js.Any])
  }
}
