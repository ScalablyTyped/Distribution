package typings.reactSelect.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActionMeta[OptionType /* <: OptionTypeBase */] extends js.Object {
  var action: ActionTypes = js.native
  var name: js.UndefOr[String] = js.native
  var option: js.UndefOr[OptionType] = js.native
  var removedValue: js.UndefOr[OptionType] = js.native
}

object ActionMeta {
  @scala.inline
  def apply[/* <: typings.reactSelect.typesMod.OptionTypeBase */ OptionType](action: ActionTypes): ActionMeta[OptionType] = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionMeta[OptionType]]
  }
  @scala.inline
  implicit class ActionMetaOps[Self <: ActionMeta[_], /* <: typings.reactSelect.typesMod.OptionTypeBase */ OptionType] (val x: Self with ActionMeta[OptionType]) extends AnyVal {
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
    def setAction(value: ActionTypes): Self = this.set("action", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOption(value: OptionType): Self = this.set("option", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOption: Self = this.set("option", js.undefined)
    @scala.inline
    def setRemovedValue(value: OptionType): Self = this.set("removedValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemovedValue: Self = this.set("removedValue", js.undefined)
  }
  
}

