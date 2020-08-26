package typings.rcDrawer.drawerChildMod

import typings.rcDrawer.idrawerproptypesMod.IDrawerChildProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IState extends js.Object {
  var _self: DrawerChild = js.native
  var prevProps: js.UndefOr[IDrawerChildProps] = js.native
}

object IState {
  @scala.inline
  def apply(_self: DrawerChild): IState = {
    val __obj = js.Dynamic.literal(_self = _self.asInstanceOf[js.Any])
    __obj.asInstanceOf[IState]
  }
  @scala.inline
  implicit class IStateOps[Self <: IState] (val x: Self) extends AnyVal {
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
    def set_self(value: DrawerChild): Self = this.set("_self", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrevProps(value: IDrawerChildProps): Self = this.set("prevProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrevProps: Self = this.set("prevProps", js.undefined)
  }
  
}

