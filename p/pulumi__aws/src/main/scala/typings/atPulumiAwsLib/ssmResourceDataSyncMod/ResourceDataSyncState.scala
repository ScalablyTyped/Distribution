package typings
package atPulumiAwsLib.ssmResourceDataSyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceDataSyncState extends js.Object {
  /**
    * Name for the configuration.
    */
  val name: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Amazon S3 configuration details for the sync.
    */
  val s3Destination: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_BucketNameKmsKeyArnPrefixRegion]
  ] = js.undefined
}

object ResourceDataSyncState {
  @scala.inline
  def apply(
    name: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    s3Destination: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_BucketNameKmsKeyArnPrefixRegion] = null
  ): ResourceDataSyncState = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (s3Destination != null) __obj.updateDynamic("s3Destination")(s3Destination.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceDataSyncState]
  }
}

