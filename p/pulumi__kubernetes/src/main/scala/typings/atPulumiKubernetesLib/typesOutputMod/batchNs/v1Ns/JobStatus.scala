package typings
package atPulumiKubernetesLib.typesOutputMod.batchNs.v1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         * JobStatus represents the current state of a Job.
         */

trait JobStatus extends js.Object {
  /**
               * The number of actively running pods.
               */
  val active: scala.Double
  /**
               * Represents time when the job was completed. It is not guaranteed to be set in
               * happens-before order across separate operations. It is represented in RFC3339 form and is
               * in UTC.
               */
  val completionTime: java.lang.String
  /**
               * The latest available observations of an object's current state. More info:
               * https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/
               */
  val conditions: js.Array[JobCondition]
  /**
               * The number of pods which reached phase Failed.
               */
  val failed: scala.Double
  /**
               * Represents time when the job was acknowledged by the job controller. It is not guaranteed
               * to be set in happens-before order across separate operations. It is represented in RFC3339
               * form and is in UTC.
               */
  val startTime: java.lang.String
  /**
               * The number of pods which reached phase Succeeded.
               */
  val succeeded: scala.Double
}

