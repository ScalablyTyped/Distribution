package typings.pulumiAws.publishingDestinationMod

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/guardduty/publishingDestination", "PublishingDestination")
@js.native
class PublishingDestination protected () extends CustomResource {
  /**
    * Create a PublishingDestination resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: PublishingDestinationArgs) = this()
  def this(name: String, args: PublishingDestinationArgs, opts: CustomResourceOptions) = this()
  
  /**
    * The bucket arn and prefix under which the findings get exported. Bucket-ARN is required, the prefix is optional and will be `AWSLogs/[Account-ID]/GuardDuty/[Region]/` if not provided
    */
  val destinationArn: Output_[String] = js.native
  
  /**
    * Currently there is only "S3" available as destination type which is also the default value
    */
  val destinationType: Output_[js.UndefOr[String]] = js.native
  
  /**
    * The detector ID of the GuardDuty.
    */
  val detectorId: Output_[String] = js.native
  
  /**
    * The ARN of the KMS key used to encrypt GuardDuty findings. GuardDuty enforces this to be encrypted.
    */
  val kmsKeyArn: Output_[String] = js.native
}
/* static members */
@JSImport("@pulumi/aws/guardduty/publishingDestination", "PublishingDestination")
@js.native
object PublishingDestination extends js.Object {
  
  /**
    * Get an existing PublishingDestination resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): PublishingDestination = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): PublishingDestination = js.native
  def get(name: String, id: Input[ID], state: PublishingDestinationState): PublishingDestination = js.native
  def get(name: String, id: Input[ID], state: PublishingDestinationState, opts: CustomResourceOptions): PublishingDestination = js.native
  
  /**
    * Returns true if the given object is an instance of PublishingDestination.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/guardduty/publishingDestination.PublishingDestination */ Boolean = js.native
}
