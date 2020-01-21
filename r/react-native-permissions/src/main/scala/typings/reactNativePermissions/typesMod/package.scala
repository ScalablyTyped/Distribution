package typings.reactNativePermissions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type AndroidPermission = typings.reactNativePermissions.typesMod.Values[typings.reactNativePermissions.AnonACCEPTHANDOVER]
  type IOSPermission = typings.reactNativePermissions.typesMod.Values[typings.reactNativePermissions.AnonBLUETOOTHPERIPHERAL]
  type Permission = typings.reactNativePermissions.typesMod.AndroidPermission | typings.reactNativePermissions.typesMod.IOSPermission
  type PermissionStatus = typings.reactNativePermissions.typesMod.Values[typings.reactNativePermissions.AnonBLOCKED]
  type Values[T /* <: js.Object */] = /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
}
