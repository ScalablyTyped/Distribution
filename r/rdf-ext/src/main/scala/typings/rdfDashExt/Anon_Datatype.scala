package typings.rdfDashExt

import typings.rdfDashExt.libUnderscorePropTypeMod.PropType
import typings.rdfDashExt.rdfDashExtStrings.language
import typings.rdfDashExt.rdfDashExtStrings.termType
import typings.rdfDashExt.rdfDashExtStrings.value
import typings.rdfDashJs.rdfDashJsMod.Literal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Datatype extends js.Object {
  var datatype: Anon_TermTypeValueNamedNode
  var language: PropType[Literal, typings.rdfDashExt.rdfDashExtStrings.language]
  var termType: PropType[Literal, typings.rdfDashExt.rdfDashExtStrings.termType]
  var value: PropType[Literal, typings.rdfDashExt.rdfDashExtStrings.value]
}

object Anon_Datatype {
  @scala.inline
  def apply(
    datatype: Anon_TermTypeValueNamedNode,
    language: PropType[Literal, language],
    termType: PropType[Literal, termType],
    value: PropType[Literal, value]
  ): Anon_Datatype = {
    val __obj = js.Dynamic.literal(datatype = datatype.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], termType = termType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Datatype]
  }
}

