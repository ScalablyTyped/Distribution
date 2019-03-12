package typings
package reduxDashPersistDashTransformDashEncryptLib.reduxDashPersistDashTransformDashEncryptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EncryptorConfig extends js.Object {
  var onError: js.UndefOr[js.Function1[/* err */ stdLib.Error, scala.Unit]] = js.undefined
  var secretKey: java.lang.String
}

object EncryptorConfig {
  @scala.inline
  def apply(secretKey: java.lang.String, onError: /* err */ stdLib.Error => scala.Unit = null): EncryptorConfig = {
    val __obj = js.Dynamic.literal(secretKey = secretKey)
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1(onError))
    __obj.asInstanceOf[EncryptorConfig]
  }
}

