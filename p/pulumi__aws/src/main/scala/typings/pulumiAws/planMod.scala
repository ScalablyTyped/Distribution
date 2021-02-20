package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.backup.PlanAdvancedBackupSetting
import typings.pulumiAws.outputMod.backup.PlanRule
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object planMod {
  
  @JSImport("@pulumi/aws/backup/plan", "Plan")
  @js.native
  class Plan protected () extends CustomResource {
    /**
      * Create a Plan resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: PlanArgs) = this()
    def this(name: String, args: PlanArgs, opts: CustomResourceOptions) = this()
    
    /**
      * An object that specifies backup options for each resource type.
      */
    val advancedBackupSettings: Output_[js.UndefOr[js.Array[PlanAdvancedBackupSetting]]] = js.native
    
    /**
      * The ARN of the backup plan.
      */
    val arn: Output_[String] = js.native
    
    /**
      * The display name of a backup plan.
      */
    val name: Output_[String] = js.native
    
    /**
      * A rule object that specifies a scheduled task that is used to back up a selection of resources.
      */
    val rules: Output_[js.Array[PlanRule]] = js.native
    
    /**
      * Metadata that you can assign to help organize the plans you create.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    /**
      * Unique, randomly generated, Unicode, UTF-8 encoded string that serves as the version ID of the backup plan.
      */
    val version: Output_[String] = js.native
  }
  /* static members */
  object Plan {
    
    /**
      * Get an existing Plan resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/backup/plan", "Plan.get")
    @js.native
    def get(name: String, id: Input[ID]): Plan = js.native
    @JSImport("@pulumi/aws/backup/plan", "Plan.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): Plan = js.native
    @JSImport("@pulumi/aws/backup/plan", "Plan.get")
    @js.native
    def get(name: String, id: Input[ID], state: PlanState): Plan = js.native
    @JSImport("@pulumi/aws/backup/plan", "Plan.get")
    @js.native
    def get(name: String, id: Input[ID], state: PlanState, opts: CustomResourceOptions): Plan = js.native
    
    /**
      * Returns true if the given object is an instance of Plan.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/backup/plan", "Plan.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/backup/plan.Plan */ Boolean = js.native
  }
  
  @js.native
  trait PlanArgs extends StObject {
    
    /**
      * An object that specifies backup options for each resource type.
      */
    val advancedBackupSettings: js.UndefOr[
        Input[js.Array[Input[typings.pulumiAws.inputMod.backup.PlanAdvancedBackupSetting]]]
      ] = js.native
    
    /**
      * The display name of a backup plan.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * A rule object that specifies a scheduled task that is used to back up a selection of resources.
      */
    val rules: Input[js.Array[Input[typings.pulumiAws.inputMod.backup.PlanRule]]] = js.native
    
    /**
      * Metadata that you can assign to help organize the plans you create.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  }
  object PlanArgs {
    
    @scala.inline
    def apply(rules: Input[js.Array[Input[typings.pulumiAws.inputMod.backup.PlanRule]]]): PlanArgs = {
      val __obj = js.Dynamic.literal(rules = rules.asInstanceOf[js.Any])
      __obj.asInstanceOf[PlanArgs]
    }
    
    @scala.inline
    implicit class PlanArgsMutableBuilder[Self <: PlanArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdvancedBackupSettings(value: Input[js.Array[Input[typings.pulumiAws.inputMod.backup.PlanAdvancedBackupSetting]]]): Self = StObject.set(x, "advancedBackupSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdvancedBackupSettingsUndefined: Self = StObject.set(x, "advancedBackupSettings", js.undefined)
      
      @scala.inline
      def setAdvancedBackupSettingsVarargs(value: Input[typings.pulumiAws.inputMod.backup.PlanAdvancedBackupSetting]*): Self = StObject.set(x, "advancedBackupSettings", js.Array(value :_*))
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setRules(value: Input[js.Array[Input[typings.pulumiAws.inputMod.backup.PlanRule]]]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRulesVarargs(value: Input[typings.pulumiAws.inputMod.backup.PlanRule]*): Self = StObject.set(x, "rules", js.Array(value :_*))
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  @js.native
  trait PlanState extends StObject {
    
    /**
      * An object that specifies backup options for each resource type.
      */
    val advancedBackupSettings: js.UndefOr[
        Input[js.Array[Input[typings.pulumiAws.inputMod.backup.PlanAdvancedBackupSetting]]]
      ] = js.native
    
    /**
      * The ARN of the backup plan.
      */
    val arn: js.UndefOr[Input[String]] = js.native
    
    /**
      * The display name of a backup plan.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * A rule object that specifies a scheduled task that is used to back up a selection of resources.
      */
    val rules: js.UndefOr[Input[js.Array[Input[typings.pulumiAws.inputMod.backup.PlanRule]]]] = js.native
    
    /**
      * Metadata that you can assign to help organize the plans you create.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
    
    /**
      * Unique, randomly generated, Unicode, UTF-8 encoded string that serves as the version ID of the backup plan.
      */
    val version: js.UndefOr[Input[String]] = js.native
  }
  object PlanState {
    
    @scala.inline
    def apply(): PlanState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PlanState]
    }
    
    @scala.inline
    implicit class PlanStateMutableBuilder[Self <: PlanState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdvancedBackupSettings(value: Input[js.Array[Input[typings.pulumiAws.inputMod.backup.PlanAdvancedBackupSetting]]]): Self = StObject.set(x, "advancedBackupSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdvancedBackupSettingsUndefined: Self = StObject.set(x, "advancedBackupSettings", js.undefined)
      
      @scala.inline
      def setAdvancedBackupSettingsVarargs(value: Input[typings.pulumiAws.inputMod.backup.PlanAdvancedBackupSetting]*): Self = StObject.set(x, "advancedBackupSettings", js.Array(value :_*))
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setRules(value: Input[js.Array[Input[typings.pulumiAws.inputMod.backup.PlanRule]]]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
      
      @scala.inline
      def setRulesVarargs(value: Input[typings.pulumiAws.inputMod.backup.PlanRule]*): Self = StObject.set(x, "rules", js.Array(value :_*))
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setVersion(value: Input[String]): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
}
