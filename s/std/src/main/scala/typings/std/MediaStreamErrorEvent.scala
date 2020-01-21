package typings.std

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaStreamErrorEvent extends Event_ {
  val error: MediaStreamError | Null = js.native
}

@JSGlobal("MediaStreamErrorEvent")
@js.native
object MediaStreamErrorEvent
  extends Instantiable1[/* typeArg */ java.lang.String, MediaStreamErrorEvent]
     with Instantiable2[
      /* typeArg */ java.lang.String, 
      /* eventInitDict */ MediaStreamErrorEventInit, 
      MediaStreamErrorEvent
    ]

