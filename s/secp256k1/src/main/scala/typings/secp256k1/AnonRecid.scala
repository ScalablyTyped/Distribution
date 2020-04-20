package typings.secp256k1

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRecid extends js.Object {
  var recid: Double
  var signature: Uint8Array
}

object AnonRecid {
  @scala.inline
  def apply(recid: Double, signature: Uint8Array): AnonRecid = {
    val __obj = js.Dynamic.literal(recid = recid.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRecid]
  }
}

