package typings.sparqljs.sparqljsMod

import typings.sparqljs.sparqljsNumbers.`false`
import typings.sparqljs.sparqljsStrings.add
import typings.sparqljs.sparqljsStrings.clear
import typings.sparqljs.sparqljsStrings.copy
import typings.sparqljs.sparqljsStrings.create
import typings.sparqljs.sparqljsStrings.delete
import typings.sparqljs.sparqljsStrings.deletewhere
import typings.sparqljs.sparqljsStrings.drop
import typings.sparqljs.sparqljsStrings.insert
import typings.sparqljs.sparqljsStrings.insertdelete
import typings.sparqljs.sparqljsStrings.load
import typings.sparqljs.sparqljsStrings.move
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.sparqljs.sparqljsMod.InsertDeleteOperation
  - typings.sparqljs.sparqljsMod.ManagementOperation
*/
trait UpdateOperation extends js.Object

object UpdateOperation {
  @scala.inline
  def LoadOperation(destination: String | `false`, silent: Boolean, source: String, `type`: load): UpdateOperation = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateOperation]
  }
  @scala.inline
  def CreateOperation(graph: String, silent: Boolean, `type`: create): UpdateOperation = {
    val __obj = js.Dynamic.literal(graph = graph.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateOperation]
  }
  @scala.inline
  def CopyMoveAddOperation(destination: GraphOrDefault, silent: Boolean, source: GraphOrDefault, `type`: copy | move | add): UpdateOperation = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateOperation]
  }
  @scala.inline
  def ClearDropOperation(graph: GraphReference, silent: Boolean, `type`: clear | drop): UpdateOperation = {
    val __obj = js.Dynamic.literal(graph = graph.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateOperation]
  }
  @scala.inline
  def InsertDeleteOperation(
    updateType: insert | delete | deletewhere | insertdelete,
    delete: js.Array[Quads] = null,
    graph: String = null,
    insert: js.Array[Quads] = null,
    where: js.Array[Pattern] = null
  ): UpdateOperation = {
    val __obj = js.Dynamic.literal(updateType = updateType.asInstanceOf[js.Any])
    if (delete != null) __obj.updateDynamic("delete")(delete.asInstanceOf[js.Any])
    if (graph != null) __obj.updateDynamic("graph")(graph.asInstanceOf[js.Any])
    if (insert != null) __obj.updateDynamic("insert")(insert.asInstanceOf[js.Any])
    if (where != null) __obj.updateDynamic("where")(where.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateOperation]
  }
}

