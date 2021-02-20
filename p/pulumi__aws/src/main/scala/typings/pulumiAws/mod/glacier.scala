package typings.pulumiAws.mod

import typings.pulumiAws.glacierVaultMod.VaultArgs
import typings.pulumiAws.glacierVaultMod.VaultState
import typings.pulumiAws.vaultLockMod.VaultLockArgs
import typings.pulumiAws.vaultLockMod.VaultLockState
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object glacier {
  
  @JSImport("@pulumi/aws", "glacier.Vault")
  @js.native
  class Vault protected ()
    extends typings.pulumiAws.glacierMod.Vault {
    /**
      * Create a Vault resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: VaultArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: VaultArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Vault {
    
    /**
      * Get an existing Vault resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "glacier.Vault.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.glacierVaultMod.Vault = js.native
    @JSImport("@pulumi/aws", "glacier.Vault.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.glacierVaultMod.Vault = js.native
    @JSImport("@pulumi/aws", "glacier.Vault.get")
    @js.native
    def get(name: String, id: Input[ID], state: VaultState): typings.pulumiAws.glacierVaultMod.Vault = js.native
    @JSImport("@pulumi/aws", "glacier.Vault.get")
    @js.native
    def get(name: String, id: Input[ID], state: VaultState, opts: CustomResourceOptions): typings.pulumiAws.glacierVaultMod.Vault = js.native
    
    /**
      * Returns true if the given object is an instance of Vault.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "glacier.Vault.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/glacier/vault.Vault */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "glacier.VaultLock")
  @js.native
  class VaultLock protected ()
    extends typings.pulumiAws.glacierMod.VaultLock {
    /**
      * Create a VaultLock resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: VaultLockArgs) = this()
    def this(name: String, args: VaultLockArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object VaultLock {
    
    /**
      * Get an existing VaultLock resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "glacier.VaultLock.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.vaultLockMod.VaultLock = js.native
    @JSImport("@pulumi/aws", "glacier.VaultLock.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.vaultLockMod.VaultLock = js.native
    @JSImport("@pulumi/aws", "glacier.VaultLock.get")
    @js.native
    def get(name: String, id: Input[ID], state: VaultLockState): typings.pulumiAws.vaultLockMod.VaultLock = js.native
    @JSImport("@pulumi/aws", "glacier.VaultLock.get")
    @js.native
    def get(name: String, id: Input[ID], state: VaultLockState, opts: CustomResourceOptions): typings.pulumiAws.vaultLockMod.VaultLock = js.native
    
    /**
      * Returns true if the given object is an instance of VaultLock.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "glacier.VaultLock.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/glacier/vaultLock.VaultLock */ Boolean = js.native
  }
}
