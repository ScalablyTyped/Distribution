package typings.reduxPersistTransformEncrypt.asyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsyncEncryptorConfig extends js.Object {
  var secretKey: String
}

object AsyncEncryptorConfig {
  @scala.inline
  def apply(secretKey: String): AsyncEncryptorConfig = {
    val __obj = js.Dynamic.literal(secretKey = secretKey.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AsyncEncryptorConfig]
  }
}

