package typings
package reactDashNativeDashPermissionsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactDashNativeDashPermissionsLibStrings {
  @js.native
  sealed trait authorized
    extends reactDashNativeDashPermissionsLib.reactDashNativeDashPermissionsMod.Status
  
  @js.native
  sealed trait denied
    extends reactDashNativeDashPermissionsLib.reactDashNativeDashPermissionsMod.Status
  
  @js.native
  sealed trait restricted
    extends reactDashNativeDashPermissionsLib.reactDashNativeDashPermissionsMod.Status
  
  @js.native
  sealed trait undetermined
    extends reactDashNativeDashPermissionsLib.reactDashNativeDashPermissionsMod.Status
  
  @scala.inline
  def authorized: authorized = "authorized".asInstanceOf[authorized]
  @scala.inline
  def denied: denied = "denied".asInstanceOf[denied]
  @scala.inline
  def restricted: restricted = "restricted".asInstanceOf[restricted]
  @scala.inline
  def undetermined: undetermined = "undetermined".asInstanceOf[undetermined]
}

