package typings.std

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The DOM CompositionEvent represents events that occur due to the user indirectly entering text. */
@js.native
trait CompositionEvent extends UIEvent {
  val data: java.lang.String = js.native
}

@JSGlobal("CompositionEvent")
@js.native
object CompositionEvent
  extends Instantiable1[/* type */ java.lang.String, CompositionEvent]
     with Instantiable2[
      /* type */ java.lang.String, 
      /* eventInitDict */ CompositionEventInit, 
      CompositionEvent
    ]

