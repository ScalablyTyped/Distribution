package typings.atPulumiAws.route53ZoneMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.Anon_VpcIdVpcRegion
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZoneState extends js.Object {
  val comment: js.UndefOr[Input[String]] = js.undefined
  /**
    * The ID of the reusable delegation set whose NS records you want to assign to the hosted zone. Conflicts with `vpc` as delegation sets can only be used for public zones.
    */
  val delegationSetId: js.UndefOr[Input[String]] = js.undefined
  val forceDestroy: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * This is the name of the hosted zone.
    */
  val name: js.UndefOr[Input[String]] = js.undefined
  /**
    * A list of name servers in associated (or default) delegation set.
    * Find more about delegation sets in [AWS docs](https://docs.aws.amazon.com/Route53/latest/APIReference/actions-on-reusable-delegation-sets.html).
    */
  val nameServers: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  /**
    * A mapping of tags to assign to the zone.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.undefined
  /**
    * Configuration block(s) specifying VPC(s) to associate with a private hosted zone. Conflicts with the `delegation_set_id` argument in this resource and any [`aws_route53_zone_association` resource](https://www.terraform.io/docs/providers/aws/r/route53_zone_association.html) specifying the same zone ID. Detailed below.
    */
  val vpcs: js.UndefOr[Input[js.Array[Input[Anon_VpcIdVpcRegion]]]] = js.undefined
  /**
    * The Hosted Zone ID. This can be referenced by zone records.
    */
  val zoneId: js.UndefOr[Input[String]] = js.undefined
}

object ZoneState {
  @scala.inline
  def apply(
    comment: Input[String] = null,
    delegationSetId: Input[String] = null,
    forceDestroy: Input[Boolean] = null,
    name: Input[String] = null,
    nameServers: Input[js.Array[Input[String]]] = null,
    tags: Input[StringDictionary[_]] = null,
    vpcs: Input[js.Array[Input[Anon_VpcIdVpcRegion]]] = null,
    zoneId: Input[String] = null
  ): ZoneState = {
    val __obj = js.Dynamic.literal()
    if (comment != null) __obj.updateDynamic("comment")(comment.asInstanceOf[js.Any])
    if (delegationSetId != null) __obj.updateDynamic("delegationSetId")(delegationSetId.asInstanceOf[js.Any])
    if (forceDestroy != null) __obj.updateDynamic("forceDestroy")(forceDestroy.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (nameServers != null) __obj.updateDynamic("nameServers")(nameServers.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (vpcs != null) __obj.updateDynamic("vpcs")(vpcs.asInstanceOf[js.Any])
    if (zoneId != null) __obj.updateDynamic("zoneId")(zoneId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZoneState]
  }
}

