package typings.rdfExt

import typings.rdfExt.propTypeMod.PropType
import typings.rdfExt.rdfExtStrings.termType
import typings.rdfExt.rdfExtStrings.value
import typings.rdfJs.mod.DefaultGraph
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonValue extends js.Object {
  var termType: PropType[DefaultGraph, typings.rdfExt.rdfExtStrings.termType]
  var value: PropType[DefaultGraph, typings.rdfExt.rdfExtStrings.value]
}

object AnonValue {
  @scala.inline
  def apply(termType: PropType[DefaultGraph, termType], value: PropType[DefaultGraph, value]): AnonValue = {
    val __obj = js.Dynamic.literal(termType = termType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonValue]
  }
}

