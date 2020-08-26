package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Pod anti affinity is a group of inter pod anti affinity scheduling rules.
  */
@js.native
trait PodAntiAffinity extends js.Object {
  /**
    * The scheduler will prefer to schedule pods to nodes that satisfy the anti-affinity expressions specified by this field, but it may choose a node that violates one or more of the expressions. The node that is most preferred is the one with the greatest sum of weights, i.e. for each node that meets all of the scheduling requirements (resource request, requiredDuringScheduling anti-affinity expressions, etc.), compute a sum by iterating through the elements of this field and adding "weight" to the sum if the node has pods which matches the corresponding podAffinityTerm; the node(s) with the highest sum are the most preferred.
    */
  var preferredDuringSchedulingIgnoredDuringExecution: js.UndefOr[Input[js.Array[Input[WeightedPodAffinityTerm]]]] = js.native
  /**
    * If the anti-affinity requirements specified by this field are not met at scheduling time, the pod will not be scheduled onto the node. If the anti-affinity requirements specified by this field cease to be met at some point during pod execution (e.g. due to a pod label update), the system may or may not try to eventually evict the pod from its node. When there are multiple elements, the lists of nodes corresponding to each podAffinityTerm are intersected, i.e. all terms must be satisfied.
    */
  var requiredDuringSchedulingIgnoredDuringExecution: js.UndefOr[Input[js.Array[Input[PodAffinityTerm]]]] = js.native
}

object PodAntiAffinity {
  @scala.inline
  def apply(): PodAntiAffinity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PodAntiAffinity]
  }
  @scala.inline
  implicit class PodAntiAffinityOps[Self <: PodAntiAffinity] (val x: Self) extends AnyVal {
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
    def setPreferredDuringSchedulingIgnoredDuringExecutionVarargs(value: Input[WeightedPodAffinityTerm]*): Self = this.set("preferredDuringSchedulingIgnoredDuringExecution", js.Array(value :_*))
    @scala.inline
    def setPreferredDuringSchedulingIgnoredDuringExecution(value: Input[js.Array[Input[WeightedPodAffinityTerm]]]): Self = this.set("preferredDuringSchedulingIgnoredDuringExecution", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreferredDuringSchedulingIgnoredDuringExecution: Self = this.set("preferredDuringSchedulingIgnoredDuringExecution", js.undefined)
    @scala.inline
    def setRequiredDuringSchedulingIgnoredDuringExecutionVarargs(value: Input[PodAffinityTerm]*): Self = this.set("requiredDuringSchedulingIgnoredDuringExecution", js.Array(value :_*))
    @scala.inline
    def setRequiredDuringSchedulingIgnoredDuringExecution(value: Input[js.Array[Input[PodAffinityTerm]]]): Self = this.set("requiredDuringSchedulingIgnoredDuringExecution", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequiredDuringSchedulingIgnoredDuringExecution: Self = this.set("requiredDuringSchedulingIgnoredDuringExecution", js.undefined)
  }
  
}

