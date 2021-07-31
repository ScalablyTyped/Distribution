package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A node selector represents the union of the results of one or more label queries over a set of nodes; that is, it represents the OR of the selectors represented by the node selector terms.
  */
trait NodeSelector extends StObject {
  
  /**
    * Required. A list of node selector terms. The terms are ORed.
    */
  var nodeSelectorTerms: Input[js.Array[Input[NodeSelectorTerm]]]
}
object NodeSelector {
  
  @scala.inline
  def apply(nodeSelectorTerms: Input[js.Array[Input[NodeSelectorTerm]]]): NodeSelector = {
    val __obj = js.Dynamic.literal(nodeSelectorTerms = nodeSelectorTerms.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeSelector]
  }
  
  @scala.inline
  implicit class NodeSelectorMutableBuilder[Self <: NodeSelector] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNodeSelectorTerms(value: Input[js.Array[Input[NodeSelectorTerm]]]): Self = StObject.set(x, "nodeSelectorTerms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeSelectorTermsVarargs(value: Input[NodeSelectorTerm]*): Self = StObject.set(x, "nodeSelectorTerms", js.Array(value :_*))
  }
}
