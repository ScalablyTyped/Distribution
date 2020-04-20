package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
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
  var nodeSelectorTerms: Input[js.Array[Input[NodeSelectorTerm]]]
}

object NodeSelector {
  @scala.inline
  def apply(nodeSelectorTerms: Input[js.Array[Input[NodeSelectorTerm]]]): NodeSelector = {
    val __obj = js.Dynamic.literal(nodeSelectorTerms = nodeSelectorTerms.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeSelector]
  }
}

