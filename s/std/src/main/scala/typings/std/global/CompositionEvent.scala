package typings.std.global

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.std.CompositionEventInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CompositionEvent")
@js.native
class CompositionEvent protected ()
  extends typings.std.CompositionEvent {
  def this(`type`: java.lang.String) = this()
  def this(`type`: java.lang.String, eventInitDict: CompositionEventInit) = this()
}

@JSGlobal("CompositionEvent")
@js.native
object CompositionEvent
  extends Instantiable1[/* type */ java.lang.String, typings.std.CompositionEvent]
     with Instantiable2[
      /* type */ java.lang.String, 
      /* eventInitDict */ CompositionEventInit, 
      typings.std.CompositionEvent
    ]

