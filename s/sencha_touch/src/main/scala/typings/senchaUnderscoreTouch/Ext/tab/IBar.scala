package typings.senchaUnderscoreTouch.Ext.tab

import typings.senchaUnderscoreTouch.Ext.IToolbar
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
    baseCls: java.lang.String = null,
    getActiveTab: () => _ = null,
    getBaseCls: () => java.lang.String = null,
    initialize: () => Unit = null,
    setActiveTab: /* activeTab */ js.UndefOr[js.Any] => Unit = null,
    setBaseCls: /* baseCls */ js.UndefOr[java.lang.String] => Unit = null
  ): IBar = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IToolbar)
    if (activeTab != null) __obj.updateDynamic("activeTab")(activeTab)
    if (baseCls != null) __obj.updateDynamic("baseCls")(baseCls)
    if (getActiveTab != null) __obj.updateDynamic("getActiveTab")(js.Any.fromFunction0(getActiveTab))
    if (getBaseCls != null) __obj.updateDynamic("getBaseCls")(js.Any.fromFunction0(getBaseCls))
    if (initialize != null) __obj.updateDynamic("initialize")(js.Any.fromFunction0(initialize))
    if (setActiveTab != null) __obj.updateDynamic("setActiveTab")(js.Any.fromFunction1(setActiveTab))
    if (setBaseCls != null) __obj.updateDynamic("setBaseCls")(js.Any.fromFunction1(setBaseCls))
    __obj.asInstanceOf[IBar]
  }
}

