package typings
package atPulumiAwsLib.pinpointApnsSandboxChannelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/pinpoint/apnsSandboxChannel", "ApnsSandboxChannel")
@js.native
class ApnsSandboxChannel protected ()
  extends atPulumiPulumiLib.pulumiMod.CustomResource {
  /**
    * Create a ApnsSandboxChannel resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: ApnsSandboxChannelArgs) = this()
  def this(name: java.lang.String, args: ApnsSandboxChannelArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  val applicationId: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  val bundleId: atPulumiPulumiLib.pulumiMod.Output[js.UndefOr[java.lang.String]] = js.native
  val certificate: atPulumiPulumiLib.pulumiMod.Output[js.UndefOr[java.lang.String]] = js.native
  val defaultAuthenticationMethod: atPulumiPulumiLib.pulumiMod.Output[js.UndefOr[java.lang.String]] = js.native
  val enabled: atPulumiPulumiLib.pulumiMod.Output[js.UndefOr[scala.Boolean]] = js.native
  val privateKey: atPulumiPulumiLib.pulumiMod.Output[js.UndefOr[java.lang.String]] = js.native
  val teamId: atPulumiPulumiLib.pulumiMod.Output[js.UndefOr[java.lang.String]] = js.native
  val tokenKey: atPulumiPulumiLib.pulumiMod.Output[js.UndefOr[java.lang.String]] = js.native
  val tokenKeyId: atPulumiPulumiLib.pulumiMod.Output[js.UndefOr[java.lang.String]] = js.native
}

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
  def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.pinpointApnsSandboxChannelMod.ApnsSandboxChannel = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.pinpointApnsSandboxChannelMod.ApnsSandboxChannelState
  ): atPulumiAwsLib.pinpointApnsSandboxChannelMod.ApnsSandboxChannel = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.pinpointApnsSandboxChannelMod.ApnsSandboxChannelState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.pinpointApnsSandboxChannelMod.ApnsSandboxChannel = js.native
}

