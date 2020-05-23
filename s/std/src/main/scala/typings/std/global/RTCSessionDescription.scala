package typings.std.global

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.std.RTCSdpType
import typings.std.RTCSessionDescriptionInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("RTCSessionDescription")
@js.native
class RTCSessionDescription ()
  extends typings.std.RTCSessionDescription {
  def this(descriptionInitDict: RTCSessionDescriptionInit) = this()
  /* CompleteClass */
  override val sdp: java.lang.String = js.native
  /* CompleteClass */
  override val `type`: RTCSdpType = js.native
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
}

@JSGlobal("RTCSessionDescription")
@js.native
object RTCSessionDescription
  extends Instantiable0[typings.std.RTCSessionDescription]
     with Instantiable1[
      /* descriptionInitDict */ RTCSessionDescriptionInit, 
      typings.std.RTCSessionDescription
    ]

