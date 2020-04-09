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
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
  /**
    * The ID of the associated VPC.
    */
  val vpcId: Input[String] = js.native
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

