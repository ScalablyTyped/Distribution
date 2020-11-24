package typings.sharepoint.SP.UI

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Menu extends js.Object {
  
  def addMenuItem(
    text: String,
    actionScriptText: String,
    imageSourceUrl: String,
    imageAlternateText: String,
    sequenceNumber: Double,
    description: String,
    id: String
  ): HTMLElement = js.native
  
  def addSeparator(): Unit = js.native
  
  def addSubMenu(
    text: String,
    imageSourceUrl: String,
    imageAlternateText: String,
    sequenceNumber: Double,
    description: String,
    id: String
  ): Menu = js.native
  
  def hideIcons(): Unit = js.native
  
  def show(relativeElement: HTMLElement, forceRefresh: Boolean, flipTopLevelMenu: Boolean, yOffset: Double): Unit = js.native
  
  def showFilterMenu(
    relativeElement: HTMLElement,
    forceRefresh: Boolean,
    flipTopLevelMenu: Boolean,
    yOffset: Double,
    fShowClose: Boolean,
    fShowCheckBoxes: Boolean
  ): Unit = js.native
  
  def showIcons(): Unit = js.native
}
object Menu {
  
  @scala.inline
  def apply(
    addMenuItem: (String, String, String, String, Double, String, String) => HTMLElement,
    addSeparator: () => Unit,
    addSubMenu: (String, String, String, Double, String, String) => Menu,
    hideIcons: () => Unit,
    show: (HTMLElement, Boolean, Boolean, Double) => Unit,
    showFilterMenu: (HTMLElement, Boolean, Boolean, Double, Boolean, Boolean) => Unit,
    showIcons: () => Unit
  ): Menu = {
    val __obj = js.Dynamic.literal(addMenuItem = js.Any.fromFunction7(addMenuItem), addSeparator = js.Any.fromFunction0(addSeparator), addSubMenu = js.Any.fromFunction6(addSubMenu), hideIcons = js.Any.fromFunction0(hideIcons), show = js.Any.fromFunction4(show), showFilterMenu = js.Any.fromFunction6(showFilterMenu), showIcons = js.Any.fromFunction0(showIcons))
    __obj.asInstanceOf[Menu]
  }
  
  @scala.inline
  implicit class MenuOps[Self <: Menu] (val x: Self) extends AnyVal {
    
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
    def setAddMenuItem(value: (String, String, String, String, Double, String, String) => HTMLElement): Self = this.set("addMenuItem", js.Any.fromFunction7(value))
    
    @scala.inline
    def setAddSeparator(value: () => Unit): Self = this.set("addSeparator", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAddSubMenu(value: (String, String, String, Double, String, String) => Menu): Self = this.set("addSubMenu", js.Any.fromFunction6(value))
    
    @scala.inline
    def setHideIcons(value: () => Unit): Self = this.set("hideIcons", js.Any.fromFunction0(value))
    
    @scala.inline
    def setShow(value: (HTMLElement, Boolean, Boolean, Double) => Unit): Self = this.set("show", js.Any.fromFunction4(value))
    
    @scala.inline
    def setShowFilterMenu(value: (HTMLElement, Boolean, Boolean, Double, Boolean, Boolean) => Unit): Self = this.set("showFilterMenu", js.Any.fromFunction6(value))
    
    @scala.inline
    def setShowIcons(value: () => Unit): Self = this.set("showIcons", js.Any.fromFunction0(value))
  }
}
