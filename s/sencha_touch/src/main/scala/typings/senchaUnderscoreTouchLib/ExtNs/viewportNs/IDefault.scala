package typings
package senchaUnderscoreTouchLib.ExtNs.viewportNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDefault
  extends senchaUnderscoreTouchLib.ExtNs.IContainer {
  /** [Config Option] (Boolean) */
  var autoMaximize: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Returns the value of autoMaximize
  		* @returns Boolean
  		*/
  var getAutoMaximize: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns the value of layout
  		* @returns Object/String
  		*/
  var getLayout: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the current orientation
  		* @returns String portrait or landscape
  		*/
  var getOrientation: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of preventPanning
  		* @returns Boolean
  		*/
  var getPreventPanning: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns the value of preventZooming
  		* @returns Boolean
  		*/
  var getPreventZooming: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns the value of useBodyElement
  		* @returns Boolean
  		*/
  var getUseBodyElement: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Retrieves the document height
  		* @returns Number height in pixels.
  		*/
  var getWindowHeight: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Retrieves the document width
  		* @returns Number width in pixels.
  		*/
  var getWindowWidth: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Hides all visible menus
  		* @param animation Object
  		*/
  var hideAllMenus: js.UndefOr[js.Function1[/* animation */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Hides a menu specified by the menu s side
  		* @param side String The side which the menu is placed.
  		*/
  var hideMenu: js.UndefOr[js.Function1[/* side */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Hides all menus except for the side specified
  		* @param side String Side(s) not to hide
  		* @param animation String Animation to hide with
  		*/
  var hideOtherMenus: js.UndefOr[
    js.Function2[
      /* side */ js.UndefOr[java.lang.String], 
      /* animation */ js.UndefOr[java.lang.String], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Property] (Boolean) */
  var isReady: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var preventPanning: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var preventZooming: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Removes a menu from a specified side
  		* @param side String The side to remove the menu from
  		*/
  var removeMenu: js.UndefOr[js.Function1[/* side */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of autoMaximize
  		* @param autoMaximize Boolean The new value.
  		*/
  var setAutoMaximize: js.UndefOr[js.Function1[/* autoMaximize */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets a menu for a given side of the Viewport
  		* @param menu Ext.Menu The menu to assign to the viewport
  		* @param config Object The configuration for the menu.
  		*/
  var setMenu: js.UndefOr[
    js.Function2[
      /* menu */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.IMenu], 
      /* config */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] Sets the value of preventPanning
  		* @param preventPanning Boolean The new value.
  		*/
  var setPreventPanning: js.UndefOr[js.Function1[/* preventPanning */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of preventZooming
  		* @param preventZooming Boolean The new value.
  		*/
  var setPreventZooming: js.UndefOr[js.Function1[/* preventZooming */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of useBodyElement
  		* @param useBodyElement Boolean The new value.
  		*/
  var setUseBodyElement: js.UndefOr[js.Function1[/* useBodyElement */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Shows a menu specified by the menu s side
  		* @param side String The side which the menu is placed.
  		*/
  var showMenu: js.UndefOr[js.Function1[/* side */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Toggles the menu specified by side
  		* @param side String The side which the menu is placed.
  		*/
  var toggleMenu: js.UndefOr[js.Function1[/* side */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
}

object IDefault {
  @scala.inline
  def apply(
    IContainer: senchaUnderscoreTouchLib.ExtNs.IContainer = null,
    autoMaximize: js.UndefOr[scala.Boolean] = js.undefined,
    getAutoMaximize: js.Function0[scala.Boolean] = null,
    getLayout: js.Function0[_] = null,
    getOrientation: js.Function0[java.lang.String] = null,
    getPreventPanning: js.Function0[scala.Boolean] = null,
    getPreventZooming: js.Function0[scala.Boolean] = null,
    getSize: js.Function0[_] = null,
    getUseBodyElement: js.Function0[scala.Boolean] = null,
    getWindowHeight: js.Function0[scala.Double] = null,
    getWindowWidth: js.Function0[scala.Double] = null,
    hideAllMenus: js.Function1[/* animation */ js.UndefOr[js.Any], scala.Unit] = null,
    hideMenu: js.Function1[/* side */ js.UndefOr[java.lang.String], scala.Unit] = null,
    hideOtherMenus: js.Function2[
      /* side */ js.UndefOr[java.lang.String], 
      /* animation */ js.UndefOr[java.lang.String], 
      scala.Unit
    ] = null,
    id: java.lang.String = null,
    isReady: js.UndefOr[scala.Boolean] = js.undefined,
    layout: js.Any = null,
    preventPanning: js.UndefOr[scala.Boolean] = js.undefined,
    preventZooming: js.UndefOr[scala.Boolean] = js.undefined,
    removeMenu: js.Function1[/* side */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setAutoMaximize: js.Function1[/* autoMaximize */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    setLayout: js.Function1[/* layout */ js.UndefOr[js.Any], scala.Unit] = null,
    setMenu: js.Function2[
      /* menu */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.IMenu], 
      /* config */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    setPreventPanning: js.Function1[/* preventPanning */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    setPreventZooming: js.Function1[/* preventZooming */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    setUseBodyElement: js.Function1[/* useBodyElement */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    showMenu: js.Function1[/* side */ js.UndefOr[java.lang.String], scala.Unit] = null,
    toggleMenu: js.Function1[/* side */ js.UndefOr[java.lang.String], scala.Unit] = null
  ): IDefault = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IContainer)
    if (!js.isUndefined(autoMaximize)) __obj.updateDynamic("autoMaximize")(autoMaximize)
    if (getAutoMaximize != null) __obj.updateDynamic("getAutoMaximize")(getAutoMaximize)
    if (getLayout != null) __obj.updateDynamic("getLayout")(getLayout)
    if (getOrientation != null) __obj.updateDynamic("getOrientation")(getOrientation)
    if (getPreventPanning != null) __obj.updateDynamic("getPreventPanning")(getPreventPanning)
    if (getPreventZooming != null) __obj.updateDynamic("getPreventZooming")(getPreventZooming)
    if (getSize != null) __obj.updateDynamic("getSize")(getSize)
    if (getUseBodyElement != null) __obj.updateDynamic("getUseBodyElement")(getUseBodyElement)
    if (getWindowHeight != null) __obj.updateDynamic("getWindowHeight")(getWindowHeight)
    if (getWindowWidth != null) __obj.updateDynamic("getWindowWidth")(getWindowWidth)
    if (hideAllMenus != null) __obj.updateDynamic("hideAllMenus")(hideAllMenus)
    if (hideMenu != null) __obj.updateDynamic("hideMenu")(hideMenu)
    if (hideOtherMenus != null) __obj.updateDynamic("hideOtherMenus")(hideOtherMenus)
    if (id != null) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(isReady)) __obj.updateDynamic("isReady")(isReady)
    if (layout != null) __obj.updateDynamic("layout")(layout)
    if (!js.isUndefined(preventPanning)) __obj.updateDynamic("preventPanning")(preventPanning)
    if (!js.isUndefined(preventZooming)) __obj.updateDynamic("preventZooming")(preventZooming)
    if (removeMenu != null) __obj.updateDynamic("removeMenu")(removeMenu)
    if (setAutoMaximize != null) __obj.updateDynamic("setAutoMaximize")(setAutoMaximize)
    if (setLayout != null) __obj.updateDynamic("setLayout")(setLayout)
    if (setMenu != null) __obj.updateDynamic("setMenu")(setMenu)
    if (setPreventPanning != null) __obj.updateDynamic("setPreventPanning")(setPreventPanning)
    if (setPreventZooming != null) __obj.updateDynamic("setPreventZooming")(setPreventZooming)
    if (setUseBodyElement != null) __obj.updateDynamic("setUseBodyElement")(setUseBodyElement)
    if (showMenu != null) __obj.updateDynamic("showMenu")(showMenu)
    if (toggleMenu != null) __obj.updateDynamic("toggleMenu")(toggleMenu)
    __obj.asInstanceOf[IDefault]
  }
}

