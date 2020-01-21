package typings.pulumiAws.apnsVoipSandboxChannelMod

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/pinpoint/apnsVoipSandboxChannel", "ApnsVoipSandboxChannel")
@js.native
class ApnsVoipSandboxChannel protected () extends CustomResource {
  /**
    * Create a ApnsVoipSandboxChannel resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: ApnsVoipSandboxChannelArgs) = this()
  def this(name: String, args: ApnsVoipSandboxChannelArgs, opts: CustomResourceOptions) = this()
  /**
    * The application ID.
    */
  val applicationId: Output_[String] = js.native
  /**
    * The ID assigned to your iOS app. To find this value, choose Certificates, IDs & Profiles, choose App IDs in the Identifiers section, and choose your app.
    */
  val bundleId: Output_[js.UndefOr[String]] = js.native
  /**
    * The pem encoded TLS Certificate from Apple.
    */
  val certificate: Output_[js.UndefOr[String]] = js.native
  /**
    * The default authentication method used for APNs.
    * __NOTE__: Amazon Pinpoint uses this default for every APNs push notification that you send using the console.
    * You can override the default when you send a message programmatically using the Amazon Pinpoint API, the AWS CLI, or an AWS SDK.
    * If your default authentication type fails, Amazon Pinpoint doesn't attempt to use the other authentication type.
    */
  val defaultAuthenticationMethod: Output_[js.UndefOr[String]] = js.native
  /**
    * Whether the channel is enabled or disabled. Defaults to `true`.
    */
  val enabled: Output_[js.UndefOr[Boolean]] = js.native
  /**
    * The Certificate Private Key file (ie. `.key` file).
    */
  val privateKey: Output_[js.UndefOr[String]] = js.native
  /**
    * The ID assigned to your Apple developer account team. This value is provided on the Membership page.
    */
  val teamId: Output_[js.UndefOr[String]] = js.native
  /**
    * The `.p8` file that you download from your Apple developer account when you create an authentication key.
    */
  val tokenKey: Output_[js.UndefOr[String]] = js.native
  /**
    * The ID assigned to your signing key. To find this value, choose Certificates, IDs & Profiles, and choose your key in the Keys section.
    */
  val tokenKeyId: Output_[js.UndefOr[String]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/pinpoint/apnsVoipSandboxChannel", "ApnsVoipSandboxChannel")
@js.native
object ApnsVoipSandboxChannel extends js.Object {
  /**
    * Get an existing ApnsVoipSandboxChannel resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): ApnsVoipSandboxChannel = js.native
  def get(name: String, id: Input[ID], state: ApnsVoipSandboxChannelState): ApnsVoipSandboxChannel = js.native
  def get(name: String, id: Input[ID], state: ApnsVoipSandboxChannelState, opts: CustomResourceOptions): ApnsVoipSandboxChannel = js.native
  /**
    * Returns true if the given object is an instance of ApnsVoipSandboxChannel.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/pinpoint/apnsVoipSandboxChannel.ApnsVoipSandboxChannel */ Boolean = js.native
}

