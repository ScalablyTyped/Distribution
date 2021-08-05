package typings.sharp.mod

import typings.sharp.sharpStrings.and
import typings.sharp.sharpStrings.eor
import typings.sharp.sharpStrings.or
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BoolEnum extends StObject {
  
  var and: typings.sharp.sharpStrings.and
  
  var eor: typings.sharp.sharpStrings.eor
  
  var or: typings.sharp.sharpStrings.or
}
object BoolEnum {
  
  inline def apply(): BoolEnum = {
    val __obj = js.Dynamic.literal(and = "and", eor = "eor", or = "or")
    __obj.asInstanceOf[BoolEnum]
  }
  
  extension [Self <: BoolEnum](x: Self) {
    
    inline def setAnd(value: and): Self = StObject.set(x, "and", value.asInstanceOf[js.Any])
    
    inline def setEor(value: eor): Self = StObject.set(x, "eor", value.asInstanceOf[js.Any])
    
    inline def setOr(value: or): Self = StObject.set(x, "or", value.asInstanceOf[js.Any])
  }
}
