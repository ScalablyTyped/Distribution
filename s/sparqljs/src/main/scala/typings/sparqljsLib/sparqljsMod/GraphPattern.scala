package typings
package sparqljsLib.sparqljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- sparqljsLib.sparqljsMod.Pattern because Already inherited */ trait GraphPattern extends BlockPattern {
  var name: Term
  @JSName("type")
  var type_GraphPattern: sparqljsLib.sparqljsLibStrings.graph
}

object GraphPattern {
  @scala.inline
  def apply(name: Term, patterns: js.Array[Pattern], `type`: sparqljsLib.sparqljsLibStrings.graph): GraphPattern = {
    val __obj = js.Dynamic.literal(name = name, patterns = patterns)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[GraphPattern]
  }
}

