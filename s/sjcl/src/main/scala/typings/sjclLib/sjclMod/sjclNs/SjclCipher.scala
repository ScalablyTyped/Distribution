package typings
package sjclLib.sjclMod.sjclNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SjclCipher extends js.Object {
  def decrypt(data: js.Array[scala.Double]): js.Array[scala.Double]
  def encrypt(data: js.Array[scala.Double]): js.Array[scala.Double]
}

object SjclCipher {
  @scala.inline
  def apply(
    decrypt: js.Function1[js.Array[scala.Double], js.Array[scala.Double]],
    encrypt: js.Function1[js.Array[scala.Double], js.Array[scala.Double]]
  ): SjclCipher = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("decrypt")(decrypt)
    __obj.updateDynamic("encrypt")(encrypt)
    __obj.asInstanceOf[SjclCipher]
  }
}

