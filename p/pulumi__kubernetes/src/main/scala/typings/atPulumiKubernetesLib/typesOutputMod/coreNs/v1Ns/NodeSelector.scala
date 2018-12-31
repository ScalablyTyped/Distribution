package typings
package atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns

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

