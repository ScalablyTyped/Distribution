package typings.pulumiAws.s3outpostsEndpointMod

import typings.pulumiAws.inputMod.s3outposts.EndpointNetworkInterface
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EndpointState extends js.Object {
  
  /**
    * Amazon Resource Name (ARN) of the endpoint.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  
  /**
    * VPC CIDR block of the endpoint.
    */
  val cidrBlock: js.UndefOr[Input[String]] = js.native
  
  /**
    * UTC creation time in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8).
    */
  val creationTime: js.UndefOr[Input[String]] = js.native
  
  /**
    * Set of nested attributes for associated Elastic Network Interfaces (ENIs).
    */
  val networkInterfaces: js.UndefOr[Input[js.Array[Input[EndpointNetworkInterface]]]] = js.native
  
  /**
    * Identifier of the Outpost to contain this endpoint.
    */
  val outpostId: js.UndefOr[Input[String]] = js.native
  
  /**
    * Identifier of the EC2 Security Group.
    */
  val securityGroupId: js.UndefOr[Input[String]] = js.native
  
  /**
    * Identifier of the EC2 Subnet.
    */
  val subnetId: js.UndefOr[Input[String]] = js.native
}
object EndpointState {
  
  @scala.inline
  def apply(): EndpointState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EndpointState]
  }
  
  @scala.inline
  implicit class EndpointStateOps[Self <: EndpointState] (val x: Self) extends AnyVal {
    
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
    def setCidrBlock(value: Input[String]): Self = this.set("cidrBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCidrBlock: Self = this.set("cidrBlock", js.undefined)
    
    @scala.inline
    def setCreationTime(value: Input[String]): Self = this.set("creationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationTime: Self = this.set("creationTime", js.undefined)
    
    @scala.inline
    def setNetworkInterfacesVarargs(value: Input[EndpointNetworkInterface]*): Self = this.set("networkInterfaces", js.Array(value :_*))
    
    @scala.inline
    def setNetworkInterfaces(value: Input[js.Array[Input[EndpointNetworkInterface]]]): Self = this.set("networkInterfaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetworkInterfaces: Self = this.set("networkInterfaces", js.undefined)
    
    @scala.inline
    def setOutpostId(value: Input[String]): Self = this.set("outpostId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutpostId: Self = this.set("outpostId", js.undefined)
    
    @scala.inline
    def setSecurityGroupId(value: Input[String]): Self = this.set("securityGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecurityGroupId: Self = this.set("securityGroupId", js.undefined)
    
    @scala.inline
    def setSubnetId(value: Input[String]): Self = this.set("subnetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubnetId: Self = this.set("subnetId", js.undefined)
  }
}
