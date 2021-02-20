package typings.pulumiAws.outputMod.ec2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetCustomerGatewayFilter extends StObject {
  
  var name: String = js.native
  
  var values: js.Array[String] = js.native
}
object GetCustomerGatewayFilter {
  
  @scala.inline
  def apply(name: String, values: js.Array[String]): GetCustomerGatewayFilter = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCustomerGatewayFilter]
  }
  
  @scala.inline
  implicit class GetCustomerGatewayFilterMutableBuilder[Self <: GetCustomerGatewayFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
