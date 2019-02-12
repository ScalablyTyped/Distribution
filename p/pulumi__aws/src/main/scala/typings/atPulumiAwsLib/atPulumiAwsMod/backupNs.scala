package typings
package atPulumiAwsLib.atPulumiAwsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "backup")
@js.native
object backupNs extends js.Object {
  @js.native
  class Vault protected ()
    extends atPulumiAwsLib.backupMod.Vault {
    /**
      * Create a Vault resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.backupVaultMod.VaultArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.backupVaultMod.VaultArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  /* static members */
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.backupVaultMod.Vault = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.backupVaultMod.VaultState
    ): atPulumiAwsLib.backupVaultMod.Vault = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.backupVaultMod.VaultState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.backupVaultMod.Vault = js.native
  }
  
}

