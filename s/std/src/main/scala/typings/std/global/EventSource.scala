package typings.std.global

import typings.std.EventSourceInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("EventSource")
@js.native
class EventSource protected ()
  extends typings.std.EventSource {
  def this(url: java.lang.String) = this()
  def this(url: java.lang.String, eventSourceInitDict: EventSourceInit) = this()
}
object EventSource {
  
  @JSGlobal("EventSource.CLOSED")
  @js.native
  val CLOSED: Double = js.native
  
  @JSGlobal("EventSource.CONNECTING")
  @js.native
  val CONNECTING: Double = js.native
  
  @JSGlobal("EventSource.OPEN")
  @js.native
  val OPEN: Double = js.native
}
