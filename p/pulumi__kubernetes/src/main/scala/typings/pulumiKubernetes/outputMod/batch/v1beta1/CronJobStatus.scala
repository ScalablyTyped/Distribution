package typings.pulumiKubernetes.outputMod.batch.v1beta1

import typings.pulumiKubernetes.outputMod.core.v1.ObjectReference
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
  val active: js.Array[ObjectReference]
  /**
    * Information when was the last time the job was successfully scheduled.
    */
  val lastScheduleTime: String
}

object CronJobStatus {
  @scala.inline
  def apply(active: js.Array[ObjectReference], lastScheduleTime: String): CronJobStatus = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], lastScheduleTime = lastScheduleTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[CronJobStatus]
  }
}

