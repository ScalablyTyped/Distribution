package typings
package atPulumiAwsLib.pinpointEmailChannelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/pinpoint/emailChannel", "EmailChannel")
@js.native
class EmailChannel protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a EmailChannel resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: EmailChannelArgs) = this()
  def this(name: java.lang.String, args: EmailChannelArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  val applicationId: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  val enabled: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[scala.Boolean]] = js.native
  val fromAddress: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  val identity: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  val messagesPerSecond: atPulumiPulumiLib.atPulumiPulumiMod.Output[scala.Double] = js.native
  val roleArn: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
}

@JSImport("@pulumi/aws/pinpoint/emailChannel", "EmailChannel")
@js.native
object EmailChannel extends js.Object {
  /**
    * Get an existing EmailChannel resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.pinpointEmailChannelMod.EmailChannel = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.pinpointEmailChannelMod.EmailChannelState
  ): atPulumiAwsLib.pinpointEmailChannelMod.EmailChannel = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.pinpointEmailChannelMod.EmailChannelState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.pinpointEmailChannelMod.EmailChannel = js.native
}

