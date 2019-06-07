package typings
package atPulumiAwsLib.atPulumiAwsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "glacier")
@js.native
object glacierNs extends js.Object {
  @js.native
  class Vault protected ()
    extends atPulumiAwsLib.glacierMod.Vault {
    /**
      * Create a Vault resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.glacierVaultMod.VaultArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.glacierVaultMod.VaultArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class VaultLock protected ()
    extends atPulumiAwsLib.glacierMod.VaultLock {
    /**
      * Create a VaultLock resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.glacierVaultLockMod.VaultLockArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.glacierVaultLockMod.VaultLockArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.glacierVaultMod.Vault = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.glacierVaultMod.VaultState
    ): atPulumiAwsLib.glacierVaultMod.Vault = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.glacierVaultMod.VaultState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.glacierVaultMod.Vault = js.native
    /**
      * Returns true if the given object is an instance of Vault.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/glacier/vault.Vault */ scala.Boolean = js.native
  }
  
  /* static members */
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
  
}

