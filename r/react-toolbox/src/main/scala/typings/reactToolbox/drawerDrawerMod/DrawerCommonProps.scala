package typings.reactToolbox.drawerDrawerMod

import typings.react.mod.ReactNode
import typings.reactToolbox.reactToolboxStrings.left
import typings.reactToolbox.reactToolboxStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DrawerCommonProps extends js.Object {
  /**
    * If true, the drawer will be visible.
    * @default false
    */
  var active: js.UndefOr[Boolean] = js.native
  /**
    * Children to pass through the component.
    */
  var children: js.UndefOr[ReactNode] = js.native
  /**
    * If true the Drawer is rendered inside the normal tree.
    * @default false
    */
  var insideTree: js.UndefOr[Boolean] = js.native
  /**
    * Callback function to be invoked when the overlay is clicked.
    */
  var onOverlayClick: js.UndefOr[js.Function] = js.native
  /**
    * Type of drawer. It can be left or right to display the drawer on the left or right side of the screen.
    * @default left
    */
  var `type`: js.UndefOr[left | right] = js.native
  /**
    * If true display an Overlay that locks the scroll when the Drawer is active.
    * @default true
    */
  var withOverlay: js.UndefOr[Boolean] = js.native
}

object DrawerCommonProps {
  @scala.inline
  def apply(): DrawerCommonProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DrawerCommonProps]
  }
  @scala.inline
  implicit class DrawerCommonPropsOps[Self <: DrawerCommonProps] (val x: Self) extends AnyVal {
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
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setInsideTree(value: Boolean): Self = this.set("insideTree", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInsideTree: Self = this.set("insideTree", js.undefined)
    @scala.inline
    def setOnOverlayClick(value: js.Function): Self = this.set("onOverlayClick", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnOverlayClick: Self = this.set("onOverlayClick", js.undefined)
    @scala.inline
    def setType(value: left | right): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setWithOverlay(value: Boolean): Self = this.set("withOverlay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWithOverlay: Self = this.set("withOverlay", js.undefined)
  }
  
}

