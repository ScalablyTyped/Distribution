package typings.reactMdTabs.tabsListMod

import typings.react.mod.HTMLAttributes
import typings.reactMdTabs.typesMod.TabsConfig
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TabsListProps
  extends HTMLAttributes[HTMLDivElement]
     with TabsConfig {
  
  /**
    * The current active tab index to determine which tabs to animate in and out
    * of view.
    */
  var activeIndex: Double = js.native
  
  /**
    * Boolean if the indicator transition should be disabled while the active tab
    * index changes.
    */
  var disableTransition: js.UndefOr[Boolean] = js.native
  
  /**
    * A function to call when the `activeIndex` should change due to keyboard
    * movement or clicking on a tab.
    */
  def onActiveIndexChange(activeIndex: Double): Unit = js.native
}
object TabsListProps {
  
  @scala.inline
  def apply(activeIndex: Double, onActiveIndexChange: Double => Unit): TabsListProps = {
    val __obj = js.Dynamic.literal(activeIndex = activeIndex.asInstanceOf[js.Any], onActiveIndexChange = js.Any.fromFunction1(onActiveIndexChange))
    __obj.asInstanceOf[TabsListProps]
  }
  
  @scala.inline
  implicit class TabsListPropsOps[Self <: TabsListProps] (val x: Self) extends AnyVal {
    
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
    def setDisableTransition(value: Boolean): Self = this.set("disableTransition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableTransition: Self = this.set("disableTransition", js.undefined)
  }
}
