package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UIEvent extends Event {
  val detail: scala.Double = js.native
  val view: Window = js.native
  def initUIEvent(
    typeArg: java.lang.String,
    canBubbleArg: scala.Boolean,
    cancelableArg: scala.Boolean,
    viewArg: Window,
    detailArg: scala.Double
  ): scala.Unit = js.native
}

@JSGlobal("UIEvent")
@js.native
class UIEventCls protected () extends UIEvent {
  def this(typeArg: java.lang.String) = this()
  def this(typeArg: java.lang.String, eventInitDict: UIEventInit) = this()
}

@JSGlobal("UIEvent")
@js.native
object UIEvent
  extends org.scalablytyped.runtime.Instantiable1[/* typeArg */ java.lang.String, UIEvent]
     with org.scalablytyped.runtime.Instantiable2[/* typeArg */ java.lang.String, /* eventInitDict */ UIEventInit, UIEvent]

