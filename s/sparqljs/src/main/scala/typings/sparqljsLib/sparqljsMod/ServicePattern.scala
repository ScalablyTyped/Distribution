package typings
package sparqljsLib.sparqljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- sparqljsLib.sparqljsMod.Pattern because Already inherited */ trait ServicePattern extends BlockPattern {
  var name: Term
  var silent: scala.Boolean
  @JSName("type")
  var type_ServicePattern: sparqljsLib.sparqljsLibStrings.service
}

object ServicePattern {
  @scala.inline
  def apply(
    name: Term,
    patterns: js.Array[Pattern],
    silent: scala.Boolean,
    `type`: sparqljsLib.sparqljsLibStrings.service
  ): ServicePattern = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("patterns")(patterns)
    __obj.updateDynamic("silent")(silent)
    __obj.asInstanceOf[ServicePattern]
  }
}

