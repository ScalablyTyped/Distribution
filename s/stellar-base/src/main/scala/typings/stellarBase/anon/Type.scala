package typings.stellarBase.anon

import typings.stellarBase.mod.KeypairType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Type extends js.Object {
  var publicKey: String
  var `type`: KeypairType
}

object Type {
  @scala.inline
  def apply(publicKey: String, `type`: KeypairType): Type = {
    val __obj = js.Dynamic.literal(publicKey = publicKey.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type]
  }
}

