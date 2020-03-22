package typings.rdfExt

import typings.rdfExt.propTypeMod.PropType
import typings.rdfExt.rdfExtStrings.termType
import typings.rdfExt.rdfExtStrings.value
import typings.rdfJs.mod.Variable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTermTypePropType extends js.Object {
  var termType: PropType[Variable, typings.rdfExt.rdfExtStrings.termType]
  var value: PropType[Variable, typings.rdfExt.rdfExtStrings.value]
}

object AnonTermTypePropType {
  @scala.inline
  def apply(termType: PropType[Variable, termType], value: PropType[Variable, value]): AnonTermTypePropType = {
    val __obj = js.Dynamic.literal(termType = termType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonTermTypePropType]
  }
}

