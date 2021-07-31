package typings.sharepoint.SP.UI

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Menu extends StObject {
  
  def addMenuItem(
    text: String,
    actionScriptText: String,
    imageSourceUrl: String,
    imageAlternateText: String,
    sequenceNumber: Double,
    description: String,
    id: String
  ): HTMLElement
  
  def addSeparator(): Unit
  
  def addSubMenu(
    text: String,
    imageSourceUrl: String,
    imageAlternateText: String,
    sequenceNumber: Double,
    description: String,
    id: String
  ): Menu
  
  def hideIcons(): Unit
  
  def show(relativeElement: HTMLElement, forceRefresh: Boolean, flipTopLevelMenu: Boolean, yOffset: Double): Unit
  
  def showFilterMenu(
    relativeElement: HTMLElement,
    forceRefresh: Boolean,
    flipTopLevelMenu: Boolean,
    yOffset: Double,
    fShowClose: Boolean,
    fShowCheckBoxes: Boolean
  ): Unit
  
  def showIcons(): Unit
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
  implicit class MenuMutableBuilder[Self <: Menu] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddMenuItem(value: (String, String, String, String, Double, String, String) => HTMLElement): Self = StObject.set(x, "addMenuItem", js.Any.fromFunction7(value))
    
    @scala.inline
    def setAddSeparator(value: () => Unit): Self = StObject.set(x, "addSeparator", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAddSubMenu(value: (String, String, String, Double, String, String) => Menu): Self = StObject.set(x, "addSubMenu", js.Any.fromFunction6(value))
    
    @scala.inline
    def setHideIcons(value: () => Unit): Self = StObject.set(x, "hideIcons", js.Any.fromFunction0(value))
    
    @scala.inline
    def setShow(value: (HTMLElement, Boolean, Boolean, Double) => Unit): Self = StObject.set(x, "show", js.Any.fromFunction4(value))
    
    @scala.inline
    def setShowFilterMenu(value: (HTMLElement, Boolean, Boolean, Double, Boolean, Boolean) => Unit): Self = StObject.set(x, "showFilterMenu", js.Any.fromFunction6(value))
    
    @scala.inline
    def setShowIcons(value: () => Unit): Self = StObject.set(x, "showIcons", js.Any.fromFunction0(value))
  }
}
