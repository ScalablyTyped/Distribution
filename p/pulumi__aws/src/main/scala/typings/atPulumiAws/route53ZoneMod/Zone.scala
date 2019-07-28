package typings.atPulumiAws.route53ZoneMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.Anon_VpcId
import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/route53/zone", "Zone")
@js.native
class Zone protected () extends CustomResource {
  /**
    * Create a Zone resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: ZoneArgs) = this()
  def this(name: String, args: ZoneArgs, opts: CustomResourceOptions) = this()
  val comment: Output[String] = js.native
  /**
    * The ID of the reusable delegation set whose NS records you want to assign to the hosted zone. Conflicts with `vpc` as delegation sets can only be used for public zones.
    */
  val delegationSetId: Output[js.UndefOr[String]] = js.native
  val forceDestroy: Output[js.UndefOr[Boolean]] = js.native
  /**
    * This is the name of the hosted zone.
    */
  val name: Output[String] = js.native
  /**
    * A list of name servers in associated (or default) delegation set.
    * Find more about delegation sets in [AWS docs](https://docs.aws.amazon.com/Route53/latest/APIReference/actions-on-reusable-delegation-sets.html).
    */
  val nameServers: Output[js.Array[String]] = js.native
  /**
    * A mapping of tags to assign to the zone.
    */
  val tags: Output[js.UndefOr[StringDictionary[_]]] = js.native
  /**
    * Configuration block(s) specifying VPC(s) to associate with a private hosted zone. Conflicts with the `delegation_set_id` argument in this resource and any [`aws_route53_zone_association` resource](https://www.terraform.io/docs/providers/aws/r/route53_zone_association.html) specifying the same zone ID. Detailed below.
    */
  val vpcs: Output[js.UndefOr[js.Array[Anon_VpcId]]] = js.native
  /**
    * The Hosted Zone ID. This can be referenced by zone records.
    */
  val zoneId: Output[String] = js.native
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
  def get(name: String, id: Input[ID]): Zone = js.native
  def get(name: String, id: Input[ID], state: ZoneState): Zone = js.native
  def get(name: String, id: Input[ID], state: ZoneState, opts: CustomResourceOptions): Zone = js.native
  /**
    * Returns true if the given object is an instance of Zone.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/route53/zone.Zone */ Boolean = js.native
}

