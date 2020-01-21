package typings.pulumiAws.zoneMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.route53.ZoneVpc
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ZoneArgs extends js.Object {
  /**
    * A comment for the hosted zone. Defaults to 'Managed by Pulumi'.
    */
  val comment: js.UndefOr[Input[String]] = js.native
  /**
    * The ID of the reusable delegation set whose NS records you want to assign to the hosted zone. Conflicts with `vpc` as delegation sets can only be used for public zones.
    */
  val delegationSetId: js.UndefOr[Input[String]] = js.native
  /**
    * Whether to destroy all records (possibly managed outside of this provider) in the zone when destroying the zone.
    */
  val forceDestroy: js.UndefOr[Input[Boolean]] = js.native
  /**
    * This is the name of the hosted zone.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * A mapping of tags to assign to the zone.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
  /**
    * Configuration block(s) specifying VPC(s) to associate with a private hosted zone. Conflicts with the `delegationSetId` argument in this resource and any [`aws.route53.ZoneAssociation` resource](https://www.terraform.io/docs/providers/aws/r/route53_zone_association.html) specifying the same zone ID. Detailed below.
    */
  val vpcs: js.UndefOr[Input[js.Array[Input[ZoneVpc]]]] = js.native
}

object ZoneArgs {
  @scala.inline
  def apply(
    comment: Input[String] = null,
    delegationSetId: Input[String] = null,
    forceDestroy: Input[Boolean] = null,
    name: Input[String] = null,
    tags: Input[StringDictionary[_]] = null,
    vpcs: Input[js.Array[Input[ZoneVpc]]] = null
  ): ZoneArgs = {
    val __obj = js.Dynamic.literal()
    if (comment != null) __obj.updateDynamic("comment")(comment.asInstanceOf[js.Any])
    if (delegationSetId != null) __obj.updateDynamic("delegationSetId")(delegationSetId.asInstanceOf[js.Any])
    if (forceDestroy != null) __obj.updateDynamic("forceDestroy")(forceDestroy.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (vpcs != null) __obj.updateDynamic("vpcs")(vpcs.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZoneArgs]
  }
}

