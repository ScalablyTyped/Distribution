package typings.reactToolbox.menuMenuMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MenuTheme extends js.Object {
  /**
    * Added to the root element when menu is active.
    */
  var active: js.UndefOr[String] = js.native
  /**
    * Added to the root when position is bottom left.
    */
  var bottomLeft: js.UndefOr[String] = js.native
  /**
    * Added to the root when position is bottom right.
    */
  var bottomRight: js.UndefOr[String] = js.native
  /**
    * Used for the root element of the menu.
    */
  var menu: js.UndefOr[String] = js.native
  /**
    * Used for the inner wrapper.
    */
  var menuInner: js.UndefOr[String] = js.native
  /**
    * Used to draw the outline.
    */
  var outline: js.UndefOr[String] = js.native
  /**
    * Added to the menu in case if should have ripple.
    */
  var rippled: js.UndefOr[String] = js.native
  /**
    * Added to the root in case its static.
    */
  var static: js.UndefOr[String] = js.native
  /**
    * Added to the root when position is top left.
    */
  var topLeft: js.UndefOr[String] = js.native
  /**
    * Added to the root when position is top right.
    */
  var topRight: js.UndefOr[String] = js.native
}

object MenuTheme {
  @scala.inline
  def apply(): MenuTheme = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MenuTheme]
  }
  @scala.inline
  implicit class MenuThemeOps[Self <: MenuTheme] (val x: Self) extends AnyVal {
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
    def setActive(value: String): Self = this.set("active", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    @scala.inline
    def setBottomLeft(value: String): Self = this.set("bottomLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBottomLeft: Self = this.set("bottomLeft", js.undefined)
    @scala.inline
    def setBottomRight(value: String): Self = this.set("bottomRight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBottomRight: Self = this.set("bottomRight", js.undefined)
    @scala.inline
    def setMenu(value: String): Self = this.set("menu", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMenu: Self = this.set("menu", js.undefined)
    @scala.inline
    def setMenuInner(value: String): Self = this.set("menuInner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMenuInner: Self = this.set("menuInner", js.undefined)
    @scala.inline
    def setOutline(value: String): Self = this.set("outline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutline: Self = this.set("outline", js.undefined)
    @scala.inline
    def setRippled(value: String): Self = this.set("rippled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRippled: Self = this.set("rippled", js.undefined)
    @scala.inline
    def setStatic(value: String): Self = this.set("static", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatic: Self = this.set("static", js.undefined)
    @scala.inline
    def setTopLeft(value: String): Self = this.set("topLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTopLeft: Self = this.set("topLeft", js.undefined)
    @scala.inline
    def setTopRight(value: String): Self = this.set("topRight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTopRight: Self = this.set("topRight", js.undefined)
  }
  
}

