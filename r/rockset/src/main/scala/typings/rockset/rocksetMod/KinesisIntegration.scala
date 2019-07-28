package typings.rockset.rocksetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KinesisIntegration extends js.Object {
  // credentials for an AWS access key integration
  var aws_access_key: js.UndefOr[AwsAccessKey] = js.undefined
  // details of an AWS cross-account role integration
  var aws_role: js.UndefOr[AwsRole] = js.undefined
}

object KinesisIntegration {
  @scala.inline
  def apply(aws_access_key: AwsAccessKey = null, aws_role: AwsRole = null): KinesisIntegration = {
    val __obj = js.Dynamic.literal()
    if (aws_access_key != null) __obj.updateDynamic("aws_access_key")(aws_access_key)
    if (aws_role != null) __obj.updateDynamic("aws_role")(aws_role)
    __obj.asInstanceOf[KinesisIntegration]
  }
}

