package typings.sparqljs.sparqljsMod

import typings.sparqljs.sparqljsStrings.service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.sparqljs.sparqljsMod.Pattern because Already inherited */ trait ServicePattern extends BlockPattern {
  var name: Term
  var silent: Boolean
  @JSName("type")
  var type_ServicePattern: service
}

object ServicePattern {
  @scala.inline
  def apply(name: Term, patterns: js.Array[Pattern], silent: Boolean, `type`: service): ServicePattern = {
    val __obj = js.Dynamic.literal(name = name, patterns = patterns, silent = silent)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ServicePattern]
  }
}

