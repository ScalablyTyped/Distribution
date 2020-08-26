package typings.pulumiAws.defaultNetworkAclMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.ec2.DefaultNetworkAclEgress
import typings.pulumiAws.inputMod.ec2.DefaultNetworkAclIngress
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefaultNetworkAclArgs extends js.Object {
  /**
    * The Network ACL ID to manage. This
    * attribute is exported from `aws.ec2.Vpc`, or manually found via the AWS Console.
    */
  val defaultNetworkAclId: Input[String] = js.native
  /**
    * Specifies an egress rule. Parameters defined below.
    */
  val egress: js.UndefOr[Input[js.Array[Input[DefaultNetworkAclEgress]]]] = js.native
  /**
    * Specifies an ingress rule. Parameters defined below.
    */
  val ingress: js.UndefOr[Input[js.Array[Input[DefaultNetworkAclIngress]]]] = js.native
  /**
    * A list of Subnet IDs to apply the ACL to. See the
    * notes below on managing Subnets in the Default Network ACL
    */
  val subnetIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * A map of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
}

object DefaultNetworkAclArgs {
  @scala.inline
  def apply(defaultNetworkAclId: Input[String]): DefaultNetworkAclArgs = {
    val __obj = js.Dynamic.literal(defaultNetworkAclId = defaultNetworkAclId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultNetworkAclArgs]
  }
  @scala.inline
  implicit class DefaultNetworkAclArgsOps[Self <: DefaultNetworkAclArgs] (val x: Self) extends AnyVal {
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
    def setDefaultNetworkAclId(value: Input[String]): Self = this.set("defaultNetworkAclId", value.asInstanceOf[js.Any])
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

