package typings.pulumiAws.resolverEndpointMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.route53.ResolverEndpointIpAddress
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResolverEndpointArgs extends js.Object {
  
  /**
    * The direction of DNS queries to or from the Route 53 Resolver endpoint.
    * Valid values are `INBOUND` (resolver forwards DNS queries to the DNS service for a VPC from your network or another VPC)
    * or `OUTBOUND` (resolver forwards DNS queries from the DNS service for a VPC to your network or another VPC).
    */
  val direction: Input[String] = js.native
  
  /**
    * The subnets and IP addresses in your VPC that you want DNS queries to pass through on the way from your VPCs
    * to your network (for outbound endpoints) or on the way from your network to your VPCs (for inbound endpoints). Described below.
    */
  val ipAddresses: Input[js.Array[Input[ResolverEndpointIpAddress]]] = js.native
  
  /**
    * The friendly name of the Route 53 Resolver endpoint.
    */
  val name: js.UndefOr[Input[String]] = js.native
  
  /**
    * The ID of one or more security groups that you want to use to control access to this VPC.
    */
  val securityGroupIds: Input[js.Array[Input[String]]] = js.native
  
  /**
    * A map of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
}
object ResolverEndpointArgs {
  
  @scala.inline
  def apply(
    direction: Input[String],
    ipAddresses: Input[js.Array[Input[ResolverEndpointIpAddress]]],
    securityGroupIds: Input[js.Array[Input[String]]]
  ): ResolverEndpointArgs = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], ipAddresses = ipAddresses.asInstanceOf[js.Any], securityGroupIds = securityGroupIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolverEndpointArgs]
  }
  
  @scala.inline
  implicit class ResolverEndpointArgsOps[Self <: ResolverEndpointArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDirection(value: Input[String]): Self = this.set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpAddressesVarargs(value: Input[ResolverEndpointIpAddress]*): Self = this.set("ipAddresses", js.Array(value :_*))
    
    @scala.inline
    def setIpAddresses(value: Input[js.Array[Input[ResolverEndpointIpAddress]]]): Self = this.set("ipAddresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityGroupIdsVarargs(value: Input[String]*): Self = this.set("securityGroupIds", js.Array(value :_*))
    
    @scala.inline
    def setSecurityGroupIds(value: Input[js.Array[Input[String]]]): Self = this.set("securityGroupIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
