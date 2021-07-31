package typings.pulumiAws.inputMod.s3

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InventoryDestinationBucket extends StObject {
  
  /**
    * The ID of the account that owns the destination bucket. Recommended to be set to prevent problems if the destination bucket ownership changes.
    */
  var accountId: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * The Amazon S3 bucket ARN of the destination.
    */
  var bucketArn: Input[String]
  
  /**
    * Contains the type of server-side encryption to use to encrypt the inventory (documented below).
    */
  var encryption: js.UndefOr[Input[InventoryDestinationBucketEncryption]] = js.undefined
  
  /**
    * Specifies the output format of the inventory results. Can be `CSV`, [`ORC`](https://orc.apache.org/) or [`Parquet`](https://parquet.apache.org/).
    */
  var format: Input[String]
  
  /**
    * The prefix that is prepended to all inventory results.
    */
  var prefix: js.UndefOr[Input[String]] = js.undefined
}
object InventoryDestinationBucket {
  
  @scala.inline
  def apply(bucketArn: Input[String], format: Input[String]): InventoryDestinationBucket = {
    val __obj = js.Dynamic.literal(bucketArn = bucketArn.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any])
    __obj.asInstanceOf[InventoryDestinationBucket]
  }
  
  @scala.inline
  implicit class InventoryDestinationBucketMutableBuilder[Self <: InventoryDestinationBucket] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: Input[String]): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    @scala.inline
    def setBucketArn(value: Input[String]): Self = StObject.set(x, "bucketArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryption(value: Input[InventoryDestinationBucketEncryption]): Self = StObject.set(x, "encryption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptionUndefined: Self = StObject.set(x, "encryption", js.undefined)
    
    @scala.inline
    def setFormat(value: Input[String]): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefix(value: Input[String]): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
  }
}
