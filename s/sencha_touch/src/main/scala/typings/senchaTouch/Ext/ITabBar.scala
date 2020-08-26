package typings.senchaTouch.Ext

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITabBar extends IToolbar {
  /** [Config Option] (Number/String/Ext.Component) */
  var activeTab: js.UndefOr[js.Any] = js.native
  /** [Method] Returns the value of activeTab
    * @returns Number/String/Ext.Component
    */
  var getActiveTab: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Sets the value of activeTab
    * @param activeTab Number/String/Ext.Component The new value.
    */
  var setActiveTab: js.UndefOr[js.Function1[/* activeTab */ js.UndefOr[js.Any], Unit]] = js.native
}

object ITabBar {
  @scala.inline
  def apply(): ITabBar = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITabBar]
  }
  @scala.inline
  implicit class ITabBarOps[Self <: ITabBar] (val x: Self) extends AnyVal {
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
    def setActiveTab(value: js.Any): Self = this.set("activeTab", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActiveTab: Self = this.set("activeTab", js.undefined)
    @scala.inline
    def setGetActiveTab(value: () => _): Self = this.set("getActiveTab", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetActiveTab: Self = this.set("getActiveTab", js.undefined)
    @scala.inline
    def setSetActiveTab(value: /* activeTab */ js.UndefOr[js.Any] => Unit): Self = this.set("setActiveTab", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetActiveTab: Self = this.set("setActiveTab", js.undefined)
  }
  
}

