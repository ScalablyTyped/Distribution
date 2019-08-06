package typings.atPulumiAws.snsPlatformApplicationMod

import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/sns/platformApplication", "PlatformApplication")
@js.native
class PlatformApplication protected () extends CustomResource {
  /**
    * Create a PlatformApplication resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: PlatformApplicationArgs) = this()
  def this(name: String, args: PlatformApplicationArgs, opts: CustomResourceOptions) = this()
  /**
    * The ARN of the SNS platform application
    */
  val arn: Output[String] = js.native
  /**
    * SNS Topic triggered when a delivery to any of the platform endpoints associated with your platform application encounters a permanent failure.
    */
  val eventDeliveryFailureTopicArn: Output[js.UndefOr[String]] = js.native
  /**
    * SNS Topic triggered when a new platform endpoint is added to your platform application.
    */
  val eventEndpointCreatedTopicArn: Output[js.UndefOr[String]] = js.native
  /**
    * SNS Topic triggered when an existing platform endpoint is deleted from your platform application.
    */
  val eventEndpointDeletedTopicArn: Output[js.UndefOr[String]] = js.native
  /**
    * SNS Topic triggered when an existing platform endpoint is changed from your platform application.
    */
  val eventEndpointUpdatedTopicArn: Output[js.UndefOr[String]] = js.native
  /**
    * The IAM role permitted to receive failure feedback for this application.
    */
  val failureFeedbackRoleArn: Output[js.UndefOr[String]] = js.native
  /**
    * The friendly name for the SNS platform application
    */
  val name: Output[String] = js.native
  /**
    * The platform that the app is registered with. See [Platform][1] for supported platforms.
    */
  val platform: Output[String] = js.native
  /**
    * Application Platform credential. See [Credential][1] for type of credential required for platform. The value of this attribute when stored into the state is only a hash of the real value, so therefore it is not practical to use this as an attribute for other resources.
    */
  val platformCredential: Output[String] = js.native
  /**
    * Application Platform principal. See [Principal][2] for type of principal required for platform. The value of this attribute when stored into the state is only a hash of the real value, so therefore it is not practical to use this as an attribute for other resources.
    */
  val platformPrincipal: Output[js.UndefOr[String]] = js.native
  /**
    * The IAM role permitted to receive success feedback for this application.
    */
  val successFeedbackRoleArn: Output[js.UndefOr[String]] = js.native
  /**
    * The percentage of success to sample (0-100)
    */
  val successFeedbackSampleRate: Output[js.UndefOr[String]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/sns/platformApplication", "PlatformApplication")
@js.native
object PlatformApplication extends js.Object {
  /**
    * Get an existing PlatformApplication resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): PlatformApplication = js.native
  def get(name: String, id: Input[ID], state: PlatformApplicationState): PlatformApplication = js.native
  def get(name: String, id: Input[ID], state: PlatformApplicationState, opts: CustomResourceOptions): PlatformApplication = js.native
  /**
    * Returns true if the given object is an instance of PlatformApplication.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/sns/platformApplication.PlatformApplication */ Boolean = js.native
}

