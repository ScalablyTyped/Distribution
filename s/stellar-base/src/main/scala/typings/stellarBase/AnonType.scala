package typings.stellarBase

import typings.stellarBase.mod.KeypairType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonType extends js.Object {
  var publicKey: String
  var `type`: KeypairType
}

object AnonType {
  @scala.inline
  def apply(publicKey: String, `type`: KeypairType): AnonType = {
    val __obj = js.Dynamic.literal(publicKey = publicKey.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonType]
  }
}

