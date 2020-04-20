package typings.rdfExt

import typings.rdfExt.propTypeMod.PropType
import typings.rdfExt.rdfExtStrings.termType
import typings.rdfExt.rdfExtStrings.value
import typings.rdfJs.mod.BlankNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTermType extends js.Object {
  var termType: PropType[BlankNode, typings.rdfExt.rdfExtStrings.termType]
  var value: PropType[BlankNode, typings.rdfExt.rdfExtStrings.value]
}

object AnonTermType {
  @scala.inline
  def apply(termType: PropType[BlankNode, termType], value: PropType[BlankNode, value]): AnonTermType = {
    val __obj = js.Dynamic.literal(termType = termType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTermType]
  }
}

