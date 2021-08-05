package typings.pulumiAws.inputMod.ec2

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityGroupIngress extends StObject {
  
  /**
    * List of CIDR blocks.
    */
  var cidrBlocks: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  
  /**
    * Description of this egress rule.
    */
  var description: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * The start port (or ICMP type number if protocol is "icmp")
    */
  var fromPort: Input[Double]
  
  /**
    * List of IPv6 CIDR blocks.
    */
  var ipv6CidrBlocks: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  
  /**
    * List of prefix list IDs (for allowing access to VPC endpoints)
    */
  var prefixListIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  
  /**
    * The protocol. If you select a protocol of
    * "-1" (semantically equivalent to `"all"`, which is not a valid value here), you must specify a "fromPort" and "toPort" equal to 0. If not icmp, tcp, udp, or "-1" use the [protocol number](https://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml)
    */
  var protocol: Input[String]
  
  /**
    * List of security group Group Names if using
    * EC2-Classic, or Group IDs if using a VPC.
    */
  var securityGroups: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  
  /**
    * If true, the security group itself will be added as
    * a source to this egress rule.
    */
  var self: js.UndefOr[Input[Boolean]] = js.undefined
  
  /**
    * The end range port (or ICMP code if protocol is "icmp").
    */
  var toPort: Input[Double]
}
object SecurityGroupIngress {
  
  inline def apply(fromPort: Input[Double], protocol: Input[String], toPort: Input[Double]): SecurityGroupIngress = {
    val __obj = js.Dynamic.literal(fromPort = fromPort.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], toPort = toPort.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityGroupIngress]
  }
  
  extension [Self <: SecurityGroupIngress](x: Self) {
    
    inline def setCidrBlocks(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "cidrBlocks", value.asInstanceOf[js.Any])
    
    inline def setCidrBlocksUndefined: Self = StObject.set(x, "cidrBlocks", js.undefined)
    
    inline def setCidrBlocksVarargs(value: Input[String]*): Self = StObject.set(x, "cidrBlocks", js.Array(value :_*))
    
    inline def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setFromPort(value: Input[Double]): Self = StObject.set(x, "fromPort", value.asInstanceOf[js.Any])
    
    inline def setIpv6CidrBlocks(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "ipv6CidrBlocks", value.asInstanceOf[js.Any])
    
    inline def setIpv6CidrBlocksUndefined: Self = StObject.set(x, "ipv6CidrBlocks", js.undefined)
    
    inline def setIpv6CidrBlocksVarargs(value: Input[String]*): Self = StObject.set(x, "ipv6CidrBlocks", js.Array(value :_*))
    
    inline def setPrefixListIds(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "prefixListIds", value.asInstanceOf[js.Any])
    
    inline def setPrefixListIdsUndefined: Self = StObject.set(x, "prefixListIds", js.undefined)
    
    inline def setPrefixListIdsVarargs(value: Input[String]*): Self = StObject.set(x, "prefixListIds", js.Array(value :_*))
    
    inline def setProtocol(value: Input[String]): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroups(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "securityGroups", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupsUndefined: Self = StObject.set(x, "securityGroups", js.undefined)
    
    inline def setSecurityGroupsVarargs(value: Input[String]*): Self = StObject.set(x, "securityGroups", js.Array(value :_*))
    
    inline def setSelf(value: Input[Boolean]): Self = StObject.set(x, "self", value.asInstanceOf[js.Any])
    
    inline def setSelfUndefined: Self = StObject.set(x, "self", js.undefined)
    
    inline def setToPort(value: Input[Double]): Self = StObject.set(x, "toPort", value.asInstanceOf[js.Any])
  }
}
