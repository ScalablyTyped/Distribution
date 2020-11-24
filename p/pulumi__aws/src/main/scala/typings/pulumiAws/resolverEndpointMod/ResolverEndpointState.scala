package typings.pulumiAws.resolverEndpointMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.route53.ResolverEndpointIpAddress
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResolverEndpointState extends js.Object {
  
  /**
    * The ARN of the Route 53 Resolver endpoint.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  
  /**
    * The direction of DNS queries to or from the Route 53 Resolver endpoint.
    * Valid values are `INBOUND` (resolver forwards DNS queries to the DNS service for a VPC from your network or another VPC)
    * or `OUTBOUND` (resolver forwards DNS queries from the DNS service for a VPC to your network or another VPC).
    */
  val direction: js.UndefOr[Input[String]] = js.native
  
  /**
    * The ID of the VPC that you want to create the resolver endpoint in.
    */
  val hostVpcId: js.UndefOr[Input[String]] = js.native
  
  /**
    * The subnets and IP addresses in your VPC that you want DNS queries to pass through on the way from your VPCs
    * to your network (for outbound endpoints) or on the way from your network to your VPCs (for inbound endpoints). Described below.
    */
  val ipAddresses: js.UndefOr[Input[js.Array[Input[ResolverEndpointIpAddress]]]] = js.native
  
  /**
    * The friendly name of the Route 53 Resolver endpoint.
    */
  val name: js.UndefOr[Input[String]] = js.native
  
  /**
    * The ID of one or more security groups that you want to use to control access to this VPC.
    */
  val securityGroupIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  
  /**
    * A map of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
}
object ResolverEndpointState {
  
  @scala.inline
  def apply(): ResolverEndpointState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResolverEndpointState]
  }
  
  @scala.inline
  implicit class ResolverEndpointStateOps[Self <: ResolverEndpointState] (val x: Self) extends AnyVal {
    
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
    def setArn(value: Input[String]): Self = this.set("arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    
    @scala.inline
    def setDirection(value: Input[String]): Self = this.set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    
    @scala.inline
    def setHostVpcId(value: Input[String]): Self = this.set("hostVpcId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHostVpcId: Self = this.set("hostVpcId", js.undefined)
    
    @scala.inline
    def setIpAddressesVarargs(value: Input[ResolverEndpointIpAddress]*): Self = this.set("ipAddresses", js.Array(value :_*))
    
    @scala.inline
    def setIpAddresses(value: Input[js.Array[Input[ResolverEndpointIpAddress]]]): Self = this.set("ipAddresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIpAddresses: Self = this.set("ipAddresses", js.undefined)
    
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setSecurityGroupIdsVarargs(value: Input[String]*): Self = this.set("securityGroupIds", js.Array(value :_*))
    
    @scala.inline
    def setSecurityGroupIds(value: Input[js.Array[Input[String]]]): Self = this.set("securityGroupIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecurityGroupIds: Self = this.set("securityGroupIds", js.undefined)
    
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
