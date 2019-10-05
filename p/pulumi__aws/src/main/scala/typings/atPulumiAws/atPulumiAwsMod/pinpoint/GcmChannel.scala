package typings.atPulumiAws.atPulumiAwsMod.pinpoint

import typings.atPulumiAws.pinpointGcmChannelMod.GcmChannelArgs
import typings.atPulumiAws.pinpointGcmChannelMod.GcmChannelState
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "pinpoint.GcmChannel")
@js.native
class GcmChannel protected ()
  extends typings.atPulumiAws.pinpointMod.GcmChannel {
  /**
    * Create a GcmChannel resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: GcmChannelArgs) = this()
  def this(name: String, args: GcmChannelArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws", "pinpoint.GcmChannel")
@js.native
object GcmChannel extends js.Object {
  /**
    * Get an existing GcmChannel resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typings.atPulumiAws.pinpointGcmChannelMod.GcmChannel = js.native
  def get(name: String, id: Input[ID], state: GcmChannelState): typings.atPulumiAws.pinpointGcmChannelMod.GcmChannel = js.native
  def get(name: String, id: Input[ID], state: GcmChannelState, opts: CustomResourceOptions): typings.atPulumiAws.pinpointGcmChannelMod.GcmChannel = js.native
  /**
    * Returns true if the given object is an instance of GcmChannel.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/pinpoint/gcmChannel.GcmChannel */ Boolean = js.native
}

