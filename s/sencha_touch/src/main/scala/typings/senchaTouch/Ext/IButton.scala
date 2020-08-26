package typings.senchaTouch.Ext

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IButton extends IComponent {
  /** [Config Option] (String) */
  var autoEvent: js.UndefOr[java.lang.String] = js.native
  /** [Config Option] (String) */
  var badge: js.UndefOr[java.lang.String] = js.native
  /** [Config Option] (String) */
  var badgeCls: js.UndefOr[java.lang.String] = js.native
  /** [Config Option] (String) */
  var badgeText: js.UndefOr[java.lang.String] = js.native
  /** [Method] Returns the value of autoEvent
    * @returns String
    */
  var getAutoEvent: js.UndefOr[js.Function0[java.lang.String]] = js.native
  /** [Method] Returns the value of badgeCls
    * @returns String
    */
  var getBadgeCls: js.UndefOr[js.Function0[java.lang.String]] = js.native
  /** [Method] Returns the value of badgeText
    * @returns String
    */
  var getBadgeText: js.UndefOr[js.Function0[java.lang.String]] = js.native
  /** [Method] Returns the value of handler
    * @returns Function
    */
  var getHandler: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of icon
    * @returns String
    */
  var getIcon: js.UndefOr[js.Function0[java.lang.String]] = js.native
  /** [Method] Returns the value of iconAlign
    * @returns String
    */
  var getIconAlign: js.UndefOr[js.Function0[java.lang.String]] = js.native
  /** [Method] Returns the value of iconCls
    * @returns String
    */
  var getIconCls: js.UndefOr[js.Function0[java.lang.String]] = js.native
  /** [Method] Returns the value of labelCls
    * @returns String
    */
  var getLabelCls: js.UndefOr[js.Function0[java.lang.String]] = js.native
  /** [Method] Returns the value of pressedCls
    * @returns String
    */
  var getPressedCls: js.UndefOr[js.Function0[java.lang.String]] = js.native
  /** [Method] Returns the value of pressedDelay
    * @returns Number/Boolean
    */
  var getPressedDelay: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of scope
    * @returns Object
    */
  var getScope: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of text
    * @returns String
    */
  var getText: js.UndefOr[js.Function0[java.lang.String]] = js.native
  /** [Config Option] (Function) */
  var handler: js.UndefOr[js.Any] = js.native
  /** [Config Option] (String) */
  @JSName("html")
  var html_IButton: js.UndefOr[java.lang.String] = js.native
  /** [Config Option] (String) */
  var icon: js.UndefOr[java.lang.String] = js.native
  /** [Config Option] (String) */
  var iconAlign: js.UndefOr[java.lang.String] = js.native
  /** [Config Option] (String) */
  var iconCls: js.UndefOr[java.lang.String] = js.native
  /** [Config Option] (String) */
  var labelCls: js.UndefOr[java.lang.String] = js.native
  /** [Config Option] (String) */
  var pressedCls: js.UndefOr[java.lang.String] = js.native
  /** [Config Option] (Number/Boolean) */
  var pressedDelay: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Object) */
  var scope: js.UndefOr[js.Any] = js.native
  /** [Method] Sets the value of autoEvent
    * @param autoEvent String The new value.
    */
  var setAutoEvent: js.UndefOr[js.Function1[/* autoEvent */ js.UndefOr[java.lang.String], Unit]] = js.native
  /** [Method] Updates the badge text
    * @param text String
    */
  var setBadge: js.UndefOr[js.Function1[/* text */ js.UndefOr[java.lang.String], Unit]] = js.native
  /** [Method] Sets the value of badgeCls
    * @param badgeCls String The new value.
    */
  var setBadgeCls: js.UndefOr[js.Function1[/* badgeCls */ js.UndefOr[java.lang.String], Unit]] = js.native
  /** [Method] Sets the value of badgeText
    * @param badgeText String The new value.
    */
  var setBadgeText: js.UndefOr[js.Function1[/* badgeText */ js.UndefOr[java.lang.String], Unit]] = js.native
  /** [Method] Sets the value of handler
    * @param handler Function The new value.
    */
  var setHandler: js.UndefOr[js.Function1[/* handler */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of icon
    * @param icon String The new value.
    */
  var setIcon: js.UndefOr[js.Function1[/* icon */ js.UndefOr[java.lang.String], Unit]] = js.native
  /** [Method] Sets the value of iconAlign
    * @param iconAlign String The new value.
    */
  var setIconAlign: js.UndefOr[js.Function1[/* iconAlign */ js.UndefOr[java.lang.String], Unit]] = js.native
  /** [Method] Updates the icon class
    * @param iconClass String
    */
  var setIconClass: js.UndefOr[js.Function1[/* iconClass */ js.UndefOr[java.lang.String], Unit]] = js.native
  /** [Method] Sets the value of iconCls
    * @param iconCls String The new value.
    */
  var setIconCls: js.UndefOr[js.Function1[/* iconCls */ js.UndefOr[java.lang.String], Unit]] = js.native
  /** [Method] Sets the value of labelCls
    * @param labelCls String The new value.
    */
  var setLabelCls: js.UndefOr[js.Function1[/* labelCls */ js.UndefOr[java.lang.String], Unit]] = js.native
  /** [Method] Sets the value of pressedCls
    * @param pressedCls String The new value.
    */
  var setPressedCls: js.UndefOr[js.Function1[/* pressedCls */ js.UndefOr[java.lang.String], Unit]] = js.native
  /** [Method] Sets the value of pressedDelay
    * @param pressedDelay Number/Boolean The new value.
    */
  var setPressedDelay: js.UndefOr[js.Function1[/* pressedDelay */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of scope
    * @param scope Object The new value.
    */
  var setScope: js.UndefOr[js.Function1[/* scope */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of text
    * @param text String The new value.
    */
  var setText: js.UndefOr[js.Function1[/* text */ js.UndefOr[java.lang.String], Unit]] = js.native
  /** [Config Option] (String) */
  var text: js.UndefOr[java.lang.String] = js.native
}

object IButton {
  @scala.inline
  def apply(): IButton = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IButton]
  }
  @scala.inline
  implicit class IButtonOps[Self <: IButton] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAutoEvent(value: java.lang.String): Self = this.set("autoEvent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoEvent: Self = this.set("autoEvent", js.undefined)
    @scala.inline
    def setBadge(value: java.lang.String): Self = this.set("badge", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBadge: Self = this.set("badge", js.undefined)
    @scala.inline
    def setBadgeCls(value: java.lang.String): Self = this.set("badgeCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBadgeCls: Self = this.set("badgeCls", js.undefined)
    @scala.inline
    def setBadgeText(value: java.lang.String): Self = this.set("badgeText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBadgeText: Self = this.set("badgeText", js.undefined)
    @scala.inline
    def setGetAutoEvent(value: () => java.lang.String): Self = this.set("getAutoEvent", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetAutoEvent: Self = this.set("getAutoEvent", js.undefined)
    @scala.inline
    def setGetBadgeCls(value: () => java.lang.String): Self = this.set("getBadgeCls", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetBadgeCls: Self = this.set("getBadgeCls", js.undefined)
    @scala.inline
    def setGetBadgeText(value: () => java.lang.String): Self = this.set("getBadgeText", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetBadgeText: Self = this.set("getBadgeText", js.undefined)
    @scala.inline
    def setGetHandler(value: () => _): Self = this.set("getHandler", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetHandler: Self = this.set("getHandler", js.undefined)
    @scala.inline
    def setGetIcon(value: () => java.lang.String): Self = this.set("getIcon", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetIcon: Self = this.set("getIcon", js.undefined)
    @scala.inline
    def setGetIconAlign(value: () => java.lang.String): Self = this.set("getIconAlign", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetIconAlign: Self = this.set("getIconAlign", js.undefined)
    @scala.inline
    def setGetIconCls(value: () => java.lang.String): Self = this.set("getIconCls", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetIconCls: Self = this.set("getIconCls", js.undefined)
    @scala.inline
    def setGetLabelCls(value: () => java.lang.String): Self = this.set("getLabelCls", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetLabelCls: Self = this.set("getLabelCls", js.undefined)
    @scala.inline
    def setGetPressedCls(value: () => java.lang.String): Self = this.set("getPressedCls", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetPressedCls: Self = this.set("getPressedCls", js.undefined)
    @scala.inline
    def setGetPressedDelay(value: () => _): Self = this.set("getPressedDelay", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetPressedDelay: Self = this.set("getPressedDelay", js.undefined)
    @scala.inline
    def setGetScope(value: () => _): Self = this.set("getScope", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetScope: Self = this.set("getScope", js.undefined)
    @scala.inline
    def setGetText(value: () => java.lang.String): Self = this.set("getText", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetText: Self = this.set("getText", js.undefined)
    @scala.inline
    def setHandler(value: js.Any): Self = this.set("handler", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHandler: Self = this.set("handler", js.undefined)
    @scala.inline
    def setHtml(value: java.lang.String): Self = this.set("html", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHtml: Self = this.set("html", js.undefined)
    @scala.inline
    def setIcon(value: java.lang.String): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    @scala.inline
    def setIconAlign(value: java.lang.String): Self = this.set("iconAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIconAlign: Self = this.set("iconAlign", js.undefined)
    @scala.inline
    def setIconCls(value: java.lang.String): Self = this.set("iconCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIconCls: Self = this.set("iconCls", js.undefined)
    @scala.inline
    def setLabelCls(value: java.lang.String): Self = this.set("labelCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelCls: Self = this.set("labelCls", js.undefined)
    @scala.inline
    def setPressedCls(value: java.lang.String): Self = this.set("pressedCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePressedCls: Self = this.set("pressedCls", js.undefined)
    @scala.inline
    def setPressedDelay(value: js.Any): Self = this.set("pressedDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePressedDelay: Self = this.set("pressedDelay", js.undefined)
    @scala.inline
    def setScope(value: js.Any): Self = this.set("scope", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScope: Self = this.set("scope", js.undefined)
    @scala.inline
    def setSetAutoEvent(value: /* autoEvent */ js.UndefOr[java.lang.String] => Unit): Self = this.set("setAutoEvent", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetAutoEvent: Self = this.set("setAutoEvent", js.undefined)
    @scala.inline
    def setSetBadge(value: /* text */ js.UndefOr[java.lang.String] => Unit): Self = this.set("setBadge", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetBadge: Self = this.set("setBadge", js.undefined)
    @scala.inline
    def setSetBadgeCls(value: /* badgeCls */ js.UndefOr[java.lang.String] => Unit): Self = this.set("setBadgeCls", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetBadgeCls: Self = this.set("setBadgeCls", js.undefined)
    @scala.inline
    def setSetBadgeText(value: /* badgeText */ js.UndefOr[java.lang.String] => Unit): Self = this.set("setBadgeText", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetBadgeText: Self = this.set("setBadgeText", js.undefined)
    @scala.inline
    def setSetHandler(value: /* handler */ js.UndefOr[js.Any] => Unit): Self = this.set("setHandler", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetHandler: Self = this.set("setHandler", js.undefined)
    @scala.inline
    def setSetIcon(value: /* icon */ js.UndefOr[java.lang.String] => Unit): Self = this.set("setIcon", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetIcon: Self = this.set("setIcon", js.undefined)
    @scala.inline
    def setSetIconAlign(value: /* iconAlign */ js.UndefOr[java.lang.String] => Unit): Self = this.set("setIconAlign", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetIconAlign: Self = this.set("setIconAlign", js.undefined)
    @scala.inline
    def setSetIconClass(value: /* iconClass */ js.UndefOr[java.lang.String] => Unit): Self = this.set("setIconClass", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetIconClass: Self = this.set("setIconClass", js.undefined)
    @scala.inline
    def setSetIconCls(value: /* iconCls */ js.UndefOr[java.lang.String] => Unit): Self = this.set("setIconCls", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetIconCls: Self = this.set("setIconCls", js.undefined)
    @scala.inline
    def setSetLabelCls(value: /* labelCls */ js.UndefOr[java.lang.String] => Unit): Self = this.set("setLabelCls", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetLabelCls: Self = this.set("setLabelCls", js.undefined)
    @scala.inline
    def setSetPressedCls(value: /* pressedCls */ js.UndefOr[java.lang.String] => Unit): Self = this.set("setPressedCls", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetPressedCls: Self = this.set("setPressedCls", js.undefined)
    @scala.inline
    def setSetPressedDelay(value: /* pressedDelay */ js.UndefOr[js.Any] => Unit): Self = this.set("setPressedDelay", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetPressedDelay: Self = this.set("setPressedDelay", js.undefined)
    @scala.inline
    def setSetScope(value: /* scope */ js.UndefOr[js.Any] => Unit): Self = this.set("setScope", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetScope: Self = this.set("setScope", js.undefined)
    @scala.inline
    def setSetText(value: /* text */ js.UndefOr[java.lang.String] => Unit): Self = this.set("setText", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetText: Self = this.set("setText", js.undefined)
    @scala.inline
    def setText(value: java.lang.String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
  
}

