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
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
}

object MaintenanceWindowState {
  @scala.inline
  def apply(
    allowUnassociatedTargets: Input[Boolean] = null,
    cutoff: Input[Double] = null,
    duration: Input[Double] = null,
    enabled: Input[Boolean] = null,
    endDate: Input[String] = null,
    name: Input[String] = null,
    schedule: Input[String] = null,
    scheduleTimezone: Input[String] = null,
    startDate: Input[String] = null,
    tags: Input[StringDictionary[_]] = null
  ): MaintenanceWindowState = {
    val __obj = js.Dynamic.literal()
    if (allowUnassociatedTargets != null) __obj.updateDynamic("allowUnassociatedTargets")(allowUnassociatedTargets.asInstanceOf[js.Any])
    if (cutoff != null) __obj.updateDynamic("cutoff")(cutoff.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (enabled != null) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (endDate != null) __obj.updateDynamic("endDate")(endDate.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (schedule != null) __obj.updateDynamic("schedule")(schedule.asInstanceOf[js.Any])
    if (scheduleTimezone != null) __obj.updateDynamic("scheduleTimezone")(scheduleTimezone.asInstanceOf[js.Any])
    if (startDate != null) __obj.updateDynamic("startDate")(startDate.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaintenanceWindowState]
  }
}

