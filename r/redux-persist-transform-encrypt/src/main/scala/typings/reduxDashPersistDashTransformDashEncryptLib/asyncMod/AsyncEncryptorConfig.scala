package typings
package reduxDashPersistDashTransformDashEncryptLib.asyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsyncEncryptorConfig extends js.Object {
  var secretKey: java.lang.String
}

object AsyncEncryptorConfig {
  @scala.inline
  def apply(secretKey: java.lang.String): AsyncEncryptorConfig = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("secretKey")(secretKey)
    __obj.asInstanceOf[AsyncEncryptorConfig]
  }
}

