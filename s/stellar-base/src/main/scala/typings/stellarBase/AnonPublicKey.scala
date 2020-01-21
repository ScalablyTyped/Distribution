package typings.stellarBase

import typings.stellarBase.mod.KeypairType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPublicKey extends js.Object {
  var publicKey: js.UndefOr[String] = js.undefined
  var secretKey: String
  var `type`: KeypairType
}

object AnonPublicKey {
  @scala.inline
  def apply(secretKey: String, `type`: KeypairType, publicKey: String = null): AnonPublicKey = {
    val __obj = js.Dynamic.literal(secretKey = secretKey.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (publicKey != null) __obj.updateDynamic("publicKey")(publicKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPublicKey]
  }
}

