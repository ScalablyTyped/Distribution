package typings.reactMdTabs.tabsManagerMod

import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.reactMdTabs.typesMod.TabConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Omit<@react-md/tabs.@react-md/tabs/types/TabsManager.TabsManagerContext, 'activeIndex' | 'onActiveIndexChange' | 'tabs'> */
@js.native
trait TabsManagerProps extends js.Object {
  /**
    * If you want to control the current active index instead of relying on the
    * built in behavior, you can provide an `activeIndex` prop which will be used
    * instead.  If this prop is defined, you **must** also provide the
    * `onActiveIndexChange` so that keyboard functionality and tab changing
    * behavior can still be used.
    */
  var activeIndex: js.UndefOr[Double] = js.native
  /**
    * The children to render that should eventually have the `Tabs` component and
    * the `TabContent` for matching specific tabs.
    */
  var children: ReactNode = js.native
  /**
    * The index of the tab that should be active by default. This is ignored if
    * the `activeIndex` prop is defined.
    */
  var defaultActiveIndex: js.UndefOr[Double] = js.native
  /**
    * Boolean if the icon should appear after the text instead of before for all
    * the `tabs` that have an icon. When the `stacked` prop is also enabled, it
    * will cause the icon to appear below the text instead of above.
    *
    * This is mostly a convenience prop so that you don't manually need to enable
    * it for each tab in the `tabs` list and if a `tab` in the `tabs` list has
    * the `stacked` attribute enabled defined, it will be used instead of this
    * value.
    */
  var iconAfter: js.UndefOr[Boolean] = js.native
  /**
    * An optional function to call when the active index changes when the
    * `activeIndex` prop is not provided. If the `activeIndex` prop is provided,
    * this is **required** for keyboard accessibility.
    */
  var onActiveIndexChange: js.UndefOr[js.Function1[/* activeIndex */ Double, Unit]] = js.native
  /**
    * Boolean if all the `tabs` that have icons should be stacked instead of
    * rendered inline.
    *
    * This is mostly a convenience prop so that you don't manually need to enable
    * it for each tab in the `tabs` list and if a `tab` in the `tabs` list has
    * the `stacked` attribute enabled defined, it will be used instead of this
    * value.
    */
  var stacked: js.UndefOr[Boolean] = js.native
  /**
    * The list of tabs that should be controlled by the tabs manager.
    */
  var tabs: js.Array[TabConfig | ReactElement | String] = js.native
  var tabsId: String = js.native
}

object TabsManagerProps {
  @scala.inline
  def apply(tabs: js.Array[TabConfig | ReactElement | String], tabsId: String): TabsManagerProps = {
    val __obj = js.Dynamic.literal(tabs = tabs.asInstanceOf[js.Any], tabsId = tabsId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabsManagerProps]
  }
  @scala.inline
  implicit class TabsManagerPropsOps[Self <: TabsManagerProps] (val x: Self) extends AnyVal {
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
    def setTabsVarargs(value: (TabConfig | ReactElement | String)*): Self = this.set("tabs", js.Array(value :_*))
    @scala.inline
    def setTabs(value: js.Array[TabConfig | ReactElement | String]): Self = this.set("tabs", value.asInstanceOf[js.Any])
    @scala.inline
    def setTabsId(value: String): Self = this.set("tabsId", value.asInstanceOf[js.Any])
    @scala.inline
    def setActiveIndex(value: Double): Self = this.set("activeIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActiveIndex: Self = this.set("activeIndex", js.undefined)
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setDefaultActiveIndex(value: Double): Self = this.set("defaultActiveIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultActiveIndex: Self = this.set("defaultActiveIndex", js.undefined)
    @scala.inline
    def setIconAfter(value: Boolean): Self = this.set("iconAfter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIconAfter: Self = this.set("iconAfter", js.undefined)
    @scala.inline
    def setOnActiveIndexChange(value: /* activeIndex */ Double => Unit): Self = this.set("onActiveIndexChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnActiveIndexChange: Self = this.set("onActiveIndexChange", js.undefined)
    @scala.inline
    def setStacked(value: Boolean): Self = this.set("stacked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStacked: Self = this.set("stacked", js.undefined)
  }
  
}

