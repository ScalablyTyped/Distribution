package typings.pulumiAws.outputMod.glue

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
  def apply(args: js.Array[GetScriptDagNodeArg], id: String, nodeType: String): GetScriptDagNode = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], nodeType = nodeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetScriptDagNode]
  }
  @scala.inline
  implicit class GetScriptDagNodeOps[Self <: GetScriptDagNode] (val x: Self) extends AnyVal {
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
    def setArgsVarargs(value: GetScriptDagNodeArg*): Self = this.set("args", js.Array(value :_*))
    @scala.inline
    def setArgs(value: js.Array[GetScriptDagNodeArg]): Self = this.set("args", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setNodeType(value: String): Self = this.set("nodeType", value.asInstanceOf[js.Any])
    @scala.inline
    def setLineNumber(value: Double): Self = this.set("lineNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineNumber: Self = this.set("lineNumber", js.undefined)
  }
  
}

