package typings.pulumiKubernetes.outputMod.core.v1

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
  var preferredDuringSchedulingIgnoredDuringExecution: js.Array[PreferredSchedulingTerm]
  
  /**
    * If the affinity requirements specified by this field are not met at scheduling time, the pod will not be scheduled onto the node. If the affinity requirements specified by this field cease to be met at some point during pod execution (e.g. due to an update), the system may or may not try to eventually evict the pod from its node.
    */
  var requiredDuringSchedulingIgnoredDuringExecution: NodeSelector
}
object NodeAffinity {
  
  inline def apply(
    preferredDuringSchedulingIgnoredDuringExecution: js.Array[PreferredSchedulingTerm],
    requiredDuringSchedulingIgnoredDuringExecution: NodeSelector
  ): NodeAffinity = {
    val __obj = js.Dynamic.literal(preferredDuringSchedulingIgnoredDuringExecution = preferredDuringSchedulingIgnoredDuringExecution.asInstanceOf[js.Any], requiredDuringSchedulingIgnoredDuringExecution = requiredDuringSchedulingIgnoredDuringExecution.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeAffinity]
  }
  
  extension [Self <: NodeAffinity](x: Self) {
    
    inline def setPreferredDuringSchedulingIgnoredDuringExecution(value: js.Array[PreferredSchedulingTerm]): Self = StObject.set(x, "preferredDuringSchedulingIgnoredDuringExecution", value.asInstanceOf[js.Any])
    
    inline def setPreferredDuringSchedulingIgnoredDuringExecutionVarargs(value: PreferredSchedulingTerm*): Self = StObject.set(x, "preferredDuringSchedulingIgnoredDuringExecution", js.Array(value :_*))
    
    inline def setRequiredDuringSchedulingIgnoredDuringExecution(value: NodeSelector): Self = StObject.set(x, "requiredDuringSchedulingIgnoredDuringExecution", value.asInstanceOf[js.Any])
  }
}
