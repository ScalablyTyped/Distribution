package typings.pulumiAws.outputMod.ec2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetLocalGatewayRouteTableFilter extends StObject {
  
  /**
    * The name of the field to filter by, as defined by
    * [the underlying AWS API](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeLocalGatewayRouteTables.html).
    */
  var name: String = js.native
  
  /**
    * Set of values that are accepted for the given field.
    * A local gateway route table will be selected if any one of the given values matches.
    */
  var values: js.Array[String] = js.native
}
object GetLocalGatewayRouteTableFilter {
  
  @scala.inline
  def apply(name: String, values: js.Array[String]): GetLocalGatewayRouteTableFilter = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLocalGatewayRouteTableFilter]
  }
  
  @scala.inline
  implicit class GetLocalGatewayRouteTableFilterMutableBuilder[Self <: GetLocalGatewayRouteTableFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
