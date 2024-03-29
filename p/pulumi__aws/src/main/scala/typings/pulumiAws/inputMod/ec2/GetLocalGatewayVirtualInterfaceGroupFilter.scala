package typings.pulumiAws.inputMod.ec2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetLocalGatewayVirtualInterfaceGroupFilter extends StObject {
  
  /**
    * Name of the filter.
    */
  var name: String
  
  /**
    * List of one or more values for the filter.
    */
  var values: js.Array[String]
}
object GetLocalGatewayVirtualInterfaceGroupFilter {
  
  inline def apply(name: String, values: js.Array[String]): GetLocalGatewayVirtualInterfaceGroupFilter = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLocalGatewayVirtualInterfaceGroupFilter]
  }
  
  extension [Self <: GetLocalGatewayVirtualInterfaceGroupFilter](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
