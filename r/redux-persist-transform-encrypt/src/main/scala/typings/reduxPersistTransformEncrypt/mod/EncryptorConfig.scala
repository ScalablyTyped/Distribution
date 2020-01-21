package typings.reduxPersistTransformEncrypt.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EncryptorConfig extends js.Object {
  var onError: js.UndefOr[js.Function1[/* err */ Error, Unit]] = js.undefined
  var secretKey: String
}

object EncryptorConfig {
  @scala.inline
  def apply(secretKey: String, onError: /* err */ Error => Unit = null): EncryptorConfig = {
    val __obj = js.Dynamic.literal(secretKey = secretKey.asInstanceOf[js.Any])
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1(onError))
    __obj.asInstanceOf[EncryptorConfig]
  }
}

