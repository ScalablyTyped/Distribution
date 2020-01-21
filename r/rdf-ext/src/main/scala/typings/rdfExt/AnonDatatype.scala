package typings.rdfExt

import typings.rdfExt.propTypeMod.PropType
import typings.rdfExt.rdfExtStrings.language
import typings.rdfExt.rdfExtStrings.termType
import typings.rdfExt.rdfExtStrings.value
import typings.rdfJs.mod.Literal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDatatype extends js.Object {
  var datatype: AnonTermTypeValueNamedNode
  var language: PropType[Literal, typings.rdfExt.rdfExtStrings.language]
  var termType: PropType[Literal, typings.rdfExt.rdfExtStrings.termType]
  var value: PropType[Literal, typings.rdfExt.rdfExtStrings.value]
}

object AnonDatatype {
  @scala.inline
  def apply(
    datatype: AnonTermTypeValueNamedNode,
    language: PropType[Literal, language],
    termType: PropType[Literal, termType],
    value: PropType[Literal, value]
  ): AnonDatatype = {
    val __obj = js.Dynamic.literal(datatype = datatype.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], termType = termType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDatatype]
  }
}

