package typings
package atPulumiKubernetesLib.typesOutputMod.batchNs.v2alpha1Ns

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
  val active: js.Array[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.ObjectReference]
  /**
    * Information when was the last time the job was successfully scheduled.
    */
  val lastScheduleTime: java.lang.String
}

object CronJobStatus {
  @scala.inline
  def apply(
    active: js.Array[atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.ObjectReference],
    lastScheduleTime: java.lang.String
  ): CronJobStatus = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("active")(active)
    __obj.updateDynamic("lastScheduleTime")(lastScheduleTime)
    __obj.asInstanceOf[CronJobStatus]
  }
}

