package typings.pulumiAws.inputMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAvailabilityZonesFilter extends StObject {
  
  /**
    * The name of the filter field. Valid values can be found in the [EC2 DescribeAvailabilityZones API Reference](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeAvailabilityZones.html).
    */
  var name: String
  
  /**
    * Set of values that are accepted for the given filter field. Results will be selected if any given value matches.
    */
  var values: js.Array[String]
}
object GetAvailabilityZonesFilter {
  
  @scala.inline
  def apply(name: String, values: js.Array[String]): GetAvailabilityZonesFilter = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAvailabilityZonesFilter]
  }
  
  @scala.inline
  implicit class GetAvailabilityZonesFilterMutableBuilder[Self <: GetAvailabilityZonesFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
