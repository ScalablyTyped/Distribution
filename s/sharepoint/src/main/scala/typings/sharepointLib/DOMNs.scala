package typings
package sharepointLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Available only in SharePoint Online*/
@JSGlobal("DOM")
@js.native
object DOMNs extends js.Object {
  val rightToLeft: scala.Boolean = js.native
  def AbsLeft(el: stdLib.HTMLElement): scala.Double = js.native
  def AbsTop(el: stdLib.HTMLElement): scala.Double = js.native
  def CancelEvent(evt: stdLib.Event): scala.Unit = js.native
  def GetElementsByName(nae: java.lang.String): stdLib.NodeList = js.native
  def GetEventCoords(evt: stdLib.Event): sharepointLib.Anon_Y = js.native
  def GetEventSrcElement(evt: stdLib.Event): stdLib.HTMLElement = js.native
  def GetInnerText(el: stdLib.HTMLElement): java.lang.String = js.native
  def PreventDefaultNavigation(evt: stdLib.Event): scala.Unit = js.native
  def SetEvent(
    eventName: java.lang.String,
    eventFunc: js.Function3[
      /* eventName */ java.lang.String, 
      /* fnContent */ js.Function1[/* evt */ stdLib.Event, scala.Unit], 
      /* window */ js.UndefOr[stdLib.Window], 
      scala.Unit
    ],
    el: stdLib.HTMLElement
  ): scala.Unit = js.native
  def cancelDefault(evt: stdLib.Event): scala.Unit = js.native
}

