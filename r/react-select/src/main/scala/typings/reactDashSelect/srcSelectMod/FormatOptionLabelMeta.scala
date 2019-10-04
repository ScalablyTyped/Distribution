package typings.reactDashSelect.srcSelectMod

import typings.reactDashSelect.srcTypesMod.OptionTypeBase
import typings.reactDashSelect.srcTypesMod.ValueType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormatOptionLabelMeta[OptionType /* <: OptionTypeBase */] extends js.Object {
  var context: FormatOptionLabelContext
  var inputValue: String
  var selectValue: ValueType[OptionType]
}

object FormatOptionLabelMeta {
  @scala.inline
  def apply[OptionType /* <: OptionTypeBase */](context: FormatOptionLabelContext, inputValue: String, selectValue: ValueType[OptionType]): FormatOptionLabelMeta[OptionType] = {
    val __obj = js.Dynamic.literal(context = context, inputValue = inputValue, selectValue = selectValue.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FormatOptionLabelMeta[OptionType]]
  }
}

