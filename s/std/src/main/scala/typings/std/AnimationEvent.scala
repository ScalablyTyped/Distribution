package typings.std

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Events providing information related to animations. */
@js.native
trait AnimationEvent extends Event_ {
  val animationName: java.lang.String = js.native
  val elapsedTime: Double = js.native
  val pseudoElement: java.lang.String = js.native
}

@JSGlobal("AnimationEvent")
@js.native
object AnimationEvent
  extends Instantiable1[/* type */ java.lang.String, AnimationEvent]
     with Instantiable2[
      /* type */ java.lang.String, 
      /* animationEventInitDict */ AnimationEventInit, 
      AnimationEvent
    ]

