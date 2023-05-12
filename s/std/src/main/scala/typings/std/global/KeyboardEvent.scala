package typings.std.global

import typings.std.KeyboardEventInit
import typings.std.stdInts.`0x00`
import typings.std.stdInts.`0x01`
import typings.std.stdInts.`0x02`
import typings.std.stdInts.`0x03`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("KeyboardEvent")
@js.native
open class KeyboardEvent protected ()
  extends StObject
     with typings.std.KeyboardEvent {
  /* standard dom */
  def this(`type`: java.lang.String) = this()
  def this(`type`: java.lang.String, eventInitDict: KeyboardEventInit) = this()
}
object KeyboardEvent {
  
  /* standard dom */
  @JSGlobal("KeyboardEvent.DOM_KEY_LOCATION_LEFT")
  @js.native
  val DOM_KEY_LOCATION_LEFT: `0x01` = js.native
  
  /* standard dom */
  @JSGlobal("KeyboardEvent.DOM_KEY_LOCATION_NUMPAD")
  @js.native
  val DOM_KEY_LOCATION_NUMPAD: `0x03` = js.native
  
  /* standard dom */
  @JSGlobal("KeyboardEvent.DOM_KEY_LOCATION_RIGHT")
  @js.native
  val DOM_KEY_LOCATION_RIGHT: `0x02` = js.native
  
  /* standard dom */
  @JSGlobal("KeyboardEvent.DOM_KEY_LOCATION_STANDARD")
  @js.native
  val DOM_KEY_LOCATION_STANDARD: `0x00` = js.native
}
