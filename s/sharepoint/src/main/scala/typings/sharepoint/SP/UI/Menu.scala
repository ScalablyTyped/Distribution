package typings.sharepoint.SP.UI

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.UI.Menu")
@js.native
class Menu () extends js.Object {
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

/* static members */
@JSGlobal("SP.UI.Menu")
@js.native
object Menu extends js.Object {
  def create(id: String): Menu = js.native
}

