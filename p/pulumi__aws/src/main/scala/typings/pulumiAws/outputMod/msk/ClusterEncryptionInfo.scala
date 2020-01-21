package typings.pulumiAws.outputMod.msk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterEncryptionInfo extends js.Object {
  /**
    * You may specify a KMS key short ID or ARN (it will always output an ARN) to use for encrypting your data at rest.  If no key is specified, an AWS managed KMS ('aws/msk' managed service) key will be used for encrypting the data at rest.
    */
  var encryptionAtRestKmsKeyArn: String = js.native
  /**
    * Configuration block to specify encryption in transit. See below.
    */
  var encryptionInTransit: js.UndefOr[ClusterEncryptionInfoEncryptionInTransit] = js.native
}

object ClusterEncryptionInfo {
  @scala.inline
  def apply(
    encryptionAtRestKmsKeyArn: String,
    encryptionInTransit: ClusterEncryptionInfoEncryptionInTransit = null
  ): ClusterEncryptionInfo = {
    val __obj = js.Dynamic.literal(encryptionAtRestKmsKeyArn = encryptionAtRestKmsKeyArn.asInstanceOf[js.Any])
    if (encryptionInTransit != null) __obj.updateDynamic("encryptionInTransit")(encryptionInTransit.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterEncryptionInfo]
  }
}

