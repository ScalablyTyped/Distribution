package typings.reactNativePermissions.anon

import typings.reactNativePermissions.reactNativePermissionsStrings.blocked
import typings.reactNativePermissions.reactNativePermissionsStrings.denied
import typings.reactNativePermissions.reactNativePermissionsStrings.granted
import typings.reactNativePermissions.reactNativePermissionsStrings.unavailable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<{  UNAVAILABLE  :'unavailable',   DENIED  :'denied',   BLOCKED  :'blocked',   GRANTED  :'granted'}> */
trait ReadonlyUNAVAILABLEunavai extends js.Object {
  val BLOCKED: blocked
  val DENIED: denied
  val GRANTED: granted
  val UNAVAILABLE: unavailable
}

object ReadonlyUNAVAILABLEunavai {
  @scala.inline
  def apply(BLOCKED: blocked, DENIED: denied, GRANTED: granted, UNAVAILABLE: unavailable): ReadonlyUNAVAILABLEunavai = {
    val __obj = js.Dynamic.literal(BLOCKED = BLOCKED.asInstanceOf[js.Any], DENIED = DENIED.asInstanceOf[js.Any], GRANTED = GRANTED.asInstanceOf[js.Any], UNAVAILABLE = UNAVAILABLE.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyUNAVAILABLEunavai]
  }
}

