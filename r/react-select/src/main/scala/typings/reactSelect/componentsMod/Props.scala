package typings.reactSelect.componentsMod

import typings.reactSelect.typesMod.OptionTypeBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Props[OptionType /* <: OptionTypeBase */] extends js.Object {
  var components: SelectComponentsConfig[OptionType] = js.native
}

object Props {
  @scala.inline
  def apply[/* <: typings.reactSelect.typesMod.OptionTypeBase */ OptionType](components: SelectComponentsConfig[OptionType]): Props[OptionType] = {
    val __obj = js.Dynamic.literal(components = components.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props[OptionType]]
  }
  @scala.inline
  implicit class PropsOps[Self <: Props[_], /* <: typings.reactSelect.typesMod.OptionTypeBase */ OptionType] (val x: Self with Props[OptionType]) extends AnyVal {
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
    def setComponents(value: SelectComponentsConfig[OptionType]): Self = this.set("components", value.asInstanceOf[js.Any])
  }
  
}

