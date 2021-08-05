package typings.pulumiAws.outputMod.kinesis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FirehoseDeliveryStreamHttpEndpointConfigurationRequestConfigurationCommonAttribute extends StObject {
  
  /**
    * The name of the HTTP endpoint common attribute.
    */
  var name: String
  
  /**
    * The value of the HTTP endpoint common attribute.
    */
  var value: String
}
object FirehoseDeliveryStreamHttpEndpointConfigurationRequestConfigurationCommonAttribute {
  
  inline def apply(name: String, value: String): FirehoseDeliveryStreamHttpEndpointConfigurationRequestConfigurationCommonAttribute = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirehoseDeliveryStreamHttpEndpointConfigurationRequestConfigurationCommonAttribute]
  }
  
  extension [Self <: FirehoseDeliveryStreamHttpEndpointConfigurationRequestConfigurationCommonAttribute](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
