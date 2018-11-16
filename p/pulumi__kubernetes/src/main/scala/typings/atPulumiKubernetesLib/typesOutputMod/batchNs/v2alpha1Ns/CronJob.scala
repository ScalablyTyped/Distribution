package typings
package atPulumiKubernetesLib.typesOutputMod.batchNs.v2alpha1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         * CronJob represents the configuration of a single cron job.
         */

trait CronJob extends js.Object {
  /**
               * APIVersion defines the versioned schema of this representation of an object. Servers should
               * convert recognized schemas to the latest internal value, and may reject unrecognized
               * values. More info:
               * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
               */
  val apiVersion: java.lang.String
  /**
               * Kind is a string value representing the REST resource this object represents. Servers may
               * infer this from the endpoint the client submits requests to. Cannot be updated. In
               * CamelCase. More info:
               * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
               */
  val kind: java.lang.String
  /**
               * Standard object's metadata. More info:
               * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
               */
  val metadata: atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta
  /**
               * Specification of the desired behavior of a cron job, including the schedule. More info:
               * https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status
               */
  val spec: CronJobSpec
  /**
               * Current status of a cron job. More info:
               * https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status
               */
  val status: CronJobStatus
}

