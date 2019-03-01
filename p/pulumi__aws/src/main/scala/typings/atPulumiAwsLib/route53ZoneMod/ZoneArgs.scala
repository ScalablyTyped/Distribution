package typings
package atPulumiAwsLib.route53ZoneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZoneArgs extends js.Object {
  /**
    * A comment for the hosted zone. Defaults to 'Managed by Terraform'.
    */
  val comment: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The ID of the reusable delegation set whose NS records you want to assign to the hosted zone. Conflicts with `vpc` and `vpc_id` as delegation sets can only be used for public zones.
    */
  val delegationSetId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Whether to destroy all records (possibly managed outside of Terraform) in the zone when destroying the zone.
    */
  val forceDestroy: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  /**
    * This is the name of the hosted zone.
    */
  val name: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * A mapping of tags to assign to the zone.
    */
  val tags: js.UndefOr[atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]]] = js.undefined
  /**
    * ID of the VPC to associate.
    */
  val vpcId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Region of the VPC to associate. Defaults to AWS provider region.
    */
  val vpcRegion: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Configuration block(s) specifying VPC(s) to associate with a private hosted zone. Conflicts with `delegation_set_id`, `vpc_id`, and `vpc_region` in this resource and any [`aws_route53_zone_association` resource](https://www.terraform.io/docs/providers/aws/r/route53_zone_association.html) specifying the same zone ID. Detailed below.
    */
  val vpcs: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_VpcIdVpcRegion]]]
  ] = js.undefined
}

object ZoneArgs {
  @scala.inline
  def apply(
    comment: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    delegationSetId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    forceDestroy: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    name: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    tags: atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]] = null,
    vpcId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    vpcRegion: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    vpcs: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_VpcIdVpcRegion]]] = null
  ): ZoneArgs = {
    val __obj = js.Dynamic.literal()
    if (comment != null) __obj.updateDynamic("comment")(comment.asInstanceOf[js.Any])
    if (delegationSetId != null) __obj.updateDynamic("delegationSetId")(delegationSetId.asInstanceOf[js.Any])
    if (forceDestroy != null) __obj.updateDynamic("forceDestroy")(forceDestroy.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (vpcId != null) __obj.updateDynamic("vpcId")(vpcId.asInstanceOf[js.Any])
    if (vpcRegion != null) __obj.updateDynamic("vpcRegion")(vpcRegion.asInstanceOf[js.Any])
    if (vpcs != null) __obj.updateDynamic("vpcs")(vpcs.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZoneArgs]
  }
}

