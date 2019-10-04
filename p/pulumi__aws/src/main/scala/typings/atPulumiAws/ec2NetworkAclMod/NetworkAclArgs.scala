package typings.atPulumiAws.ec2NetworkAclMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.typesInputMod.ec2Ns.NetworkAclEgress
import typings.atPulumiAws.typesInputMod.ec2Ns.NetworkAclIngress
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NetworkAclArgs extends js.Object {
  /**
    * Specifies an egress rule. Parameters defined below.
    * This argument is processed in [attribute-as-blocks mode](https://www.terraform.io/docs/configuration/attr-as-blocks.html).
    */
  val egress: js.UndefOr[Input[js.Array[Input[NetworkAclEgress]]]] = js.undefined
  /**
    * Specifies an ingress rule. Parameters defined below.
    * This argument is processed in [attribute-as-blocks mode](https://www.terraform.io/docs/configuration/attr-as-blocks.html).
    */
  val ingress: js.UndefOr[Input[js.Array[Input[NetworkAclIngress]]]] = js.undefined
  /**
    * A list of Subnet IDs to apply the ACL to
    */
  val subnetIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.undefined
  /**
    * The ID of the associated VPC.
    */
  val vpcId: Input[String]
}

object NetworkAclArgs {
  @scala.inline
  def apply(
    vpcId: Input[String],
    egress: Input[js.Array[Input[NetworkAclEgress]]] = null,
    ingress: Input[js.Array[Input[NetworkAclIngress]]] = null,
    subnetIds: Input[js.Array[Input[String]]] = null,
    tags: Input[StringDictionary[_]] = null
  ): NetworkAclArgs = {
    val __obj = js.Dynamic.literal(vpcId = vpcId.asInstanceOf[js.Any])
    if (egress != null) __obj.updateDynamic("egress")(egress.asInstanceOf[js.Any])
    if (ingress != null) __obj.updateDynamic("ingress")(ingress.asInstanceOf[js.Any])
    if (subnetIds != null) __obj.updateDynamic("subnetIds")(subnetIds.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkAclArgs]
  }
}

