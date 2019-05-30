package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** PopStateEvent is an event handler for the popstate event on the window. */
@js.native
trait PopStateEvent extends Event {
  val state: js.Any = js.native
}

@JSGlobal("PopStateEvent")
@js.native
class PopStateEventCls protected () extends PopStateEvent {
  def this(`type`: java.lang.String) = this()
  def this(`type`: java.lang.String, eventInitDict: PopStateEventInit) = this()
}

@JSGlobal("PopStateEvent")
@js.native
object PopStateEvent
  extends org.scalablytyped.runtime.Instantiable1[/* type */ java.lang.String, PopStateEvent]
     with org.scalablytyped.runtime.Instantiable2[/* type */ java.lang.String, /* eventInitDict */ PopStateEventInit, PopStateEvent]

