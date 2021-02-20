package typings.pulumiAws.outputMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object backup {
  
  @js.native
  trait PlanAdvancedBackupSetting extends StObject {
    
    /**
      * Specifies the backup option for a selected resource. This option is only available for Windows VSS backup jobs. Set to `{ WindowsVSS = "enabled" }` to enable Windows VSS backup option and create a VSS Windows backup.
      */
    var backupOptions: js.UndefOr[StringDictionary[String]] = js.native
    
    /**
      * The type of AWS resource to be backed up. For VSS Windows backups, the only supported resource type is Amazon EC2. Valid values: `EC2`.
      */
    var resourceType: js.UndefOr[String] = js.native
  }
  object PlanAdvancedBackupSetting {
    
    @scala.inline
    def apply(): PlanAdvancedBackupSetting = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PlanAdvancedBackupSetting]
    }
    
    @scala.inline
    implicit class PlanAdvancedBackupSettingMutableBuilder[Self <: PlanAdvancedBackupSetting] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackupOptions(value: StringDictionary[String]): Self = StObject.set(x, "backupOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackupOptionsUndefined: Self = StObject.set(x, "backupOptions", js.undefined)
      
      @scala.inline
      def setResourceType(value: String): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourceTypeUndefined: Self = StObject.set(x, "resourceType", js.undefined)
    }
  }
  
  @js.native
  trait PlanRule extends StObject {
    
    /**
      * The amount of time AWS Backup attempts a backup before canceling the job and returning an error.
      */
    var completionWindow: js.UndefOr[Double] = js.native
    
    /**
      * Configuration block(s) with copy operation settings. Detailed below.
      */
    var copyActions: js.UndefOr[js.Array[PlanRuleCopyAction]] = js.native
    
    /**
      * The lifecycle defines when a protected resource is copied over to a backup vault and when it expires.  Fields documented above.
      */
    var lifecycle: js.UndefOr[PlanRuleLifecycle] = js.native
    
    /**
      * Metadata that you can assign to help organize the resources that you create.
      */
    var recoveryPointTags: js.UndefOr[StringDictionary[String]] = js.native
    
    /**
      * An display name for a backup rule.
      */
    var ruleName: String = js.native
    
    /**
      * A CRON expression specifying when AWS Backup initiates a backup job.
      */
    var schedule: js.UndefOr[String] = js.native
    
    /**
      * The amount of time in minutes before beginning a backup.
      */
    var startWindow: js.UndefOr[Double] = js.native
    
    /**
      * The name of a logical container where backups are stored.
      */
    var targetVaultName: String = js.native
  }
  object PlanRule {
    
    @scala.inline
    def apply(ruleName: String, targetVaultName: String): PlanRule = {
      val __obj = js.Dynamic.literal(ruleName = ruleName.asInstanceOf[js.Any], targetVaultName = targetVaultName.asInstanceOf[js.Any])
      __obj.asInstanceOf[PlanRule]
    }
    
    @scala.inline
    implicit class PlanRuleMutableBuilder[Self <: PlanRule] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCompletionWindow(value: Double): Self = StObject.set(x, "completionWindow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompletionWindowUndefined: Self = StObject.set(x, "completionWindow", js.undefined)
      
      @scala.inline
      def setCopyActions(value: js.Array[PlanRuleCopyAction]): Self = StObject.set(x, "copyActions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCopyActionsUndefined: Self = StObject.set(x, "copyActions", js.undefined)
      
      @scala.inline
      def setCopyActionsVarargs(value: PlanRuleCopyAction*): Self = StObject.set(x, "copyActions", js.Array(value :_*))
      
      @scala.inline
      def setLifecycle(value: PlanRuleLifecycle): Self = StObject.set(x, "lifecycle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLifecycleUndefined: Self = StObject.set(x, "lifecycle", js.undefined)
      
      @scala.inline
      def setRecoveryPointTags(value: StringDictionary[String]): Self = StObject.set(x, "recoveryPointTags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecoveryPointTagsUndefined: Self = StObject.set(x, "recoveryPointTags", js.undefined)
      
      @scala.inline
      def setRuleName(value: String): Self = StObject.set(x, "ruleName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSchedule(value: String): Self = StObject.set(x, "schedule", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScheduleUndefined: Self = StObject.set(x, "schedule", js.undefined)
      
      @scala.inline
      def setStartWindow(value: Double): Self = StObject.set(x, "startWindow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartWindowUndefined: Self = StObject.set(x, "startWindow", js.undefined)
      
      @scala.inline
      def setTargetVaultName(value: String): Self = StObject.set(x, "targetVaultName", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PlanRuleCopyAction extends StObject {
    
    /**
      * An Amazon Resource Name (ARN) that uniquely identifies the destination backup vault for the copied backup.
      */
    var destinationVaultArn: String = js.native
    
    /**
      * The lifecycle defines when a protected resource is copied over to a backup vault and when it expires.  Fields documented above.
      */
    var lifecycle: js.UndefOr[PlanRuleCopyActionLifecycle] = js.native
  }
  object PlanRuleCopyAction {
    
    @scala.inline
    def apply(destinationVaultArn: String): PlanRuleCopyAction = {
      val __obj = js.Dynamic.literal(destinationVaultArn = destinationVaultArn.asInstanceOf[js.Any])
      __obj.asInstanceOf[PlanRuleCopyAction]
    }
    
    @scala.inline
    implicit class PlanRuleCopyActionMutableBuilder[Self <: PlanRuleCopyAction] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDestinationVaultArn(value: String): Self = StObject.set(x, "destinationVaultArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLifecycle(value: PlanRuleCopyActionLifecycle): Self = StObject.set(x, "lifecycle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLifecycleUndefined: Self = StObject.set(x, "lifecycle", js.undefined)
    }
  }
  
  @js.native
  trait PlanRuleCopyActionLifecycle extends StObject {
    
    /**
      * Specifies the number of days after creation that a recovery point is moved to cold storage.
      */
    var coldStorageAfter: js.UndefOr[Double] = js.native
    
    /**
      * Specifies the number of days after creation that a recovery point is deleted. Must be 90 days greater than `coldStorageAfter`.
      */
    var deleteAfter: js.UndefOr[Double] = js.native
  }
  object PlanRuleCopyActionLifecycle {
    
    @scala.inline
    def apply(): PlanRuleCopyActionLifecycle = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PlanRuleCopyActionLifecycle]
    }
    
    @scala.inline
    implicit class PlanRuleCopyActionLifecycleMutableBuilder[Self <: PlanRuleCopyActionLifecycle] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColdStorageAfter(value: Double): Self = StObject.set(x, "coldStorageAfter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColdStorageAfterUndefined: Self = StObject.set(x, "coldStorageAfter", js.undefined)
      
      @scala.inline
      def setDeleteAfter(value: Double): Self = StObject.set(x, "deleteAfter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeleteAfterUndefined: Self = StObject.set(x, "deleteAfter", js.undefined)
    }
  }
  
  @js.native
  trait PlanRuleLifecycle extends StObject {
    
    /**
      * Specifies the number of days after creation that a recovery point is moved to cold storage.
      */
    var coldStorageAfter: js.UndefOr[Double] = js.native
    
    /**
      * Specifies the number of days after creation that a recovery point is deleted. Must be 90 days greater than `coldStorageAfter`.
      */
    var deleteAfter: js.UndefOr[Double] = js.native
  }
  object PlanRuleLifecycle {
    
    @scala.inline
    def apply(): PlanRuleLifecycle = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PlanRuleLifecycle]
    }
    
    @scala.inline
    implicit class PlanRuleLifecycleMutableBuilder[Self <: PlanRuleLifecycle] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColdStorageAfter(value: Double): Self = StObject.set(x, "coldStorageAfter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColdStorageAfterUndefined: Self = StObject.set(x, "coldStorageAfter", js.undefined)
      
      @scala.inline
      def setDeleteAfter(value: Double): Self = StObject.set(x, "deleteAfter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeleteAfterUndefined: Self = StObject.set(x, "deleteAfter", js.undefined)
    }
  }
  
  @js.native
  trait SelectionSelectionTag extends StObject {
    
    /**
      * The key in a key-value pair.
      */
    var key: String = js.native
    
    /**
      * An operation, such as `StringEquals`, that is applied to a key-value pair used to filter resources in a selection.
      */
    var `type`: String = js.native
    
    /**
      * The value in a key-value pair.
      */
    var value: String = js.native
  }
  object SelectionSelectionTag {
    
    @scala.inline
    def apply(key: String, `type`: String, value: String): SelectionSelectionTag = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectionSelectionTag]
    }
    
    @scala.inline
    implicit class SelectionSelectionTagMutableBuilder[Self <: SelectionSelectionTag] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
