package typings.pulumiKubernetes.outputMod.batch.v2alpha1

import typings.pulumiKubernetes.outputMod.core.v1.ObjectReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * CronJobStatus represents the current state of a cron job.
  */
@js.native
trait CronJobStatus extends js.Object {
  /**
    * A list of pointers to currently running jobs.
    */
  var active: js.Array[ObjectReference] = js.native
  /**
    * Information when was the last time the job was successfully scheduled.
    */
  var lastScheduleTime: String = js.native
}

object CronJobStatus {
  @scala.inline
  def apply(active: js.Array[ObjectReference], lastScheduleTime: String): CronJobStatus = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], lastScheduleTime = lastScheduleTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[CronJobStatus]
  }
  @scala.inline
  implicit class CronJobStatusOps[Self <: CronJobStatus] (val x: Self) extends AnyVal {
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
    def setActiveVarargs(value: ObjectReference*): Self = this.set("active", js.Array(value :_*))
    @scala.inline
    def setActive(value: js.Array[ObjectReference]): Self = this.set("active", value.asInstanceOf[js.Any])
    @scala.inline
    def setLastScheduleTime(value: String): Self = this.set("lastScheduleTime", value.asInstanceOf[js.Any])
  }
  
}

