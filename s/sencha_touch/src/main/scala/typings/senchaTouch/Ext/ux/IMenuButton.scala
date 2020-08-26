package typings.senchaTouch.Ext.ux

import typings.senchaTouch.Ext.Array
import typings.senchaTouch.Ext.IButton
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMenuButton extends IButton {
  /** [Method] Returns the value of menuItems
    * @returns Array
    */
  var getMenuItems: js.UndefOr[js.Function0[Array]] = js.native
  /** [Method] Sets the value of menuItems
    * @param menuItems Array The new value.
    */
  var setMenuItems: js.UndefOr[js.Function1[/* menuItems */ js.UndefOr[Array], Unit]] = js.native
}

object IMenuButton {
  @scala.inline
  def apply(): IMenuButton = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMenuButton]
  }
  @scala.inline
  implicit class IMenuButtonOps[Self <: IMenuButton] (val x: Self) extends AnyVal {
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
    def setGetMenuItems(value: () => Array): Self = this.set("getMenuItems", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetMenuItems: Self = this.set("getMenuItems", js.undefined)
    @scala.inline
    def setSetMenuItems(value: /* menuItems */ js.UndefOr[Array] => Unit): Self = this.set("setMenuItems", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetMenuItems: Self = this.set("setMenuItems", js.undefined)
  }
  
}

