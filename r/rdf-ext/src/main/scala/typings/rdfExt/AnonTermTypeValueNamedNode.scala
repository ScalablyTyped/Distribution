package typings.rdfExt

import typings.rdfExt.propTypeMod.PropType
import typings.rdfExt.rdfExtStrings.termType
import typings.rdfExt.rdfExtStrings.value
import typings.rdfJs.mod.NamedNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTermTypeValueNamedNode extends js.Object {
  var termType: PropType[NamedNode, typings.rdfExt.rdfExtStrings.termType]
  var value: PropType[NamedNode, typings.rdfExt.rdfExtStrings.value]
}

object AnonTermTypeValueNamedNode {
  @scala.inline
  def apply(termType: PropType[NamedNode, termType], value: PropType[NamedNode, value]): AnonTermTypeValueNamedNode = {
    val __obj = js.Dynamic.literal(termType = termType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonTermTypeValueNamedNode]
  }
}

