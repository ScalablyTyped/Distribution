package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Permissions extends StObject {
  
  def query(permissionDesc: DevicePermissionDescriptor): js.Promise[PermissionStatus] = js.native
  def query(permissionDesc: MidiPermissionDescriptor): js.Promise[PermissionStatus] = js.native
  def query(permissionDesc: PermissionDescriptor): js.Promise[PermissionStatus] = js.native
  def query(permissionDesc: PushPermissionDescriptor): js.Promise[PermissionStatus] = js.native
}
