package typings.sharepoint.global

import typings.sharepoint.anon.X
import typings.std.Event
import typings.std.HTMLElement
import typings.std.NodeList
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Available only in SharePoint Online*/
object DOM {
  
  @JSGlobal("DOM.AbsLeft")
  @js.native
  def AbsLeft(el: HTMLElement): Double = js.native
  
  @JSGlobal("DOM.AbsTop")
  @js.native
  def AbsTop(el: HTMLElement): Double = js.native
  
  @JSGlobal("DOM.CancelEvent")
  @js.native
  def CancelEvent(evt: Event): Unit = js.native
  
  @JSGlobal("DOM.GetElementsByName")
  @js.native
  def GetElementsByName(nae: String): NodeList = js.native
  
  @JSGlobal("DOM.GetEventCoords")
  @js.native
  def GetEventCoords(evt: Event): X = js.native
  
  @JSGlobal("DOM.GetEventSrcElement")
  @js.native
  def GetEventSrcElement(evt: Event): HTMLElement = js.native
  
  @JSGlobal("DOM.GetInnerText")
  @js.native
  def GetInnerText(el: HTMLElement): String = js.native
  
  @JSGlobal("DOM.PreventDefaultNavigation")
  @js.native
  def PreventDefaultNavigation(evt: Event): Unit = js.native
  
  @JSGlobal("DOM.SetEvent")
  @js.native
  def SetEvent(
    eventName: String,
    eventFunc: js.Function3[
      /* eventName */ String, 
      /* fnContent */ js.Function1[/* evt */ Event, Unit], 
      /* window */ js.UndefOr[Window], 
      Unit
    ],
    el: HTMLElement
  ): Unit = js.native
  
  @JSGlobal("DOM.cancelDefault")
  @js.native
  def cancelDefault(evt: Event): Unit = js.native
  
  @JSGlobal("DOM.rightToLeft")
  @js.native
  val rightToLeft: Boolean = js.native
}
