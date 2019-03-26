package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RTCStatsEvent extends Event {
  val report: RTCStatsReport = js.native
}

@JSGlobal("RTCStatsEvent")
@js.native
class RTCStatsEventCls protected () extends RTCStatsEvent {
  def this(`type`: java.lang.String, eventInitDict: RTCStatsEventInit) = this()
}

@JSGlobal("RTCStatsEvent")
@js.native
object RTCStatsEvent
  extends org.scalablytyped.runtime.Instantiable2[/* type */ java.lang.String, /* eventInitDict */ RTCStatsEventInit, RTCStatsEvent]

