package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaStreamEvent extends Event {
  val stream: MediaStream | scala.Null = js.native
}

@JSGlobal("MediaStreamEvent")
@js.native
object MediaStreamEvent
  extends org.scalablytyped.runtime.Instantiable2[
      /* type */ java.lang.String, 
      /* eventInitDict */ MediaStreamEventInit, 
      MediaStreamEvent
    ]

