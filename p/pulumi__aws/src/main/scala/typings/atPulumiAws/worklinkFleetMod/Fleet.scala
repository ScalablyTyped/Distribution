package typings.atPulumiAws.worklinkFleetMod

import typings.atPulumiAws.typesOutputMod.worklink.FleetIdentityProvider
import typings.atPulumiAws.typesOutputMod.worklink.FleetNetwork
import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/worklink/fleet", "Fleet")
@js.native
class Fleet protected () extends CustomResource {
  /**
    * Create a Fleet resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: FleetArgs) = this()
  def this(name: String, args: FleetArgs, opts: CustomResourceOptions) = this()
  /**
    * The ARN of the created WorkLink Fleet.
    */
  val arn: Output[String] = js.native
  /**
    * The ARN of the Amazon Kinesis data stream that receives the audit events.
    */
  val auditStreamArn: Output[js.UndefOr[String]] = js.native
  /**
    * The identifier used by users to sign in to the Amazon WorkLink app.
    */
  val companyCode: Output[String] = js.native
  /**
    * The time that the fleet was created.
    */
  val createdTime: Output[String] = js.native
  /**
    * The certificate chain, including intermediate certificates and the root certificate authority certificate used to issue device certificates.
    */
  val deviceCaCertificate: Output[js.UndefOr[String]] = js.native
  /**
    * The name of the fleet.
    */
  val displayName: Output[js.UndefOr[String]] = js.native
  /**
    * Provide this to allow manage the identity provider configuration for the fleet. Fields documented below.
    */
  val identityProvider: Output[js.UndefOr[FleetIdentityProvider]] = js.native
  /**
    * The time that the fleet was last updated.
    */
  val lastUpdatedTime: Output[String] = js.native
  /**
    * A region-unique name for the AMI.
    */
  val name: Output[String] = js.native
  /**
    * Provide this to allow manage the company network configuration for the fleet. Fields documented below.
    */
  val network: Output[js.UndefOr[FleetNetwork]] = js.native
  /**
    * The option to optimize for better performance by routing traffic through the closest AWS Region to users, which may be outside of your home Region. Defaults to `true`.
    */
  val optimizeForEndUserLocation: Output[js.UndefOr[Boolean]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/worklink/fleet", "Fleet")
@js.native
object Fleet extends js.Object {
  /**
    * Get an existing Fleet resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): Fleet = js.native
  def get(name: String, id: Input[ID], state: FleetState): Fleet = js.native
  def get(name: String, id: Input[ID], state: FleetState, opts: CustomResourceOptions): Fleet = js.native
  /**
    * Returns true if the given object is an instance of Fleet.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/worklink/fleet.Fleet */ Boolean = js.native
}

