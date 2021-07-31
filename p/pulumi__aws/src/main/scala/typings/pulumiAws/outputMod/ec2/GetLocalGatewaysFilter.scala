package typings.pulumiAws.outputMod.ec2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetLocalGatewaysFilter extends StObject {
  
  /**
    * The name of the field to filter by, as defined by
    * [the underlying AWS API](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeLocalGateways.html).
    */
  var name: String
  
  /**
    * Set of values that are accepted for the given field.
    * A Local Gateway will be selected if any one of the given values matches.
    */
  var values: js.Array[String]
}
object GetLocalGatewaysFilter {
  
  @scala.inline
  def apply(name: String, values: js.Array[String]): GetLocalGatewaysFilter = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLocalGatewaysFilter]
  }
  
  @scala.inline
  implicit class GetLocalGatewaysFilterMutableBuilder[Self <: GetLocalGatewaysFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
