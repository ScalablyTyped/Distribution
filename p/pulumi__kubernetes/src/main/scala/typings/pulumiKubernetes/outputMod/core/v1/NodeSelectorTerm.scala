package typings.pulumiKubernetes.outputMod.core.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A null or empty node selector term matches no objects. The requirements of them are ANDed. The TopologySelectorTerm type implements a subset of the NodeSelectorTerm.
  */
@js.native
trait NodeSelectorTerm extends js.Object {
  /**
    * A list of node selector requirements by node's labels.
    */
  var matchExpressions: js.Array[NodeSelectorRequirement] = js.native
  /**
    * A list of node selector requirements by node's fields.
    */
  var matchFields: js.Array[NodeSelectorRequirement] = js.native
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
  @scala.inline
  implicit class NodeSelectorTermOps[Self <: NodeSelectorTerm] (val x: Self) extends AnyVal {
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
    def setMatchExpressionsVarargs(value: NodeSelectorRequirement*): Self = this.set("matchExpressions", js.Array(value :_*))
    @scala.inline
    def setMatchExpressions(value: js.Array[NodeSelectorRequirement]): Self = this.set("matchExpressions", value.asInstanceOf[js.Any])
    @scala.inline
    def setMatchFieldsVarargs(value: NodeSelectorRequirement*): Self = this.set("matchFields", js.Array(value :_*))
    @scala.inline
    def setMatchFields(value: js.Array[NodeSelectorRequirement]): Self = this.set("matchFields", value.asInstanceOf[js.Any])
  }
  
}

