package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransitionEvent extends Event {
  val elapsedTime: scala.Double = js.native
  val propertyName: java.lang.String = js.native
  val pseudoElement: java.lang.String = js.native
}

@JSGlobal("TransitionEvent")
@js.native
object TransitionEvent
  extends ScalablyTyped.runtime.Instantiable1[/* type */ java.lang.String, TransitionEvent]
     with ScalablyTyped.runtime.Instantiable2[
      /* type */ java.lang.String, 
      /* transitionEventInitDict */ TransitionEventInit, 
      TransitionEvent
    ]

