package typings.stellarDashBase

import typings.stellarDashBase.stellarDashBaseMod.KeypairType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PublicKeyType extends js.Object {
  var publicKey: String
  var `type`: KeypairType
}

object Anon_PublicKeyType {
  @scala.inline
  def apply(publicKey: String, `type`: KeypairType): Anon_PublicKeyType = {
    val __obj = js.Dynamic.literal(publicKey = publicKey)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_PublicKeyType]
  }
}

