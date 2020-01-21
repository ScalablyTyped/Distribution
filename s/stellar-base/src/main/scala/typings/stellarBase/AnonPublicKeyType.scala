package typings.stellarBase

import typings.stellarBase.mod.KeypairType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPublicKeyType extends js.Object {
  var publicKey: String
  var `type`: KeypairType
}

object AnonPublicKeyType {
  @scala.inline
  def apply(publicKey: String, `type`: KeypairType): AnonPublicKeyType = {
    val __obj = js.Dynamic.literal(publicKey = publicKey.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPublicKeyType]
  }
}

