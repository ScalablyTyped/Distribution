package typings
package senchaUnderscoreTouchLib.ExtNs.tabNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBar
  extends senchaUnderscoreTouchLib.ExtNs.IToolbar {
  /** [Config Option] (Number/String/Ext.Component) */
  var activeTab: js.UndefOr[js.Any] = js.undefined
  /** [Method] Returns the value of activeTab
  		* @returns Number/String/Ext.Component
  		*/
  var getActiveTab: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Sets the value of activeTab
  		* @param activeTab Number/String/Ext.Component The new value.
  		*/
  var setActiveTab: js.UndefOr[js.Function1[/* activeTab */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
}

object IBar {
  @scala.inline
  def apply(
    IToolbar: senchaUnderscoreTouchLib.ExtNs.IToolbar = null,
    activeTab: js.Any = null,
    baseCls: java.lang.String = null,
    getActiveTab: js.Function0[_] = null,
    getBaseCls: js.Function0[java.lang.String] = null,
    initialize: js.Function0[scala.Unit] = null,
    setActiveTab: js.Function1[/* activeTab */ js.UndefOr[js.Any], scala.Unit] = null,
    setBaseCls: js.Function1[/* baseCls */ js.UndefOr[java.lang.String], scala.Unit] = null
  ): IBar = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IToolbar)
    if (activeTab != null) __obj.updateDynamic("activeTab")(activeTab)
    if (baseCls != null) __obj.updateDynamic("baseCls")(baseCls)
    if (getActiveTab != null) __obj.updateDynamic("getActiveTab")(getActiveTab)
    if (getBaseCls != null) __obj.updateDynamic("getBaseCls")(getBaseCls)
    if (initialize != null) __obj.updateDynamic("initialize")(initialize)
    if (setActiveTab != null) __obj.updateDynamic("setActiveTab")(setActiveTab)
    if (setBaseCls != null) __obj.updateDynamic("setBaseCls")(setBaseCls)
    __obj.asInstanceOf[IBar]
  }
}

