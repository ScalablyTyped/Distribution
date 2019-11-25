package typings.sparqljs.sparqljsMod

import typings.sparqljs.sparqljsNumbers.`false`
import typings.sparqljs.sparqljsStrings.add
import typings.sparqljs.sparqljsStrings.clear
import typings.sparqljs.sparqljsStrings.copy
import typings.sparqljs.sparqljsStrings.create
import typings.sparqljs.sparqljsStrings.drop
import typings.sparqljs.sparqljsStrings.load
import typings.sparqljs.sparqljsStrings.move
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.sparqljs.sparqljsMod.CopyMoveAddOperation
  - typings.sparqljs.sparqljsMod.LoadOperation
  - typings.sparqljs.sparqljsMod.CreateOperation
  - typings.sparqljs.sparqljsMod.ClearDropOperation
*/
trait ManagementOperation extends UpdateOperation

object ManagementOperation {
  @scala.inline
  def CopyMoveAddOperation(destination: GraphOrDefault, silent: Boolean, source: GraphOrDefault, `type`: copy | move | add): ManagementOperation = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManagementOperation]
  }
  @scala.inline
  def LoadOperation(destination: String | `false`, silent: Boolean, source: String, `type`: load): ManagementOperation = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManagementOperation]
  }
  @scala.inline
  def CreateOperation(graph: String, silent: Boolean, `type`: create): ManagementOperation = {
    val __obj = js.Dynamic.literal(graph = graph.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManagementOperation]
  }
  @scala.inline
  def ClearDropOperation(graph: GraphReference, silent: Boolean, `type`: clear | drop): ManagementOperation = {
    val __obj = js.Dynamic.literal(graph = graph.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManagementOperation]
  }
}

