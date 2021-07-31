package typings.pulumiAws.inputMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pricing {
  
  trait GetProductFilter extends StObject {
    
    /**
      * The product attribute name that you want to filter on.
      */
    var field: String
    
    /**
      * The product attribute value that you want to filter on.
      */
    var value: String
  }
  object GetProductFilter {
    
    @scala.inline
    def apply(field: String, value: String): GetProductFilter = {
      val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetProductFilter]
    }
    
    @scala.inline
    implicit class GetProductFilterMutableBuilder[Self <: GetProductFilter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
