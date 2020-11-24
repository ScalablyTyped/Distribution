package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Node affinity is a group of node affinity scheduling rules.
  */
@js.native
trait NodeAffinity extends js.Object {
  
  /**
    * The scheduler will prefer to schedule pods to nodes that satisfy the affinity expressions specified by this field, but it may choose a node that violates one or more of the expressions. The node that is most preferred is the one with the greatest sum of weights, i.e. for each node that meets all of the scheduling requirements (resource request, requiredDuringScheduling affinity expressions, etc.), compute a sum by iterating through the elements of this field and adding "weight" to the sum if the node matches the corresponding matchExpressions; the node(s) with the highest sum are the most preferred.
    */
  var preferredDuringSchedulingIgnoredDuringExecution: js.UndefOr[Input[js.Array[Input[PreferredSchedulingTerm]]]] = js.native
  
  /**
    * If the affinity requirements specified by this field are not met at scheduling time, the pod will not be scheduled onto the node. If the affinity requirements specified by this field cease to be met at some point during pod execution (e.g. due to an update), the system may or may not try to eventually evict the pod from its node.
    */
  var requiredDuringSchedulingIgnoredDuringExecution: js.UndefOr[Input[NodeSelector]] = js.native
}
object NodeAffinity {
  
  @scala.inline
  def apply(): NodeAffinity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeAffinity]
  }
  
  @scala.inline
  implicit class NodeAffinityOps[Self <: NodeAffinity] (val x: Self) extends AnyVal {
    
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
    def setPreferredDuringSchedulingIgnoredDuringExecutionVarargs(value: Input[PreferredSchedulingTerm]*): Self = this.set("preferredDuringSchedulingIgnoredDuringExecution", js.Array(value :_*))
    
    @scala.inline
    def setPreferredDuringSchedulingIgnoredDuringExecution(value: Input[js.Array[Input[PreferredSchedulingTerm]]]): Self = this.set("preferredDuringSchedulingIgnoredDuringExecution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreferredDuringSchedulingIgnoredDuringExecution: Self = this.set("preferredDuringSchedulingIgnoredDuringExecution", js.undefined)
    
    @scala.inline
    def setRequiredDuringSchedulingIgnoredDuringExecution(value: Input[NodeSelector]): Self = this.set("requiredDuringSchedulingIgnoredDuringExecution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequiredDuringSchedulingIgnoredDuringExecution: Self = this.set("requiredDuringSchedulingIgnoredDuringExecution", js.undefined)
  }
}
