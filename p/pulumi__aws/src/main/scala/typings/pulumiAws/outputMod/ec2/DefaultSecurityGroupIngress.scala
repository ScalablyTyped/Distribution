package typings.pulumiAws.outputMod.ec2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DefaultSecurityGroupIngress extends StObject {
  
  /**
    * List of CIDR blocks.
    */
  var cidrBlocks: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Description of this egress rule.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * The start port (or ICMP type number if protocol is "icmp")
    */
  var fromPort: Double = js.native
  
  /**
    * List of IPv6 CIDR blocks.
    */
  var ipv6CidrBlocks: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * List of prefix list IDs (for allowing access to VPC endpoints)
    */
  var prefixListIds: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The protocol. If you select a protocol of "-1" (semantically equivalent to `"all"`, which is not a valid value here), you must specify a "fromPort" and "toPort" equal to 0. If not icmp, tcp, udp, or "-1" use the [protocol number](https://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml)
    */
  var protocol: String = js.native
  
  /**
    * List of security group Group Names if using EC2-Classic, or Group IDs if using a VPC.
    */
  var securityGroups: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * If true, the security group itself will be added as a source to this egress rule.
    */
  var self: js.UndefOr[Boolean] = js.native
  
  /**
    * The end range port (or ICMP code if protocol is "icmp").
    */
  var toPort: Double = js.native
}
object DefaultSecurityGroupIngress {
  
  @scala.inline
  def apply(fromPort: Double, protocol: String, toPort: Double): DefaultSecurityGroupIngress = {
    val __obj = js.Dynamic.literal(fromPort = fromPort.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], toPort = toPort.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultSecurityGroupIngress]
  }
  
  @scala.inline
  implicit class DefaultSecurityGroupIngressMutableBuilder[Self <: DefaultSecurityGroupIngress] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCidrBlocks(value: js.Array[String]): Self = StObject.set(x, "cidrBlocks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCidrBlocksUndefined: Self = StObject.set(x, "cidrBlocks", js.undefined)
    
    @scala.inline
    def setCidrBlocksVarargs(value: String*): Self = StObject.set(x, "cidrBlocks", js.Array(value :_*))
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setFromPort(value: Double): Self = StObject.set(x, "fromPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpv6CidrBlocks(value: js.Array[String]): Self = StObject.set(x, "ipv6CidrBlocks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpv6CidrBlocksUndefined: Self = StObject.set(x, "ipv6CidrBlocks", js.undefined)
    
    @scala.inline
    def setIpv6CidrBlocksVarargs(value: String*): Self = StObject.set(x, "ipv6CidrBlocks", js.Array(value :_*))
    
    @scala.inline
    def setPrefixListIds(value: js.Array[String]): Self = StObject.set(x, "prefixListIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixListIdsUndefined: Self = StObject.set(x, "prefixListIds", js.undefined)
    
    @scala.inline
    def setPrefixListIdsVarargs(value: String*): Self = StObject.set(x, "prefixListIds", js.Array(value :_*))
    
    @scala.inline
    def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityGroups(value: js.Array[String]): Self = StObject.set(x, "securityGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityGroupsUndefined: Self = StObject.set(x, "securityGroups", js.undefined)
    
    @scala.inline
    def setSecurityGroupsVarargs(value: String*): Self = StObject.set(x, "securityGroups", js.Array(value :_*))
    
    @scala.inline
    def setSelf(value: Boolean): Self = StObject.set(x, "self", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelfUndefined: Self = StObject.set(x, "self", js.undefined)
    
    @scala.inline
    def setToPort(value: Double): Self = StObject.set(x, "toPort", value.asInstanceOf[js.Any])
  }
}
