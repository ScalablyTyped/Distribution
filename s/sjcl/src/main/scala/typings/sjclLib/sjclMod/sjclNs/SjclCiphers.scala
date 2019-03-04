package typings
package sjclLib.sjclMod.sjclNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// ________________________________________________________________________
trait SjclCiphers extends js.Object {
  var aes: SjclCipherStatic
}

object SjclCiphers {
  @scala.inline
  def apply(aes: SjclCipherStatic): SjclCiphers = {
    val __obj = js.Dynamic.literal(aes = aes)
  
    __obj.asInstanceOf[SjclCiphers]
  }
}

