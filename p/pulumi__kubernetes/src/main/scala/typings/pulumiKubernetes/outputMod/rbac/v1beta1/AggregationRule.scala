package typings.pulumiKubernetes.outputMod.rbac.v1beta1

import typings.pulumiKubernetes.outputMod.meta.v1.LabelSelector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * AggregationRule describes how to locate ClusterRoles to aggregate into the ClusterRole
  */
@js.native
trait AggregationRule extends js.Object {
  /**
    * ClusterRoleSelectors holds a list of selectors which will be used to find ClusterRoles and create the rules. If any of the selectors match, then the ClusterRole's permissions will be added
    */
  var clusterRoleSelectors: js.Array[LabelSelector] = js.native
}

object AggregationRule {
  @scala.inline
  def apply(clusterRoleSelectors: js.Array[LabelSelector]): AggregationRule = {
    val __obj = js.Dynamic.literal(clusterRoleSelectors = clusterRoleSelectors.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregationRule]
  }
  @scala.inline
  implicit class AggregationRuleOps[Self <: AggregationRule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setClusterRoleSelectorsVarargs(value: LabelSelector*): Self = this.set("clusterRoleSelectors", js.Array(value :_*))
    @scala.inline
    def setClusterRoleSelectors(value: js.Array[LabelSelector]): Self = this.set("clusterRoleSelectors", value.asInstanceOf[js.Any])
  }
  
}

