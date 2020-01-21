package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
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
  var matchExpressions: js.UndefOr[Input[js.Array[Input[NodeSelectorRequirement]]]] = js.undefined
  /**
    * A list of node selector requirements by node's fields.
    */
  var matchFields: js.UndefOr[Input[js.Array[Input[NodeSelectorRequirement]]]] = js.undefined
}

object NodeSelectorTerm {
  @scala.inline
  def apply(
    matchExpressions: Input[js.Array[Input[NodeSelectorRequirement]]] = null,
    matchFields: Input[js.Array[Input[NodeSelectorRequirement]]] = null
  ): NodeSelectorTerm = {
    val __obj = js.Dynamic.literal()
    if (matchExpressions != null) __obj.updateDynamic("matchExpressions")(matchExpressions.asInstanceOf[js.Any])
    if (matchFields != null) __obj.updateDynamic("matchFields")(matchFields.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeSelectorTerm]
  }
}

