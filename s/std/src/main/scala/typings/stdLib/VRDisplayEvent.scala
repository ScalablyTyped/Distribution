package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The VRDisplayEvent interface of the WebVR API represents represents the event object of WebVR-related events (see the list of WebVR window extensions). */
@js.native
trait VRDisplayEvent extends Event {
  val display: VRDisplay = js.native
  val reason: VRDisplayEventReason | scala.Null = js.native
}

@JSGlobal("VRDisplayEvent")
@js.native
class VRDisplayEventCls protected () extends VRDisplayEvent {
  def this(`type`: java.lang.String, eventInitDict: VRDisplayEventInit) = this()
}

@JSGlobal("VRDisplayEvent")
@js.native
object VRDisplayEvent
  extends org.scalablytyped.runtime.Instantiable2[/* type */ java.lang.String, /* eventInitDict */ VRDisplayEventInit, VRDisplayEvent]

