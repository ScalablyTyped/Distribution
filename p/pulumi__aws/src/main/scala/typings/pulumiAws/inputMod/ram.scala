package typings.pulumiAws.inputMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ram {
  
  trait GetResourceShareFilter extends StObject {
    
    /**
      * The name of the tag key to filter on.
      */
    var name: String
    
    /**
      * The value of the tag key.
      */
    var values: js.Array[String]
  }
  object GetResourceShareFilter {
    
    @scala.inline
    def apply(name: String, values: js.Array[String]): GetResourceShareFilter = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetResourceShareFilter]
    }
    
    @scala.inline
    implicit class GetResourceShareFilterMutableBuilder[Self <: GetResourceShareFilter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value :_*))
    }
  }
}
