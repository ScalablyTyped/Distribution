package typings.pulumiAws.outputMod.ec2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetInstanceTypeOfferingFilter extends StObject {
  
  /**
    * Name of the filter. The `location` filter depends on the top-level `locationType` argument and if not specified, defaults to the current region.
    */
  var name: String
  
  /**
    * List of one or more values for the filter.
    */
  var values: js.Array[String]
}
object GetInstanceTypeOfferingFilter {
  
  @scala.inline
  def apply(name: String, values: js.Array[String]): GetInstanceTypeOfferingFilter = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetInstanceTypeOfferingFilter]
  }
  
  @scala.inline
  implicit class GetInstanceTypeOfferingFilterMutableBuilder[Self <: GetInstanceTypeOfferingFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
