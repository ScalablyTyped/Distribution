package typings.senchaUnderscoreTouch.ExtNs.viewportNs

import typings.senchaUnderscoreTouch.ExtNs.IContainer
import typings.senchaUnderscoreTouch.ExtNs.IMenu
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDefault extends IContainer {
  /** [Config Option] (Boolean) */
  var autoMaximize: js.UndefOr[Boolean] = js.undefined
  /** [Method] Returns the value of autoMaximize
  		* @returns Boolean
  		*/
  var getAutoMaximize: js.UndefOr[js.Function0[Boolean]] = js.undefined
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
  var getPreventPanning: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns the value of preventZooming
  		* @returns Boolean
  		*/
  var getPreventZooming: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns the value of useBodyElement
  		* @returns Boolean
  		*/
  var getUseBodyElement: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Retrieves the document height
  		* @returns Number height in pixels.
  		*/
  var getWindowHeight: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Retrieves the document width
  		* @returns Number width in pixels.
  		*/
  var getWindowWidth: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Hides all visible menus
  		* @param animation Object
  		*/
  var hideAllMenus: js.UndefOr[js.Function1[/* animation */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Hides a menu specified by the menu s side
  		* @param side String The side which the menu is placed.
  		*/
  var hideMenu: js.UndefOr[js.Function1[/* side */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  /** [Method] Hides all menus except for the side specified
  		* @param side String Side(s) not to hide
  		* @param animation String Animation to hide with
  		*/
  var hideOtherMenus: js.UndefOr[
    js.Function2[
      /* side */ js.UndefOr[java.lang.String], 
      /* animation */ js.UndefOr[java.lang.String], 
      Unit
    ]
  ] = js.undefined
  /** [Property] (Boolean) */
  var isReady: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var preventPanning: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var preventZooming: js.UndefOr[Boolean] = js.undefined
  /** [Method] Removes a menu from a specified side
  		* @param side String The side to remove the menu from
  		*/
  var removeMenu: js.UndefOr[js.Function1[/* side */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  /** [Method] Sets the value of autoMaximize
  		* @param autoMaximize Boolean The new value.
  		*/
  var setAutoMaximize: js.UndefOr[js.Function1[/* autoMaximize */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets a menu for a given side of the Viewport
  		* @param menu Ext.Menu The menu to assign to the viewport
  		* @param config Object The configuration for the menu.
  		*/
  var setMenu: js.UndefOr[
    js.Function2[/* menu */ js.UndefOr[IMenu], /* config */ js.UndefOr[js.Any], Unit]
  ] = js.undefined
  /** [Method] Sets the value of preventPanning
  		* @param preventPanning Boolean The new value.
  		*/
  var setPreventPanning: js.UndefOr[js.Function1[/* preventPanning */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of preventZooming
  		* @param preventZooming Boolean The new value.
  		*/
  var setPreventZooming: js.UndefOr[js.Function1[/* preventZooming */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of useBodyElement
  		* @param useBodyElement Boolean The new value.
  		*/
  var setUseBodyElement: js.UndefOr[js.Function1[/* useBodyElement */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Shows a menu specified by the menu s side
  		* @param side String The side which the menu is placed.
  		*/
  var showMenu: js.UndefOr[js.Function1[/* side */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  /** [Method] Toggles the menu specified by side
  		* @param side String The side which the menu is placed.
  		*/
  var toggleMenu: js.UndefOr[js.Function1[/* side */ js.UndefOr[java.lang.String], Unit]] = js.undefined
}

object IDefault {
  @scala.inline
  def apply(
    IContainer: IContainer = null,
    autoMaximize: js.UndefOr[Boolean] = js.undefined,
    getAutoMaximize: () => Boolean = null,
    getLayout: () => _ = null,
    getOrientation: () => java.lang.String = null,
    getPreventPanning: () => Boolean = null,
    getPreventZooming: () => Boolean = null,
    getSize: () => _ = null,
    getUseBodyElement: () => Boolean = null,
    getWindowHeight: () => Double = null,
    getWindowWidth: () => Double = null,
    hideAllMenus: /* animation */ js.UndefOr[js.Any] => Unit = null,
    hideMenu: /* side */ js.UndefOr[java.lang.String] => Unit = null,
    hideOtherMenus: (/* side */ js.UndefOr[java.lang.String], /* animation */ js.UndefOr[java.lang.String]) => Unit = null,
    id: java.lang.String = null,
    isReady: js.UndefOr[Boolean] = js.undefined,
    layout: js.Any = null,
    preventPanning: js.UndefOr[Boolean] = js.undefined,
    preventZooming: js.UndefOr[Boolean] = js.undefined,
    removeMenu: /* side */ js.UndefOr[java.lang.String] => Unit = null,
    setAutoMaximize: /* autoMaximize */ js.UndefOr[Boolean] => Unit = null,
    setLayout: /* layout */ js.UndefOr[js.Any] => Unit = null,
    setMenu: (/* menu */ js.UndefOr[IMenu], /* config */ js.UndefOr[js.Any]) => Unit = null,
    setPreventPanning: /* preventPanning */ js.UndefOr[Boolean] => Unit = null,
    setPreventZooming: /* preventZooming */ js.UndefOr[Boolean] => Unit = null,
    setUseBodyElement: /* useBodyElement */ js.UndefOr[Boolean] => Unit = null,
    showMenu: /* side */ js.UndefOr[java.lang.String] => Unit = null,
    toggleMenu: /* side */ js.UndefOr[java.lang.String] => Unit = null
  ): IDefault = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IContainer)
    if (!js.isUndefined(autoMaximize)) __obj.updateDynamic("autoMaximize")(autoMaximize)
    if (getAutoMaximize != null) __obj.updateDynamic("getAutoMaximize")(js.Any.fromFunction0(getAutoMaximize))
    if (getLayout != null) __obj.updateDynamic("getLayout")(js.Any.fromFunction0(getLayout))
    if (getOrientation != null) __obj.updateDynamic("getOrientation")(js.Any.fromFunction0(getOrientation))
    if (getPreventPanning != null) __obj.updateDynamic("getPreventPanning")(js.Any.fromFunction0(getPreventPanning))
    if (getPreventZooming != null) __obj.updateDynamic("getPreventZooming")(js.Any.fromFunction0(getPreventZooming))
    if (getSize != null) __obj.updateDynamic("getSize")(js.Any.fromFunction0(getSize))
    if (getUseBodyElement != null) __obj.updateDynamic("getUseBodyElement")(js.Any.fromFunction0(getUseBodyElement))
    if (getWindowHeight != null) __obj.updateDynamic("getWindowHeight")(js.Any.fromFunction0(getWindowHeight))
    if (getWindowWidth != null) __obj.updateDynamic("getWindowWidth")(js.Any.fromFunction0(getWindowWidth))
    if (hideAllMenus != null) __obj.updateDynamic("hideAllMenus")(js.Any.fromFunction1(hideAllMenus))
    if (hideMenu != null) __obj.updateDynamic("hideMenu")(js.Any.fromFunction1(hideMenu))
    if (hideOtherMenus != null) __obj.updateDynamic("hideOtherMenus")(js.Any.fromFunction2(hideOtherMenus))
    if (id != null) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(isReady)) __obj.updateDynamic("isReady")(isReady)
    if (layout != null) __obj.updateDynamic("layout")(layout)
    if (!js.isUndefined(preventPanning)) __obj.updateDynamic("preventPanning")(preventPanning)
    if (!js.isUndefined(preventZooming)) __obj.updateDynamic("preventZooming")(preventZooming)
    if (removeMenu != null) __obj.updateDynamic("removeMenu")(js.Any.fromFunction1(removeMenu))
    if (setAutoMaximize != null) __obj.updateDynamic("setAutoMaximize")(js.Any.fromFunction1(setAutoMaximize))
    if (setLayout != null) __obj.updateDynamic("setLayout")(js.Any.fromFunction1(setLayout))
    if (setMenu != null) __obj.updateDynamic("setMenu")(js.Any.fromFunction2(setMenu))
    if (setPreventPanning != null) __obj.updateDynamic("setPreventPanning")(js.Any.fromFunction1(setPreventPanning))
    if (setPreventZooming != null) __obj.updateDynamic("setPreventZooming")(js.Any.fromFunction1(setPreventZooming))
    if (setUseBodyElement != null) __obj.updateDynamic("setUseBodyElement")(js.Any.fromFunction1(setUseBodyElement))
    if (showMenu != null) __obj.updateDynamic("showMenu")(js.Any.fromFunction1(showMenu))
    if (toggleMenu != null) __obj.updateDynamic("toggleMenu")(js.Any.fromFunction1(toggleMenu))
    __obj.asInstanceOf[IDefault]
  }
}

