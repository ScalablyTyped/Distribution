package typings.atPulumiAws.ec2DefaultNetworkAclMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.Anon_ActionCidrBlockFromPort
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultNetworkAclArgs extends js.Object {
  /**
    * The Network ACL ID to manage. This
    * attribute is exported from `aws_vpc`, or manually found via the AWS Console.
    */
  val defaultNetworkAclId: Input[String]
  /**
    * Specifies an egress rule. Parameters defined below.
    */
  val egress: js.UndefOr[Input[js.Array[Input[Anon_ActionCidrBlockFromPort]]]] = js.undefined
  /**
    * Specifies an ingress rule. Parameters defined below.
    */
  val ingress: js.UndefOr[Input[js.Array[Input[Anon_ActionCidrBlockFromPort]]]] = js.undefined
  /**
    * A list of Subnet IDs to apply the ACL to. See the
    * notes below on managing Subnets in the Default Network ACL
    */
  val subnetIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.undefined
}

object DefaultNetworkAclArgs {
  @scala.inline
  def apply(
    defaultNetworkAclId: Input[String],
    egress: Input[js.Array[Input[Anon_ActionCidrBlockFromPort]]] = null,
    ingress: Input[js.Array[Input[Anon_ActionCidrBlockFromPort]]] = null,
    subnetIds: Input[js.Array[Input[String]]] = null,
    tags: Input[StringDictionary[_]] = null
  ): DefaultNetworkAclArgs = {
    val __obj = js.Dynamic.literal(defaultNetworkAclId = defaultNetworkAclId.asInstanceOf[js.Any])
    if (egress != null) __obj.updateDynamic("egress")(egress.asInstanceOf[js.Any])
    if (ingress != null) __obj.updateDynamic("ingress")(ingress.asInstanceOf[js.Any])
    if (subnetIds != null) __obj.updateDynamic("subnetIds")(subnetIds.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultNetworkAclArgs]
  }
}

