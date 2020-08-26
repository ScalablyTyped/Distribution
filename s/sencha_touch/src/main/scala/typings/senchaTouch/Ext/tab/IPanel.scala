package typings.senchaTouch.Ext.tab

import typings.senchaTouch.Ext.IContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPanel extends IContainer {
  /** [Method] Updates this container with the new active item
    * @param tabBar Object
    * @param newTab Object
    * @returns Boolean
    */
  var doTabChange: js.UndefOr[
    js.Function2[/* tabBar */ js.UndefOr[js.Any], /* newTab */ js.UndefOr[js.Any], Boolean]
  ] = js.native
  /** [Method] Returns the value of cls
    * @returns String
    */
  @JSName("getCls")
  var getCls_IPanel: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of layout
    * @returns Object
    */
  var getLayout: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of tabBar
    * @returns Object
    */
  var getTabBar: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of tabBarPosition
    * @returns String
    */
  var getTabBarPosition: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Sets the value of cls
    * @param cls String The new value.
    */
  @JSName("setCls")
  var setCls_IPanel: js.UndefOr[js.Function1[/* cls */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of tabBar
    * @param tabBar Object The new value.
    */
  var setTabBar: js.UndefOr[js.Function1[/* tabBar */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of tabBarPosition
    * @param tabBarPosition String The new value.
    */
  var setTabBarPosition: js.UndefOr[js.Function1[/* tabBarPosition */ js.UndefOr[String], Unit]] = js.native
  /** [Config Option] (Object) */
  var tabBar: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Boolean) */
  var tabBarDock: js.UndefOr[Boolean] = js.native
  /** [Config Option] (String) */
  var tabBarPosition: js.UndefOr[String] = js.native
  /** [Method] Updates the Ui for this component and the tabBar
    * @param newUi Object
    * @param oldUi Object
    */
  var updateUi: js.UndefOr[
    js.Function2[/* newUi */ js.UndefOr[js.Any], /* oldUi */ js.UndefOr[js.Any], Unit]
  ] = js.native
}

object IPanel {
  @scala.inline
  def apply(): IPanel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPanel]
  }
  @scala.inline
  implicit class IPanelOps[Self <: IPanel] (val x: Self) extends AnyVal {
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
    def setDoTabChange(value: (/* tabBar */ js.UndefOr[js.Any], /* newTab */ js.UndefOr[js.Any]) => Boolean): Self = this.set("doTabChange", js.Any.fromFunction2(value))
    @scala.inline
    def deleteDoTabChange: Self = this.set("doTabChange", js.undefined)
    @scala.inline
    def setGetCls(value: () => String): Self = this.set("getCls", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetCls: Self = this.set("getCls", js.undefined)
    @scala.inline
    def setGetLayout(value: () => _): Self = this.set("getLayout", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetLayout: Self = this.set("getLayout", js.undefined)
    @scala.inline
    def setGetTabBar(value: () => _): Self = this.set("getTabBar", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetTabBar: Self = this.set("getTabBar", js.undefined)
    @scala.inline
    def setGetTabBarPosition(value: () => String): Self = this.set("getTabBarPosition", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetTabBarPosition: Self = this.set("getTabBarPosition", js.undefined)
    @scala.inline
    def setSetCls(value: /* cls */ js.UndefOr[String] => Unit): Self = this.set("setCls", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetCls: Self = this.set("setCls", js.undefined)
    @scala.inline
    def setSetTabBar(value: /* tabBar */ js.UndefOr[js.Any] => Unit): Self = this.set("setTabBar", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetTabBar: Self = this.set("setTabBar", js.undefined)
    @scala.inline
    def setSetTabBarPosition(value: /* tabBarPosition */ js.UndefOr[String] => Unit): Self = this.set("setTabBarPosition", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetTabBarPosition: Self = this.set("setTabBarPosition", js.undefined)
    @scala.inline
    def setTabBar(value: js.Any): Self = this.set("tabBar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTabBar: Self = this.set("tabBar", js.undefined)
    @scala.inline
    def setTabBarDock(value: Boolean): Self = this.set("tabBarDock", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTabBarDock: Self = this.set("tabBarDock", js.undefined)
    @scala.inline
    def setTabBarPosition(value: String): Self = this.set("tabBarPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTabBarPosition: Self = this.set("tabBarPosition", js.undefined)
    @scala.inline
    def setUpdateUi(value: (/* newUi */ js.UndefOr[js.Any], /* oldUi */ js.UndefOr[js.Any]) => Unit): Self = this.set("updateUi", js.Any.fromFunction2(value))
    @scala.inline
    def deleteUpdateUi: Self = this.set("updateUi", js.undefined)
  }
  
}

