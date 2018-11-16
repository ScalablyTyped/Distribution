package typings
package reactDashNativeDashPermissionsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactDashNativeDashPermissionsLibStrings {
  @js.native
  sealed trait authorized extends js.Object
  
  @js.native
  sealed trait denied extends js.Object
  
  @js.native
  sealed trait restricted extends js.Object
  
  @js.native
  sealed trait undetermined extends js.Object
  
  def authorized: authorized = "authorized".asInstanceOf[authorized]
  def denied: denied = "denied".asInstanceOf[denied]
  def restricted: restricted = "restricted".asInstanceOf[restricted]
  def undetermined: undetermined = "undetermined".asInstanceOf[undetermined]
}

