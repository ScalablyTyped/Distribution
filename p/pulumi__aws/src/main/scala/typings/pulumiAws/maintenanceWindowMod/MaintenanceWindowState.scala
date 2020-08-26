package typings.pulumiAws.maintenanceWindowMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MaintenanceWindowState extends js.Object {
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
  implicit class MaintenanceWindowStateOps[Self <: MaintenanceWindowState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAllowUnassociatedTargets(value: Input[Boolean]): Self = this.set("allowUnassociatedTargets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowUnassociatedTargets: Self = this.set("allowUnassociatedTargets", js.undefined)
    @scala.inline
    def setCutoff(value: Input[Double]): Self = this.set("cutoff", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCutoff: Self = this.set("cutoff", js.undefined)
    @scala.inline
    def setDescription(value: Input[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setDuration(value: Input[Double]): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    @scala.inline
    def setEnabled(value: Input[Boolean]): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    @scala.inline
    def setEndDate(value: Input[String]): Self = this.set("endDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndDate: Self = this.set("endDate", js.undefined)
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setSchedule(value: Input[String]): Self = this.set("schedule", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSchedule: Self = this.set("schedule", js.undefined)
    @scala.inline
    def setScheduleTimezone(value: Input[String]): Self = this.set("scheduleTimezone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScheduleTimezone: Self = this.set("scheduleTimezone", js.undefined)
    @scala.inline
    def setStartDate(value: Input[String]): Self = this.set("startDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartDate: Self = this.set("startDate", js.undefined)
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
  
}

