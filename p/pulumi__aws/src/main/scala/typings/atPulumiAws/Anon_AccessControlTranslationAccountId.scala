package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AccessControlTranslationAccountId extends js.Object {
  var accessControlTranslation: js.UndefOr[Input[Anon_OwnerInput]] = js.undefined
  var accountId: js.UndefOr[Input[String]] = js.undefined
  var bucket: Input[String]
  var replicaKmsKeyId: js.UndefOr[Input[String]] = js.undefined
  var storageClass: js.UndefOr[Input[String]] = js.undefined
}

object Anon_AccessControlTranslationAccountId {
  @scala.inline
  def apply(
    bucket: Input[String],
    accessControlTranslation: Input[Anon_OwnerInput] = null,
    accountId: Input[String] = null,
    replicaKmsKeyId: Input[String] = null,
    storageClass: Input[String] = null
  ): Anon_AccessControlTranslationAccountId = {
    val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any])
    if (accessControlTranslation != null) __obj.updateDynamic("accessControlTranslation")(accessControlTranslation.asInstanceOf[js.Any])
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    if (replicaKmsKeyId != null) __obj.updateDynamic("replicaKmsKeyId")(replicaKmsKeyId.asInstanceOf[js.Any])
    if (storageClass != null) __obj.updateDynamic("storageClass")(storageClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AccessControlTranslationAccountId]
  }
}

