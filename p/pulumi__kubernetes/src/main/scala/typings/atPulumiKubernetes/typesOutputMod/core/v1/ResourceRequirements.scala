package typings.atPulumiKubernetes.typesOutputMod.core.v1

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

object ResourceRequirements {
  @scala.inline
  def apply(limits: js.Object, requests: js.Object): ResourceRequirements = {
    val __obj = js.Dynamic.literal(limits = limits.asInstanceOf[js.Any], requests = requests.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ResourceRequirements]
  }
}

