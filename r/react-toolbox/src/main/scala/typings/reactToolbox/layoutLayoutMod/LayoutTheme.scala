package typings.reactToolbox.layoutLayoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LayoutTheme extends js.Object {
  var appbarFixed: js.UndefOr[String] = js.native
  /**
    * The root class that wraps the whole layout.
    */
  var layout: js.UndefOr[String] = js.native
  /**
    * Added to the root if there is a clipped NavDrawer.
    */
  var navDrawerClipped: js.UndefOr[String] = js.native
  /**
    * Added to the root if there is a pinned `NavDrawer`
    */
  var navDrawerPinned: js.UndefOr[String] = js.native
  /**
    * Added to the root if there is a clipped sidebar.
    */
  var sidebarClipped: js.UndefOr[String] = js.native
  /**
    * Added to the root if there is a pinned sidebar.
    */
  var sidebarPinned: js.UndefOr[String] = js.native
  /**
    * Added to the root element in case there is a sidebar present. width correspond to the value passed to the `Sidebar`.
    */
  var sidebarWidth1: js.UndefOr[String] = js.native
  var sidebarWidth10: js.UndefOr[String] = js.native
  var sidebarWidth100: js.UndefOr[String] = js.native
  var sidebarWidth11: js.UndefOr[String] = js.native
  var sidebarWidth12: js.UndefOr[String] = js.native
  var sidebarWidth2: js.UndefOr[String] = js.native
  var sidebarWidth25: js.UndefOr[String] = js.native
  var sidebarWidth3: js.UndefOr[String] = js.native
  var sidebarWidth33: js.UndefOr[String] = js.native
  var sidebarWidth4: js.UndefOr[String] = js.native
  var sidebarWidth5: js.UndefOr[String] = js.native
  var sidebarWidth50: js.UndefOr[String] = js.native
  var sidebarWidth6: js.UndefOr[String] = js.native
  var sidebarWidth66: js.UndefOr[String] = js.native
  var sidebarWidth7: js.UndefOr[String] = js.native
  var sidebarWidth75: js.UndefOr[String] = js.native
  var sidebarWidth8: js.UndefOr[String] = js.native
  var sidebarWidth9: js.UndefOr[String] = js.native
}

object LayoutTheme {
  @scala.inline
  def apply(): LayoutTheme = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LayoutTheme]
  }
  @scala.inline
  implicit class LayoutThemeOps[Self <: LayoutTheme] (val x: Self) extends AnyVal {
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
    def setAppbarFixed(value: String): Self = this.set("appbarFixed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppbarFixed: Self = this.set("appbarFixed", js.undefined)
    @scala.inline
    def setLayout(value: String): Self = this.set("layout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayout: Self = this.set("layout", js.undefined)
    @scala.inline
    def setNavDrawerClipped(value: String): Self = this.set("navDrawerClipped", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNavDrawerClipped: Self = this.set("navDrawerClipped", js.undefined)
    @scala.inline
    def setNavDrawerPinned(value: String): Self = this.set("navDrawerPinned", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNavDrawerPinned: Self = this.set("navDrawerPinned", js.undefined)
    @scala.inline
    def setSidebarClipped(value: String): Self = this.set("sidebarClipped", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSidebarClipped: Self = this.set("sidebarClipped", js.undefined)
    @scala.inline
    def setSidebarPinned(value: String): Self = this.set("sidebarPinned", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSidebarPinned: Self = this.set("sidebarPinned", js.undefined)
    @scala.inline
    def setSidebarWidth1(value: String): Self = this.set("sidebarWidth1", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSidebarWidth1: Self = this.set("sidebarWidth1", js.undefined)
    @scala.inline
    def setSidebarWidth10(value: String): Self = this.set("sidebarWidth10", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSidebarWidth10: Self = this.set("sidebarWidth10", js.undefined)
    @scala.inline
    def setSidebarWidth100(value: String): Self = this.set("sidebarWidth100", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSidebarWidth100: Self = this.set("sidebarWidth100", js.undefined)
    @scala.inline
    def setSidebarWidth11(value: String): Self = this.set("sidebarWidth11", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSidebarWidth11: Self = this.set("sidebarWidth11", js.undefined)
    @scala.inline
    def setSidebarWidth12(value: String): Self = this.set("sidebarWidth12", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSidebarWidth12: Self = this.set("sidebarWidth12", js.undefined)
    @scala.inline
    def setSidebarWidth2(value: String): Self = this.set("sidebarWidth2", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSidebarWidth2: Self = this.set("sidebarWidth2", js.undefined)
    @scala.inline
    def setSidebarWidth25(value: String): Self = this.set("sidebarWidth25", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSidebarWidth25: Self = this.set("sidebarWidth25", js.undefined)
    @scala.inline
    def setSidebarWidth3(value: String): Self = this.set("sidebarWidth3", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSidebarWidth3: Self = this.set("sidebarWidth3", js.undefined)
    @scala.inline
    def setSidebarWidth33(value: String): Self = this.set("sidebarWidth33", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSidebarWidth33: Self = this.set("sidebarWidth33", js.undefined)
    @scala.inline
    def setSidebarWidth4(value: String): Self = this.set("sidebarWidth4", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSidebarWidth4: Self = this.set("sidebarWidth4", js.undefined)
    @scala.inline
    def setSidebarWidth5(value: String): Self = this.set("sidebarWidth5", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSidebarWidth5: Self = this.set("sidebarWidth5", js.undefined)
    @scala.inline
    def setSidebarWidth50(value: String): Self = this.set("sidebarWidth50", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSidebarWidth50: Self = this.set("sidebarWidth50", js.undefined)
    @scala.inline
    def setSidebarWidth6(value: String): Self = this.set("sidebarWidth6", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSidebarWidth6: Self = this.set("sidebarWidth6", js.undefined)
    @scala.inline
    def setSidebarWidth66(value: String): Self = this.set("sidebarWidth66", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSidebarWidth66: Self = this.set("sidebarWidth66", js.undefined)
    @scala.inline
    def setSidebarWidth7(value: String): Self = this.set("sidebarWidth7", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSidebarWidth7: Self = this.set("sidebarWidth7", js.undefined)
    @scala.inline
    def setSidebarWidth75(value: String): Self = this.set("sidebarWidth75", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSidebarWidth75: Self = this.set("sidebarWidth75", js.undefined)
    @scala.inline
    def setSidebarWidth8(value: String): Self = this.set("sidebarWidth8", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSidebarWidth8: Self = this.set("sidebarWidth8", js.undefined)
    @scala.inline
    def setSidebarWidth9(value: String): Self = this.set("sidebarWidth9", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSidebarWidth9: Self = this.set("sidebarWidth9", js.undefined)
  }
  
}

