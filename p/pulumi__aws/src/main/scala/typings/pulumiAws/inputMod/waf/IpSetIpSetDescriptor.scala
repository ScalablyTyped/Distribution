package typings.pulumiAws.inputMod.waf

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IpSetIpSetDescriptor extends StObject {
  
  /**
    * Type of the IP address - `IPV4` or `IPV6`.
    */
  var `type`: Input[String]
  
  /**
    * An IPv4 or IPv6 address specified via CIDR notation. e.g. `192.0.2.44/32` or `1111:0000:0000:0000:0000:0000:0000:0000/64`
    */
  var value: Input[String]
}
object IpSetIpSetDescriptor {
  
  @scala.inline
  def apply(`type`: Input[String], value: Input[String]): IpSetIpSetDescriptor = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IpSetIpSetDescriptor]
  }
  
  @scala.inline
  implicit class IpSetIpSetDescriptorMutableBuilder[Self <: IpSetIpSetDescriptor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: Input[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Input[String]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
