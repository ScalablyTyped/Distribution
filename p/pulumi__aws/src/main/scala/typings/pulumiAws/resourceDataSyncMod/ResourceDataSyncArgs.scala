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
  def apply(s3Destination: Input[ResourceDataSyncS3Destination]): ResourceDataSyncArgs = {
    val __obj = js.Dynamic.literal(s3Destination = s3Destination.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceDataSyncArgs]
  }
  @scala.inline
  implicit class ResourceDataSyncArgsOps[Self <: ResourceDataSyncArgs] (val x: Self) extends AnyVal {
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
    def setS3Destination(value: Input[ResourceDataSyncS3Destination]): Self = this.set("s3Destination", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
  
}

