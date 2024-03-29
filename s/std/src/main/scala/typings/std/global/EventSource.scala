package typings.std.global

import typings.std.EventSourceInit
import typings.std.stdInts.`0`
import typings.std.stdInts.`1`
import typings.std.stdInts.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("EventSource")
@js.native
open class EventSource protected ()
  extends StObject
     with typings.std.EventSource {
  /* standard dom */
  def this(url: java.lang.String) = this()
  def this(url: typings.std.URL) = this()
  def this(url: java.lang.String, eventSourceInitDict: EventSourceInit) = this()
  def this(url: typings.std.URL, eventSourceInitDict: EventSourceInit) = this()
}
object EventSource {
  
  /* standard dom */
  @JSGlobal("EventSource.CLOSED")
  @js.native
  val CLOSED: `2` = js.native
  
  /* standard dom */
  @JSGlobal("EventSource.CONNECTING")
  @js.native
  val CONNECTING: `0` = js.native
  
  /* standard dom */
  @JSGlobal("EventSource.OPEN")
  @js.native
  val OPEN: `1` = js.native
}
