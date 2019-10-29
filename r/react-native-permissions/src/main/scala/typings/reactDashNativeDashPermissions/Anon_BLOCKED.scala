package typings.reactDashNativeDashPermissions

import typings.reactDashNativeDashPermissions.reactDashNativeDashPermissionsStrings.blocked
import typings.reactDashNativeDashPermissions.reactDashNativeDashPermissionsStrings.denied
import typings.reactDashNativeDashPermissions.reactDashNativeDashPermissionsStrings.granted
import typings.reactDashNativeDashPermissions.reactDashNativeDashPermissionsStrings.unavailable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BLOCKED extends js.Object {
  var BLOCKED: blocked
  var DENIED: denied
  var GRANTED: granted
  var UNAVAILABLE: unavailable
}

object Anon_BLOCKED {
  @scala.inline
  def apply(BLOCKED: blocked, DENIED: denied, GRANTED: granted, UNAVAILABLE: unavailable): Anon_BLOCKED = {
    val __obj = js.Dynamic.literal(BLOCKED = BLOCKED, DENIED = DENIED, GRANTED = GRANTED, UNAVAILABLE = UNAVAILABLE)
  
    __obj.asInstanceOf[Anon_BLOCKED]
  }
}

