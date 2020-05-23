package typings.reactSelect.selectMod

import typings.reactSelect.typesMod.OptionTypeBase
import typings.reactSelect.typesMod.ValueType
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
  def apply[OptionType](
    context: FormatOptionLabelContext,
    inputValue: String,
    selectValue: js.UndefOr[Null | ValueType[OptionType]] = js.undefined
  ): FormatOptionLabelMeta[OptionType] = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], inputValue = inputValue.asInstanceOf[js.Any])
    if (!js.isUndefined(selectValue)) __obj.updateDynamic("selectValue")(selectValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormatOptionLabelMeta[OptionType]]
  }
}

