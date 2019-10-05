package typings.atPulumiAws.typesInputMod.s3

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InventoryDestinationBucket extends js.Object {
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
  def apply(
    bucketArn: Input[String],
    format: Input[String],
    accountId: Input[String] = null,
    encryption: Input[InventoryDestinationBucketEncryption] = null,
    prefix: Input[String] = null
  ): InventoryDestinationBucket = {
    val __obj = js.Dynamic.literal(bucketArn = bucketArn.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any])
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    if (encryption != null) __obj.updateDynamic("encryption")(encryption.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[InventoryDestinationBucket]
  }
}

