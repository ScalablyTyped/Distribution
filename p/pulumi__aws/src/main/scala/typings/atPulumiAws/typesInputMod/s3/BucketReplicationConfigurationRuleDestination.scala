package typings.atPulumiAws.typesInputMod.s3

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BucketReplicationConfigurationRuleDestination extends js.Object {
  /**
    * Specifies the overrides to use for object owners on replication. Must be used in conjunction with `accountId` owner override configuration.
    */
  var accessControlTranslation: js.UndefOr[Input[BucketReplicationConfigurationRuleDestinationAccessControlTranslation]] = js.undefined
  /**
    * The Account ID to use for overriding the object owner on replication. Must be used in conjunction with `accessControlTranslation` override configuration.
    */
  var accountId: js.UndefOr[Input[String]] = js.undefined
  /**
    * The ARN of the S3 bucket where you want Amazon S3 to store replicas of the object identified by the rule.
    */
  var bucket: Input[String]
  /**
    * Destination KMS encryption key ARN for SSE-KMS replication. Must be used in conjunction with
    * `sseKmsEncryptedObjects` source selection criteria.
    */
  var replicaKmsKeyId: js.UndefOr[Input[String]] = js.undefined
  /**
    * The class of storage used to store the object. Can be `STANDARD`, `REDUCED_REDUNDANCY`, `STANDARD_IA`, `ONEZONE_IA`, `INTELLIGENT_TIERING`, `GLACIER`, or `DEEP_ARCHIVE`.
    */
  var storageClass: js.UndefOr[Input[String]] = js.undefined
}

object BucketReplicationConfigurationRuleDestination {
  @scala.inline
  def apply(
    bucket: Input[String],
    accessControlTranslation: Input[BucketReplicationConfigurationRuleDestinationAccessControlTranslation] = null,
    accountId: Input[String] = null,
    replicaKmsKeyId: Input[String] = null,
    storageClass: Input[String] = null
  ): BucketReplicationConfigurationRuleDestination = {
    val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any])
    if (accessControlTranslation != null) __obj.updateDynamic("accessControlTranslation")(accessControlTranslation.asInstanceOf[js.Any])
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    if (replicaKmsKeyId != null) __obj.updateDynamic("replicaKmsKeyId")(replicaKmsKeyId.asInstanceOf[js.Any])
    if (storageClass != null) __obj.updateDynamic("storageClass")(storageClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketReplicationConfigurationRuleDestination]
  }
}

