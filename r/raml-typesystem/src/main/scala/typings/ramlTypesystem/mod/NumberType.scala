package typings.ramlTypesystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NumberType
  extends StObject
     with IType {
  
  /**
    * maximum value for this type
    */
  var maximim: js.UndefOr[Double] = js.undefined
  
  /**
    * minimum value for this type
    */
  var minimum: js.UndefOr[Double] = js.undefined
  
  /**
    * value for multiple of constraint
    */
  var multipleOf: js.UndefOr[Double] = js.undefined
}
object NumberType {
  
  inline def apply(): NumberType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NumberType]
  }
  
  extension [Self <: NumberType](x: Self) {
    
    inline def setMaximim(value: Double): Self = StObject.set(x, "maximim", value.asInstanceOf[js.Any])
    
    inline def setMaximimUndefined: Self = StObject.set(x, "maximim", js.undefined)
    
    inline def setMinimum(value: Double): Self = StObject.set(x, "minimum", value.asInstanceOf[js.Any])
    
    inline def setMinimumUndefined: Self = StObject.set(x, "minimum", js.undefined)
    
    inline def setMultipleOf(value: Double): Self = StObject.set(x, "multipleOf", value.asInstanceOf[js.Any])
    
    inline def setMultipleOfUndefined: Self = StObject.set(x, "multipleOf", js.undefined)
  }
}
