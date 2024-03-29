package typings.pulumiAws.inputMod.ec2

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NetworkAclIngress extends StObject {
  
  /**
    * The action to take.
    */
  var action: Input[String]
  
  /**
    * The CIDR block to match. This must be a
    * valid network mask.
    */
  var cidrBlock: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * The from port to match.
    */
  var fromPort: Input[Double]
  
  /**
    * The ICMP type code to be used. Default 0.
    */
  var icmpCode: js.UndefOr[Input[Double]] = js.undefined
  
  /**
    * The ICMP type to be used. Default 0.
    */
  var icmpType: js.UndefOr[Input[Double]] = js.undefined
  
  /**
    * The IPv6 CIDR block.
    */
  var ipv6CidrBlock: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * The protocol to match. If using the -1 'all'
    * protocol, you must specify a from and to port of 0.
    */
  var protocol: Input[String]
  
  /**
    * The rule number. Used for ordering.
    */
  var ruleNo: Input[Double]
  
  /**
    * The to port to match.
    */
  var toPort: Input[Double]
}
object NetworkAclIngress {
  
  inline def apply(
    action: Input[String],
    fromPort: Input[Double],
    protocol: Input[String],
    ruleNo: Input[Double],
    toPort: Input[Double]
  ): NetworkAclIngress = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], fromPort = fromPort.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], ruleNo = ruleNo.asInstanceOf[js.Any], toPort = toPort.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkAclIngress]
  }
  
  extension [Self <: NetworkAclIngress](x: Self) {
    
    inline def setAction(value: Input[String]): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setCidrBlock(value: Input[String]): Self = StObject.set(x, "cidrBlock", value.asInstanceOf[js.Any])
    
    inline def setCidrBlockUndefined: Self = StObject.set(x, "cidrBlock", js.undefined)
    
    inline def setFromPort(value: Input[Double]): Self = StObject.set(x, "fromPort", value.asInstanceOf[js.Any])
    
    inline def setIcmpCode(value: Input[Double]): Self = StObject.set(x, "icmpCode", value.asInstanceOf[js.Any])
    
    inline def setIcmpCodeUndefined: Self = StObject.set(x, "icmpCode", js.undefined)
    
    inline def setIcmpType(value: Input[Double]): Self = StObject.set(x, "icmpType", value.asInstanceOf[js.Any])
    
    inline def setIcmpTypeUndefined: Self = StObject.set(x, "icmpType", js.undefined)
    
    inline def setIpv6CidrBlock(value: Input[String]): Self = StObject.set(x, "ipv6CidrBlock", value.asInstanceOf[js.Any])
    
    inline def setIpv6CidrBlockUndefined: Self = StObject.set(x, "ipv6CidrBlock", js.undefined)
    
    inline def setProtocol(value: Input[String]): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    inline def setRuleNo(value: Input[Double]): Self = StObject.set(x, "ruleNo", value.asInstanceOf[js.Any])
    
    inline def setToPort(value: Input[Double]): Self = StObject.set(x, "toPort", value.asInstanceOf[js.Any])
  }
}
