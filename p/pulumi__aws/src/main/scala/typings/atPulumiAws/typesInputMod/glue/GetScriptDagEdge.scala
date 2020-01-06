package typings.atPulumiAws.typesInputMod.glue

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetScriptDagEdge extends js.Object {
  /**
    * The ID of the node at which the edge starts.
    */
  var source: String = js.native
  /**
    * The ID of the node at which the edge ends.
    */
  var target: String = js.native
  /**
    * The target of the edge.
    */
  var targetParameter: js.UndefOr[String] = js.native
}

object GetScriptDagEdge {
  @scala.inline
  def apply(source: String, target: String, targetParameter: String = null): GetScriptDagEdge = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    if (targetParameter != null) __obj.updateDynamic("targetParameter")(targetParameter.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetScriptDagEdge]
  }
}

