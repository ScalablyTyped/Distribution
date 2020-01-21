package typings.sparqljs.mod

import typings.sparqljs.sparqljsBooleans.`false`
import typings.sparqljs.sparqljsStrings.load
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoadOperation extends ManagementOperation {
  var destination: String | `false`
  var silent: Boolean
  var source: String
  var `type`: load
}

object LoadOperation {
  @scala.inline
  def apply(destination: String | `false`, silent: Boolean, source: String, `type`: load): LoadOperation = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadOperation]
  }
}

