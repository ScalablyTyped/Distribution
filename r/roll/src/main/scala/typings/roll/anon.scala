package typings.roll

import typings.roll.mod.RollTransformation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Quantity extends StObject {
    
    var quantity: Double
    
    var sides: Double
    
    var transformations: js.Array[RollTransformation]
  }
  object Quantity {
    
    inline def apply(quantity: Double, sides: Double, transformations: js.Array[RollTransformation]): Quantity = {
      val __obj = js.Dynamic.literal(quantity = quantity.asInstanceOf[js.Any], sides = sides.asInstanceOf[js.Any], transformations = transformations.asInstanceOf[js.Any])
      __obj.asInstanceOf[Quantity]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Quantity] (val x: Self) extends AnyVal {
      
      inline def setQuantity(value: Double): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
      
      inline def setSides(value: Double): Self = StObject.set(x, "sides", value.asInstanceOf[js.Any])
      
      inline def setTransformations(value: js.Array[RollTransformation]): Self = StObject.set(x, "transformations", value.asInstanceOf[js.Any])
      
      inline def setTransformationsVarargs(value: RollTransformation*): Self = StObject.set(x, "transformations", js.Array(value*))
    }
  }
}
