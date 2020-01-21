package typings.pulumiKubernetes.inputMod.rbac.v1alpha1

import typings.pulumiKubernetes.inputMod.meta.v1.LabelSelector
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * AggregationRule describes how to locate ClusterRoles to aggregate into the ClusterRole
  */
trait AggregationRule extends js.Object {
  /**
    * ClusterRoleSelectors holds a list of selectors which will be used to find ClusterRoles and
    * create the rules. If any of the selectors match, then the ClusterRole's permissions will be
    * added
    */
  var clusterRoleSelectors: js.UndefOr[Input[js.Array[Input[LabelSelector]]]] = js.undefined
}

object AggregationRule {
  @scala.inline
  def apply(clusterRoleSelectors: Input[js.Array[Input[LabelSelector]]] = null): AggregationRule = {
    val __obj = js.Dynamic.literal()
    if (clusterRoleSelectors != null) __obj.updateDynamic("clusterRoleSelectors")(clusterRoleSelectors.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregationRule]
  }
}

