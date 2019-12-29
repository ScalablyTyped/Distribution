package typings.rdfDashExt

import typings.rdfDashExt.libUnderscorePropTypeMod.PropType
import typings.rdfDashExt.rdfDashExtStrings.termType
import typings.rdfDashExt.rdfDashExtStrings.value
import typings.rdfDashJs.rdfDashJsMod.BlankNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_TermType extends js.Object {
  var termType: PropType[BlankNode, typings.rdfDashExt.rdfDashExtStrings.termType]
  var value: PropType[BlankNode, typings.rdfDashExt.rdfDashExtStrings.value]
}

object Anon_TermType {
  @scala.inline
  def apply(termType: PropType[BlankNode, termType], value: PropType[BlankNode, value]): Anon_TermType = {
    val __obj = js.Dynamic.literal(termType = termType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_TermType]
  }
}

