package typings.atPulumiKubernetes.typesOutputMod.core.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ResourceQuotaStatus defines the enforced hard limits and observed use.
  */
trait ResourceQuotaStatus extends js.Object {
  /**
    * Hard is the set of enforced hard limits for each named resource. More info:
    * https://kubernetes.io/docs/concepts/policy/resource-quotas/
    */
  val hard: js.Object
  /**
    * Used is the current observed total usage of the resource in the namespace.
    */
  val used: js.Object
}

object ResourceQuotaStatus {
  @scala.inline
  def apply(hard: js.Object, used: js.Object): ResourceQuotaStatus = {
    val __obj = js.Dynamic.literal(hard = hard, used = used)
  
    __obj.asInstanceOf[ResourceQuotaStatus]
  }
}

