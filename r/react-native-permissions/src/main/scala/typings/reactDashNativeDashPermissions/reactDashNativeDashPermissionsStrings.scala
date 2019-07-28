package typings.reactDashNativeDashPermissions

import typings.reactDashNativeDashPermissions.reactDashNativeDashPermissionsMod.Status
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactDashNativeDashPermissionsStrings {
  @js.native
  sealed trait authorized extends Status
  
  @js.native
  sealed trait denied extends Status
  
  @js.native
  sealed trait restricted extends Status
  
  @js.native
  sealed trait undetermined extends Status
  
  @scala.inline
  def authorized: authorized = "authorized".asInstanceOf[authorized]
  @scala.inline
  def denied: denied = "denied".asInstanceOf[denied]
  @scala.inline
  def restricted: restricted = "restricted".asInstanceOf[restricted]
  @scala.inline
  def undetermined: undetermined = "undetermined".asInstanceOf[undetermined]
}

