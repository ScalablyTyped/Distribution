package typings
package atPulumiKubernetesLib.typesOutputMod.batchNs.v1beta1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         * JobTemplateSpec describes the data a Job should have when created from a template
         */

trait JobTemplateSpec extends js.Object {
  /**
               * Standard object's metadata of the jobs created from this template. More info:
               * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
               */
  val metadata: atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta
  /**
               * Specification of the desired behavior of the job. More info:
               * https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status
               */
  val spec: atPulumiKubernetesLib.typesOutputMod.batchNs.v1Ns.JobSpec
}

