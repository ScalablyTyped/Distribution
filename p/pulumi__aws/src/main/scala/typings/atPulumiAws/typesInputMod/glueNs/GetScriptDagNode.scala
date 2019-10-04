package typings.atPulumiAws.typesInputMod.glueNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetScriptDagNode extends js.Object {
  /**
    * Nested configuration an argument or property of a node. Defined below.
    */
  var args: js.Array[GetScriptDagNodeArg]
  /**
    * A node identifier that is unique within the node's graph.
    */
  var id: String
  /**
    * The line number of the node.
    */
  var lineNumber: js.UndefOr[Double] = js.undefined
  /**
    * The type of node this is.
    */
  var nodeType: String
}

object GetScriptDagNode {
  @scala.inline
  def apply(args: js.Array[GetScriptDagNodeArg], id: String, nodeType: String, lineNumber: Int | Double = null): GetScriptDagNode = {
    val __obj = js.Dynamic.literal(args = args, id = id, nodeType = nodeType)
    if (lineNumber != null) __obj.updateDynamic("lineNumber")(lineNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetScriptDagNode]
  }
}

