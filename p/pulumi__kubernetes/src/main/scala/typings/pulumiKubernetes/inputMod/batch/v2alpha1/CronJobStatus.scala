package typings.pulumiKubernetes.inputMod.batch.v2alpha1

import typings.pulumiKubernetes.inputMod.core.v1.ObjectReference
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * CronJobStatus represents the current state of a cron job.
  */
trait CronJobStatus extends js.Object {
  /**
    * A list of pointers to currently running jobs.
    */
  var active: js.UndefOr[Input[js.Array[Input[ObjectReference]]]] = js.undefined
  /**
    * Information when was the last time the job was successfully scheduled.
    */
  var lastScheduleTime: js.UndefOr[Input[String]] = js.undefined
}

object CronJobStatus {
  @scala.inline
  def apply(active: Input[js.Array[Input[ObjectReference]]] = null, lastScheduleTime: Input[String] = null): CronJobStatus = {
    val __obj = js.Dynamic.literal()
    if (active != null) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (lastScheduleTime != null) __obj.updateDynamic("lastScheduleTime")(lastScheduleTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[CronJobStatus]
  }
}

