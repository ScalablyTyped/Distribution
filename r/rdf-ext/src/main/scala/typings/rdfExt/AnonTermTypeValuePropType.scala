package typings.rdfExt

import typings.rdfExt.propTypeMod.PropType
import typings.rdfExt.rdfExtStrings.termType
import typings.rdfExt.rdfExtStrings.value
import typings.rdfJs.mod.Variable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTermTypeValuePropType extends js.Object {
  var termType: PropType[Variable, typings.rdfExt.rdfExtStrings.termType]
  var value: PropType[Variable, typings.rdfExt.rdfExtStrings.value]
}

object AnonTermTypeValuePropType {
  @scala.inline
  def apply(termType: PropType[Variable, termType], value: PropType[Variable, value]): AnonTermTypeValuePropType = {
    val __obj = js.Dynamic.literal(termType = termType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonTermTypeValuePropType]
  }
}

