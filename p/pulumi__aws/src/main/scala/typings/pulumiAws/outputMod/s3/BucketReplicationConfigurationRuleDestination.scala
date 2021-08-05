package typings.pulumiAws.outputMod.s3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BucketReplicationConfigurationRuleDestination extends StObject {
  
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
  
  inline def apply(bucket: String): BucketReplicationConfigurationRuleDestination = {
    val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketReplicationConfigurationRuleDestination]
  }
  
  extension [Self <: BucketReplicationConfigurationRuleDestination](x: Self) {
    
    inline def setAccessControlTranslation(value: BucketReplicationConfigurationRuleDestinationAccessControlTranslation): Self = StObject.set(x, "accessControlTranslation", value.asInstanceOf[js.Any])
    
    inline def setAccessControlTranslationUndefined: Self = StObject.set(x, "accessControlTranslation", js.undefined)
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setBucket(value: String): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
    
    inline def setReplicaKmsKeyId(value: String): Self = StObject.set(x, "replicaKmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setReplicaKmsKeyIdUndefined: Self = StObject.set(x, "replicaKmsKeyId", js.undefined)
    
    inline def setStorageClass(value: String): Self = StObject.set(x, "storageClass", value.asInstanceOf[js.Any])
    
    inline def setStorageClassUndefined: Self = StObject.set(x, "storageClass", js.undefined)
  }
}
