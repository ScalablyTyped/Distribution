package typings.sparqljs.mod

import typings.sparqljs.sparqljsStrings.service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.sparqljs.mod.Pattern because Already inherited */ trait ServicePattern extends BlockPattern {
  var name: Term
  var silent: Boolean
  @JSName("type")
  var type_ServicePattern: service
}

object ServicePattern {
  @scala.inline
  def apply(name: Term, patterns: js.Array[Pattern], silent: Boolean, `type`: service): ServicePattern = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], patterns = patterns.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServicePattern]
  }
}

