package typings.sparqljs.sparqljsMod

import typings.sparqljs.sparqljsStrings.values
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValuesPattern extends Pattern {
  var `type`: values
  var values: js.Array[ValuePatternRow]
}

object ValuesPattern {
  @scala.inline
  def apply(`type`: values, values: js.Array[ValuePatternRow]): ValuesPattern = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValuesPattern]
  }
}

