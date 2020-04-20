package typings.pulumiKubernetes.outputMod.core.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A topology selector term represents the result of label queries. A null or empty topology
  * selector term matches no objects. The requirements of them are ANDed. It provides a subset of
  * functionality as NodeSelectorTerm. This is an alpha feature and may change in the future.
  */
trait TopologySelectorTerm extends js.Object {
  /**
    * A list of topology selector requirements by labels.
    */
  val matchLabelExpressions: js.Array[TopologySelectorLabelRequirement]
}

object TopologySelectorTerm {
  @scala.inline
  def apply(matchLabelExpressions: js.Array[TopologySelectorLabelRequirement]): TopologySelectorTerm = {
    val __obj = js.Dynamic.literal(matchLabelExpressions = matchLabelExpressions.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopologySelectorTerm]
  }
}

