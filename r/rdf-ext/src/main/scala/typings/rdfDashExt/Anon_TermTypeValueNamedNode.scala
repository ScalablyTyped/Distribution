package typings.rdfDashExt

import typings.rdfDashExt.libUnderscorePropTypeMod.PropType
import typings.rdfDashExt.rdfDashExtStrings.termType
import typings.rdfDashExt.rdfDashExtStrings.value
import typings.rdfDashJs.rdfDashJsMod.NamedNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_TermTypeValueNamedNode extends js.Object {
  var termType: PropType[NamedNode, typings.rdfDashExt.rdfDashExtStrings.termType]
  var value: PropType[NamedNode, typings.rdfDashExt.rdfDashExtStrings.value]
}

object Anon_TermTypeValueNamedNode {
  @scala.inline
  def apply(termType: PropType[NamedNode, termType], value: PropType[NamedNode, value]): Anon_TermTypeValueNamedNode = {
    val __obj = js.Dynamic.literal(termType = termType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_TermTypeValueNamedNode]
  }
}

