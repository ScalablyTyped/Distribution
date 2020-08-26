package typings.reactSelect.srcCreatableMod

import typings.reactSelect.typesMod.OptionTypeBase
import typings.reactSelect.typesMod.OptionsType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait State[OptionType /* <: OptionTypeBase */] extends js.Object {
  var newOption: js.UndefOr[OptionType] = js.native
  var options: OptionsType[OptionType] = js.native
}

object State {
  @scala.inline
  def apply[/* <: typings.reactSelect.typesMod.OptionTypeBase */ OptionType](options: OptionsType[OptionType]): State[OptionType] = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[State[OptionType]]
  }
  @scala.inline
  implicit class StateOps[Self <: State[_], /* <: typings.reactSelect.typesMod.OptionTypeBase */ OptionType] (val x: Self with State[OptionType]) extends AnyVal {
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
    def setOptionsVarargs(value: OptionType*): Self = this.set("options", js.Array(value :_*))
    @scala.inline
    def setOptions(value: OptionsType[OptionType]): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def setNewOption(value: OptionType): Self = this.set("newOption", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNewOption: Self = this.set("newOption", js.undefined)
  }
  
}

