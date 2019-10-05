package typings.atPulumiAws.typesOutputMod.s3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BucketReplicationConfigurationRuleDestination extends js.Object {
  /**
    * Specifies the overrides to use for object owners on replication. Must be used in conjunction with `accountId` owner override configuration.
    */
  var accessControlTranslation: js.UndefOr[BucketReplicationConfigurationRuleDestinationAccessControlTranslation] = js.undefined
  /**
    * The Account ID to use for overriding the object owner on replication. Must be used in conjunction with `accessControlTranslation` override configuration.
    */
  var accountId: js.UndefOr[String] = js.undefined
  /**
    * The ARN of the S3 bucket where you want Amazon S3 to store replicas of the object identified by the rule.
    */
  var bucket: String
  /**
    * Destination KMS encryption key ARN for SSE-KMS replication. Must be used in conjunction with
    * `sseKmsEncryptedObjects` source selection criteria.
    */
  var replicaKmsKeyId: js.UndefOr[String] = js.undefined
  /**
    * The class of storage used to store the object. Can be `STANDARD`, `REDUCED_REDUNDANCY`, `STANDARD_IA`, `ONEZONE_IA`, `INTELLIGENT_TIERING`, `GLACIER`, or `DEEP_ARCHIVE`.
    */
  var storageClass: js.UndefOr[String] = js.undefined
}

object BucketReplicationConfigurationRuleDestination {
  @scala.inline
  def apply(
    bucket: String,
    accessControlTranslation: BucketReplicationConfigurationRuleDestinationAccessControlTranslation = null,
    accountId: String = null,
    replicaKmsKeyId: String = null,
    storageClass: String = null
  ): BucketReplicationConfigurationRuleDestination = {
    val __obj = js.Dynamic.literal(bucket = bucket)
    if (accessControlTranslation != null) __obj.updateDynamic("accessControlTranslation")(accessControlTranslation)
    if (accountId != null) __obj.updateDynamic("accountId")(accountId)
    if (replicaKmsKeyId != null) __obj.updateDynamic("replicaKmsKeyId")(replicaKmsKeyId)
    if (storageClass != null) __obj.updateDynamic("storageClass")(storageClass)
    __obj.asInstanceOf[BucketReplicationConfigurationRuleDestination]
  }
}

