package typings.pulumiAws.securityGroupMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.ec2.SecurityGroupEgress
import typings.pulumiAws.inputMod.ec2.SecurityGroupIngress
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SecurityGroupState extends js.Object {
  /**
    * The ARN of the security group
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * Description of this egress rule.
    */
  val description: js.UndefOr[Input[String]] = js.native
  /**
    * Can be specified multiple times for each
    * egress rule. Each egress block supports fields documented below.
    */
  val egress: js.UndefOr[Input[js.Array[Input[SecurityGroupEgress]]]] = js.native
  /**
    * Can be specified multiple times for each
    * ingress rule. Each ingress block supports fields documented below.
    */
  val ingress: js.UndefOr[Input[js.Array[Input[SecurityGroupIngress]]]] = js.native
  /**
    * The name of the security group. If omitted, this provider will
    * assign a random, unique name
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * Creates a unique name beginning with the specified
    * prefix. Conflicts with `name`.
    */
  val namePrefix: js.UndefOr[Input[String]] = js.native
  /**
    * The owner ID.
    */
  val ownerId: js.UndefOr[Input[String]] = js.native
  /**
    * Instruct this provider to revoke all of the
    * Security Groups attached ingress and egress rules before deleting the rule
    * itself. This is normally not needed, however certain AWS services such as
    * Elastic Map Reduce may automatically add required rules to security groups used
    * with the service, and those rules may contain a cyclic dependency that prevent
    * the security groups from being destroyed without removing the dependency first.
    * Default `false`
    */
  val revokeRulesOnDelete: js.UndefOr[Input[Boolean]] = js.native
  /**
    * A map of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  /**
    * The VPC ID.
    */
  val vpcId: js.UndefOr[Input[String]] = js.native
}

object SecurityGroupState {
  @scala.inline
  def apply(): SecurityGroupState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecurityGroupState]
  }
  @scala.inline
  implicit class SecurityGroupStateOps[Self <: SecurityGroupState] (val x: Self) extends AnyVal {
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
    def setDescription(value: Input[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setEgressVarargs(value: Input[SecurityGroupEgress]*): Self = this.set("egress", js.Array(value :_*))
    @scala.inline
    def setEgress(value: Input[js.Array[Input[SecurityGroupEgress]]]): Self = this.set("egress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEgress: Self = this.set("egress", js.undefined)
    @scala.inline
    def setIngressVarargs(value: Input[SecurityGroupIngress]*): Self = this.set("ingress", js.Array(value :_*))
    @scala.inline
    def setIngress(value: Input[js.Array[Input[SecurityGroupIngress]]]): Self = this.set("ingress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIngress: Self = this.set("ingress", js.undefined)
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setNamePrefix(value: Input[String]): Self = this.set("namePrefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNamePrefix: Self = this.set("namePrefix", js.undefined)
    @scala.inline
    def setOwnerId(value: Input[String]): Self = this.set("ownerId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwnerId: Self = this.set("ownerId", js.undefined)
    @scala.inline
    def setRevokeRulesOnDelete(value: Input[Boolean]): Self = this.set("revokeRulesOnDelete", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRevokeRulesOnDelete: Self = this.set("revokeRulesOnDelete", js.undefined)
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

