package typings.reactBeautifulDnd.mod

import typings.reactBeautifulDnd.reactBeautifulDndStrings.COMBINE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CombineImpact
  extends StObject
     with ImpactLocation {
  
  var combine: Combine
  
  var `type`: COMBINE
}
object CombineImpact {
  
  inline def apply(combine: Combine): CombineImpact = {
    val __obj = js.Dynamic.literal(combine = combine.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("COMBINE")
    __obj.asInstanceOf[CombineImpact]
  }
  
  extension [Self <: CombineImpact](x: Self) {
    
    inline def setCombine(value: Combine): Self = StObject.set(x, "combine", value.asInstanceOf[js.Any])
    
    inline def setType(value: COMBINE): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
