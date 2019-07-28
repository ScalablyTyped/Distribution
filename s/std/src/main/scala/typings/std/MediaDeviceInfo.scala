package typings.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The MediaDevicesInfo interface contains information that describes a single media input or output device. */
trait MediaDeviceInfo extends js.Object {
  val deviceId: java.lang.String
  val groupId: java.lang.String
  val kind: MediaDeviceKind
  val label: java.lang.String
  def toJSON(): js.Any
}

@JSGlobal("MediaDeviceInfo")
@js.native
class MediaDeviceInfoCls () extends MediaDeviceInfo {
  /* CompleteClass */
  override val deviceId: java.lang.String = js.native
  /* CompleteClass */
  override val groupId: java.lang.String = js.native
  /* CompleteClass */
  override val kind: MediaDeviceKind = js.native
  /* CompleteClass */
  override val label: java.lang.String = js.native
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
}

@JSGlobal("MediaDeviceInfo")
@js.native
object MediaDeviceInfo extends Instantiable0[MediaDeviceInfo]

