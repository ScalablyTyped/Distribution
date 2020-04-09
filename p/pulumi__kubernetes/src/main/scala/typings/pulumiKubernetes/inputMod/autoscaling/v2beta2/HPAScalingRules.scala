package typings.pulumiKubernetes.inputMod.autoscaling.v2beta2

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * HPAScalingRules configures the scaling behavior for one direction. These Rules are applied
  * after calculating DesiredReplicas from metrics for the HPA. They can limit the scaling
  * velocity by specifying scaling policies. They can prevent flapping by specifying the
  * stabilization window, so that the number of replicas is not set instantly, instead, the
  * safest value from the stabilization window is chosen.
  */
trait HPAScalingRules extends js.Object {
  /**
    * policies is a list of potential scaling polices which can be used during scaling. At least
    * one policy must be specified, otherwise the HPAScalingRules will be discarded as invalid
    */
  var policies: js.UndefOr[Input[js.Array[Input[HPAScalingPolicy]]]] = js.undefined
  /**
    * selectPolicy is used to specify which policy should be used. If not set, the default value
    * MaxPolicySelect is used.
    */
  var selectPolicy: js.UndefOr[Input[String]] = js.undefined
  /**
    * StabilizationWindowSeconds is the number of seconds for which past recommendations should
    * be considered while scaling up or scaling down. StabilizationWindowSeconds must be greater
    * than or equal to zero and less than or equal to 3600 (one hour). If not set, use the
    * default values: - For scale up: 0 (i.e. no stabilization is done). - For scale down: 300
    * (i.e. the stabilization window is 300 seconds long).
    */
  var stabilizationWindowSeconds: js.UndefOr[Input[Double]] = js.undefined
}

object HPAScalingRules {
  @scala.inline
  def apply(
    policies: Input[js.Array[Input[HPAScalingPolicy]]] = null,
    selectPolicy: Input[String] = null,
    stabilizationWindowSeconds: Input[Double] = null
  ): HPAScalingRules = {
    val __obj = js.Dynamic.literal()
    if (policies != null) __obj.updateDynamic("policies")(policies.asInstanceOf[js.Any])
    if (selectPolicy != null) __obj.updateDynamic("selectPolicy")(selectPolicy.asInstanceOf[js.Any])
    if (stabilizationWindowSeconds != null) __obj.updateDynamic("stabilizationWindowSeconds")(stabilizationWindowSeconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[HPAScalingRules]
  }
}

