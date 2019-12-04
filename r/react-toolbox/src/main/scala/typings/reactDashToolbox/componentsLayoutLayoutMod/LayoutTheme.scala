package typings.reactDashToolbox.componentsLayoutLayoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayoutTheme extends js.Object {
  var appbarFixed: js.UndefOr[String] = js.undefined
  /**
    * The root class that wraps the whole layout.
    */
  var layout: js.UndefOr[String] = js.undefined
  /**
    * Added to the root if there is a clipped NavDrawer.
    */
  var navDrawerClipped: js.UndefOr[String] = js.undefined
  /**
    * Added to the root if there is a pinned `NavDrawer`
    */
  var navDrawerPinned: js.UndefOr[String] = js.undefined
  /**
    * Added to the root if there is a clipped sidebar.
    */
  var sidebarClipped: js.UndefOr[String] = js.undefined
  /**
    * Added to the root if there is a pinned sidebar.
    */
  var sidebarPinned: js.UndefOr[String] = js.undefined
  /**
    * Added to the root element in case there is a sidebar present. width correspond to the value passed to the `Sidebar`.
    */
  var sidebarWidth1: js.UndefOr[String] = js.undefined
  var sidebarWidth10: js.UndefOr[String] = js.undefined
  var sidebarWidth100: js.UndefOr[String] = js.undefined
  var sidebarWidth11: js.UndefOr[String] = js.undefined
  var sidebarWidth12: js.UndefOr[String] = js.undefined
  var sidebarWidth2: js.UndefOr[String] = js.undefined
  var sidebarWidth25: js.UndefOr[String] = js.undefined
  var sidebarWidth3: js.UndefOr[String] = js.undefined
  var sidebarWidth33: js.UndefOr[String] = js.undefined
  var sidebarWidth4: js.UndefOr[String] = js.undefined
  var sidebarWidth5: js.UndefOr[String] = js.undefined
  var sidebarWidth50: js.UndefOr[String] = js.undefined
  var sidebarWidth6: js.UndefOr[String] = js.undefined
  var sidebarWidth66: js.UndefOr[String] = js.undefined
  var sidebarWidth7: js.UndefOr[String] = js.undefined
  var sidebarWidth75: js.UndefOr[String] = js.undefined
  var sidebarWidth8: js.UndefOr[String] = js.undefined
  var sidebarWidth9: js.UndefOr[String] = js.undefined
}

object LayoutTheme {
  @scala.inline
  def apply(
    appbarFixed: String = null,
    layout: String = null,
    navDrawerClipped: String = null,
    navDrawerPinned: String = null,
    sidebarClipped: String = null,
    sidebarPinned: String = null,
    sidebarWidth1: String = null,
    sidebarWidth10: String = null,
    sidebarWidth100: String = null,
    sidebarWidth11: String = null,
    sidebarWidth12: String = null,
    sidebarWidth2: String = null,
    sidebarWidth25: String = null,
    sidebarWidth3: String = null,
    sidebarWidth33: String = null,
    sidebarWidth4: String = null,
    sidebarWidth5: String = null,
    sidebarWidth50: String = null,
    sidebarWidth6: String = null,
    sidebarWidth66: String = null,
    sidebarWidth7: String = null,
    sidebarWidth75: String = null,
    sidebarWidth8: String = null,
    sidebarWidth9: String = null
  ): LayoutTheme = {
    val __obj = js.Dynamic.literal()
    if (appbarFixed != null) __obj.updateDynamic("appbarFixed")(appbarFixed.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (navDrawerClipped != null) __obj.updateDynamic("navDrawerClipped")(navDrawerClipped.asInstanceOf[js.Any])
    if (navDrawerPinned != null) __obj.updateDynamic("navDrawerPinned")(navDrawerPinned.asInstanceOf[js.Any])
    if (sidebarClipped != null) __obj.updateDynamic("sidebarClipped")(sidebarClipped.asInstanceOf[js.Any])
    if (sidebarPinned != null) __obj.updateDynamic("sidebarPinned")(sidebarPinned.asInstanceOf[js.Any])
    if (sidebarWidth1 != null) __obj.updateDynamic("sidebarWidth1")(sidebarWidth1.asInstanceOf[js.Any])
    if (sidebarWidth10 != null) __obj.updateDynamic("sidebarWidth10")(sidebarWidth10.asInstanceOf[js.Any])
    if (sidebarWidth100 != null) __obj.updateDynamic("sidebarWidth100")(sidebarWidth100.asInstanceOf[js.Any])
    if (sidebarWidth11 != null) __obj.updateDynamic("sidebarWidth11")(sidebarWidth11.asInstanceOf[js.Any])
    if (sidebarWidth12 != null) __obj.updateDynamic("sidebarWidth12")(sidebarWidth12.asInstanceOf[js.Any])
    if (sidebarWidth2 != null) __obj.updateDynamic("sidebarWidth2")(sidebarWidth2.asInstanceOf[js.Any])
    if (sidebarWidth25 != null) __obj.updateDynamic("sidebarWidth25")(sidebarWidth25.asInstanceOf[js.Any])
    if (sidebarWidth3 != null) __obj.updateDynamic("sidebarWidth3")(sidebarWidth3.asInstanceOf[js.Any])
    if (sidebarWidth33 != null) __obj.updateDynamic("sidebarWidth33")(sidebarWidth33.asInstanceOf[js.Any])
    if (sidebarWidth4 != null) __obj.updateDynamic("sidebarWidth4")(sidebarWidth4.asInstanceOf[js.Any])
    if (sidebarWidth5 != null) __obj.updateDynamic("sidebarWidth5")(sidebarWidth5.asInstanceOf[js.Any])
    if (sidebarWidth50 != null) __obj.updateDynamic("sidebarWidth50")(sidebarWidth50.asInstanceOf[js.Any])
    if (sidebarWidth6 != null) __obj.updateDynamic("sidebarWidth6")(sidebarWidth6.asInstanceOf[js.Any])
    if (sidebarWidth66 != null) __obj.updateDynamic("sidebarWidth66")(sidebarWidth66.asInstanceOf[js.Any])
    if (sidebarWidth7 != null) __obj.updateDynamic("sidebarWidth7")(sidebarWidth7.asInstanceOf[js.Any])
    if (sidebarWidth75 != null) __obj.updateDynamic("sidebarWidth75")(sidebarWidth75.asInstanceOf[js.Any])
    if (sidebarWidth8 != null) __obj.updateDynamic("sidebarWidth8")(sidebarWidth8.asInstanceOf[js.Any])
    if (sidebarWidth9 != null) __obj.updateDynamic("sidebarWidth9")(sidebarWidth9.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayoutTheme]
  }
}

