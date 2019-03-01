package typings
package sparqljsLib.sparqljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupPattern
  extends BlockPattern
     with _Expression {
  @JSName("type")
  var type_GroupPattern: sparqljsLib.sparqljsLibStrings.group
}

object GroupPattern {
  @scala.inline
  def apply(patterns: js.Array[Pattern], `type`: sparqljsLib.sparqljsLibStrings.group): GroupPattern = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("patterns")(patterns)
    __obj.asInstanceOf[GroupPattern]
  }
}

