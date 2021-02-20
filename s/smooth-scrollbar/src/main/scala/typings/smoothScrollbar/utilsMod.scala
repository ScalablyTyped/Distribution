package typings.smoothScrollbar

import typings.smoothScrollbar.anon.XY
import typings.smoothScrollbar.eventHubMod.EventHandler
import typings.smoothScrollbar.scrollbarMod.Scrollbar
import typings.std.EventTarget
import typings.std.HTMLElement
import typings.std.Touch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("smooth-scrollbar/utils", "TouchRecord")
  @js.native
  class TouchRecord ()
    extends typings.smoothScrollbar.touchRecordMod.TouchRecord
  
  @JSImport("smooth-scrollbar/utils", "Tracker")
  @js.native
  class Tracker protected ()
    extends typings.smoothScrollbar.touchRecordMod.Tracker {
    def this(touch: Touch) = this()
  }
  
  @JSImport("smooth-scrollbar/utils", "clearEventsOn")
  @js.native
  def clearEventsOn(scrollbar: Scrollbar): Unit = js.native
  
  @JSImport("smooth-scrollbar/utils", "eventScope")
  @js.native
  def eventScope(scrollbar: Scrollbar): js.Function3[/* elem */ EventTarget, /* events */ String, /* fn */ EventHandler, Unit] = js.native
  
  @JSImport("smooth-scrollbar/utils", "getPointerData")
  @js.native
  def getPointerData(evt: js.Any): js.Any = js.native
  
  @JSImport("smooth-scrollbar/utils", "getPosition")
  @js.native
  def getPosition(evt: js.Any): XY = js.native
  
  @JSImport("smooth-scrollbar/utils", "isOneOf")
  @js.native
  def isOneOf(a: js.Any): Boolean = js.native
  @JSImport("smooth-scrollbar/utils", "isOneOf")
  @js.native
  def isOneOf(a: js.Any, b: js.Array[_]): Boolean = js.native
  
  @JSImport("smooth-scrollbar/utils", "setStyle")
  @js.native
  def setStyle(elem: HTMLElement, styles: js.Any): Unit = js.native
}
