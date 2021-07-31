package typings.pulumiAws

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vaultNotificationsMod {
  
  @JSImport("@pulumi/aws/backup/vaultNotifications", "VaultNotifications")
  @js.native
  class VaultNotifications protected () extends CustomResource {
    /**
      * Create a VaultNotifications resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: VaultNotificationsArgs) = this()
    def this(name: String, args: VaultNotificationsArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The ARN of the vault.
      */
    val backupVaultArn: Output_[String] = js.native
    
    /**
      * An array of events that indicate the status of jobs to back up resources to the backup vault.
      */
    val backupVaultEvents: Output_[js.Array[String]] = js.native
    
    /**
      * Name of the backup vault to add notifications for.
      */
    val backupVaultName: Output_[String] = js.native
    
    /**
      * The Amazon Resource Name (ARN) that specifies the topic for a backup vault’s events
      */
    val snsTopicArn: Output_[String] = js.native
  }
  /* static members */
  object VaultNotifications {
    
    @JSImport("@pulumi/aws/backup/vaultNotifications", "VaultNotifications")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing VaultNotifications resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): VaultNotifications = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[VaultNotifications]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): VaultNotifications = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[VaultNotifications]
    @scala.inline
    def get(name: String, id: Input[ID], state: VaultNotificationsState): VaultNotifications = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[VaultNotifications]
    @scala.inline
    def get(name: String, id: Input[ID], state: VaultNotificationsState, opts: CustomResourceOptions): VaultNotifications = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[VaultNotifications]
    
    /**
      * Returns true if the given object is an instance of VaultNotifications.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/backup/vaultNotifications.VaultNotifications */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/backup/vaultNotifications.VaultNotifications */ Boolean]
  }
  
  trait VaultNotificationsArgs extends StObject {
    
    /**
      * An array of events that indicate the status of jobs to back up resources to the backup vault.
      */
    val backupVaultEvents: Input[js.Array[Input[String]]]
    
    /**
      * Name of the backup vault to add notifications for.
      */
    val backupVaultName: Input[String]
    
    /**
      * The Amazon Resource Name (ARN) that specifies the topic for a backup vault’s events
      */
    val snsTopicArn: Input[String]
  }
  object VaultNotificationsArgs {
    
    @scala.inline
    def apply(
      backupVaultEvents: Input[js.Array[Input[String]]],
      backupVaultName: Input[String],
      snsTopicArn: Input[String]
    ): VaultNotificationsArgs = {
      val __obj = js.Dynamic.literal(backupVaultEvents = backupVaultEvents.asInstanceOf[js.Any], backupVaultName = backupVaultName.asInstanceOf[js.Any], snsTopicArn = snsTopicArn.asInstanceOf[js.Any])
      __obj.asInstanceOf[VaultNotificationsArgs]
    }
    
    @scala.inline
    implicit class VaultNotificationsArgsMutableBuilder[Self <: VaultNotificationsArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackupVaultEvents(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "backupVaultEvents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackupVaultEventsVarargs(value: Input[String]*): Self = StObject.set(x, "backupVaultEvents", js.Array(value :_*))
      
      @scala.inline
      def setBackupVaultName(value: Input[String]): Self = StObject.set(x, "backupVaultName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSnsTopicArn(value: Input[String]): Self = StObject.set(x, "snsTopicArn", value.asInstanceOf[js.Any])
    }
  }
  
  trait VaultNotificationsState extends StObject {
    
    /**
      * The ARN of the vault.
      */
    val backupVaultArn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * An array of events that indicate the status of jobs to back up resources to the backup vault.
      */
    val backupVaultEvents: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * Name of the backup vault to add notifications for.
      */
    val backupVaultName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The Amazon Resource Name (ARN) that specifies the topic for a backup vault’s events
      */
    val snsTopicArn: js.UndefOr[Input[String]] = js.undefined
  }
  object VaultNotificationsState {
    
    @scala.inline
    def apply(): VaultNotificationsState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VaultNotificationsState]
    }
    
    @scala.inline
    implicit class VaultNotificationsStateMutableBuilder[Self <: VaultNotificationsState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackupVaultArn(value: Input[String]): Self = StObject.set(x, "backupVaultArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackupVaultArnUndefined: Self = StObject.set(x, "backupVaultArn", js.undefined)
      
      @scala.inline
      def setBackupVaultEvents(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "backupVaultEvents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackupVaultEventsUndefined: Self = StObject.set(x, "backupVaultEvents", js.undefined)
      
      @scala.inline
      def setBackupVaultEventsVarargs(value: Input[String]*): Self = StObject.set(x, "backupVaultEvents", js.Array(value :_*))
      
      @scala.inline
      def setBackupVaultName(value: Input[String]): Self = StObject.set(x, "backupVaultName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackupVaultNameUndefined: Self = StObject.set(x, "backupVaultName", js.undefined)
      
      @scala.inline
      def setSnsTopicArn(value: Input[String]): Self = StObject.set(x, "snsTopicArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSnsTopicArnUndefined: Self = StObject.set(x, "snsTopicArn", js.undefined)
    }
  }
}
