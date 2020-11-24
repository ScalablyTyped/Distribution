package typings.reactNativePermissions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object typesMod {
  
  type AndroidPermission = typings.reactNativePermissions.typesMod.Values[typings.reactNativePermissions.permissionsAndroidMod.AndroidPermissionMap]
  
  type IOSPermission = typings.reactNativePermissions.typesMod.Values[typings.reactNativePermissions.permissionsIosMod.IOSPermissionMap]
  
  type Permission = typings.reactNativePermissions.typesMod.AndroidPermission | typings.reactNativePermissions.typesMod.IOSPermission | typings.reactNativePermissions.typesMod.WindowsPermission
  
  type PermissionStatus = typings.reactNativePermissions.typesMod.Values[typings.reactNativePermissions.resultsMod.ResultMap]
  
  type Values[T /* <: js.Object */] = /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  
  type WindowsPermission = typings.reactNativePermissions.typesMod.Values[typings.reactNativePermissions.permissionsWindowsMod.WindowsPermissionMap]
}
