package typings.rdfDashExt

import typings.rdfDashExt.libUnderscorePropTypeMod.PropType
import typings.rdfDashExt.rdfDashExtStrings.termType
import typings.rdfDashExt.rdfDashExtStrings.value
import typings.rdfDashJs.rdfDashJsMod.DefaultGraph
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_TermTypeValue extends js.Object {
  var termType: PropType[DefaultGraph, typings.rdfDashExt.rdfDashExtStrings.termType]
  var value: PropType[DefaultGraph, typings.rdfDashExt.rdfDashExtStrings.value]
}

object Anon_TermTypeValue {
  @scala.inline
  def apply(termType: PropType[DefaultGraph, termType], value: PropType[DefaultGraph, value]): Anon_TermTypeValue = {
    val __obj = js.Dynamic.literal(termType = termType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_TermTypeValue]
  }
}

