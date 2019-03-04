package typings
package secp256k1Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Recovery extends js.Object {
  var recovery: scala.Double
  var signature: nodeLib.Buffer
}

object Anon_Recovery {
  @scala.inline
  def apply(recovery: scala.Double, signature: nodeLib.Buffer): Anon_Recovery = {
    val __obj = js.Dynamic.literal(recovery = recovery, signature = signature)
  
    __obj.asInstanceOf[Anon_Recovery]
  }
}

