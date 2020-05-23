package typings.sharepoint.global.SP.UI

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.UI.Menu")
@js.native
class Menu ()
  extends typings.sharepoint.SP.UI.Menu {
  /* CompleteClass */
  override def addMenuItem(
    text: String,
    actionScriptText: String,
    imageSourceUrl: String,
    imageAlternateText: String,
    sequenceNumber: Double,
    description: String,
    id: String
  ): HTMLElement = js.native
  /* CompleteClass */
  override def addSeparator(): Unit = js.native
  /* CompleteClass */
  override def addSubMenu(
    text: String,
    imageSourceUrl: String,
    imageAlternateText: String,
    sequenceNumber: Double,
    description: String,
    id: String
  ): typings.sharepoint.SP.UI.Menu = js.native
  /* CompleteClass */
  override def hideIcons(): Unit = js.native
  /* CompleteClass */
  override def show(relativeElement: HTMLElement, forceRefresh: Boolean, flipTopLevelMenu: Boolean, yOffset: Double): Unit = js.native
  /* CompleteClass */
  override def showFilterMenu(
    relativeElement: HTMLElement,
    forceRefresh: Boolean,
    flipTopLevelMenu: Boolean,
    yOffset: Double,
    fShowClose: Boolean,
    fShowCheckBoxes: Boolean
  ): Unit = js.native
  /* CompleteClass */
  override def showIcons(): Unit = js.native
}

/* static members */
@JSGlobal("SP.UI.Menu")
@js.native
object Menu extends js.Object {
  def create(id: String): typings.sharepoint.SP.UI.Menu = js.native
}

