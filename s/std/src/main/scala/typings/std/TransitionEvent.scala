package typings.std

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Events providing information related to transitions. */
@js.native
trait TransitionEvent extends Event {
  val elapsedTime: Double = js.native
  val propertyName: java.lang.String = js.native
  val pseudoElement: java.lang.String = js.native
}

@JSGlobal("TransitionEvent")
@js.native
object TransitionEvent
  extends Instantiable1[/* type */ java.lang.String, TransitionEvent]
     with Instantiable2[
      /* type */ java.lang.String, 
      /* transitionEventInitDict */ TransitionEventInit, 
      TransitionEvent
    ]

