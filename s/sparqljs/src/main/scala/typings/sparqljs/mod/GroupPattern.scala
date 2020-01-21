package typings.sparqljs.mod

import typings.sparqljs.sparqljsStrings.group
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupPattern
  extends BlockPattern
     with _Expression {
  @JSName("type")
  var type_GroupPattern: group
}

object GroupPattern {
  @scala.inline
  def apply(patterns: js.Array[Pattern], `type`: group): GroupPattern = {
    val __obj = js.Dynamic.literal(patterns = patterns.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupPattern]
  }
}

