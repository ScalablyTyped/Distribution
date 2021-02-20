package typings.smoothScrollbar

import typings.smoothScrollbar.scrollbarMod.Scrollbar
import typings.std.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventHubMod {
  
  @JSImport("smooth-scrollbar/utils/event-hub", "clearEventsOn")
  @js.native
  def clearEventsOn(scrollbar: Scrollbar): Unit = js.native
  
  @JSImport("smooth-scrollbar/utils/event-hub", "eventScope")
  @js.native
  def eventScope(scrollbar: Scrollbar): js.Function3[/* elem */ EventTarget, /* events */ String, /* fn */ EventHandler, Unit] = js.native
  
  type EventHandler = js.Function1[/* event */ js.Any, Unit]
}
