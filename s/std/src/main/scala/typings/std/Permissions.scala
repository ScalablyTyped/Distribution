package typings.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Permissions extends js.Object {
  def query(permissionDesc: DevicePermissionDescriptor): js.Promise[PermissionStatus] = js.native
  def query(permissionDesc: MidiPermissionDescriptor): js.Promise[PermissionStatus] = js.native
  def query(permissionDesc: PermissionDescriptor): js.Promise[PermissionStatus] = js.native
  def query(permissionDesc: PushPermissionDescriptor): js.Promise[PermissionStatus] = js.native
}

@JSGlobal("Permissions")
@js.native
class PermissionsCls () extends Permissions

@JSGlobal("Permissions")
@js.native
object Permissions extends Instantiable0[Permissions]

