package typings.sparqljs.sparqljsMod

import typings.sparqljs.sparqljsStrings.add
import typings.sparqljs.sparqljsStrings.copy
import typings.sparqljs.sparqljsStrings.move
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CopyMoveAddOperation extends ManagementOperation {
  var destination: GraphOrDefault
  var silent: Boolean
  var source: GraphOrDefault
  var `type`: copy | move | add
}

object CopyMoveAddOperation {
  @scala.inline
  def apply(destination: GraphOrDefault, silent: Boolean, source: GraphOrDefault, `type`: copy | move | add): CopyMoveAddOperation = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CopyMoveAddOperation]
  }
}

