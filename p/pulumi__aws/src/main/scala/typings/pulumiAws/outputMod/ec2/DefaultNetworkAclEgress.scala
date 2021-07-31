package typings.pulumiAws.outputMod.ec2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultNetworkAclEgress extends StObject {
  
  /**
    * The action to take.
    */
  var action: String
  
  /**
    * The CIDR block to match. This must be a
    * valid network mask.
    */
  var cidrBlock: js.UndefOr[String] = js.undefined
  
  /**
    * The from port to match.
    */
  var fromPort: Double
  
  /**
    * The ICMP type code to be used. Default 0.
    */
  var icmpCode: js.UndefOr[Double] = js.undefined
  
  /**
    * The ICMP type to be used. Default 0.
    */
  var icmpType: js.UndefOr[Double] = js.undefined
  
  /**
    * The IPv6 CIDR block.
    */
  var ipv6CidrBlock: js.UndefOr[String] = js.undefined
  
  /**
    * The protocol to match. If using the -1 'all'
    * protocol, you must specify a from and to port of 0.
    */
  var protocol: String
  
  /**
    * The rule number. Used for ordering.
    */
  var ruleNo: Double
  
  /**
    * The to port to match.
    */
  var toPort: Double
}
object DefaultNetworkAclEgress {
  
  @scala.inline
  def apply(action: String, fromPort: Double, protocol: String, ruleNo: Double, toPort: Double): DefaultNetworkAclEgress = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], fromPort = fromPort.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], ruleNo = ruleNo.asInstanceOf[js.Any], toPort = toPort.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultNetworkAclEgress]
  }
  
  @scala.inline
  implicit class DefaultNetworkAclEgressMutableBuilder[Self <: DefaultNetworkAclEgress] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCidrBlock(value: String): Self = StObject.set(x, "cidrBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCidrBlockUndefined: Self = StObject.set(x, "cidrBlock", js.undefined)
    
    @scala.inline
    def setFromPort(value: Double): Self = StObject.set(x, "fromPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIcmpCode(value: Double): Self = StObject.set(x, "icmpCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIcmpCodeUndefined: Self = StObject.set(x, "icmpCode", js.undefined)
    
    @scala.inline
    def setIcmpType(value: Double): Self = StObject.set(x, "icmpType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIcmpTypeUndefined: Self = StObject.set(x, "icmpType", js.undefined)
    
    @scala.inline
    def setIpv6CidrBlock(value: String): Self = StObject.set(x, "ipv6CidrBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpv6CidrBlockUndefined: Self = StObject.set(x, "ipv6CidrBlock", js.undefined)
    
    @scala.inline
    def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleNo(value: Double): Self = StObject.set(x, "ruleNo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToPort(value: Double): Self = StObject.set(x, "toPort", value.asInstanceOf[js.Any])
  }
}
