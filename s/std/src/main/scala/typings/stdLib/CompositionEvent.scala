package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The DOM CompositionEvent represents events that occur due to the user indirectly entering text. */
@js.native
trait CompositionEvent extends UIEvent {
  val data: java.lang.String = js.native
  val locale: java.lang.String = js.native
  def initCompositionEvent(
    typeArg: java.lang.String,
    canBubbleArg: scala.Boolean,
    cancelableArg: scala.Boolean,
    viewArg: Window,
    dataArg: java.lang.String,
    locale: java.lang.String
  ): scala.Unit = js.native
}

@JSGlobal("CompositionEvent")
@js.native
class CompositionEventCls protected () extends CompositionEvent {
  def this(typeArg: java.lang.String) = this()
  def this(typeArg: java.lang.String, eventInitDict: CompositionEventInit) = this()
}

@JSGlobal("CompositionEvent")
@js.native
object CompositionEvent
  extends org.scalablytyped.runtime.Instantiable1[/* typeArg */ java.lang.String, CompositionEvent]
     with org.scalablytyped.runtime.Instantiable2[
      /* typeArg */ java.lang.String, 
      /* eventInitDict */ CompositionEventInit, 
      CompositionEvent
    ]

