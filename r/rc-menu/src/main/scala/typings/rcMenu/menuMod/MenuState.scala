package typings.rcMenu.menuMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MenuState extends js.Object {
  var switchingModeFromInline: Boolean = js.native
}

object MenuState {
  @scala.inline
  def apply(switchingModeFromInline: Boolean): MenuState = {
    val __obj = js.Dynamic.literal(switchingModeFromInline = switchingModeFromInline.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuState]
  }
  @scala.inline
  implicit class MenuStateOps[Self <: MenuState] (val x: Self) extends AnyVal {
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
    def setSwitchingModeFromInline(value: Boolean): Self = this.set("switchingModeFromInline", value.asInstanceOf[js.Any])
  }
  
}

