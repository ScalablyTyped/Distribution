package typings.stellarDashBase

import typings.stellarDashBase.stellarDashBaseMod.KeypairType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PublicKey extends js.Object {
  var publicKey: js.UndefOr[String] = js.undefined
  var secretKey: String
  var `type`: KeypairType
}

object Anon_PublicKey {
  @scala.inline
  def apply(secretKey: String, `type`: KeypairType, publicKey: String = null): Anon_PublicKey = {
    val __obj = js.Dynamic.literal(secretKey = secretKey.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (publicKey != null) __obj.updateDynamic("publicKey")(publicKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_PublicKey]
  }
}

