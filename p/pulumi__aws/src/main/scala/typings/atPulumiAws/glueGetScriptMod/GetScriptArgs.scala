package typings.atPulumiAws.glueGetScriptMod

import typings.atPulumiAws.typesInputMod.glue.GetScriptDagEdge
import typings.atPulumiAws.typesInputMod.glue.GetScriptDagNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetScriptArgs extends js.Object {
  /**
    * A list of the edges in the DAG. Defined below.
    */
  val dagEdges: js.Array[GetScriptDagEdge] = js.native
  /**
    * A list of the nodes in the DAG. Defined below.
    */
  val dagNodes: js.Array[GetScriptDagNode] = js.native
  /**
    * The programming language of the resulting code from the DAG. Defaults to `PYTHON`. Valid values are `PYTHON` and `SCALA`.
    */
  val language: js.UndefOr[String] = js.native
}

object GetScriptArgs {
  @scala.inline
  def apply(
    dagEdges: js.Array[GetScriptDagEdge],
    dagNodes: js.Array[GetScriptDagNode],
    language: String = null
  ): GetScriptArgs = {
    val __obj = js.Dynamic.literal(dagEdges = dagEdges.asInstanceOf[js.Any], dagNodes = dagNodes.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetScriptArgs]
  }
}

