package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AccessControlTranslationAccountId extends js.Object {
  var accessControlTranslation: js.UndefOr[atPulumiPulumiLib.outputMod.Input[Anon_OwnerInput]] = js.undefined
  var accountId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var bucket: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var replicaKmsKeyId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var storageClass: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object Anon_AccessControlTranslationAccountId {
  @scala.inline
  def apply(
    bucket: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    accessControlTranslation: atPulumiPulumiLib.outputMod.Input[Anon_OwnerInput] = null,
    accountId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    replicaKmsKeyId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    storageClass: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): Anon_AccessControlTranslationAccountId = {
    val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any])
    if (accessControlTranslation != null) __obj.updateDynamic("accessControlTranslation")(accessControlTranslation.asInstanceOf[js.Any])
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    if (replicaKmsKeyId != null) __obj.updateDynamic("replicaKmsKeyId")(replicaKmsKeyId.asInstanceOf[js.Any])
    if (storageClass != null) __obj.updateDynamic("storageClass")(storageClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AccessControlTranslationAccountId]
  }
}

