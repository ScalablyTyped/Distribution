package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EncryptionAtRestKmsKeyArnEncryptionInTransit extends js.Object {
  var encryptionAtRestKmsKeyArn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var encryptionInTransit: js.UndefOr[atPulumiPulumiLib.outputMod.Input[Anon_ClientBrokerInCluster]] = js.undefined
}

object Anon_EncryptionAtRestKmsKeyArnEncryptionInTransit {
  @scala.inline
  def apply(
    encryptionAtRestKmsKeyArn: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    encryptionInTransit: atPulumiPulumiLib.outputMod.Input[Anon_ClientBrokerInCluster] = null
  ): Anon_EncryptionAtRestKmsKeyArnEncryptionInTransit = {
    val __obj = js.Dynamic.literal()
    if (encryptionAtRestKmsKeyArn != null) __obj.updateDynamic("encryptionAtRestKmsKeyArn")(encryptionAtRestKmsKeyArn.asInstanceOf[js.Any])
    if (encryptionInTransit != null) __obj.updateDynamic("encryptionInTransit")(encryptionInTransit.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_EncryptionAtRestKmsKeyArnEncryptionInTransit]
  }
}

