package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Node affinity is a group of node affinity scheduling rules.
  */
trait NodeAffinity extends StObject {
  
  /**
    * The scheduler will prefer to schedule pods to nodes that satisfy the affinity expressions specified by this field, but it may choose a node that violates one or more of the expressions. The node that is most preferred is the one with the greatest sum of weights, i.e. for each node that meets all of the scheduling requirements (resource request, requiredDuringScheduling affinity expressions, etc.), compute a sum by iterating through the elements of this field and adding "weight" to the sum if the node matches the corresponding matchExpressions; the node(s) with the highest sum are the most preferred.
    */
  var preferredDuringSchedulingIgnoredDuringExecution: js.UndefOr[Input[js.Array[Input[PreferredSchedulingTerm]]]] = js.undefined
  
  /**
    * If the affinity requirements specified by this field are not met at scheduling time, the pod will not be scheduled onto the node. If the affinity requirements specified by this field cease to be met at some point during pod execution (e.g. due to an update), the system may or may not try to eventually evict the pod from its node.
    */
  var requiredDuringSchedulingIgnoredDuringExecution: js.UndefOr[Input[NodeSelector]] = js.undefined
}
object NodeAffinity {
  
  inline def apply(): NodeAffinity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeAffinity]
  }
  
  extension [Self <: NodeAffinity](x: Self) {
    
    inline def setPreferredDuringSchedulingIgnoredDuringExecution(value: Input[js.Array[Input[PreferredSchedulingTerm]]]): Self = StObject.set(x, "preferredDuringSchedulingIgnoredDuringExecution", value.asInstanceOf[js.Any])
    
    inline def setPreferredDuringSchedulingIgnoredDuringExecutionUndefined: Self = StObject.set(x, "preferredDuringSchedulingIgnoredDuringExecution", js.undefined)
    
    inline def setPreferredDuringSchedulingIgnoredDuringExecutionVarargs(value: Input[PreferredSchedulingTerm]*): Self = StObject.set(x, "preferredDuringSchedulingIgnoredDuringExecution", js.Array(value :_*))
    
    inline def setRequiredDuringSchedulingIgnoredDuringExecution(value: Input[NodeSelector]): Self = StObject.set(x, "requiredDuringSchedulingIgnoredDuringExecution", value.asInstanceOf[js.Any])
    
    inline def setRequiredDuringSchedulingIgnoredDuringExecutionUndefined: Self = StObject.set(x, "requiredDuringSchedulingIgnoredDuringExecution", js.undefined)
  }
}
