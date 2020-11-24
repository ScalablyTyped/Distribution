package typings.pulumiAws.vaultPolicyMod

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/backup/vaultPolicy", "VaultPolicy")
@js.native
class VaultPolicy protected () extends CustomResource {
  /**
    * Create a VaultPolicy resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: VaultPolicyArgs) = this()
  def this(name: String, args: VaultPolicyArgs, opts: CustomResourceOptions) = this()
  
  /**
    * The ARN of the vault.
    */
  val backupVaultArn: Output_[String] = js.native
  
  /**
    * Name of the backup vault to add policy for.
    */
  val backupVaultName: Output_[String] = js.native
  
  /**
    * The backup vault access policy document in JSON format.
    */
  val policy: Output_[String] = js.native
}
/* static members */
@JSImport("@pulumi/aws/backup/vaultPolicy", "VaultPolicy")
@js.native
object VaultPolicy extends js.Object {
  
  /**
    * Get an existing VaultPolicy resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): VaultPolicy = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): VaultPolicy = js.native
  def get(name: String, id: Input[ID], state: VaultPolicyState): VaultPolicy = js.native
  def get(name: String, id: Input[ID], state: VaultPolicyState, opts: CustomResourceOptions): VaultPolicy = js.native
  
  /**
    * Returns true if the given object is an instance of VaultPolicy.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/backup/vaultPolicy.VaultPolicy */ Boolean = js.native
}
