package typings.senchaTouch.Ext.ux

import typings.senchaTouch.Ext.IMenu
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IApplicationMenu extends IMenu

object IApplicationMenu {
  @scala.inline
  def apply(IMenu: IMenu = null): IApplicationMenu = {
    val __obj = js.Dynamic.literal()
    if (IMenu != null) js.Dynamic.global.Object.assign(__obj, IMenu)
    __obj.asInstanceOf[IApplicationMenu]
  }
}

