package typings.atPulumiAws.ssmResourceDataSyncMod

import typings.atPulumiAws.typesInputMod.ssm.ResourceDataSyncS3Destination
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceDataSyncState extends js.Object {
  /**
    * Name for the configuration.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * Amazon S3 configuration details for the sync.
    */
  val s3Destination: js.UndefOr[Input[ResourceDataSyncS3Destination]] = js.native
}

object ResourceDataSyncState {
  @scala.inline
  def apply(name: Input[String] = null, s3Destination: Input[ResourceDataSyncS3Destination] = null): ResourceDataSyncState = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (s3Destination != null) __obj.updateDynamic("s3Destination")(s3Destination.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceDataSyncState]
  }
}

