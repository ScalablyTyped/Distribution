package typings.atPulumiAws.backupMod

import typings.atPulumiAws.backupVaultMod.VaultArgs
import typings.atPulumiAws.backupVaultMod.VaultState
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/backup", "Vault")
@js.native
class Vault protected ()
  extends typings.atPulumiAws.backupVaultMod.Vault {
  /**
    * Create a Vault resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: VaultArgs) = this()
  def this(name: String, args: VaultArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/backup", "Vault")
@js.native
object Vault extends js.Object {
  /**
    * Get an existing Vault resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typings.atPulumiAws.backupVaultMod.Vault = js.native
  def get(name: String, id: Input[ID], state: VaultState): typings.atPulumiAws.backupVaultMod.Vault = js.native
  def get(name: String, id: Input[ID], state: VaultState, opts: CustomResourceOptions): typings.atPulumiAws.backupVaultMod.Vault = js.native
  /**
    * Returns true if the given object is an instance of Vault.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/backup/vault.Vault */ Boolean = js.native
}

