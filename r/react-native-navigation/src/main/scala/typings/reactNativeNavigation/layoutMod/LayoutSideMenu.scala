package typings.reactNativeNavigation.layoutMod

import typings.reactNativeNavigation.optionsMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LayoutSideMenu extends js.Object {
  /**
    * Set the center view
    */
  var center: Layout[js.Object] = js.native
  /**
    * Set ID of the stack so you can use Navigation.mergeOptions to
    * update options
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Set the left side bar
    */
  var left: js.UndefOr[LayoutStackChildren] = js.native
  /**
    * Set the bottom tabs options
    */
  var options: js.UndefOr[Options] = js.native
  /**
    * Set the right side bar
    */
  var right: js.UndefOr[LayoutStackChildren] = js.native
}

object LayoutSideMenu {
  @scala.inline
  def apply(center: Layout[js.Object]): LayoutSideMenu = {
    val __obj = js.Dynamic.literal(center = center.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayoutSideMenu]
  }
  @scala.inline
  implicit class LayoutSideMenuOps[Self <: LayoutSideMenu] (val x: Self) extends AnyVal {
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
    def setCenter(value: Layout[js.Object]): Self = this.set("center", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setLeft(value: LayoutStackChildren): Self = this.set("left", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeft: Self = this.set("left", js.undefined)
    @scala.inline
    def setOptions(value: Options): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    @scala.inline
    def setRight(value: LayoutStackChildren): Self = this.set("right", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRight: Self = this.set("right", js.undefined)
  }
  
}

