package typings.pulumiAws.networkAclMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.ec2.NetworkAclEgress
import typings.pulumiAws.inputMod.ec2.NetworkAclIngress
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NetworkAclArgs extends js.Object {
  /**
    * Specifies an egress rule. Parameters defined below.
    */
  val egress: js.UndefOr[Input[js.Array[Input[NetworkAclEgress]]]] = js.native
  /**
    * Specifies an ingress rule. Parameters defined below.
    */
  val ingress: js.UndefOr[Input[js.Array[Input[NetworkAclIngress]]]] = js.native
  /**
    * A list of Subnet IDs to apply the ACL to
    */
  val subnetIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  /**
    * The ID of the associated VPC.
    */
  val vpcId: Input[String] = js.native
}

object NetworkAclArgs {
  @scala.inline
  def apply(vpcId: Input[String]): NetworkAclArgs = {
    val __obj = js.Dynamic.literal(vpcId = vpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkAclArgs]
  }
  @scala.inline
  implicit class NetworkAclArgsOps[Self <: NetworkAclArgs] (val x: Self) extends AnyVal {
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
    def setVpcId(value: Input[String]): Self = this.set("vpcId", value.asInstanceOf[js.Any])
    @scala.inline
    def setEgressVarargs(value: Input[NetworkAclEgress]*): Self = this.set("egress", js.Array(value :_*))
    @scala.inline
    def setEgress(value: Input[js.Array[Input[NetworkAclEgress]]]): Self = this.set("egress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEgress: Self = this.set("egress", js.undefined)
    @scala.inline
    def setIngressVarargs(value: Input[NetworkAclIngress]*): Self = this.set("ingress", js.Array(value :_*))
    @scala.inline
    def setIngress(value: Input[js.Array[Input[NetworkAclIngress]]]): Self = this.set("ingress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIngress: Self = this.set("ingress", js.undefined)
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
  }
  
}

