package typings.reactDashNativeDashPermissions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libTypescriptTypesMod {
  import typings.reactDashNativeDashPermissions.Anon_ACCEPTHANDOVER
  import typings.reactDashNativeDashPermissions.Anon_BLOCKED
  import typings.reactDashNativeDashPermissions.Anon_BLUETOOTHPERIPHERAL

  type AndroidPermission = Values[Anon_ACCEPTHANDOVER]
  type IOSPermission = Values[Anon_BLUETOOTHPERIPHERAL]
  type Permission = AndroidPermission | IOSPermission
  type PermissionStatus = Values[Anon_BLOCKED]
  type Values[T /* <: js.Object */] = /* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any
}
