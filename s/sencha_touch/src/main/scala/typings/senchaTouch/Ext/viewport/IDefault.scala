package typings.senchaTouch.Ext.viewport

import typings.senchaTouch.Ext.IContainer
import typings.senchaTouch.Ext.IMenu
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDefault extends IContainer {
  /** [Config Option] (Boolean) */
  var autoMaximize: js.UndefOr[Boolean] = js.native
  /** [Method] Returns the value of autoMaximize
    * @returns Boolean
    */
  var getAutoMaximize: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of layout
    * @returns Object/String
    */
  var getLayout: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the current orientation
    * @returns String portrait or landscape
    */
  var getOrientation: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of preventPanning
    * @returns Boolean
    */
  var getPreventPanning: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of preventZooming
    * @returns Boolean
    */
  var getPreventZooming: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of useBodyElement
    * @returns Boolean
    */
  var getUseBodyElement: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Retrieves the document height
    * @returns Number height in pixels.
    */
  var getWindowHeight: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Retrieves the document width
    * @returns Number width in pixels.
    */
  var getWindowWidth: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Hides all visible menus
    * @param animation Object
    */
  var hideAllMenus: js.UndefOr[js.Function1[/* animation */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Hides a menu specified by the menu s side
    * @param side String The side which the menu is placed.
    */
  var hideMenu: js.UndefOr[js.Function1[/* side */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Hides all menus except for the side specified
    * @param side String Side(s) not to hide
    * @param animation String Animation to hide with
    */
  var hideOtherMenus: js.UndefOr[
    js.Function2[/* side */ js.UndefOr[String], /* animation */ js.UndefOr[String], Unit]
  ] = js.native
  /** [Property] (Boolean) */
  var isReady: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var preventPanning: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var preventZooming: js.UndefOr[Boolean] = js.native
  /** [Method] Removes a menu from a specified side
    * @param side String The side to remove the menu from
    */
  var removeMenu: js.UndefOr[js.Function1[/* side */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of autoMaximize
    * @param autoMaximize Boolean The new value.
    */
  var setAutoMaximize: js.UndefOr[js.Function1[/* autoMaximize */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets a menu for a given side of the Viewport
    * @param menu Ext.Menu The menu to assign to the viewport
    * @param config Object The configuration for the menu.
    */
  var setMenu: js.UndefOr[
    js.Function2[/* menu */ js.UndefOr[IMenu], /* config */ js.UndefOr[js.Any], Unit]
  ] = js.native
  /** [Method] Sets the value of preventPanning
    * @param preventPanning Boolean The new value.
    */
  var setPreventPanning: js.UndefOr[js.Function1[/* preventPanning */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of preventZooming
    * @param preventZooming Boolean The new value.
    */
  var setPreventZooming: js.UndefOr[js.Function1[/* preventZooming */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of useBodyElement
    * @param useBodyElement Boolean The new value.
    */
  var setUseBodyElement: js.UndefOr[js.Function1[/* useBodyElement */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Shows a menu specified by the menu s side
    * @param side String The side which the menu is placed.
    */
  var showMenu: js.UndefOr[js.Function1[/* side */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Toggles the menu specified by side
    * @param side String The side which the menu is placed.
    */
  var toggleMenu: js.UndefOr[js.Function1[/* side */ js.UndefOr[String], Unit]] = js.native
}

object IDefault {
  @scala.inline
  def apply(): IDefault = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDefault]
  }
  @scala.inline
  implicit class IDefaultOps[Self <: IDefault] (val x: Self) extends AnyVal {
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
    def setAutoMaximize(value: Boolean): Self = this.set("autoMaximize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoMaximize: Self = this.set("autoMaximize", js.undefined)
    @scala.inline
    def setGetAutoMaximize(value: () => Boolean): Self = this.set("getAutoMaximize", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetAutoMaximize: Self = this.set("getAutoMaximize", js.undefined)
    @scala.inline
    def setGetLayout(value: () => _): Self = this.set("getLayout", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetLayout: Self = this.set("getLayout", js.undefined)
    @scala.inline
    def setGetOrientation(value: () => String): Self = this.set("getOrientation", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetOrientation: Self = this.set("getOrientation", js.undefined)
    @scala.inline
    def setGetPreventPanning(value: () => Boolean): Self = this.set("getPreventPanning", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetPreventPanning: Self = this.set("getPreventPanning", js.undefined)
    @scala.inline
    def setGetPreventZooming(value: () => Boolean): Self = this.set("getPreventZooming", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetPreventZooming: Self = this.set("getPreventZooming", js.undefined)
    @scala.inline
    def setGetUseBodyElement(value: () => Boolean): Self = this.set("getUseBodyElement", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetUseBodyElement: Self = this.set("getUseBodyElement", js.undefined)
    @scala.inline
    def setGetWindowHeight(value: () => Double): Self = this.set("getWindowHeight", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetWindowHeight: Self = this.set("getWindowHeight", js.undefined)
    @scala.inline
    def setGetWindowWidth(value: () => Double): Self = this.set("getWindowWidth", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetWindowWidth: Self = this.set("getWindowWidth", js.undefined)
    @scala.inline
    def setHideAllMenus(value: /* animation */ js.UndefOr[js.Any] => Unit): Self = this.set("hideAllMenus", js.Any.fromFunction1(value))
    @scala.inline
    def deleteHideAllMenus: Self = this.set("hideAllMenus", js.undefined)
    @scala.inline
    def setHideMenu(value: /* side */ js.UndefOr[String] => Unit): Self = this.set("hideMenu", js.Any.fromFunction1(value))
    @scala.inline
    def deleteHideMenu: Self = this.set("hideMenu", js.undefined)
    @scala.inline
    def setHideOtherMenus(value: (/* side */ js.UndefOr[String], /* animation */ js.UndefOr[String]) => Unit): Self = this.set("hideOtherMenus", js.Any.fromFunction2(value))
    @scala.inline
    def deleteHideOtherMenus: Self = this.set("hideOtherMenus", js.undefined)
    @scala.inline
    def setIsReady(value: Boolean): Self = this.set("isReady", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsReady: Self = this.set("isReady", js.undefined)
    @scala.inline
    def setPreventPanning(value: Boolean): Self = this.set("preventPanning", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreventPanning: Self = this.set("preventPanning", js.undefined)
    @scala.inline
    def setPreventZooming(value: Boolean): Self = this.set("preventZooming", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreventZooming: Self = this.set("preventZooming", js.undefined)
    @scala.inline
    def setRemoveMenu(value: /* side */ js.UndefOr[String] => Unit): Self = this.set("removeMenu", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRemoveMenu: Self = this.set("removeMenu", js.undefined)
    @scala.inline
    def setSetAutoMaximize(value: /* autoMaximize */ js.UndefOr[Boolean] => Unit): Self = this.set("setAutoMaximize", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetAutoMaximize: Self = this.set("setAutoMaximize", js.undefined)
    @scala.inline
    def setSetMenu(value: (/* menu */ js.UndefOr[IMenu], /* config */ js.UndefOr[js.Any]) => Unit): Self = this.set("setMenu", js.Any.fromFunction2(value))
    @scala.inline
    def deleteSetMenu: Self = this.set("setMenu", js.undefined)
    @scala.inline
    def setSetPreventPanning(value: /* preventPanning */ js.UndefOr[Boolean] => Unit): Self = this.set("setPreventPanning", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetPreventPanning: Self = this.set("setPreventPanning", js.undefined)
    @scala.inline
    def setSetPreventZooming(value: /* preventZooming */ js.UndefOr[Boolean] => Unit): Self = this.set("setPreventZooming", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetPreventZooming: Self = this.set("setPreventZooming", js.undefined)
    @scala.inline
    def setSetUseBodyElement(value: /* useBodyElement */ js.UndefOr[Boolean] => Unit): Self = this.set("setUseBodyElement", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetUseBodyElement: Self = this.set("setUseBodyElement", js.undefined)
    @scala.inline
    def setShowMenu(value: /* side */ js.UndefOr[String] => Unit): Self = this.set("showMenu", js.Any.fromFunction1(value))
    @scala.inline
    def deleteShowMenu: Self = this.set("showMenu", js.undefined)
    @scala.inline
    def setToggleMenu(value: /* side */ js.UndefOr[String] => Unit): Self = this.set("toggleMenu", js.Any.fromFunction1(value))
    @scala.inline
    def deleteToggleMenu: Self = this.set("toggleMenu", js.undefined)
  }
  
}

