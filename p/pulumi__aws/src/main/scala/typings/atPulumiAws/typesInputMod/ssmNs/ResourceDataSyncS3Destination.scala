package typings.atPulumiAws.typesInputMod.ssmNs

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceDataSyncS3Destination extends js.Object {
  var bucketName: Input[String]
  var kmsKeyArn: js.UndefOr[Input[String]] = js.undefined
  var prefix: js.UndefOr[Input[String]] = js.undefined
  var region: Input[String]
  var syncFormat: js.UndefOr[Input[String]] = js.undefined
}

object ResourceDataSyncS3Destination {
  @scala.inline
  def apply(
    bucketName: Input[String],
    region: Input[String],
    kmsKeyArn: Input[String] = null,
    prefix: Input[String] = null,
    syncFormat: Input[String] = null
  ): ResourceDataSyncS3Destination = {
    val __obj = js.Dynamic.literal(bucketName = bucketName.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any])
    if (kmsKeyArn != null) __obj.updateDynamic("kmsKeyArn")(kmsKeyArn.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (syncFormat != null) __obj.updateDynamic("syncFormat")(syncFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceDataSyncS3Destination]
  }
}

