package typings.reactMdTabs.tabsManagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Required<@react-md/tabs.@react-md/tabs/types/TabsManager.TabsManagerContext> */
@js.native
trait InitializedTabsManagerContext extends js.Object {
  
  var activeIndex: Double = js.native
  
  var onActiveIndexChange: js.Function1[/* activeIndex */ Double, Unit] = js.native
  
  var tabs: js.Array[InitializedTabConfig] = js.native
  
  var tabsId: String = js.native
}
object InitializedTabsManagerContext {
  
  @scala.inline
  def apply(
    activeIndex: Double,
    onActiveIndexChange: /* activeIndex */ Double => Unit,
    tabs: js.Array[InitializedTabConfig],
    tabsId: String
  ): InitializedTabsManagerContext = {
    val __obj = js.Dynamic.literal(activeIndex = activeIndex.asInstanceOf[js.Any], onActiveIndexChange = js.Any.fromFunction1(onActiveIndexChange), tabs = tabs.asInstanceOf[js.Any], tabsId = tabsId.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitializedTabsManagerContext]
  }
  
  @scala.inline
  implicit class InitializedTabsManagerContextOps[Self <: InitializedTabsManagerContext] (val x: Self) extends AnyVal {
    
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
    def setOnActiveIndexChange(value: /* activeIndex */ Double => Unit): Self = this.set("onActiveIndexChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTabsVarargs(value: InitializedTabConfig*): Self = this.set("tabs", js.Array(value :_*))
    
    @scala.inline
    def setTabs(value: js.Array[InitializedTabConfig]): Self = this.set("tabs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabsId(value: String): Self = this.set("tabsId", value.asInstanceOf[js.Any])
  }
}
