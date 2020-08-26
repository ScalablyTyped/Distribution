package typings.reactMdTabs.tabsManagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TabsManagerContext extends js.Object {
  /**
    * The current active tab index to determine which tabs to animate in and out
    * of view.
    */
  var activeIndex: Double = js.native
  /**
    * The list of tabs that should be controlled by the tabs manager.
    */
  var tabs: js.Array[InitializedTabConfig] = js.native
  /**
    * This is an id prefix to use for all the child Tab, TabList, and TabPanel
    * components.
    *
    * - `Tabs` -> id={id}
    * - `Tab` ->
    *    - id={`${id}-tab-${index + 1}`}
    *    - panelId={active && `${id}-panel-${index + 1}`}
    * - `TabPanel` -> id={`${id}-panel-${index + 1}`}
    */
  var tabsId: String = js.native
  /**
    * A function to call when the `activeIndex` should change due to keyboard
    * movement or clicking on a tab.
    */
  def onActiveIndexChange(activeIndex: Double): Unit = js.native
}

object TabsManagerContext {
  @scala.inline
  def apply(
    activeIndex: Double,
    onActiveIndexChange: Double => Unit,
    tabs: js.Array[InitializedTabConfig],
    tabsId: String
  ): TabsManagerContext = {
    val __obj = js.Dynamic.literal(activeIndex = activeIndex.asInstanceOf[js.Any], onActiveIndexChange = js.Any.fromFunction1(onActiveIndexChange), tabs = tabs.asInstanceOf[js.Any], tabsId = tabsId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabsManagerContext]
  }
  @scala.inline
  implicit class TabsManagerContextOps[Self <: TabsManagerContext] (val x: Self) extends AnyVal {
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
    def setActiveIndex(value: Double): Self = this.set("activeIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnActiveIndexChange(value: Double => Unit): Self = this.set("onActiveIndexChange", js.Any.fromFunction1(value))
    @scala.inline
    def setTabsVarargs(value: InitializedTabConfig*): Self = this.set("tabs", js.Array(value :_*))
    @scala.inline
    def setTabs(value: js.Array[InitializedTabConfig]): Self = this.set("tabs", value.asInstanceOf[js.Any])
    @scala.inline
    def setTabsId(value: String): Self = this.set("tabsId", value.asInstanceOf[js.Any])
  }
  
}

