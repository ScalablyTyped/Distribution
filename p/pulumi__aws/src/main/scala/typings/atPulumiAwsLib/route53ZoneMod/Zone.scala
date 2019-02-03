package typings
package atPulumiAwsLib.route53ZoneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/route53/zone", "Zone")
@js.native
class Zone protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a Zone resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String) = this()
  def this(name: java.lang.String, args: ZoneArgs) = this()
  def this(name: java.lang.String, args: ZoneArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * A comment for the hosted zone. Defaults to 'Managed by Terraform'.
    */
  val comment: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * The ID of the reusable delegation set whose NS records you want to assign to the hosted zone. Conflicts with `vpc` and `vpc_id` as delegation sets can only be used for public zones.
    */
  val delegationSetId: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * Whether to destroy all records (possibly managed outside of Terraform) in the zone when destroying the zone.
    */
  val forceDestroy: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[scala.Boolean]] = js.native
  /**
    * This is the name of the hosted zone.
    */
  val name: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * A list of name servers in associated (or default) delegation set.
    * Find more about delegation sets in [AWS docs](https://docs.aws.amazon.com/Route53/latest/APIReference/actions-on-reusable-delegation-sets.html).
    */
  val nameServers: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.Array[java.lang.String]] = js.native
  /**
    * A mapping of tags to assign to the zone.
    */
  val tags: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[org.scalablytyped.runtime.StringDictionary[_]]] = js.native
  /**
    * ID of the VPC to associate.
    */
  val vpcId: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * Region of the VPC to associate. Defaults to AWS provider region.
    */
  val vpcRegion: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * Configuration block(s) specifying VPC(s) to associate with a private hosted zone. Conflicts with `delegation_set_id`, `vpc_id`, and `vpc_region` in this resource and any [`aws_route53_zone_association` resource](https://www.terraform.io/docs/providers/aws/r/route53_zone_association.html) specifying the same zone ID. Detailed below.
    */
  val vpcs: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.Array[atPulumiAwsLib.Anon_VpcId]] = js.native
  /**
    * The Hosted Zone ID. This can be referenced by zone records.
    */
  val zoneId: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/route53/zone", "Zone")
@js.native
object Zone extends js.Object {
  /**
    * Get an existing Zone resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.route53ZoneMod.Zone = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.route53ZoneMod.ZoneState
  ): atPulumiAwsLib.route53ZoneMod.Zone = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.route53ZoneMod.ZoneState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.route53ZoneMod.Zone = js.native
}

