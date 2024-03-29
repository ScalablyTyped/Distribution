package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vaultMod {
  
  @JSImport("@pulumi/aws/backup/vault", "Vault")
  @js.native
  class Vault protected () extends CustomResource {
    /**
      * Create a Vault resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: VaultArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: VaultArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The ARN of the vault.
      */
    val arn: Output_[String] = js.native
    
    /**
      * The server-side encryption key that is used to protect your backups.
      */
    val kmsKeyArn: Output_[String] = js.native
    
    /**
      * Name of the backup vault to create.
      */
    val name: Output_[String] = js.native
    
    /**
      * The number of recovery points that are stored in a backup vault.
      */
    val recoveryPoints: Output_[Double] = js.native
    
    /**
      * Metadata that you can assign to help organize the resources that you create.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  }
  /* static members */
  object Vault {
    
    @JSImport("@pulumi/aws/backup/vault", "Vault")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Vault resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): Vault = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Vault]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): Vault = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Vault]
    inline def get(name: String, id: Input[ID], state: VaultState): Vault = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Vault]
    inline def get(name: String, id: Input[ID], state: VaultState, opts: CustomResourceOptions): Vault = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Vault]
    
    /**
      * Returns true if the given object is an instance of Vault.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/backup/vault.Vault */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/backup/vault.Vault */ Boolean]
  }
  
  trait VaultArgs extends StObject {
    
    /**
      * The server-side encryption key that is used to protect your backups.
      */
    val kmsKeyArn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Name of the backup vault to create.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Metadata that you can assign to help organize the resources that you create.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  }
  object VaultArgs {
    
    inline def apply(): VaultArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VaultArgs]
    }
    
    extension [Self <: VaultArgs](x: Self) {
      
      inline def setKmsKeyArn(value: Input[String]): Self = StObject.set(x, "kmsKeyArn", value.asInstanceOf[js.Any])
      
      inline def setKmsKeyArnUndefined: Self = StObject.set(x, "kmsKeyArn", js.undefined)
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  trait VaultState extends StObject {
    
    /**
      * The ARN of the vault.
      */
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The server-side encryption key that is used to protect your backups.
      */
    val kmsKeyArn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Name of the backup vault to create.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The number of recovery points that are stored in a backup vault.
      */
    val recoveryPoints: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * Metadata that you can assign to help organize the resources that you create.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  }
  object VaultState {
    
    inline def apply(): VaultState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VaultState]
    }
    
    extension [Self <: VaultState](x: Self) {
      
      inline def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      inline def setKmsKeyArn(value: Input[String]): Self = StObject.set(x, "kmsKeyArn", value.asInstanceOf[js.Any])
      
      inline def setKmsKeyArnUndefined: Self = StObject.set(x, "kmsKeyArn", js.undefined)
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setRecoveryPoints(value: Input[Double]): Self = StObject.set(x, "recoveryPoints", value.asInstanceOf[js.Any])
      
      inline def setRecoveryPointsUndefined: Self = StObject.set(x, "recoveryPoints", js.undefined)
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
}
