package typings.pulumiAws.inputMod.ec2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSubnetIdsFilter extends StObject {
  
  /**
    * The name of the field to filter by, as defined by
    * [the underlying AWS API](http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeSubnets.html).
    * For example, if matching against tag `Name`, use:
    */
  var name: String
  
  /**
    * Set of values that are accepted for the given field.
    * Subnet IDs will be selected if any one of the given values match.
    */
  var values: js.Array[String]
}
object GetSubnetIdsFilter {
  
  @scala.inline
  def apply(name: String, values: js.Array[String]): GetSubnetIdsFilter = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSubnetIdsFilter]
  }
  
  @scala.inline
  implicit class GetSubnetIdsFilterMutableBuilder[Self <: GetSubnetIdsFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
