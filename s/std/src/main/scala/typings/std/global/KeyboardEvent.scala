package typings.std.global

import typings.std.KeyboardEventInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("KeyboardEvent")
@js.native
class KeyboardEvent protected ()
  extends typings.std.KeyboardEvent {
  def this(`type`: java.lang.String) = this()
  def this(`type`: java.lang.String, eventInitDict: KeyboardEventInit) = this()
}
object KeyboardEvent {
  
  @JSGlobal("KeyboardEvent.DOM_KEY_LOCATION_LEFT")
  @js.native
  val DOM_KEY_LOCATION_LEFT: Double = js.native
  
  @JSGlobal("KeyboardEvent.DOM_KEY_LOCATION_NUMPAD")
  @js.native
  val DOM_KEY_LOCATION_NUMPAD: Double = js.native
  
  @JSGlobal("KeyboardEvent.DOM_KEY_LOCATION_RIGHT")
  @js.native
  val DOM_KEY_LOCATION_RIGHT: Double = js.native
  
  @JSGlobal("KeyboardEvent.DOM_KEY_LOCATION_STANDARD")
  @js.native
  val DOM_KEY_LOCATION_STANDARD: Double = js.native
}
