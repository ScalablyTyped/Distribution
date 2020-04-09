package typings.pulumiAws.outputMod.athena

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatabaseEncryptionConfiguration extends js.Object {
  /**
    * The type of key; one of `SSE_S3`, `SSE_KMS`, `CSE_KMS`
    */
  var encryptionOption: String = js.native
  /**
    * The KMS key ARN or ID; required for key types `SSE_KMS` and `CSE_KMS`.
    */
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

