package typings.smoothScrollbar

import typings.smoothScrollbar.anon.XY
import typings.smoothScrollbar.eventHubMod.EventHandler
import typings.smoothScrollbar.scrollbarMod.Scrollbar
import typings.std.EventTarget
import typings.std.HTMLElement
import typings.std.Touch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("smooth-scrollbar/utils", JSImport.Namespace)
@js.native
object utilsMod extends js.Object {
  @js.native
  class TouchRecord ()
    extends typings.smoothScrollbar.touchRecordMod.TouchRecord
  
  @js.native
  class Tracker protected ()
    extends typings.smoothScrollbar.touchRecordMod.Tracker {
    def this(touch: Touch) = this()
  }
  
  def clearEventsOn(scrollbar: Scrollbar): Unit = js.native
  def eventScope(scrollbar: Scrollbar): js.Function3[/* elem */ EventTarget, /* events */ String, /* fn */ EventHandler, Unit] = js.native
  def getPointerData(evt: js.Any): js.Any = js.native
  def getPosition(evt: js.Any): XY = js.native
  def isOneOf(a: js.Any): Boolean = js.native
  def isOneOf(a: js.Any, b: js.Array[_]): Boolean = js.native
  def setStyle(elem: HTMLElement, styles: js.Any): Unit = js.native
}

