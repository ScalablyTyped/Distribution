package typings.rdfExt.anon

import typings.rdfExt.propTypeMod.PropType
import typings.rdfExt.rdfExtStrings.termType
import typings.rdfExt.rdfExtStrings.value
import typings.rdfJs.mod.NamedNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TermTypeValue extends js.Object {
  var termType: PropType[NamedNode[String], typings.rdfExt.rdfExtStrings.termType]
  var value: PropType[NamedNode[String], typings.rdfExt.rdfExtStrings.value]
}

object TermTypeValue {
  @scala.inline
  def apply(termType: PropType[NamedNode[String], termType], value: PropType[NamedNode[String], value]): TermTypeValue = {
    val __obj = js.Dynamic.literal(termType = termType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TermTypeValue]
  }
}

