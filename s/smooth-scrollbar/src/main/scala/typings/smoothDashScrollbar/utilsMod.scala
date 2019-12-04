package typings.smoothDashScrollbar

import typings.smoothDashScrollbar.interfacesScrollbarMod.Scrollbar
import typings.smoothDashScrollbar.utilsEventDashHubMod.EventHandler
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
    extends typings.smoothDashScrollbar.utilsTouchDashRecordMod.TouchRecord
  
  @js.native
  class Tracker protected ()
    extends typings.smoothDashScrollbar.utilsTouchDashRecordMod.Tracker {
    def this(touch: Touch) = this()
  }
  
  def clearEventsOn(scrollbar: Scrollbar): Unit = js.native
  def eventScope(scrollbar: Scrollbar): js.Function3[/* elem */ EventTarget, /* events */ String, /* fn */ EventHandler, Unit] = js.native
  def getPointerData(evt: js.Any): js.Any = js.native
  def getPosition(evt: js.Any): Anon_XYAny = js.native
  def isOneOf(a: js.Any): Boolean = js.native
  def isOneOf(a: js.Any, b: js.Array[_]): Boolean = js.native
  def setStyle(elem: HTMLElement, styles: js.Any): Unit = js.native
}

