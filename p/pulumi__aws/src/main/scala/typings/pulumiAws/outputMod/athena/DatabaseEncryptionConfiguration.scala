package typings.pulumiAws.outputMod.athena

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatabaseEncryptionConfiguration extends js.Object {
  var encryptionOption: String = js.native
  var kmsKey: js.UndefOr[String] = js.native
}

object DatabaseEncryptionConfiguration {
  @scala.inline
  def apply(encryptionOption: String, kmsKey: String = null): DatabaseEncryptionConfiguration = {
    val __obj = js.Dynamic.literal(encryptionOption = encryptionOption.asInstanceOf[js.Any])
    if (kmsKey != null) __obj.updateDynamic("kmsKey")(kmsKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatabaseEncryptionConfiguration]
  }
}

