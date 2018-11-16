package typings
package atPulumiKubernetesLib.typesOutputMod.batchNs.v1beta1Ns

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

