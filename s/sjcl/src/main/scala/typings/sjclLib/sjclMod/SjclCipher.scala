package typings
package sjclLib.sjclMod

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
    decrypt: js.Array[scala.Double] => js.Array[scala.Double],
    encrypt: js.Array[scala.Double] => js.Array[scala.Double]
  ): SjclCipher = {
    val __obj = js.Dynamic.literal(decrypt = js.Any.fromFunction1(decrypt), encrypt = js.Any.fromFunction1(encrypt))
  
    __obj.asInstanceOf[SjclCipher]
  }
}

