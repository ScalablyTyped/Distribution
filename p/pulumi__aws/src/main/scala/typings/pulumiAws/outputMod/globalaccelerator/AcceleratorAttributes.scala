package typings.pulumiAws.outputMod.globalaccelerator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AcceleratorAttributes extends js.Object {
  /**
    * Indicates whether flow logs are enabled.
    */
  var flowLogsEnabled: js.UndefOr[Boolean] = js.native
  /**
    * The name of the Amazon S3 bucket for the flow logs.
    */
  var flowLogsS3Bucket: js.UndefOr[String] = js.native
  /**
    * The prefix for the location in the Amazon S3 bucket for the flow logs.
    */
  var flowLogsS3Prefix: js.UndefOr[String] = js.native
}

object AcceleratorAttributes {
  @scala.inline
  def apply(): AcceleratorAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AcceleratorAttributes]
  }
  @scala.inline
  implicit class AcceleratorAttributesOps[Self <: AcceleratorAttributes] (val x: Self) extends AnyVal {
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
    def setFlowLogsEnabled(value: Boolean): Self = this.set("flowLogsEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlowLogsEnabled: Self = this.set("flowLogsEnabled", js.undefined)
    @scala.inline
    def setFlowLogsS3Bucket(value: String): Self = this.set("flowLogsS3Bucket", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlowLogsS3Bucket: Self = this.set("flowLogsS3Bucket", js.undefined)
    @scala.inline
    def setFlowLogsS3Prefix(value: String): Self = this.set("flowLogsS3Prefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlowLogsS3Prefix: Self = this.set("flowLogsS3Prefix", js.undefined)
  }
  
}

