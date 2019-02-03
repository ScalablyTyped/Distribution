package typings
package atPulumiAwsLib.pinpointApnsChannelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/pinpoint/apnsChannel", "ApnsChannel")
@js.native
class ApnsChannel protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a ApnsChannel resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: ApnsChannelArgs) = this()
  def this(name: java.lang.String, args: ApnsChannelArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  val applicationId: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  val bundleId: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[java.lang.String]] = js.native
  val certificate: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[java.lang.String]] = js.native
  val defaultAuthenticationMethod: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[java.lang.String]] = js.native
  val enabled: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[scala.Boolean]] = js.native
  val privateKey: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[java.lang.String]] = js.native
  val teamId: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[java.lang.String]] = js.native
  val tokenKey: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[java.lang.String]] = js.native
  val tokenKeyId: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[java.lang.String]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/pinpoint/apnsChannel", "ApnsChannel")
@js.native
object ApnsChannel extends js.Object {
  /**
    * Get an existing ApnsChannel resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.pinpointApnsChannelMod.ApnsChannel = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.pinpointApnsChannelMod.ApnsChannelState
  ): atPulumiAwsLib.pinpointApnsChannelMod.ApnsChannel = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.pinpointApnsChannelMod.ApnsChannelState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.pinpointApnsChannelMod.ApnsChannel = js.native
}

