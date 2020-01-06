package typings.atPulumiAws.typesOutputMod.mq

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BrokerEncryptionOptions extends js.Object {
  /**
    * Amazon Resource Name (ARN) of Key Management Service (KMS) Customer Master Key (CMK) to use for encryption at rest. Requires setting `useAwsOwnedKey` to `false`. To perform drift detection when AWS managed CMKs or customer managed CMKs are in use, this value must be configured.
    */
  var kmsKeyId: String = js.native
  /**
    * Boolean to enable an AWS owned Key Management Service (KMS) Customer Master Key (CMK) that is not in your account. Defaults to `true`. Setting to `false` without configuring `kmsKeyId` will create an AWS managed Customer Master Key (CMK) aliased to `aws/mq` in your account.
    */
  var useAwsOwnedKey: js.UndefOr[Boolean] = js.native
}

object BrokerEncryptionOptions {
  @scala.inline
  def apply(kmsKeyId: String, useAwsOwnedKey: js.UndefOr[Boolean] = js.undefined): BrokerEncryptionOptions = {
    val __obj = js.Dynamic.literal(kmsKeyId = kmsKeyId.asInstanceOf[js.Any])
    if (!js.isUndefined(useAwsOwnedKey)) __obj.updateDynamic("useAwsOwnedKey")(useAwsOwnedKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[BrokerEncryptionOptions]
  }
}

