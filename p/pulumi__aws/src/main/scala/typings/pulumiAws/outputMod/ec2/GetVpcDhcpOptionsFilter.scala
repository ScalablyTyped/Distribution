package typings.pulumiAws.outputMod.ec2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetVpcDhcpOptionsFilter extends StObject {
  
  /**
    * The name of the field to filter.
    */
  var name: String
  
  /**
    * Set of values for filtering.
    */
  var values: js.Array[String]
}
object GetVpcDhcpOptionsFilter {
  
  inline def apply(name: String, values: js.Array[String]): GetVpcDhcpOptionsFilter = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetVpcDhcpOptionsFilter]
  }
  
  extension [Self <: GetVpcDhcpOptionsFilter](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
