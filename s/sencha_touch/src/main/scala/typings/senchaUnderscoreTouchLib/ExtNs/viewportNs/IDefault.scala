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

