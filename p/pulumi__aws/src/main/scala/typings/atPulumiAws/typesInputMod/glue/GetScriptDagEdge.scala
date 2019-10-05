package typings.atPulumiAws.typesInputMod.glue

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetScriptDagEdge extends js.Object {
  /**
    * The ID of the node at which the edge starts.
    */
  var source: String
  /**
    * The ID of the node at which the edge ends.
    */
  var target: String
  /**
    * The target of the edge.
    */
  var targetParameter: js.UndefOr[String] = js.undefined
}

object GetScriptDagEdge {
  @scala.inline
  def apply(source: String, target: String, targetParameter: String = null): GetScriptDagEdge = {
    val __obj = js.Dynamic.literal(source = source, target = target)
    if (targetParameter != null) __obj.updateDynamic("targetParameter")(targetParameter)
    __obj.asInstanceOf[GetScriptDagEdge]
  }
}

