package typings.std.global

import typings.std.WheelEventInit
import typings.std.stdInts.`0x00`
import typings.std.stdInts.`0x01`
import typings.std.stdInts.`0x02`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("WheelEvent")
@js.native
open class WheelEvent protected ()
  extends StObject
     with typings.std.WheelEvent {
  /* standard dom */
  def this(`type`: java.lang.String) = this()
  def this(`type`: java.lang.String, eventInitDict: WheelEventInit) = this()
}
object WheelEvent {
  
  /* standard dom */
  @JSGlobal("WheelEvent.DOM_DELTA_LINE")
  @js.native
  val DOM_DELTA_LINE: `0x01` = js.native
  
  /* standard dom */
  @JSGlobal("WheelEvent.DOM_DELTA_PAGE")
  @js.native
  val DOM_DELTA_PAGE: `0x02` = js.native
  
  /* standard dom */
  @JSGlobal("WheelEvent.DOM_DELTA_PIXEL")
  @js.native
  val DOM_DELTA_PIXEL: `0x00` = js.native
}
