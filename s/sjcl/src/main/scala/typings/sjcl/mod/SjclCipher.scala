package typings.sjcl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SjclCipher extends js.Object {
  def decrypt(data: js.Array[Double]): js.Array[Double]
  def encrypt(data: js.Array[Double]): js.Array[Double]
}

object SjclCipher {
  @scala.inline
  def apply(decrypt: js.Array[Double] => js.Array[Double], encrypt: js.Array[Double] => js.Array[Double]): SjclCipher = {
    val __obj = js.Dynamic.literal(decrypt = js.Any.fromFunction1(decrypt), encrypt = js.Any.fromFunction1(encrypt))
    __obj.asInstanceOf[SjclCipher]
  }
}

