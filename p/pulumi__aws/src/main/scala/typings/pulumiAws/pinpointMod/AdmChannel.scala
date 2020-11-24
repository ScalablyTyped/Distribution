package typings.pulumiAws.pinpointMod

import typings.pulumiAws.admChannelMod.AdmChannelArgs
import typings.pulumiAws.admChannelMod.AdmChannelState
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/pinpoint", "AdmChannel")
@js.native
class AdmChannel protected ()
  extends typings.pulumiAws.admChannelMod.AdmChannel {
  /**
    * Create a AdmChannel resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: AdmChannelArgs) = this()
  def this(name: String, args: AdmChannelArgs, opts: CustomResourceOptions) = this()
}
/* static members */
@JSImport("@pulumi/aws/pinpoint", "AdmChannel")
@js.native
object AdmChannel extends js.Object {
  
  /**
    * Get an existing AdmChannel resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): typings.pulumiAws.admChannelMod.AdmChannel = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.admChannelMod.AdmChannel = js.native
  def get(name: String, id: Input[ID], state: AdmChannelState): typings.pulumiAws.admChannelMod.AdmChannel = js.native
  def get(name: String, id: Input[ID], state: AdmChannelState, opts: CustomResourceOptions): typings.pulumiAws.admChannelMod.AdmChannel = js.native
  
  /**
    * Returns true if the given object is an instance of AdmChannel.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/pinpoint/admChannel.AdmChannel */ Boolean = js.native
}
