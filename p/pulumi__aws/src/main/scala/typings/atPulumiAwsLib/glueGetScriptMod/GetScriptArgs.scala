package typings
package atPulumiAwsLib.glueGetScriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetScriptArgs extends js.Object {
  /**
    * A list of the edges in the DAG. Defined below.
    */
  val dagEdges: js.Array[atPulumiAwsLib.Anon_TargetParameter]
  /**
    * A list of the nodes in the DAG. Defined below.
    */
  val dagNodes: js.Array[atPulumiAwsLib.Anon_NodeType]
  /**
    * The programming language of the resulting code from the DAG. Defaults to `PYTHON`. Valid values are `PYTHON` and `SCALA`.
    */
  val language: js.UndefOr[java.lang.String] = js.undefined
}

