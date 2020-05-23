package typings.rcDrawer.anon

import typings.rcDrawer.drawerChildMod.DrawerChild
import typings.rcDrawer.idrawerproptypesMod.IDrawerChildProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrevProps extends js.Object {
  var _self: DrawerChild
  var prevProps: IDrawerChildProps
}

object PrevProps {
  @scala.inline
  def apply(_self: DrawerChild, prevProps: IDrawerChildProps): PrevProps = {
    val __obj = js.Dynamic.literal(_self = _self.asInstanceOf[js.Any], prevProps = prevProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrevProps]
  }
}

