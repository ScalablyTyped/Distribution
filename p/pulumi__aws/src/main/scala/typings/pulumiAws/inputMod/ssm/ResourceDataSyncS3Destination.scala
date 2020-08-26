package typings.pulumiAws.inputMod.ssm

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceDataSyncS3Destination extends js.Object {
  /**
    * Name of S3 bucket where the aggregated data is stored.
    */
  var bucketName: Input[String] = js.native
  /**
    * ARN of an encryption key for a destination in Amazon S3.
    */
  var kmsKeyArn: js.UndefOr[Input[String]] = js.native
  /**
    * Prefix for the bucket.
    */
  var prefix: js.UndefOr[Input[String]] = js.native
  /**
    * Region with the bucket targeted by the Resource Data Sync.
    */
  var region: Input[String] = js.native
  /**
    * A supported sync format. Only JsonSerDe is currently supported. Defaults to JsonSerDe.
    */
  var syncFormat: js.UndefOr[Input[String]] = js.native
}

object ResourceDataSyncS3Destination {
  @scala.inline
  def apply(bucketName: Input[String], region: Input[String]): ResourceDataSyncS3Destination = {
    val __obj = js.Dynamic.literal(bucketName = bucketName.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceDataSyncS3Destination]
  }
  @scala.inline
  implicit class ResourceDataSyncS3DestinationOps[Self <: ResourceDataSyncS3Destination] (val x: Self) extends AnyVal {
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
    def setBucketName(value: Input[String]): Self = this.set("bucketName", value.asInstanceOf[js.Any])
    @scala.inline
    def setRegion(value: Input[String]): Self = this.set("region", value.asInstanceOf[js.Any])
    @scala.inline
    def setKmsKeyArn(value: Input[String]): Self = this.set("kmsKeyArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKmsKeyArn: Self = this.set("kmsKeyArn", js.undefined)
    @scala.inline
    def setPrefix(value: Input[String]): Self = this.set("prefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefix: Self = this.set("prefix", js.undefined)
    @scala.inline
    def setSyncFormat(value: Input[String]): Self = this.set("syncFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSyncFormat: Self = this.set("syncFormat", js.undefined)
  }
  
}

