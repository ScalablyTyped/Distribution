package typings.pulumiAws.inputMod.ec2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetVpcPeeringConnectionFilter extends StObject {
  
  /**
    * The name of the field to filter by, as defined by
    * [the underlying AWS API](http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeVpcPeeringConnections.html).
    */
  var name: String = js.native
  
  /**
    * Set of values that are accepted for the given field.
    * A VPC Peering Connection will be selected if any one of the given values matches.
    */
  var values: js.Array[String] = js.native
}
object GetVpcPeeringConnectionFilter {
  
  @scala.inline
  def apply(name: String, values: js.Array[String]): GetVpcPeeringConnectionFilter = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetVpcPeeringConnectionFilter]
  }
  
  @scala.inline
  implicit class GetVpcPeeringConnectionFilterMutableBuilder[Self <: GetVpcPeeringConnectionFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
