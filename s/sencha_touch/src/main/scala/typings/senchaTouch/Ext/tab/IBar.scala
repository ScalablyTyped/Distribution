package typings.senchaTouch.Ext.tab

import typings.senchaTouch.Ext.IToolbar
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBar extends IToolbar {
  /** [Config Option] (Number/String/Ext.Component) */
  var activeTab: js.UndefOr[js.Any] = js.undefined
  /** [Method] Returns the value of activeTab
  		* @returns Number/String/Ext.Component
  		*/
  var getActiveTab: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Sets the value of activeTab
  		* @param activeTab Number/String/Ext.Component The new value.
  		*/
  var setActiveTab: js.UndefOr[js.Function1[/* activeTab */ js.UndefOr[js.Any], Unit]] = js.undefined
}

object IBar {
  @scala.inline
  def apply(
    IToolbar: IToolbar = null,
    activeTab: js.Any = null,
    getActiveTab: () => _ = null,
    setActiveTab: /* activeTab */ js.UndefOr[js.Any] => Unit = null
  ): IBar = {
    val __obj = js.Dynamic.literal()
    if (IToolbar != null) js.Dynamic.global.Object.assign(__obj, IToolbar)
    if (activeTab != null) __obj.updateDynamic("activeTab")(activeTab.asInstanceOf[js.Any])
    if (getActiveTab != null) __obj.updateDynamic("getActiveTab")(js.Any.fromFunction0(getActiveTab))
    if (setActiveTab != null) __obj.updateDynamic("setActiveTab")(js.Any.fromFunction1(setActiveTab))
    __obj.asInstanceOf[IBar]
  }
}

