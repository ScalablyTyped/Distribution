package typings
package atPulumiAwsLib.pinpointApnsSandboxChannelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/pinpoint/apnsSandboxChannel", "ApnsSandboxChannel")
@js.native
class ApnsSandboxChannel protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a ApnsSandboxChannel resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: ApnsSandboxChannelArgs) = this()
  def this(name: java.lang.String, args: ApnsSandboxChannelArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * The application ID.
    */
  val applicationId: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * The ID assigned to your iOS app. To find this value, choose Certificates, IDs & Profiles, choose App IDs in the Identifiers section, and choose your app.
    */
  val bundleId: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * The pem encoded TLS Certificate from Apple.
    */
  val certificate: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * The default authentication method used for APNs Sandbox.
    * __NOTE__: Amazon Pinpoint uses this default for every APNs push notification that you send using the console.
    * You can override the default when you send a message programmatically using the Amazon Pinpoint API, the AWS CLI, or an AWS SDK.
    * If your default authentication type fails, Amazon Pinpoint doesn't attempt to use the other authentication type.
    */
  val defaultAuthenticationMethod: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * Whether the channel is enabled or disabled. Defaults to `true`.
    */
  val enabled: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[scala.Boolean]] = js.native
  /**
    * The Certificate Private Key file (ie. `.key` file).
    */
  val privateKey: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * The ID assigned to your Apple developer account team. This value is provided on the Membership page.
    */
  val teamId: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * The `.p8` file that you download from your Apple developer account when you create an authentication key.
    */
  val tokenKey: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * The ID assigned to your signing key. To find this value, choose Certificates, IDs & Profiles, and choose your key in the Keys section.
    */
  val tokenKeyId: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[java.lang.String]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/pinpoint/apnsSandboxChannel", "ApnsSandboxChannel")
@js.native
object ApnsSandboxChannel extends js.Object {
  /**
    * Get an existing ApnsSandboxChannel resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.pinpointApnsSandboxChannelMod.ApnsSandboxChannel = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.pinpointApnsSandboxChannelMod.ApnsSandboxChannelState
  ): atPulumiAwsLib.pinpointApnsSandboxChannelMod.ApnsSandboxChannel = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.pinpointApnsSandboxChannelMod.ApnsSandboxChannelState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.pinpointApnsSandboxChannelMod.ApnsSandboxChannel = js.native
}

