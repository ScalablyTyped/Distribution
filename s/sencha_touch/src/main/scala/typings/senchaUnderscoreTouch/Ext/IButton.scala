package typings.senchaUnderscoreTouch.Ext

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IButton extends IComponent {
  /** [Config Option] (String) */
  var autoEvent: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var badge: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var badgeCls: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var badgeText: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Returns the value of autoEvent
  		* @returns String
  		*/
  var getAutoEvent: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of badgeCls
  		* @returns String
  		*/
  var getBadgeCls: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of badgeText
  		* @returns String
  		*/
  var getBadgeText: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of handler
  		* @returns Function
  		*/
  var getHandler: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of icon
  		* @returns String
  		*/
  var getIcon: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of iconAlign
  		* @returns String
  		*/
  var getIconAlign: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of iconCls
  		* @returns String
  		*/
  var getIconCls: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of labelCls
  		* @returns String
  		*/
  var getLabelCls: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of pressedCls
  		* @returns String
  		*/
  var getPressedCls: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of pressedDelay
  		* @returns Number/Boolean
  		*/
  var getPressedDelay: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of scope
  		* @returns Object
  		*/
  var getScope: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of text
  		* @returns String
  		*/
  var getText: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Config Option] (Function) */
  var handler: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String) */
  @JSName("html")
  var html_IButton: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var icon: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var iconAlign: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var iconCls: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var labelCls: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var pressedCls: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Number/Boolean) */
  var pressedDelay: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Object) */
  var scope: js.UndefOr[js.Any] = js.undefined
  /** [Method] Sets the value of autoEvent
  		* @param autoEvent String The new value.
  		*/
  var setAutoEvent: js.UndefOr[js.Function1[/* autoEvent */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  /** [Method] Updates the badge text
  		* @param text String
  		*/
  var setBadge: js.UndefOr[js.Function1[/* text */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  /** [Method] Sets the value of badgeCls
  		* @param badgeCls String The new value.
  		*/
  var setBadgeCls: js.UndefOr[js.Function1[/* badgeCls */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  /** [Method] Sets the value of badgeText
  		* @param badgeText String The new value.
  		*/
  var setBadgeText: js.UndefOr[js.Function1[/* badgeText */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  /** [Method] Sets the value of handler
  		* @param handler Function The new value.
  		*/
  var setHandler: js.UndefOr[js.Function1[/* handler */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of icon
  		* @param icon String The new value.
  		*/
  var setIcon: js.UndefOr[js.Function1[/* icon */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  /** [Method] Sets the value of iconAlign
  		* @param iconAlign String The new value.
  		*/
  var setIconAlign: js.UndefOr[js.Function1[/* iconAlign */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  /** [Method] Updates the icon class
  		* @param iconClass String
  		*/
  var setIconClass: js.UndefOr[js.Function1[/* iconClass */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  /** [Method] Sets the value of iconCls
  		* @param iconCls String The new value.
  		*/
  var setIconCls: js.UndefOr[js.Function1[/* iconCls */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  /** [Method] Sets the value of labelCls
  		* @param labelCls String The new value.
  		*/
  var setLabelCls: js.UndefOr[js.Function1[/* labelCls */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  /** [Method] Sets the value of pressedCls
  		* @param pressedCls String The new value.
  		*/
  var setPressedCls: js.UndefOr[js.Function1[/* pressedCls */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  /** [Method] Sets the value of pressedDelay
  		* @param pressedDelay Number/Boolean The new value.
  		*/
  var setPressedDelay: js.UndefOr[js.Function1[/* pressedDelay */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of scope
  		* @param scope Object The new value.
  		*/
  var setScope: js.UndefOr[js.Function1[/* scope */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of text
  		* @param text String The new value.
  		*/
  var setText: js.UndefOr[js.Function1[/* text */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  /** [Config Option] (String) */
  var text: js.UndefOr[java.lang.String] = js.undefined
}

object IButton {
  @scala.inline
  def apply(
    IComponent: IComponent = null,
    autoEvent: java.lang.String = null,
    badge: java.lang.String = null,
    badgeCls: java.lang.String = null,
    badgeText: java.lang.String = null,
    baseCls: java.lang.String = null,
    getAutoEvent: () => java.lang.String = null,
    getBadgeCls: () => java.lang.String = null,
    getBadgeText: () => java.lang.String = null,
    getBaseCls: () => java.lang.String = null,
    getHandler: () => _ = null,
    getIcon: () => java.lang.String = null,
    getIconAlign: () => java.lang.String = null,
    getIconCls: () => java.lang.String = null,
    getLabelCls: () => java.lang.String = null,
    getPressedCls: () => java.lang.String = null,
    getPressedDelay: () => _ = null,
    getScope: () => _ = null,
    getText: () => java.lang.String = null,
    getUi: () => java.lang.String = null,
    handler: js.Any = null,
    html: java.lang.String = null,
    icon: java.lang.String = null,
    iconAlign: java.lang.String = null,
    iconCls: java.lang.String = null,
    initialize: () => Unit = null,
    labelCls: java.lang.String = null,
    pressedCls: java.lang.String = null,
    pressedDelay: js.Any = null,
    scope: js.Any = null,
    setAutoEvent: /* autoEvent */ js.UndefOr[java.lang.String] => Unit = null,
    setBadge: /* text */ js.UndefOr[java.lang.String] => Unit = null,
    setBadgeCls: /* badgeCls */ js.UndefOr[java.lang.String] => Unit = null,
    setBadgeText: /* badgeText */ js.UndefOr[java.lang.String] => Unit = null,
    setBaseCls: /* baseCls */ js.UndefOr[java.lang.String] => Unit = null,
    setHandler: /* handler */ js.UndefOr[js.Any] => Unit = null,
    setIcon: /* icon */ js.UndefOr[java.lang.String] => Unit = null,
    setIconAlign: /* iconAlign */ js.UndefOr[java.lang.String] => Unit = null,
    setIconClass: /* iconClass */ js.UndefOr[java.lang.String] => Unit = null,
    setIconCls: /* iconCls */ js.UndefOr[java.lang.String] => Unit = null,
    setLabelCls: /* labelCls */ js.UndefOr[java.lang.String] => Unit = null,
    setPressedCls: /* pressedCls */ js.UndefOr[java.lang.String] => Unit = null,
    setPressedDelay: /* pressedDelay */ js.UndefOr[js.Any] => Unit = null,
    setScope: /* scope */ js.UndefOr[js.Any] => Unit = null,
    setText: /* text */ js.UndefOr[java.lang.String] => Unit = null,
    setUi: /* ui */ js.UndefOr[java.lang.String] => Unit = null,
    text: java.lang.String = null,
    ui: java.lang.String = null
  ): IButton = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IComponent)
    if (autoEvent != null) __obj.updateDynamic("autoEvent")(autoEvent)
    if (badge != null) __obj.updateDynamic("badge")(badge)
    if (badgeCls != null) __obj.updateDynamic("badgeCls")(badgeCls)
    if (badgeText != null) __obj.updateDynamic("badgeText")(badgeText)
    if (baseCls != null) __obj.updateDynamic("baseCls")(baseCls)
    if (getAutoEvent != null) __obj.updateDynamic("getAutoEvent")(js.Any.fromFunction0(getAutoEvent))
    if (getBadgeCls != null) __obj.updateDynamic("getBadgeCls")(js.Any.fromFunction0(getBadgeCls))
    if (getBadgeText != null) __obj.updateDynamic("getBadgeText")(js.Any.fromFunction0(getBadgeText))
    if (getBaseCls != null) __obj.updateDynamic("getBaseCls")(js.Any.fromFunction0(getBaseCls))
    if (getHandler != null) __obj.updateDynamic("getHandler")(js.Any.fromFunction0(getHandler))
    if (getIcon != null) __obj.updateDynamic("getIcon")(js.Any.fromFunction0(getIcon))
    if (getIconAlign != null) __obj.updateDynamic("getIconAlign")(js.Any.fromFunction0(getIconAlign))
    if (getIconCls != null) __obj.updateDynamic("getIconCls")(js.Any.fromFunction0(getIconCls))
    if (getLabelCls != null) __obj.updateDynamic("getLabelCls")(js.Any.fromFunction0(getLabelCls))
    if (getPressedCls != null) __obj.updateDynamic("getPressedCls")(js.Any.fromFunction0(getPressedCls))
    if (getPressedDelay != null) __obj.updateDynamic("getPressedDelay")(js.Any.fromFunction0(getPressedDelay))
    if (getScope != null) __obj.updateDynamic("getScope")(js.Any.fromFunction0(getScope))
    if (getText != null) __obj.updateDynamic("getText")(js.Any.fromFunction0(getText))
    if (getUi != null) __obj.updateDynamic("getUi")(js.Any.fromFunction0(getUi))
    if (handler != null) __obj.updateDynamic("handler")(handler)
    if (html != null) __obj.updateDynamic("html")(html)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (iconAlign != null) __obj.updateDynamic("iconAlign")(iconAlign)
    if (iconCls != null) __obj.updateDynamic("iconCls")(iconCls)
    if (initialize != null) __obj.updateDynamic("initialize")(js.Any.fromFunction0(initialize))
    if (labelCls != null) __obj.updateDynamic("labelCls")(labelCls)
    if (pressedCls != null) __obj.updateDynamic("pressedCls")(pressedCls)
    if (pressedDelay != null) __obj.updateDynamic("pressedDelay")(pressedDelay)
    if (scope != null) __obj.updateDynamic("scope")(scope)
    if (setAutoEvent != null) __obj.updateDynamic("setAutoEvent")(js.Any.fromFunction1(setAutoEvent))
    if (setBadge != null) __obj.updateDynamic("setBadge")(js.Any.fromFunction1(setBadge))
    if (setBadgeCls != null) __obj.updateDynamic("setBadgeCls")(js.Any.fromFunction1(setBadgeCls))
    if (setBadgeText != null) __obj.updateDynamic("setBadgeText")(js.Any.fromFunction1(setBadgeText))
    if (setBaseCls != null) __obj.updateDynamic("setBaseCls")(js.Any.fromFunction1(setBaseCls))
    if (setHandler != null) __obj.updateDynamic("setHandler")(js.Any.fromFunction1(setHandler))
    if (setIcon != null) __obj.updateDynamic("setIcon")(js.Any.fromFunction1(setIcon))
    if (setIconAlign != null) __obj.updateDynamic("setIconAlign")(js.Any.fromFunction1(setIconAlign))
    if (setIconClass != null) __obj.updateDynamic("setIconClass")(js.Any.fromFunction1(setIconClass))
    if (setIconCls != null) __obj.updateDynamic("setIconCls")(js.Any.fromFunction1(setIconCls))
    if (setLabelCls != null) __obj.updateDynamic("setLabelCls")(js.Any.fromFunction1(setLabelCls))
    if (setPressedCls != null) __obj.updateDynamic("setPressedCls")(js.Any.fromFunction1(setPressedCls))
    if (setPressedDelay != null) __obj.updateDynamic("setPressedDelay")(js.Any.fromFunction1(setPressedDelay))
    if (setScope != null) __obj.updateDynamic("setScope")(js.Any.fromFunction1(setScope))
    if (setText != null) __obj.updateDynamic("setText")(js.Any.fromFunction1(setText))
    if (setUi != null) __obj.updateDynamic("setUi")(js.Any.fromFunction1(setUi))
    if (text != null) __obj.updateDynamic("text")(text)
    if (ui != null) __obj.updateDynamic("ui")(ui)
    __obj.asInstanceOf[IButton]
  }
}

