package typings.atPulumiKubernetes.typesInputMod.core.v1

import typings.atPulumiPulumi.outputMod.Input
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
  var limits: js.UndefOr[Input[js.Object]] = js.undefined
  /**
    * Requests describes the minimum amount of compute resources required. If Requests is omitted
    * for a container, it defaults to Limits if that is explicitly specified, otherwise to an
    * implementation-defined value. More info:
    * https://kubernetes.io/docs/concepts/configuration/manage-compute-resources-container/
    */
  var requests: js.UndefOr[Input[js.Object]] = js.undefined
}

object ResourceRequirements {
  @scala.inline
  def apply(limits: Input[js.Object] = null, requests: Input[js.Object] = null): ResourceRequirements = {
    val __obj = js.Dynamic.literal()
    if (limits != null) __obj.updateDynamic("limits")(limits.asInstanceOf[js.Any])
    if (requests != null) __obj.updateDynamic("requests")(requests.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceRequirements]
  }
}

