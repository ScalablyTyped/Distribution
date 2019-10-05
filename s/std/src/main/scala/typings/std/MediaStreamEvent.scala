package typings.std

import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Events that occurs in relation to a MediaStream. Two events of this type can be thrown: addstream and removestream. */
@js.native
trait MediaStreamEvent extends Event {
  val stream: MediaStream | Null = js.native
}

@JSGlobal("MediaStreamEvent")
@js.native
object MediaStreamEvent
  extends Instantiable2[
      /* type */ java.lang.String, 
      /* eventInitDict */ MediaStreamEventInit, 
      MediaStreamEvent
    ]

