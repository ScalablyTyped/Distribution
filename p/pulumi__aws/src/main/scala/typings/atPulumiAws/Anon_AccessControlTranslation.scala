package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AccessControlTranslation extends js.Object {
  var accessControlTranslation: js.UndefOr[Anon_OwnerString] = js.undefined
  var accountId: js.UndefOr[String] = js.undefined
  var bucket: String
  var replicaKmsKeyId: js.UndefOr[String] = js.undefined
  var storageClass: js.UndefOr[String] = js.undefined
}

object Anon_AccessControlTranslation {
  @scala.inline
  def apply(
    bucket: String,
    accessControlTranslation: Anon_OwnerString = null,
    accountId: String = null,
    replicaKmsKeyId: String = null,
    storageClass: String = null
  ): Anon_AccessControlTranslation = {
    val __obj = js.Dynamic.literal(bucket = bucket)
    if (accessControlTranslation != null) __obj.updateDynamic("accessControlTranslation")(accessControlTranslation)
    if (accountId != null) __obj.updateDynamic("accountId")(accountId)
    if (replicaKmsKeyId != null) __obj.updateDynamic("replicaKmsKeyId")(replicaKmsKeyId)
    if (storageClass != null) __obj.updateDynamic("storageClass")(storageClass)
    __obj.asInstanceOf[Anon_AccessControlTranslation]
  }
}

