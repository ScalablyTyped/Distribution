package typings.std.global

import org.scalablytyped.runtime.Instantiable0
import typings.std.MediaDeviceKind
import typings.std.MediaTrackCapabilities
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("InputDeviceInfo")
@js.native
class InputDeviceInfo ()
  extends typings.std.InputDeviceInfo {
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
object InputDeviceInfo
  extends Instantiable0[typings.std.InputDeviceInfo]

