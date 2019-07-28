package typings.atPulumiKubernetes.typesOutputMod.batchNs.v2alpha1Ns

import typings.atPulumiKubernetes.typesOutputMod.coreNs.v1Ns.ObjectReference
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
    val __obj = js.Dynamic.literal(active = active, lastScheduleTime = lastScheduleTime)
  
    __obj.asInstanceOf[CronJobStatus]
  }
}

