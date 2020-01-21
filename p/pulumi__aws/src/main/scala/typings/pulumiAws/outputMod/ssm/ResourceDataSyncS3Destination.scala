package typings.pulumiAws.outputMod.ssm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceDataSyncS3Destination extends js.Object {
  var bucketName: String = js.native
  var kmsKeyArn: js.UndefOr[String] = js.native
  var prefix: js.UndefOr[String] = js.native
  var region: String = js.native
  var syncFormat: js.UndefOr[String] = js.native
}

object ResourceDataSyncS3Destination {
  @scala.inline
  def apply(
    bucketName: String,
    region: String,
    kmsKeyArn: String = null,
    prefix: String = null,
    syncFormat: String = null
  ): ResourceDataSyncS3Destination = {
    val __obj = js.Dynamic.literal(bucketName = bucketName.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any])
    if (kmsKeyArn != null) __obj.updateDynamic("kmsKeyArn")(kmsKeyArn.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (syncFormat != null) __obj.updateDynamic("syncFormat")(syncFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceDataSyncS3Destination]
  }
}

