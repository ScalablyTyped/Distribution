package typings.atPulumiAws.typesOutputMod.athena

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatabaseEncryptionConfiguration extends js.Object {
  var encryptionOption: String
  var kmsKey: js.UndefOr[String] = js.undefined
}

object DatabaseEncryptionConfiguration {
  @scala.inline
  def apply(encryptionOption: String, kmsKey: String = null): DatabaseEncryptionConfiguration = {
    val __obj = js.Dynamic.literal(encryptionOption = encryptionOption)
    if (kmsKey != null) __obj.updateDynamic("kmsKey")(kmsKey)
    __obj.asInstanceOf[DatabaseEncryptionConfiguration]
  }
}

