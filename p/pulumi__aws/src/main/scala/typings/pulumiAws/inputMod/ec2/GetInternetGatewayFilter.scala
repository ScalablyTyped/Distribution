package typings.pulumiAws.inputMod.ec2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetInternetGatewayFilter extends StObject {
  
  /**
    * The name of the field to filter by, as defined by
    * [the underlying AWS API](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeInternetGateways.html).
    */
  var name: String
  
  /**
    * Set of values that are accepted for the given field.
    * An Internet Gateway will be selected if any one of the given values matches.
    */
  var values: js.Array[String]
}
object GetInternetGatewayFilter {
  
  inline def apply(name: String, values: js.Array[String]): GetInternetGatewayFilter = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetInternetGatewayFilter]
  }
  
  extension [Self <: GetInternetGatewayFilter](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
