package typings.pulumiAws.admChannelMod

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/pinpoint/admChannel", "AdmChannel")
@js.native
class AdmChannel protected () extends CustomResource {
  /**
    * Create a AdmChannel resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: AdmChannelArgs) = this()
  def this(name: String, args: AdmChannelArgs, opts: CustomResourceOptions) = this()
  
  /**
    * The application ID.
    */
  val applicationId: Output_[String] = js.native
  
  /**
    * Client ID (part of OAuth Credentials) obtained via Amazon Developer Account.
    */
  val clientId: Output_[String] = js.native
  
  /**
    * Client Secret (part of OAuth Credentials) obtained via Amazon Developer Account.
    */
  val clientSecret: Output_[String] = js.native
  
  /**
    * Specifies whether to enable the channel. Defaults to `true`.
    */
  val enabled: Output_[js.UndefOr[Boolean]] = js.native
}
/* static members */
@JSImport("@pulumi/aws/pinpoint/admChannel", "AdmChannel")
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
  def get(name: String, id: Input[ID]): AdmChannel = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): AdmChannel = js.native
  def get(name: String, id: Input[ID], state: AdmChannelState): AdmChannel = js.native
  def get(name: String, id: Input[ID], state: AdmChannelState, opts: CustomResourceOptions): AdmChannel = js.native
  
  /**
    * Returns true if the given object is an instance of AdmChannel.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/pinpoint/admChannel.AdmChannel */ Boolean = js.native
}
