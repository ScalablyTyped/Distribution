package typings.reactToolbox.navDrawerMod

import typings.reactToolbox.drawerDrawerMod.DrawerCommonProps
import typings.reactToolbox.reactToolboxStrings.lg
import typings.reactToolbox.reactToolboxStrings.lgTablet
import typings.reactToolbox.reactToolboxStrings.md
import typings.reactToolbox.reactToolboxStrings.sm
import typings.reactToolbox.reactToolboxStrings.smTablet
import typings.reactToolbox.reactToolboxStrings.xl
import typings.reactToolbox.reactToolboxStrings.xxl
import typings.reactToolbox.reactToolboxStrings.xxxl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavDrawerProps extends DrawerCommonProps {
  /**
    * If true, when the `AppBar` gets pinned, it will stand over the `Drawer`.
    * @default false
    */
  var clipped: js.UndefOr[Boolean] = js.native
  /**
    * The breakpoint at which the drawer is automatically pinned.
    */
  var permanentAt: js.UndefOr[sm | smTablet | md | lg | lgTablet | xl | xxl | xxxl] = js.native
  /**
    * If true, the drawer will be pinned open. pinned takes precedence over active.
    * @default false
    */
  var pinned: js.UndefOr[Boolean] = js.native
  /**
    * Classnames object defining the component style.
    */
  var theme: js.UndefOr[NavDrawerTheme] = js.native
}

object NavDrawerProps {
  @scala.inline
  def apply(): NavDrawerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavDrawerProps]
  }
  @scala.inline
  implicit class NavDrawerPropsOps[Self <: NavDrawerProps] (val x: Self) extends AnyVal {
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
    def setClipped(value: Boolean): Self = this.set("clipped", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClipped: Self = this.set("clipped", js.undefined)
    @scala.inline
    def setPermanentAt(value: sm | smTablet | md | lg | lgTablet | xl | xxl | xxxl): Self = this.set("permanentAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePermanentAt: Self = this.set("permanentAt", js.undefined)
    @scala.inline
    def setPinned(value: Boolean): Self = this.set("pinned", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePinned: Self = this.set("pinned", js.undefined)
    @scala.inline
    def setTheme(value: NavDrawerTheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
  }
  
}

