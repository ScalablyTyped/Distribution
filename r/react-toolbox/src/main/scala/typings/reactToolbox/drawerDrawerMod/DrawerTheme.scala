package typings.reactToolbox.drawerDrawerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DrawerTheme extends js.Object {
  /**
    * Used for the root class when the drawer is active.
    */
  var active: js.UndefOr[String] = js.native
  /**
    * Used for the drawer content.
    */
  var content: js.UndefOr[String] = js.native
  /**
    * Root class.
    */
  var drawer: js.UndefOr[String] = js.native
  /**
    * Added to the root class when drawer is to the left.
    */
  var left: js.UndefOr[String] = js.native
  /**
    * Added to the root class when drawer is to the right.
    */
  var right: js.UndefOr[String] = js.native
  /**
    * A wrapper class for the top of the root.
    */
  var wrapper: js.UndefOr[String] = js.native
}

object DrawerTheme {
  @scala.inline
  def apply(): DrawerTheme = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DrawerTheme]
  }
  @scala.inline
  implicit class DrawerThemeOps[Self <: DrawerTheme] (val x: Self) extends AnyVal {
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
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    @scala.inline
    def setDrawer(value: String): Self = this.set("drawer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDrawer: Self = this.set("drawer", js.undefined)
    @scala.inline
    def setLeft(value: String): Self = this.set("left", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeft: Self = this.set("left", js.undefined)
    @scala.inline
    def setRight(value: String): Self = this.set("right", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRight: Self = this.set("right", js.undefined)
    @scala.inline
    def setWrapper(value: String): Self = this.set("wrapper", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWrapper: Self = this.set("wrapper", js.undefined)
  }
  
}

