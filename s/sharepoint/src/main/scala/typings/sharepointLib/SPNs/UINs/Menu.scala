package typings
package sharepointLib.SPNs.UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.UI.Menu")
@js.native
class Menu () extends js.Object {
  def addMenuItem(
    text: java.lang.String,
    actionScriptText: java.lang.String,
    imageSourceUrl: java.lang.String,
    imageAlternateText: java.lang.String,
    sequenceNumber: scala.Double,
    description: java.lang.String,
    id: java.lang.String
  ): stdLib.HTMLElement = js.native
  def addSeparator(): scala.Unit = js.native
  def addSubMenu(
    text: java.lang.String,
    imageSourceUrl: java.lang.String,
    imageAlternateText: java.lang.String,
    sequenceNumber: scala.Double,
    description: java.lang.String,
    id: java.lang.String
  ): Menu = js.native
  def hideIcons(): scala.Unit = js.native
  def show(
    relativeElement: stdLib.HTMLElement,
    forceRefresh: scala.Boolean,
    flipTopLevelMenu: scala.Boolean,
    yOffset: scala.Double
  ): scala.Unit = js.native
  def showFilterMenu(
    relativeElement: stdLib.HTMLElement,
    forceRefresh: scala.Boolean,
    flipTopLevelMenu: scala.Boolean,
    yOffset: scala.Double,
    fShowClose: scala.Boolean,
    fShowCheckBoxes: scala.Boolean
  ): scala.Unit = js.native
  def showIcons(): scala.Unit = js.native
}

@JSGlobal("SP.UI.Menu")
@js.native
object Menu extends js.Object {
  def create(id: java.lang.String): sharepointLib.SPNs.UINs.Menu = js.native
}

