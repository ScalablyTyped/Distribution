package typings.std.global

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.std.EventSourceInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("EventSource")
@js.native
class EventSource protected ()
  extends typings.std.EventSource {
  def this(url: java.lang.String) = this()
  def this(url: java.lang.String, eventSourceInitDict: EventSourceInit) = this()
}

@JSGlobal("EventSource")
@js.native
object EventSource
  extends Instantiable1[/* url */ java.lang.String, typings.std.EventSource]
     with Instantiable2[
      /* url */ java.lang.String, 
      /* eventSourceInitDict */ EventSourceInit, 
      typings.std.EventSource
    ] {
  val CLOSED: Double = js.native
  val CONNECTING: Double = js.native
  val OPEN: Double = js.native
}

