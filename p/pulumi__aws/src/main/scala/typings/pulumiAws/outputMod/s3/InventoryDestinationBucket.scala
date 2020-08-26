package typings.pulumiAws.outputMod.s3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InventoryDestinationBucket extends js.Object {
  /**
    * The ID of the account that owns the destination bucket. Recommended to be set to prevent problems if the destination bucket ownership changes.
    */
  var accountId: js.UndefOr[String] = js.native
  /**
    * The Amazon S3 bucket ARN of the destination.
    */
  var bucketArn: String = js.native
  /**
    * Contains the type of server-side encryption to use to encrypt the inventory (documented below).
    */
  var encryption: js.UndefOr[InventoryDestinationBucketEncryption] = js.native
  /**
    * Specifies the output format of the inventory results. Can be `CSV`, [`ORC`](https://orc.apache.org/) or [`Parquet`](https://parquet.apache.org/).
    */
  var format: String = js.native
  /**
    * The prefix that is prepended to all inventory results.
    */
  var prefix: js.UndefOr[String] = js.native
}

object InventoryDestinationBucket {
  @scala.inline
  def apply(bucketArn: String, format: String): InventoryDestinationBucket = {
    val __obj = js.Dynamic.literal(bucketArn = bucketArn.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any])
    __obj.asInstanceOf[InventoryDestinationBucket]
  }
  @scala.inline
  implicit class InventoryDestinationBucketOps[Self <: InventoryDestinationBucket] (val x: Self) extends AnyVal {
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
    def setBucketArn(value: String): Self = this.set("bucketArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def setAccountId(value: String): Self = this.set("accountId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccountId: Self = this.set("accountId", js.undefined)
    @scala.inline
    def setEncryption(value: InventoryDestinationBucketEncryption): Self = this.set("encryption", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncryption: Self = this.set("encryption", js.undefined)
    @scala.inline
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefix: Self = this.set("prefix", js.undefined)
  }
  
}

