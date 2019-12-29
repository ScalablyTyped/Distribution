package typings.rdfDashExt

import typings.rdfDashExt.libUnderscorePropTypeMod.PropType
import typings.rdfDashExt.rdfDashExtStrings.termType
import typings.rdfDashExt.rdfDashExtStrings.value
import typings.rdfDashJs.rdfDashJsMod.Variable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_TermTypeValuePropType extends js.Object {
  var termType: PropType[Variable, typings.rdfDashExt.rdfDashExtStrings.termType]
  var value: PropType[Variable, typings.rdfDashExt.rdfDashExtStrings.value]
}

object Anon_TermTypeValuePropType {
  @scala.inline
  def apply(termType: PropType[Variable, termType], value: PropType[Variable, value]): Anon_TermTypeValuePropType = {
    val __obj = js.Dynamic.literal(termType = termType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_TermTypeValuePropType]
  }
}

