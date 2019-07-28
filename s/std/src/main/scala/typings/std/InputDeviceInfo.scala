package typings.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputDeviceInfo extends MediaDeviceInfo {
  def getCapabilities(): MediaTrackCapabilities
}

@JSGlobal("InputDeviceInfo")
@js.native
class InputDeviceInfoCls () extends InputDeviceInfo {
  /* CompleteClass */
  override val deviceId: java.lang.String = js.native
  /* CompleteClass */
  override val groupId: java.lang.String = js.native
  /* CompleteClass */
  override val kind: MediaDeviceKind = js.native
  /* CompleteClass */
  override val label: java.lang.String = js.native
  /* CompleteClass */
  override def getCapabilities(): MediaTrackCapabilities = js.native
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
}

@JSGlobal("InputDeviceInfo")
@js.native
object InputDeviceInfo extends Instantiable0[InputDeviceInfo]

