package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The MediaStreamEvent interface represents events that occurs in relation to a MediaStream. Two events of this type can be thrown: addstream and removestream. */
@js.native
trait MediaStreamEvent extends Event {
  val stream: MediaStream | scala.Null = js.native
}

@JSGlobal("MediaStreamEvent")
@js.native
class MediaStreamEventCls protected () extends MediaStreamEvent {
  def this(`type`: java.lang.String, eventInitDict: MediaStreamEventInit) = this()
}

@JSGlobal("MediaStreamEvent")
@js.native
object MediaStreamEvent
  extends org.scalablytyped.runtime.Instantiable2[
      /* type */ java.lang.String, 
      /* eventInitDict */ MediaStreamEventInit, 
      MediaStreamEvent
    ]

