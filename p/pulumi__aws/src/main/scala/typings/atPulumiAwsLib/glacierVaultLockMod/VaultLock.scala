package typings
package atPulumiAwsLib.glacierVaultLockMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/glacier/vaultLock", "VaultLock")
@js.native
class VaultLock protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a VaultLock resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: VaultLockArgs) = this()
  def this(name: java.lang.String, args: VaultLockArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  val completeLock: atPulumiPulumiLib.outputMod.Output[scala.Boolean] = js.native
  val ignoreDeletionError: atPulumiPulumiLib.outputMod.Output[js.UndefOr[scala.Boolean]] = js.native
  /**
    * JSON string containing the IAM policy to apply as the Glacier Vault Lock policy.
    */
  val policy: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The name of the Glacier Vault.
    */
  val vaultName: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/glacier/vaultLock", "VaultLock")
@js.native
object VaultLock extends js.Object {
  /**
    * Get an existing VaultLock resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.glacierVaultLockMod.VaultLock = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.glacierVaultLockMod.VaultLockState
  ): atPulumiAwsLib.glacierVaultLockMod.VaultLock = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.glacierVaultLockMod.VaultLockState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.glacierVaultLockMod.VaultLock = js.native
  /**
    * Returns true if the given object is an instance of VaultLock.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/glacier/vaultLock.VaultLock */ scala.Boolean = js.native
}

