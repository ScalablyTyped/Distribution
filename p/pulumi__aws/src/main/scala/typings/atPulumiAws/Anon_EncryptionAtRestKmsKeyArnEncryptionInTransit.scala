package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EncryptionAtRestKmsKeyArnEncryptionInTransit extends js.Object {
  var encryptionAtRestKmsKeyArn: js.UndefOr[Input[String]] = js.undefined
  var encryptionInTransit: js.UndefOr[Input[Anon_ClientBrokerInCluster]] = js.undefined
}

object Anon_EncryptionAtRestKmsKeyArnEncryptionInTransit {
  @scala.inline
  def apply(
    encryptionAtRestKmsKeyArn: Input[String] = null,
    encryptionInTransit: Input[Anon_ClientBrokerInCluster] = null
  ): Anon_EncryptionAtRestKmsKeyArnEncryptionInTransit = {
    val __obj = js.Dynamic.literal()
    if (encryptionAtRestKmsKeyArn != null) __obj.updateDynamic("encryptionAtRestKmsKeyArn")(encryptionAtRestKmsKeyArn.asInstanceOf[js.Any])
    if (encryptionInTransit != null) __obj.updateDynamic("encryptionInTransit")(encryptionInTransit.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_EncryptionAtRestKmsKeyArnEncryptionInTransit]
  }
}

