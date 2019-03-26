package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RTCIceGathererEvent extends Event {
  val candidate: RTCIceCandidateDictionary | RTCIceCandidateComplete = js.native
}

@JSGlobal("RTCIceGathererEvent")
@js.native
class RTCIceGathererEventCls () extends RTCIceGathererEvent

@JSGlobal("RTCIceGathererEvent")
@js.native
object RTCIceGathererEvent
  extends org.scalablytyped.runtime.Instantiable0[RTCIceGathererEvent]

