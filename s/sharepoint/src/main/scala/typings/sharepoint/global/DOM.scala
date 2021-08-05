package typings.sharepoint.global

import typings.sharepoint.anon.X
import typings.std.Event
import typings.std.HTMLElement
import typings.std.NodeList
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Available only in SharePoint Online*/
object DOM {
  
  @JSGlobal("DOM")
  @js.native
  val ^ : js.Any = js.native
  
  inline def AbsLeft(el: HTMLElement): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("AbsLeft")(el.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def AbsTop(el: HTMLElement): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("AbsTop")(el.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def CancelEvent(evt: Event): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("CancelEvent")(evt.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def GetElementsByName(nae: String): NodeList = ^.asInstanceOf[js.Dynamic].applyDynamic("GetElementsByName")(nae.asInstanceOf[js.Any]).asInstanceOf[NodeList]
  
  inline def GetEventCoords(evt: Event): X = ^.asInstanceOf[js.Dynamic].applyDynamic("GetEventCoords")(evt.asInstanceOf[js.Any]).asInstanceOf[X]
  
  inline def GetEventSrcElement(evt: Event): HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("GetEventSrcElement")(evt.asInstanceOf[js.Any]).asInstanceOf[HTMLElement]
  
  inline def GetInnerText(el: HTMLElement): String = ^.asInstanceOf[js.Dynamic].applyDynamic("GetInnerText")(el.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def PreventDefaultNavigation(evt: Event): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("PreventDefaultNavigation")(evt.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def SetEvent(
    eventName: String,
    eventFunc: js.Function3[
      /* eventName */ String, 
      /* fnContent */ js.Function1[/* evt */ Event, Unit], 
      /* window */ js.UndefOr[Window], 
      Unit
    ],
    el: HTMLElement
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("SetEvent")(eventName.asInstanceOf[js.Any], eventFunc.asInstanceOf[js.Any], el.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def cancelDefault(evt: Event): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("cancelDefault")(evt.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSGlobal("DOM.rightToLeft")
  @js.native
  val rightToLeft: Boolean = js.native
}
