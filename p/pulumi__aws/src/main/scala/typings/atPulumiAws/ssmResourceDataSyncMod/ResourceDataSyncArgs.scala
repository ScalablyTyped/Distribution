package typings.atPulumiAws.ssmResourceDataSyncMod

import typings.atPulumiAws.Anon_BucketNameKmsKeyArnPrefixRegion
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceDataSyncArgs extends js.Object {
  /**
    * Name for the configuration.
    */
  val name: js.UndefOr[Input[String]] = js.undefined
  /**
    * Amazon S3 configuration details for the sync.
    */
  val s3Destination: Input[Anon_BucketNameKmsKeyArnPrefixRegion]
}

object ResourceDataSyncArgs {
  @scala.inline
  def apply(s3Destination: Input[Anon_BucketNameKmsKeyArnPrefixRegion], name: Input[String] = null): ResourceDataSyncArgs = {
    val __obj = js.Dynamic.literal(s3Destination = s3Destination.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceDataSyncArgs]
  }
}

