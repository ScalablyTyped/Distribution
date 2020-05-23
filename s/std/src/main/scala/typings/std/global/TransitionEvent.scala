package typings.std.global

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.std.TransitionEventInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TransitionEvent")
@js.native
class TransitionEvent protected ()
  extends typings.std.TransitionEvent {
  def this(`type`: java.lang.String) = this()
  def this(`type`: java.lang.String, transitionEventInitDict: TransitionEventInit) = this()
}

@JSGlobal("TransitionEvent")
@js.native
object TransitionEvent
  extends Instantiable1[/* type */ java.lang.String, typings.std.TransitionEvent]
     with Instantiable2[
      /* type */ java.lang.String, 
      /* transitionEventInitDict */ TransitionEventInit, 
      typings.std.TransitionEvent
    ]

