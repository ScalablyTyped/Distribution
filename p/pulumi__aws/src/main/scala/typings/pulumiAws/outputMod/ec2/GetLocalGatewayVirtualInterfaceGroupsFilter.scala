package typings.pulumiAws.outputMod.ec2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetLocalGatewayVirtualInterfaceGroupsFilter extends StObject {
  
  /**
    * Name of the filter.
    */
  var name: String
  
  /**
    * List of one or more values for the filter.
    */
  var values: js.Array[String]
}
object GetLocalGatewayVirtualInterfaceGroupsFilter {
  
  inline def apply(name: String, values: js.Array[String]): GetLocalGatewayVirtualInterfaceGroupsFilter = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLocalGatewayVirtualInterfaceGroupsFilter]
  }
  
  extension [Self <: GetLocalGatewayVirtualInterfaceGroupsFilter](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
