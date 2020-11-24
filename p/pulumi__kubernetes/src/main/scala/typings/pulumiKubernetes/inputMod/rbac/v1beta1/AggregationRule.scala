package typings.pulumiKubernetes.inputMod.rbac.v1beta1

import typings.pulumiKubernetes.inputMod.meta.v1.LabelSelector
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * AggregationRule describes how to locate ClusterRoles to aggregate into the ClusterRole
  */
@js.native
trait AggregationRule extends js.Object {
  
  /**
    * ClusterRoleSelectors holds a list of selectors which will be used to find ClusterRoles and create the rules. If any of the selectors match, then the ClusterRole's permissions will be added
    */
  var clusterRoleSelectors: js.UndefOr[Input[js.Array[Input[LabelSelector]]]] = js.native
}
object AggregationRule {
  
  @scala.inline
  def apply(): AggregationRule = {
    val __obj = js.Dynamic.literal()
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
    def setClusterRoleSelectorsVarargs(value: Input[LabelSelector]*): Self = this.set("clusterRoleSelectors", js.Array(value :_*))
    
    @scala.inline
    def setClusterRoleSelectors(value: Input[js.Array[Input[LabelSelector]]]): Self = this.set("clusterRoleSelectors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClusterRoleSelectors: Self = this.set("clusterRoleSelectors", js.undefined)
  }
}
