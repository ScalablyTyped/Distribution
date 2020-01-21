package typings.std

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** PopStateEvent is an event handler for the popstate event on the window. */
@js.native
trait PopStateEvent extends Event_ {
  val state: js.Any = js.native
}

@JSGlobal("PopStateEvent")
@js.native
object PopStateEvent
  extends Instantiable1[/* type */ java.lang.String, PopStateEvent]
     with Instantiable2[/* type */ java.lang.String, /* eventInitDict */ PopStateEventInit, PopStateEvent]

