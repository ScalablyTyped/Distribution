package typings.sharepoint

import typings.std.Event_
import typings.std.HTMLElement
import typings.std.NodeList
import typings.std.Window_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Available only in SharePoint Online*/
@JSGlobal("DOM")
@js.native
object DOM extends js.Object {
  val rightToLeft: Boolean = js.native
  def AbsLeft(el: HTMLElement): Double = js.native
  def AbsTop(el: HTMLElement): Double = js.native
  def CancelEvent(evt: Event_): Unit = js.native
  def GetElementsByName(nae: String): NodeList = js.native
  def GetEventCoords(evt: Event_): AnonX = js.native
  def GetEventSrcElement(evt: Event_): HTMLElement = js.native
  def GetInnerText(el: HTMLElement): String = js.native
  def PreventDefaultNavigation(evt: Event_): Unit = js.native
  def SetEvent(
    eventName: String,
    eventFunc: js.Function3[
      /* eventName */ String, 
      /* fnContent */ js.Function1[/* evt */ Event_, Unit], 
      /* window */ js.UndefOr[Window_], 
      Unit
    ],
    el: HTMLElement
  ): Unit = js.native
  def cancelDefault(evt: Event_): Unit = js.native
}

