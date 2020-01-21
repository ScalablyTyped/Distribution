package typings.pulumiKubernetes.outputMod.core.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A null or empty node selector term matches no objects. The requirements of them are ANDed.
  * The TopologySelectorTerm type implements a subset of the NodeSelectorTerm.
  */
trait NodeSelectorTerm extends js.Object {
  /**
    * A list of node selector requirements by node's labels.
    */
  val matchExpressions: js.Array[NodeSelectorRequirement]
  /**
    * A list of node selector requirements by node's fields.
    */
  val matchFields: js.Array[NodeSelectorRequirement]
}

object NodeSelectorTerm {
  @scala.inline
  def apply(
    matchExpressions: js.Array[NodeSelectorRequirement],
    matchFields: js.Array[NodeSelectorRequirement]
  ): NodeSelectorTerm = {
    val __obj = js.Dynamic.literal(matchExpressions = matchExpressions.asInstanceOf[js.Any], matchFields = matchFields.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NodeSelectorTerm]
  }
}

