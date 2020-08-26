package typings.rockset.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KinesisIntegration extends js.Object {
  // credentials for an AWS access key integration
  var aws_access_key: js.UndefOr[AwsAccessKey] = js.native
  // details of an AWS cross-account role integration
  var aws_role: js.UndefOr[AwsRole] = js.native
}

object KinesisIntegration {
  @scala.inline
  def apply(): KinesisIntegration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KinesisIntegration]
  }
  @scala.inline
  implicit class KinesisIntegrationOps[Self <: KinesisIntegration] (val x: Self) extends AnyVal {
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
    def setAws_access_key(value: AwsAccessKey): Self = this.set("aws_access_key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAws_access_key: Self = this.set("aws_access_key", js.undefined)
    @scala.inline
    def setAws_role(value: AwsRole): Self = this.set("aws_role", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAws_role: Self = this.set("aws_role", js.undefined)
  }
  
}

