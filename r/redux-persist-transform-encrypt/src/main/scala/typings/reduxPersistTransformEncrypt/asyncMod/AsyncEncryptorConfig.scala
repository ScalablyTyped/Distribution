package typings.reduxPersistTransformEncrypt.asyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsyncEncryptorConfig extends js.Object {
  var secretKey: String = js.native
}

object AsyncEncryptorConfig {
  @scala.inline
  def apply(secretKey: String): AsyncEncryptorConfig = {
    val __obj = js.Dynamic.literal(secretKey = secretKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsyncEncryptorConfig]
  }
  @scala.inline
  implicit class AsyncEncryptorConfigOps[Self <: AsyncEncryptorConfig] (val x: Self) extends AnyVal {
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
    def setSecretKey(value: String): Self = this.set("secretKey", value.asInstanceOf[js.Any])
  }
  
}

