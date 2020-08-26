package typings.rdfExt.anon

import typings.rdfExt.propTypeMod.PropType
import typings.rdfExt.rdfExtStrings.termType
import typings.rdfExt.rdfExtStrings.value
import typings.rdfJs.mod.NamedNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TermTypeValue extends js.Object {
  var termType: PropType[NamedNode[String], typings.rdfExt.rdfExtStrings.termType] = js.native
  var value: PropType[NamedNode[String], typings.rdfExt.rdfExtStrings.value] = js.native
}

object TermTypeValue {
  @scala.inline
  def apply(termType: PropType[NamedNode[String], termType], value: PropType[NamedNode[String], value]): TermTypeValue = {
    val __obj = js.Dynamic.literal(termType = termType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TermTypeValue]
  }
  @scala.inline
  implicit class TermTypeValueOps[Self <: TermTypeValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setTermType(value: PropType[NamedNode[String], termType]): Self = this.set("termType", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: PropType[NamedNode[String], value]): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

