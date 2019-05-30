package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Events providing information related to animations. */
@js.native
trait AnimationEvent extends Event {
  val animationName: java.lang.String = js.native
  val elapsedTime: scala.Double = js.native
  val pseudoElement: java.lang.String = js.native
}

@JSGlobal("AnimationEvent")
@js.native
class AnimationEventCls protected () extends AnimationEvent {
  def this(`type`: java.lang.String) = this()
  def this(`type`: java.lang.String, animationEventInitDict: AnimationEventInit) = this()
}

@JSGlobal("AnimationEvent")
@js.native
object AnimationEvent
  extends org.scalablytyped.runtime.Instantiable1[/* type */ java.lang.String, AnimationEvent]
     with org.scalablytyped.runtime.Instantiable2[
      /* type */ java.lang.String, 
      /* animationEventInitDict */ AnimationEventInit, 
      AnimationEvent
    ]

