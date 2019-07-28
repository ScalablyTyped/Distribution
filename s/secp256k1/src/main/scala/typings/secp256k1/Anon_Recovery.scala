package typings.secp256k1

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Recovery extends js.Object {
  var recovery: Double
  var signature: Buffer
}

object Anon_Recovery {
  @scala.inline
  def apply(recovery: Double, signature: Buffer): Anon_Recovery = {
    val __obj = js.Dynamic.literal(recovery = recovery, signature = signature)
  
    __obj.asInstanceOf[Anon_Recovery]
  }
}

