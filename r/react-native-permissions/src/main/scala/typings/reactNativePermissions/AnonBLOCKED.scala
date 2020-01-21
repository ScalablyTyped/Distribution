package typings.reactNativePermissions

import typings.reactNativePermissions.reactNativePermissionsStrings.blocked
import typings.reactNativePermissions.reactNativePermissionsStrings.denied
import typings.reactNativePermissions.reactNativePermissionsStrings.granted
import typings.reactNativePermissions.reactNativePermissionsStrings.unavailable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBLOCKED extends js.Object {
  var BLOCKED: blocked
  var DENIED: denied
  var GRANTED: granted
  var UNAVAILABLE: unavailable
}

object AnonBLOCKED {
  @scala.inline
  def apply(BLOCKED: blocked, DENIED: denied, GRANTED: granted, UNAVAILABLE: unavailable): AnonBLOCKED = {
    val __obj = js.Dynamic.literal(BLOCKED = BLOCKED.asInstanceOf[js.Any], DENIED = DENIED.asInstanceOf[js.Any], GRANTED = GRANTED.asInstanceOf[js.Any], UNAVAILABLE = UNAVAILABLE.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBLOCKED]
  }
}

