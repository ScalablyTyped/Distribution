package typings.pulumiAws.inputMod.glue

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetScriptDagNode extends js.Object {
  /**
    * Nested configuration an argument or property of a node. Defined below.
    */
  var args: js.Array[GetScriptDagNodeArg] = js.native
  /**
    * A node identifier that is unique within the node's graph.
    */
  var id: String = js.native
  /**
    * The line number of the node.
    */
  var lineNumber: js.UndefOr[Double] = js.native
  /**
    * The type of node this is.
    */
  var nodeType: String = js.native
}

object GetScriptDagNode {
  @scala.inline
  def apply(
    args: js.Array[GetScriptDagNodeArg],
    id: String,
    nodeType: String,
    lineNumber: js.UndefOr[Double] = js.undefined
  ): GetScriptDagNode = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], nodeType = nodeType.asInstanceOf[js.Any])
    if (!js.isUndefined(lineNumber)) __obj.updateDynamic("lineNumber")(lineNumber.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetScriptDagNode]
  }
}

