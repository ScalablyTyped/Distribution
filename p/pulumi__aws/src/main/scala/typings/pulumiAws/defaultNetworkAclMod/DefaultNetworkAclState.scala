package typings.pulumiAws.defaultNetworkAclMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.ec2.DefaultNetworkAclEgress
import typings.pulumiAws.inputMod.ec2.DefaultNetworkAclIngress
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DefaultNetworkAclState extends js.Object {
  
  /**
    * The ARN of the Default Network ACL
    */
  val arn: js.UndefOr[Input[String]] = js.native
  
  /**
    * The Network ACL ID to manage. This
    * attribute is exported from `aws.ec2.Vpc`, or manually found via the AWS Console.
    */
  val defaultNetworkAclId: js.UndefOr[Input[String]] = js.native
  
  /**
    * Specifies an egress rule. Parameters defined below.
    */
  val egress: js.UndefOr[Input[js.Array[Input[DefaultNetworkAclEgress]]]] = js.native
  
  /**
    * Specifies an ingress rule. Parameters defined below.
    */
  val ingress: js.UndefOr[Input[js.Array[Input[DefaultNetworkAclIngress]]]] = js.native
  
  /**
    * The ID of the AWS account that owns the Default Network ACL
    */
  val ownerId: js.UndefOr[Input[String]] = js.native
  
  /**
    * A list of Subnet IDs to apply the ACL to. See the
    * notes below on managing Subnets in the Default Network ACL
    */
  val subnetIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  
  /**
    * A map of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  
  /**
    * The ID of the associated VPC
    */
  val vpcId: js.UndefOr[Input[String]] = js.native
}
object DefaultNetworkAclState {
  
  @scala.inline
  def apply(): DefaultNetworkAclState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultNetworkAclState]
  }
  
  @scala.inline
  implicit class DefaultNetworkAclStateOps[Self <: DefaultNetworkAclState] (val x: Self) extends AnyVal {
    
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
    def setDefaultNetworkAclId(value: Input[String]): Self = this.set("defaultNetworkAclId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultNetworkAclId: Self = this.set("defaultNetworkAclId", js.undefined)
    
    @scala.inline
    def setEgressVarargs(value: Input[DefaultNetworkAclEgress]*): Self = this.set("egress", js.Array(value :_*))
    
    @scala.inline
    def setEgress(value: Input[js.Array[Input[DefaultNetworkAclEgress]]]): Self = this.set("egress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEgress: Self = this.set("egress", js.undefined)
    
    @scala.inline
    def setIngressVarargs(value: Input[DefaultNetworkAclIngress]*): Self = this.set("ingress", js.Array(value :_*))
    
    @scala.inline
    def setIngress(value: Input[js.Array[Input[DefaultNetworkAclIngress]]]): Self = this.set("ingress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIngress: Self = this.set("ingress", js.undefined)
    
    @scala.inline
    def setOwnerId(value: Input[String]): Self = this.set("ownerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwnerId: Self = this.set("ownerId", js.undefined)
    
    @scala.inline
    def setSubnetIdsVarargs(value: Input[String]*): Self = this.set("subnetIds", js.Array(value :_*))
    
    @scala.inline
    def setSubnetIds(value: Input[js.Array[Input[String]]]): Self = this.set("subnetIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubnetIds: Self = this.set("subnetIds", js.undefined)
    
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    
    @scala.inline
    def setVpcId(value: Input[String]): Self = this.set("vpcId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVpcId: Self = this.set("vpcId", js.undefined)
  }
}
