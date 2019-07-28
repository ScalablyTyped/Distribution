package typings.sparqljs.sparqljsMod

import typings.sparqljs.sparqljsStrings.clear
import typings.sparqljs.sparqljsStrings.drop
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClearDropOperation extends ManagementOperation {
  var graph: GraphReference
  var silent: Boolean
  var `type`: clear | drop
}

object ClearDropOperation {
  @scala.inline
  def apply(graph: GraphReference, silent: Boolean, `type`: clear | drop): ClearDropOperation = {
    val __obj = js.Dynamic.literal(graph = graph, silent = silent)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClearDropOperation]
  }
}

