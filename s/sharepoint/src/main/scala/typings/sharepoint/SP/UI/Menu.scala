package typings.sharepoint.SP.UI

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Menu extends js.Object {
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
}

