package typings.pulumiAws.inputMod.wafregional

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IpSetIpSetDescriptor extends StObject {
  
  /**
    * The string like IPV4 or IPV6.
    */
  var `type`: Input[String]
  
  /**
    * The CIDR notation.
    */
  var value: Input[String]
}
object IpSetIpSetDescriptor {
  
  inline def apply(`type`: Input[String], value: Input[String]): IpSetIpSetDescriptor = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IpSetIpSetDescriptor]
  }
  
  extension [Self <: IpSetIpSetDescriptor](x: Self) {
    
    inline def setType(value: Input[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Input[String]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
