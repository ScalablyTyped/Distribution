package typings.rdfExt.anon

import typings.rdfExt.propTypeMod.PropType
import typings.rdfExt.rdfExtStrings.termType
import typings.rdfExt.rdfExtStrings.value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TermType extends js.Object {
  var termType: PropType[typings.rdfJs.mod.BlankNode, typings.rdfExt.rdfExtStrings.termType]
  var value: PropType[typings.rdfJs.mod.BlankNode, typings.rdfExt.rdfExtStrings.value]
}

object TermType {
  @scala.inline
  def apply(
    termType: PropType[typings.rdfJs.mod.BlankNode, termType],
    value: PropType[typings.rdfJs.mod.BlankNode, value]
  ): TermType = {
    val __obj = js.Dynamic.literal(termType = termType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TermType]
  }
}

