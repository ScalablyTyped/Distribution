package typings.atPulumiAws.typesInputMod.mq

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BrokerEncryptionOptions extends js.Object {
  /**
    * Amazon Resource Name (ARN) of Key Management Service (KMS) Customer Master Key (CMK) to use for encryption at rest. Requires setting `useAwsOwnedKey` to `false`. To perform drift detection when AWS managed CMKs or customer managed CMKs are in use, this value must be configured.
    */
  var kmsKeyId: js.UndefOr[Input[String]] = js.undefined
  /**
    * Boolean to enable an AWS owned Key Management Service (KMS) Customer Master Key (CMK) that is not in your account. Defaults to `true`. Setting to `false` without configuring `kmsKeyId` will create an AWS managed Customer Master Key (CMK) aliased to `aws/mq` in your account.
    */
  var useAwsOwnedKey: js.UndefOr[Input[Boolean]] = js.undefined
}

object BrokerEncryptionOptions {
  @scala.inline
  def apply(kmsKeyId: Input[String] = null, useAwsOwnedKey: Input[Boolean] = null): BrokerEncryptionOptions = {
    val __obj = js.Dynamic.literal()
    if (kmsKeyId != null) __obj.updateDynamic("kmsKeyId")(kmsKeyId.asInstanceOf[js.Any])
    if (useAwsOwnedKey != null) __obj.updateDynamic("useAwsOwnedKey")(useAwsOwnedKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[BrokerEncryptionOptions]
  }
}

