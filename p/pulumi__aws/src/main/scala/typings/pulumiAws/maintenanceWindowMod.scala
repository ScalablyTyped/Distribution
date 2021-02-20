package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object maintenanceWindowMod {
  
  @JSImport("@pulumi/aws/ssm/maintenanceWindow", "MaintenanceWindow")
  @js.native
  class MaintenanceWindow protected () extends CustomResource {
    /**
      * Create a MaintenanceWindow resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: MaintenanceWindowArgs) = this()
    def this(name: String, args: MaintenanceWindowArgs, opts: CustomResourceOptions) = this()
    
    /**
      * Whether targets must be registered with the Maintenance Window before tasks can be defined for those targets.
      */
    val allowUnassociatedTargets: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * The number of hours before the end of the Maintenance Window that Systems Manager stops scheduling new tasks for execution.
      */
    val cutoff: Output_[Double] = js.native
    
    /**
      * A description for the maintenance window.
      */
    val description: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The duration of the Maintenance Window in hours.
      */
    val duration: Output_[Double] = js.native
    
    /**
      * Whether the maintenance window is enabled. Default: `true`.
      */
    val enabled: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * Timestamp in [ISO-8601 extended format](https://www.iso.org/iso-8601-date-and-time-format.html) when to no longer run the maintenance window.
      */
    val endDate: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The name of the maintenance window.
      */
    val name: Output_[String] = js.native
    
    /**
      * The schedule of the Maintenance Window in the form of a [cron](https://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-maintenance-cron.html) or rate expression.
      */
    val schedule: Output_[String] = js.native
    
    /**
      * Timezone for schedule in [Internet Assigned Numbers Authority (IANA) Time Zone Database format](https://www.iana.org/time-zones). For example: `America/Los_Angeles`, `etc/UTC`, or `Asia/Seoul`.
      */
    val scheduleTimezone: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Timestamp in [ISO-8601 extended format](https://www.iso.org/iso-8601-date-and-time-format.html) when to begin the maintenance window.
      */
    val startDate: Output_[js.UndefOr[String]] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  }
  /* static members */
  object MaintenanceWindow {
    
    /**
      * Get an existing MaintenanceWindow resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/ssm/maintenanceWindow", "MaintenanceWindow.get")
    @js.native
    def get(name: String, id: Input[ID]): MaintenanceWindow = js.native
    @JSImport("@pulumi/aws/ssm/maintenanceWindow", "MaintenanceWindow.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): MaintenanceWindow = js.native
    @JSImport("@pulumi/aws/ssm/maintenanceWindow", "MaintenanceWindow.get")
    @js.native
    def get(name: String, id: Input[ID], state: MaintenanceWindowState): MaintenanceWindow = js.native
    @JSImport("@pulumi/aws/ssm/maintenanceWindow", "MaintenanceWindow.get")
    @js.native
    def get(name: String, id: Input[ID], state: MaintenanceWindowState, opts: CustomResourceOptions): MaintenanceWindow = js.native
    
    /**
      * Returns true if the given object is an instance of MaintenanceWindow.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/ssm/maintenanceWindow", "MaintenanceWindow.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ssm/maintenanceWindow.MaintenanceWindow */ Boolean = js.native
  }
  
  @js.native
  trait MaintenanceWindowArgs extends StObject {
    
    /**
      * Whether targets must be registered with the Maintenance Window before tasks can be defined for those targets.
      */
    val allowUnassociatedTargets: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * The number of hours before the end of the Maintenance Window that Systems Manager stops scheduling new tasks for execution.
      */
    val cutoff: Input[Double] = js.native
    
    /**
      * A description for the maintenance window.
      */
    val description: js.UndefOr[Input[String]] = js.native
    
    /**
      * The duration of the Maintenance Window in hours.
      */
    val duration: Input[Double] = js.native
    
    /**
      * Whether the maintenance window is enabled. Default: `true`.
      */
    val enabled: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * Timestamp in [ISO-8601 extended format](https://www.iso.org/iso-8601-date-and-time-format.html) when to no longer run the maintenance window.
      */
    val endDate: js.UndefOr[Input[String]] = js.native
    
    /**
      * The name of the maintenance window.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * The schedule of the Maintenance Window in the form of a [cron](https://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-maintenance-cron.html) or rate expression.
      */
    val schedule: Input[String] = js.native
    
    /**
      * Timezone for schedule in [Internet Assigned Numbers Authority (IANA) Time Zone Database format](https://www.iana.org/time-zones). For example: `America/Los_Angeles`, `etc/UTC`, or `Asia/Seoul`.
      */
    val scheduleTimezone: js.UndefOr[Input[String]] = js.native
    
    /**
      * Timestamp in [ISO-8601 extended format](https://www.iso.org/iso-8601-date-and-time-format.html) when to begin the maintenance window.
      */
    val startDate: js.UndefOr[Input[String]] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  }
  object MaintenanceWindowArgs {
    
    @scala.inline
    def apply(cutoff: Input[Double], duration: Input[Double], schedule: Input[String]): MaintenanceWindowArgs = {
      val __obj = js.Dynamic.literal(cutoff = cutoff.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], schedule = schedule.asInstanceOf[js.Any])
      __obj.asInstanceOf[MaintenanceWindowArgs]
    }
    
    @scala.inline
    implicit class MaintenanceWindowArgsMutableBuilder[Self <: MaintenanceWindowArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowUnassociatedTargets(value: Input[Boolean]): Self = StObject.set(x, "allowUnassociatedTargets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowUnassociatedTargetsUndefined: Self = StObject.set(x, "allowUnassociatedTargets", js.undefined)
      
      @scala.inline
      def setCutoff(value: Input[Double]): Self = StObject.set(x, "cutoff", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setDuration(value: Input[Double]): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabled(value: Input[Boolean]): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      @scala.inline
      def setEndDate(value: Input[String]): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setSchedule(value: Input[String]): Self = StObject.set(x, "schedule", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScheduleTimezone(value: Input[String]): Self = StObject.set(x, "scheduleTimezone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScheduleTimezoneUndefined: Self = StObject.set(x, "scheduleTimezone", js.undefined)
      
      @scala.inline
      def setStartDate(value: Input[String]): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  @js.native
  trait MaintenanceWindowState extends StObject {
    
    /**
      * Whether targets must be registered with the Maintenance Window before tasks can be defined for those targets.
      */
    val allowUnassociatedTargets: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * The number of hours before the end of the Maintenance Window that Systems Manager stops scheduling new tasks for execution.
      */
    val cutoff: js.UndefOr[Input[Double]] = js.native
    
    /**
      * A description for the maintenance window.
      */
    val description: js.UndefOr[Input[String]] = js.native
    
    /**
      * The duration of the Maintenance Window in hours.
      */
    val duration: js.UndefOr[Input[Double]] = js.native
    
    /**
      * Whether the maintenance window is enabled. Default: `true`.
      */
    val enabled: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * Timestamp in [ISO-8601 extended format](https://www.iso.org/iso-8601-date-and-time-format.html) when to no longer run the maintenance window.
      */
    val endDate: js.UndefOr[Input[String]] = js.native
    
    /**
      * The name of the maintenance window.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * The schedule of the Maintenance Window in the form of a [cron](https://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-maintenance-cron.html) or rate expression.
      */
    val schedule: js.UndefOr[Input[String]] = js.native
    
    /**
      * Timezone for schedule in [Internet Assigned Numbers Authority (IANA) Time Zone Database format](https://www.iana.org/time-zones). For example: `America/Los_Angeles`, `etc/UTC`, or `Asia/Seoul`.
      */
    val scheduleTimezone: js.UndefOr[Input[String]] = js.native
    
    /**
      * Timestamp in [ISO-8601 extended format](https://www.iso.org/iso-8601-date-and-time-format.html) when to begin the maintenance window.
      */
    val startDate: js.UndefOr[Input[String]] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  }
  object MaintenanceWindowState {
    
    @scala.inline
    def apply(): MaintenanceWindowState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MaintenanceWindowState]
    }
    
    @scala.inline
    implicit class MaintenanceWindowStateMutableBuilder[Self <: MaintenanceWindowState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowUnassociatedTargets(value: Input[Boolean]): Self = StObject.set(x, "allowUnassociatedTargets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowUnassociatedTargetsUndefined: Self = StObject.set(x, "allowUnassociatedTargets", js.undefined)
      
      @scala.inline
      def setCutoff(value: Input[Double]): Self = StObject.set(x, "cutoff", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCutoffUndefined: Self = StObject.set(x, "cutoff", js.undefined)
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setDuration(value: Input[Double]): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      @scala.inline
      def setEnabled(value: Input[Boolean]): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      @scala.inline
      def setEndDate(value: Input[String]): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setSchedule(value: Input[String]): Self = StObject.set(x, "schedule", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScheduleTimezone(value: Input[String]): Self = StObject.set(x, "scheduleTimezone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScheduleTimezoneUndefined: Self = StObject.set(x, "scheduleTimezone", js.undefined)
      
      @scala.inline
      def setScheduleUndefined: Self = StObject.set(x, "schedule", js.undefined)
      
      @scala.inline
      def setStartDate(value: Input[String]): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
}
