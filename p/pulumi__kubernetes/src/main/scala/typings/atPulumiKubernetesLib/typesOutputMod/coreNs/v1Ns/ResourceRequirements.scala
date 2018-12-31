package typings
package atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ResourceRequirements describes the compute resource requirements.
  */
trait ResourceRequirements extends js.Object {
  /**
    * Limits describes the maximum amount of compute resources allowed. More info:
    * https://kubernetes.io/docs/concepts/configuration/manage-compute-resources-container/
    */
  val limits: js.Object
  /**
    * Requests describes the minimum amount of compute resources required. If Requests is omitted
    * for a container, it defaults to Limits if that is explicitly specified, otherwise to an
    * implementation-defined value. More info:
    * https://kubernetes.io/docs/concepts/configuration/manage-compute-resources-container/
    */
  val requests: js.Object
}

