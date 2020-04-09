package typings.secp256k1

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRecId extends js.Object {
  var recId: Double
  var signature: Uint8Array
}

object AnonRecId {
  @scala.inline
  def apply(recId: Double, signature: Uint8Array): AnonRecId = {
    val __obj = js.Dynamic.literal(recId = recId.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonRecId]
  }
}

