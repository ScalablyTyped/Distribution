package typings.atPulumiAws.typesOutputMod.msk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClusterEncryptionInfo extends js.Object {
  /**
    * You may specify a KMS key short ID or ARN (it will always output an ARN) to use for encrypting your data at rest.  If no key is specified, an AWS managed KMS ('aws/msk' managed service) key will be used for encrypting the data at rest.
    */
  var encryptionAtRestKmsKeyArn: String
  /**
    * Configuration block to specify encryption in transit. See below.
    */
  var encryptionInTransit: js.UndefOr[ClusterEncryptionInfoEncryptionInTransit] = js.undefined
}

object ClusterEncryptionInfo {
  @scala.inline
  def apply(
    encryptionAtRestKmsKeyArn: String,
    encryptionInTransit: ClusterEncryptionInfoEncryptionInTransit = null
  ): ClusterEncryptionInfo = {
    val __obj = js.Dynamic.literal(encryptionAtRestKmsKeyArn = encryptionAtRestKmsKeyArn)
    if (encryptionInTransit != null) __obj.updateDynamic("encryptionInTransit")(encryptionInTransit)
    __obj.asInstanceOf[ClusterEncryptionInfo]
  }
}

