package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("RTCSessionDescription")
@js.native
class RTCSessionDescriptionCls protected () extends RTCSessionDescription {
  def this(descriptionInitDict: RTCSessionDescriptionInit) = this()
  /* CompleteClass */
  override val sdp: java.lang.String = js.native
  /* CompleteClass */
  override val `type`: RTCSdpType = js.native
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
}

