package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RTCSessionDescription extends js.Object {
  val sdp: java.lang.String
  val `type`: RTCSdpType
  def toJSON(): js.Any
}

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

@JSGlobal("RTCSessionDescription")
@js.native
object RTCSessionDescription
  extends org.scalablytyped.runtime.Instantiable1[/* descriptionInitDict */ RTCSessionDescriptionInit, RTCSessionDescription]

