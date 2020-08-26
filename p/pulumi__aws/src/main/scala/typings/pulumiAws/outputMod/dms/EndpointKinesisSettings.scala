package typings.pulumiAws.outputMod.dms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EndpointKinesisSettings extends js.Object {
  /**
    * Output format for the records created. Defaults to `json`. Valid values are `json` and `jsonUnformatted` (a single line with no tab).
    */
  var messageFormat: js.UndefOr[String] = js.native
  /**
    * Amazon Resource Name (ARN) of the IAM Role with permissions to write to the Kinesis data stream.
    */
  var serviceAccessRoleArn: js.UndefOr[String] = js.native
  /**
    * Amazon Resource Name (ARN) of the Kinesis data stream.
    */
  var streamArn: js.UndefOr[String] = js.native
}

object EndpointKinesisSettings {
  @scala.inline
  def apply(): EndpointKinesisSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EndpointKinesisSettings]
  }
  @scala.inline
  implicit class EndpointKinesisSettingsOps[Self <: EndpointKinesisSettings] (val x: Self) extends AnyVal {
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
    def setMessageFormat(value: String): Self = this.set("messageFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessageFormat: Self = this.set("messageFormat", js.undefined)
    @scala.inline
    def setServiceAccessRoleArn(value: String): Self = this.set("serviceAccessRoleArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServiceAccessRoleArn: Self = this.set("serviceAccessRoleArn", js.undefined)
    @scala.inline
    def setStreamArn(value: String): Self = this.set("streamArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStreamArn: Self = this.set("streamArn", js.undefined)
  }
  
}

