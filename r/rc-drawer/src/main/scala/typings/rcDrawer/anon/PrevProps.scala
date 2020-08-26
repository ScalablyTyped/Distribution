package typings.rcDrawer.anon

import typings.rcDrawer.drawerChildMod.DrawerChild
import typings.rcDrawer.idrawerproptypesMod.IDrawerChildProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrevProps extends js.Object {
  var _self: DrawerChild = js.native
  var prevProps: IDrawerChildProps = js.native
}

object PrevProps {
  @scala.inline
  def apply(_self: DrawerChild, prevProps: IDrawerChildProps): PrevProps = {
    val __obj = js.Dynamic.literal(_self = _self.asInstanceOf[js.Any], prevProps = prevProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrevProps]
  }
  @scala.inline
  implicit class PrevPropsOps[Self <: PrevProps] (val x: Self) extends AnyVal {
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
  }
  
}

