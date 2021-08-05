package typings.pulumiAws.outputMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object backup {
  
  trait PlanAdvancedBackupSetting extends StObject {
    
    /**
      * Specifies the backup option for a selected resource. This option is only available for Windows VSS backup jobs. Set to `{ WindowsVSS = "enabled" }` to enable Windows VSS backup option and create a VSS Windows backup.
      */
    var backupOptions: js.UndefOr[StringDictionary[String]] = js.undefined
    
    /**
      * The type of AWS resource to be backed up. For VSS Windows backups, the only supported resource type is Amazon EC2. Valid values: `EC2`.
      */
    var resourceType: js.UndefOr[String] = js.undefined
  }
  object PlanAdvancedBackupSetting {
    
    inline def apply(): PlanAdvancedBackupSetting = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PlanAdvancedBackupSetting]
    }
    
    extension [Self <: PlanAdvancedBackupSetting](x: Self) {
      
      inline def setBackupOptions(value: StringDictionary[String]): Self = StObject.set(x, "backupOptions", value.asInstanceOf[js.Any])
      
      inline def setBackupOptionsUndefined: Self = StObject.set(x, "backupOptions", js.undefined)
      
      inline def setResourceType(value: String): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
      
      inline def setResourceTypeUndefined: Self = StObject.set(x, "resourceType", js.undefined)
    }
  }
  
  trait PlanRule extends StObject {
    
    /**
      * The amount of time AWS Backup attempts a backup before canceling the job and returning an error.
      */
    var completionWindow: js.UndefOr[Double] = js.undefined
    
    /**
      * Configuration block(s) with copy operation settings. Detailed below.
      */
    var copyActions: js.UndefOr[js.Array[PlanRuleCopyAction]] = js.undefined
    
    /**
      * The lifecycle defines when a protected resource is copied over to a backup vault and when it expires.  Fields documented above.
      */
    var lifecycle: js.UndefOr[PlanRuleLifecycle] = js.undefined
    
    /**
      * Metadata that you can assign to help organize the resources that you create.
      */
    var recoveryPointTags: js.UndefOr[StringDictionary[String]] = js.undefined
    
    /**
      * An display name for a backup rule.
      */
    var ruleName: String
    
    /**
      * A CRON expression specifying when AWS Backup initiates a backup job.
      */
    var schedule: js.UndefOr[String] = js.undefined
    
    /**
      * The amount of time in minutes before beginning a backup.
      */
    var startWindow: js.UndefOr[Double] = js.undefined
    
    /**
      * The name of a logical container where backups are stored.
      */
    var targetVaultName: String
  }
  object PlanRule {
    
    inline def apply(ruleName: String, targetVaultName: String): PlanRule = {
      val __obj = js.Dynamic.literal(ruleName = ruleName.asInstanceOf[js.Any], targetVaultName = targetVaultName.asInstanceOf[js.Any])
      __obj.asInstanceOf[PlanRule]
    }
    
    extension [Self <: PlanRule](x: Self) {
      
      inline def setCompletionWindow(value: Double): Self = StObject.set(x, "completionWindow", value.asInstanceOf[js.Any])
      
      inline def setCompletionWindowUndefined: Self = StObject.set(x, "completionWindow", js.undefined)
      
      inline def setCopyActions(value: js.Array[PlanRuleCopyAction]): Self = StObject.set(x, "copyActions", value.asInstanceOf[js.Any])
      
      inline def setCopyActionsUndefined: Self = StObject.set(x, "copyActions", js.undefined)
      
      inline def setCopyActionsVarargs(value: PlanRuleCopyAction*): Self = StObject.set(x, "copyActions", js.Array(value :_*))
      
      inline def setLifecycle(value: PlanRuleLifecycle): Self = StObject.set(x, "lifecycle", value.asInstanceOf[js.Any])
      
      inline def setLifecycleUndefined: Self = StObject.set(x, "lifecycle", js.undefined)
      
      inline def setRecoveryPointTags(value: StringDictionary[String]): Self = StObject.set(x, "recoveryPointTags", value.asInstanceOf[js.Any])
      
      inline def setRecoveryPointTagsUndefined: Self = StObject.set(x, "recoveryPointTags", js.undefined)
      
      inline def setRuleName(value: String): Self = StObject.set(x, "ruleName", value.asInstanceOf[js.Any])
      
      inline def setSchedule(value: String): Self = StObject.set(x, "schedule", value.asInstanceOf[js.Any])
      
      inline def setScheduleUndefined: Self = StObject.set(x, "schedule", js.undefined)
      
      inline def setStartWindow(value: Double): Self = StObject.set(x, "startWindow", value.asInstanceOf[js.Any])
      
      inline def setStartWindowUndefined: Self = StObject.set(x, "startWindow", js.undefined)
      
      inline def setTargetVaultName(value: String): Self = StObject.set(x, "targetVaultName", value.asInstanceOf[js.Any])
    }
  }
  
  trait PlanRuleCopyAction extends StObject {
    
    /**
      * An Amazon Resource Name (ARN) that uniquely identifies the destination backup vault for the copied backup.
      */
    var destinationVaultArn: String
    
    /**
      * The lifecycle defines when a protected resource is copied over to a backup vault and when it expires.  Fields documented above.
      */
    var lifecycle: js.UndefOr[PlanRuleCopyActionLifecycle] = js.undefined
  }
  object PlanRuleCopyAction {
    
    inline def apply(destinationVaultArn: String): PlanRuleCopyAction = {
      val __obj = js.Dynamic.literal(destinationVaultArn = destinationVaultArn.asInstanceOf[js.Any])
      __obj.asInstanceOf[PlanRuleCopyAction]
    }
    
    extension [Self <: PlanRuleCopyAction](x: Self) {
      
      inline def setDestinationVaultArn(value: String): Self = StObject.set(x, "destinationVaultArn", value.asInstanceOf[js.Any])
      
      inline def setLifecycle(value: PlanRuleCopyActionLifecycle): Self = StObject.set(x, "lifecycle", value.asInstanceOf[js.Any])
      
      inline def setLifecycleUndefined: Self = StObject.set(x, "lifecycle", js.undefined)
    }
  }
  
  trait PlanRuleCopyActionLifecycle extends StObject {
    
    /**
      * Specifies the number of days after creation that a recovery point is moved to cold storage.
      */
    var coldStorageAfter: js.UndefOr[Double] = js.undefined
    
    /**
      * Specifies the number of days after creation that a recovery point is deleted. Must be 90 days greater than `coldStorageAfter`.
      */
    var deleteAfter: js.UndefOr[Double] = js.undefined
  }
  object PlanRuleCopyActionLifecycle {
    
    inline def apply(): PlanRuleCopyActionLifecycle = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PlanRuleCopyActionLifecycle]
    }
    
    extension [Self <: PlanRuleCopyActionLifecycle](x: Self) {
      
      inline def setColdStorageAfter(value: Double): Self = StObject.set(x, "coldStorageAfter", value.asInstanceOf[js.Any])
      
      inline def setColdStorageAfterUndefined: Self = StObject.set(x, "coldStorageAfter", js.undefined)
      
      inline def setDeleteAfter(value: Double): Self = StObject.set(x, "deleteAfter", value.asInstanceOf[js.Any])
      
      inline def setDeleteAfterUndefined: Self = StObject.set(x, "deleteAfter", js.undefined)
    }
  }
  
  trait PlanRuleLifecycle extends StObject {
    
    /**
      * Specifies the number of days after creation that a recovery point is moved to cold storage.
      */
    var coldStorageAfter: js.UndefOr[Double] = js.undefined
    
    /**
      * Specifies the number of days after creation that a recovery point is deleted. Must be 90 days greater than `coldStorageAfter`.
      */
    var deleteAfter: js.UndefOr[Double] = js.undefined
  }
  object PlanRuleLifecycle {
    
    inline def apply(): PlanRuleLifecycle = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PlanRuleLifecycle]
    }
    
    extension [Self <: PlanRuleLifecycle](x: Self) {
      
      inline def setColdStorageAfter(value: Double): Self = StObject.set(x, "coldStorageAfter", value.asInstanceOf[js.Any])
      
      inline def setColdStorageAfterUndefined: Self = StObject.set(x, "coldStorageAfter", js.undefined)
      
      inline def setDeleteAfter(value: Double): Self = StObject.set(x, "deleteAfter", value.asInstanceOf[js.Any])
      
      inline def setDeleteAfterUndefined: Self = StObject.set(x, "deleteAfter", js.undefined)
    }
  }
  
  trait SelectionSelectionTag extends StObject {
    
    /**
      * The key in a key-value pair.
      */
    var key: String
    
    /**
      * An operation, such as `StringEquals`, that is applied to a key-value pair used to filter resources in a selection.
      */
    var `type`: String
    
    /**
      * The value in a key-value pair.
      */
    var value: String
  }
  object SelectionSelectionTag {
    
    inline def apply(key: String, `type`: String, value: String): SelectionSelectionTag = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectionSelectionTag]
    }
    
    extension [Self <: SelectionSelectionTag](x: Self) {
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
