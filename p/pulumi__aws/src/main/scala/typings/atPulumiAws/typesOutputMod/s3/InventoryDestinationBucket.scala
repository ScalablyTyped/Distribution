package typings.atPulumiAws.typesOutputMod.s3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InventoryDestinationBucket extends js.Object {
  /**
    * The ID of the account that owns the destination bucket. Recommended to be set to prevent problems if the destination bucket ownership changes.
    */
  var accountId: js.UndefOr[String] = js.undefined
  /**
    * The Amazon S3 bucket ARN of the destination.
    */
  var bucketArn: String
  /**
    * Contains the type of server-side encryption to use to encrypt the inventory (documented below).
    */
  var encryption: js.UndefOr[InventoryDestinationBucketEncryption] = js.undefined
  /**
    * Specifies the output format of the inventory results. Can be `CSV`, [`ORC`](https://orc.apache.org/) or [`Parquet`](https://parquet.apache.org/).
    */
  var format: String
  /**
    * The prefix that is prepended to all inventory results.
    */
  var prefix: js.UndefOr[String] = js.undefined
}

object InventoryDestinationBucket {
  @scala.inline
  def apply(
    bucketArn: String,
    format: String,
    accountId: String = null,
    encryption: InventoryDestinationBucketEncryption = null,
    prefix: String = null
  ): InventoryDestinationBucket = {
    val __obj = js.Dynamic.literal(bucketArn = bucketArn, format = format)
    if (accountId != null) __obj.updateDynamic("accountId")(accountId)
    if (encryption != null) __obj.updateDynamic("encryption")(encryption)
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    __obj.asInstanceOf[InventoryDestinationBucket]
  }
}

