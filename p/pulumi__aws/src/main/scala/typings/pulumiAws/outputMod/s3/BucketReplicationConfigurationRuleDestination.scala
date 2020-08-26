package typings.pulumiAws.outputMod.s3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BucketReplicationConfigurationRuleDestination extends js.Object {
  /**
    * Specifies the overrides to use for object owners on replication. Must be used in conjunction with `accountId` owner override configuration.
    */
  var accessControlTranslation: js.UndefOr[BucketReplicationConfigurationRuleDestinationAccessControlTranslation] = js.native
  /**
    * The Account ID to use for overriding the object owner on replication. Must be used in conjunction with `accessControlTranslation` override configuration.
    */
  var accountId: js.UndefOr[String] = js.native
  /**
    * The ARN of the S3 bucket where you want Amazon S3 to store replicas of the object identified by the rule.
    */
  var bucket: String = js.native
  /**
    * Destination KMS encryption key ARN for SSE-KMS replication. Must be used in conjunction with
    * `sseKmsEncryptedObjects` source selection criteria.
    */
  var replicaKmsKeyId: js.UndefOr[String] = js.native
  /**
    * The class of storage used to store the object. Can be `STANDARD`, `REDUCED_REDUNDANCY`, `STANDARD_IA`, `ONEZONE_IA`, `INTELLIGENT_TIERING`, `GLACIER`, or `DEEP_ARCHIVE`.
    */
  var storageClass: js.UndefOr[String] = js.native
}

object BucketReplicationConfigurationRuleDestination {
  @scala.inline
  def apply(bucket: String): BucketReplicationConfigurationRuleDestination = {
    val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketReplicationConfigurationRuleDestination]
  }
  @scala.inline
  implicit class BucketReplicationConfigurationRuleDestinationOps[Self <: BucketReplicationConfigurationRuleDestination] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBucket(value: String): Self = this.set("bucket", value.asInstanceOf[js.Any])
    @scala.inline
    def setAccessControlTranslation(value: BucketReplicationConfigurationRuleDestinationAccessControlTranslation): Self = this.set("accessControlTranslation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessControlTranslation: Self = this.set("accessControlTranslation", js.undefined)
    @scala.inline
    def setAccountId(value: String): Self = this.set("accountId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccountId: Self = this.set("accountId", js.undefined)
    @scala.inline
    def setReplicaKmsKeyId(value: String): Self = this.set("replicaKmsKeyId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplicaKmsKeyId: Self = this.set("replicaKmsKeyId", js.undefined)
    @scala.inline
    def setStorageClass(value: String): Self = this.set("storageClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStorageClass: Self = this.set("storageClass", js.undefined)
  }
  
}

