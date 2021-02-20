package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Pod affinity is a group of inter pod affinity scheduling rules.
  */
@js.native
trait PodAffinity extends StObject {
  
  /**
    * The scheduler will prefer to schedule pods to nodes that satisfy the affinity expressions specified by this field, but it may choose a node that violates one or more of the expressions. The node that is most preferred is the one with the greatest sum of weights, i.e. for each node that meets all of the scheduling requirements (resource request, requiredDuringScheduling affinity expressions, etc.), compute a sum by iterating through the elements of this field and adding "weight" to the sum if the node has pods which matches the corresponding podAffinityTerm; the node(s) with the highest sum are the most preferred.
    */
  var preferredDuringSchedulingIgnoredDuringExecution: js.UndefOr[Input[js.Array[Input[WeightedPodAffinityTerm]]]] = js.native
  
  /**
    * If the affinity requirements specified by this field are not met at scheduling time, the pod will not be scheduled onto the node. If the affinity requirements specified by this field cease to be met at some point during pod execution (e.g. due to a pod label update), the system may or may not try to eventually evict the pod from its node. When there are multiple elements, the lists of nodes corresponding to each podAffinityTerm are intersected, i.e. all terms must be satisfied.
    */
  var requiredDuringSchedulingIgnoredDuringExecution: js.UndefOr[Input[js.Array[Input[PodAffinityTerm]]]] = js.native
}
object PodAffinity {
  
  @scala.inline
  def apply(): PodAffinity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PodAffinity]
  }
  
  @scala.inline
  implicit class PodAffinityMutableBuilder[Self <: PodAffinity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPreferredDuringSchedulingIgnoredDuringExecution(value: Input[js.Array[Input[WeightedPodAffinityTerm]]]): Self = StObject.set(x, "preferredDuringSchedulingIgnoredDuringExecution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreferredDuringSchedulingIgnoredDuringExecutionUndefined: Self = StObject.set(x, "preferredDuringSchedulingIgnoredDuringExecution", js.undefined)
    
    @scala.inline
    def setPreferredDuringSchedulingIgnoredDuringExecutionVarargs(value: Input[WeightedPodAffinityTerm]*): Self = StObject.set(x, "preferredDuringSchedulingIgnoredDuringExecution", js.Array(value :_*))
    
    @scala.inline
    def setRequiredDuringSchedulingIgnoredDuringExecution(value: Input[js.Array[Input[PodAffinityTerm]]]): Self = StObject.set(x, "requiredDuringSchedulingIgnoredDuringExecution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiredDuringSchedulingIgnoredDuringExecutionUndefined: Self = StObject.set(x, "requiredDuringSchedulingIgnoredDuringExecution", js.undefined)
    
    @scala.inline
    def setRequiredDuringSchedulingIgnoredDuringExecutionVarargs(value: Input[PodAffinityTerm]*): Self = StObject.set(x, "requiredDuringSchedulingIgnoredDuringExecution", js.Array(value :_*))
  }
}
