package typings.rcDrawer.drawerChildMod

import typings.rcDrawer.idrawerproptypesMod.IDrawerChildProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IState extends js.Object {
  var _self: DrawerChild
  var prevProps: js.UndefOr[IDrawerChildProps] = js.undefined
}

object IState {
  @scala.inline
  def apply(_self: DrawerChild, prevProps: IDrawerChildProps = null): IState = {
    val __obj = js.Dynamic.literal(_self = _self.asInstanceOf[js.Any])
    if (prevProps != null) __obj.updateDynamic("prevProps")(prevProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[IState]
  }
}

