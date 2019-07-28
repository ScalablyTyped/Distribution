package typings.ssh2.ssh2Mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PublicKey extends js.Object {
  /** The name of the key algorithm. */
  var algo: String
  /** The actual key data. */
  var data: Buffer
}

object PublicKey {
  @scala.inline
  def apply(algo: String, data: Buffer): PublicKey = {
    val __obj = js.Dynamic.literal(algo = algo, data = data)
  
    __obj.asInstanceOf[PublicKey]
  }
}

