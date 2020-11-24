package typings.pulumiAws.transferSshKeyMod

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/transfer/sshKey", "SshKey")
@js.native
class SshKey protected () extends CustomResource {
  /**
    * Create a SshKey resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: SshKeyArgs) = this()
  def this(name: String, args: SshKeyArgs, opts: CustomResourceOptions) = this()
  
  /**
    * The public key portion of an SSH key pair.
    */
  val body: Output_[String] = js.native
  
  /**
    * The Server ID of the Transfer Server (e.g. `s-12345678`)
    */
  val serverId: Output_[String] = js.native
  
  /**
    * The name of the user account that is assigned to one or more servers.
    */
  val userName: Output_[String] = js.native
}
/* static members */
@JSImport("@pulumi/aws/transfer/sshKey", "SshKey")
@js.native
object SshKey extends js.Object {
  
  /**
    * Get an existing SshKey resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): SshKey = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): SshKey = js.native
  def get(name: String, id: Input[ID], state: SshKeyState): SshKey = js.native
  def get(name: String, id: Input[ID], state: SshKeyState, opts: CustomResourceOptions): SshKey = js.native
  
  /**
    * Returns true if the given object is an instance of SshKey.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/transfer/sshKey.SshKey */ Boolean = js.native
}
