package typings.roll

import typings.roll.mod.RollTransformation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Quantity extends StObject {
    
    var quantity: Double = js.native
    
    var sides: Double = js.native
    
    var transformations: js.Array[RollTransformation] = js.native
  }
  object Quantity {
    
    @scala.inline
    def apply(quantity: Double, sides: Double, transformations: js.Array[RollTransformation]): Quantity = {
      val __obj = js.Dynamic.literal(quantity = quantity.asInstanceOf[js.Any], sides = sides.asInstanceOf[js.Any], transformations = transformations.asInstanceOf[js.Any])
      __obj.asInstanceOf[Quantity]
    }
    
    @scala.inline
    implicit class QuantityMutableBuilder[Self <: Quantity] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setQuantity(value: Double): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSides(value: Double): Self = StObject.set(x, "sides", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransformations(value: js.Array[RollTransformation]): Self = StObject.set(x, "transformations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransformationsVarargs(value: RollTransformation*): Self = StObject.set(x, "transformations", js.Array(value :_*))
    }
  }
}
