package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaStreamErrorEvent extends Event {
  val error: MediaStreamError | scala.Null = js.native
}

@JSGlobal("MediaStreamErrorEvent")
@js.native
class MediaStreamErrorEventCls protected () extends MediaStreamErrorEvent {
  def this(typeArg: java.lang.String) = this()
  def this(typeArg: java.lang.String, eventInitDict: MediaStreamErrorEventInit) = this()
}

@JSGlobal("MediaStreamErrorEvent")
@js.native
object MediaStreamErrorEvent
  extends org.scalablytyped.runtime.Instantiable1[/* typeArg */ java.lang.String, MediaStreamErrorEvent]
     with org.scalablytyped.runtime.Instantiable2[
      /* typeArg */ java.lang.String, 
      /* eventInitDict */ MediaStreamErrorEventInit, 
      MediaStreamErrorEvent
    ]

