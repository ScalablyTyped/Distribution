package typings.reactSelect.selectMod

import typings.reactSelect.typesMod.OptionTypeBase
import typings.reactSelect.typesMod.ValueType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormatOptionLabelMeta[OptionType /* <: OptionTypeBase */] extends js.Object {
  var context: FormatOptionLabelContext = js.native
  var inputValue: String = js.native
  var selectValue: ValueType[OptionType] = js.native
}

object FormatOptionLabelMeta {
  @scala.inline
  def apply[/* <: typings.reactSelect.typesMod.OptionTypeBase */ OptionType](context: FormatOptionLabelContext, inputValue: String): FormatOptionLabelMeta[OptionType] = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], inputValue = inputValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormatOptionLabelMeta[OptionType]]
  }
  @scala.inline
  implicit class FormatOptionLabelMetaOps[Self <: FormatOptionLabelMeta[_], /* <: typings.reactSelect.typesMod.OptionTypeBase */ OptionType] (val x: Self with FormatOptionLabelMeta[OptionType]) extends AnyVal {
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
    def setContext(value: FormatOptionLabelContext): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def setInputValue(value: String): Self = this.set("inputValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectValueVarargs(value: OptionType*): Self = this.set("selectValue", js.Array(value :_*))
    @scala.inline
    def setSelectValue(value: ValueType[OptionType]): Self = this.set("selectValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectValue: Self = this.set("selectValue", js.undefined)
    @scala.inline
    def setSelectValueNull: Self = this.set("selectValue", null)
  }
  
}

