package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EncryptionKey extends js.Object {
  var encryptionKey: js.UndefOr[Anon_IdType] = js.undefined
  var location: String
  var `type`: String
}

object Anon_EncryptionKey {
  @scala.inline
  def apply(location: String, `type`: String, encryptionKey: Anon_IdType = null): Anon_EncryptionKey = {
    val __obj = js.Dynamic.literal(location = location)
    __obj.updateDynamic("type")(`type`)
    if (encryptionKey != null) __obj.updateDynamic("encryptionKey")(encryptionKey)
    __obj.asInstanceOf[Anon_EncryptionKey]
  }
}

