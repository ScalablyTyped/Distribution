package typings.secp256k1

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRecovery extends js.Object {
  var recovery: Double
  var signature: Buffer
}

object AnonRecovery {
  @scala.inline
  def apply(recovery: Double, signature: Buffer): AnonRecovery = {
    val __obj = js.Dynamic.literal(recovery = recovery.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonRecovery]
  }
}

