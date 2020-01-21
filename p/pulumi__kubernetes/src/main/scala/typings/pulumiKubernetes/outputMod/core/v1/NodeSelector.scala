package typings.pulumiKubernetes.outputMod.core.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A node selector represents the union of the results of one or more label queries over a set
  * of nodes; that is, it represents the OR of the selectors represented by the node selector
  * terms.
  */
trait NodeSelector extends js.Object {
  /**
    * Required. A list of node selector terms. The terms are ORed.
    */
  val nodeSelectorTerms: js.Array[NodeSelectorTerm]
}

object NodeSelector {
  @scala.inline
  def apply(nodeSelectorTerms: js.Array[NodeSelectorTerm]): NodeSelector = {
    val __obj = js.Dynamic.literal(nodeSelectorTerms = nodeSelectorTerms.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NodeSelector]
  }
}

