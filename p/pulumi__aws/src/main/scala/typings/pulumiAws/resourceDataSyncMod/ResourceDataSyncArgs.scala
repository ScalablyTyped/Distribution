package typings.pulumiAws.resourceDataSyncMod

import typings.pulumiAws.inputMod.ssm.ResourceDataSyncS3Destination
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceDataSyncArgs extends js.Object {
  /**
    * Name for the configuration.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * Amazon S3 configuration details for the sync.
    */
  val s3Destination: Input[ResourceDataSyncS3Destination] = js.native
}

object ResourceDataSyncArgs {
  @scala.inline
  def apply(s3Destination: Input[ResourceDataSyncS3Destination], name: Input[String] = null): ResourceDataSyncArgs = {
    val __obj = js.Dynamic.literal(s3Destination = s3Destination.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceDataSyncArgs]
  }
}

