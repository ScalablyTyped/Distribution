package typings.secp256k1

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRecovery extends js.Object {
  var recovery: Double
  var signature: Uint8Array
}

object AnonRecovery {
  @scala.inline
  def apply(recovery: Double, signature: Uint8Array): AnonRecovery = {
    val __obj = js.Dynamic.literal(recovery = recovery.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonRecovery]
  }
}

