package typings.smoothScrollbar

import typings.smoothScrollbar.anon.XY
import typings.smoothScrollbar.interfacesScrollbarMod.Scrollbar
import typings.smoothScrollbar.utilsEventHubMod.EventHandler
import typings.std.EventTarget
import typings.std.HTMLElement
import typings.std.Touch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("smooth-scrollbar/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("smooth-scrollbar/utils", "TouchRecord")
  @js.native
  open class TouchRecord ()
    extends typings.smoothScrollbar.utilsTouchRecordMod.TouchRecord
  
  @JSImport("smooth-scrollbar/utils", "Tracker")
  @js.native
  open class Tracker protected ()
    extends typings.smoothScrollbar.utilsTouchRecordMod.Tracker {
    def this(touch: Touch) = this()
  }
  
  inline def clearEventsOn(scrollbar: Scrollbar): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearEventsOn")(scrollbar.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def eventScope(scrollbar: Scrollbar): js.Function3[/* elem */ EventTarget, /* events */ String, /* fn */ EventHandler, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("eventScope")(scrollbar.asInstanceOf[js.Any]).asInstanceOf[js.Function3[/* elem */ EventTarget, /* events */ String, /* fn */ EventHandler, Unit]]
  
  inline def getPointerData(evt: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getPointerData")(evt.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def getPosition(evt: Any): XY = ^.asInstanceOf[js.Dynamic].applyDynamic("getPosition")(evt.asInstanceOf[js.Any]).asInstanceOf[XY]
  
  inline def isOneOf(a: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isOneOf")(a.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isOneOf(a: Any, b: js.Array[Any]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isOneOf")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def setStyle(elem: HTMLElement, styles: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setStyle")(elem.asInstanceOf[js.Any], styles.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
