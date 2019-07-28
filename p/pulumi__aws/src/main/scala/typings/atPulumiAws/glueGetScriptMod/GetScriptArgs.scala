package typings.atPulumiAws.glueGetScriptMod

import typings.atPulumiAws.Anon_ArgsId
import typings.atPulumiAws.Anon_Source
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetScriptArgs extends js.Object {
  /**
    * A list of the edges in the DAG. Defined below.
    */
  val dagEdges: js.Array[Anon_Source]
  /**
    * A list of the nodes in the DAG. Defined below.
    */
  val dagNodes: js.Array[Anon_ArgsId]
  /**
    * The programming language of the resulting code from the DAG. Defaults to `PYTHON`. Valid values are `PYTHON` and `SCALA`.
    */
  val language: js.UndefOr[String] = js.undefined
}

object GetScriptArgs {
  @scala.inline
  def apply(dagEdges: js.Array[Anon_Source], dagNodes: js.Array[Anon_ArgsId], language: String = null): GetScriptArgs = {
    val __obj = js.Dynamic.literal(dagEdges = dagEdges, dagNodes = dagNodes)
    if (language != null) __obj.updateDynamic("language")(language)
    __obj.asInstanceOf[GetScriptArgs]
  }
}

