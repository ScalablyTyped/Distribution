package typings.sparqljs.sparqljsMod

import typings.sparqljs.sparqljsStrings.create
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateOperation extends ManagementOperation {
  var graph: String
  var silent: Boolean
  var `type`: create
}

object CreateOperation {
  @scala.inline
  def apply(graph: String, silent: Boolean, `type`: create): CreateOperation = {
    val __obj = js.Dynamic.literal(graph = graph, silent = silent)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[CreateOperation]
  }
}

