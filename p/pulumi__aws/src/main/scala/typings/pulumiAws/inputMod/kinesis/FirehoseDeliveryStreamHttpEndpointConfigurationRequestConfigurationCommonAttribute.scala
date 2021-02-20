package typings.pulumiAws.inputMod.kinesis

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FirehoseDeliveryStreamHttpEndpointConfigurationRequestConfigurationCommonAttribute extends StObject {
  
  /**
    * The name of the HTTP endpoint common attribute.
    */
  var name: Input[String] = js.native
  
  /**
    * The value of the HTTP endpoint common attribute.
    */
  var value: Input[String] = js.native
}
object FirehoseDeliveryStreamHttpEndpointConfigurationRequestConfigurationCommonAttribute {
  
  @scala.inline
  def apply(name: Input[String], value: Input[String]): FirehoseDeliveryStreamHttpEndpointConfigurationRequestConfigurationCommonAttribute = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirehoseDeliveryStreamHttpEndpointConfigurationRequestConfigurationCommonAttribute]
  }
  
  @scala.inline
  implicit class FirehoseDeliveryStreamHttpEndpointConfigurationRequestConfigurationCommonAttributeMutableBuilder[Self <: FirehoseDeliveryStreamHttpEndpointConfigurationRequestConfigurationCommonAttribute] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Input[String]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
