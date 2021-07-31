package typings.pulumiAws

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vaultPolicyMod {
  
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
  object VaultPolicy {
    
    @JSImport("@pulumi/aws/backup/vaultPolicy", "VaultPolicy")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing VaultPolicy resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): VaultPolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[VaultPolicy]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): VaultPolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[VaultPolicy]
    @scala.inline
    def get(name: String, id: Input[ID], state: VaultPolicyState): VaultPolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[VaultPolicy]
    @scala.inline
    def get(name: String, id: Input[ID], state: VaultPolicyState, opts: CustomResourceOptions): VaultPolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[VaultPolicy]
    
    /**
      * Returns true if the given object is an instance of VaultPolicy.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/backup/vaultPolicy.VaultPolicy */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/backup/vaultPolicy.VaultPolicy */ Boolean]
  }
  
  trait VaultPolicyArgs extends StObject {
    
    /**
      * Name of the backup vault to add policy for.
      */
    val backupVaultName: Input[String]
    
    /**
      * The backup vault access policy document in JSON format.
      */
    val policy: Input[String]
  }
  object VaultPolicyArgs {
    
    @scala.inline
    def apply(backupVaultName: Input[String], policy: Input[String]): VaultPolicyArgs = {
      val __obj = js.Dynamic.literal(backupVaultName = backupVaultName.asInstanceOf[js.Any], policy = policy.asInstanceOf[js.Any])
      __obj.asInstanceOf[VaultPolicyArgs]
    }
    
    @scala.inline
    implicit class VaultPolicyArgsMutableBuilder[Self <: VaultPolicyArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackupVaultName(value: Input[String]): Self = StObject.set(x, "backupVaultName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPolicy(value: Input[String]): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
    }
  }
  
  trait VaultPolicyState extends StObject {
    
    /**
      * The ARN of the vault.
      */
    val backupVaultArn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Name of the backup vault to add policy for.
      */
    val backupVaultName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The backup vault access policy document in JSON format.
      */
    val policy: js.UndefOr[Input[String]] = js.undefined
  }
  object VaultPolicyState {
    
    @scala.inline
    def apply(): VaultPolicyState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VaultPolicyState]
    }
    
    @scala.inline
    implicit class VaultPolicyStateMutableBuilder[Self <: VaultPolicyState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackupVaultArn(value: Input[String]): Self = StObject.set(x, "backupVaultArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackupVaultArnUndefined: Self = StObject.set(x, "backupVaultArn", js.undefined)
      
      @scala.inline
      def setBackupVaultName(value: Input[String]): Self = StObject.set(x, "backupVaultName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackupVaultNameUndefined: Self = StObject.set(x, "backupVaultName", js.undefined)
      
      @scala.inline
      def setPolicy(value: Input[String]): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
    }
  }
}
