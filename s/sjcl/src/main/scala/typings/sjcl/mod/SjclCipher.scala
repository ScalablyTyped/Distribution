package typings.sjcl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SjclCipher extends js.Object {
  def decrypt(data: js.Array[Double]): js.Array[Double] = js.native
  def encrypt(data: js.Array[Double]): js.Array[Double] = js.native
}

object SjclCipher {
  @scala.inline
  def apply(decrypt: js.Array[Double] => js.Array[Double], encrypt: js.Array[Double] => js.Array[Double]): SjclCipher = {
    val __obj = js.Dynamic.literal(decrypt = js.Any.fromFunction1(decrypt), encrypt = js.Any.fromFunction1(encrypt))
    __obj.asInstanceOf[SjclCipher]
  }
  @scala.inline
  implicit class SjclCipherOps[Self <: SjclCipher] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDecrypt(value: js.Array[Double] => js.Array[Double]): Self = this.set("decrypt", js.Any.fromFunction1(value))
    @scala.inline
    def setEncrypt(value: js.Array[Double] => js.Array[Double]): Self = this.set("encrypt", js.Any.fromFunction1(value))
  }
  
}

