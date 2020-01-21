package typings.rockset.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DynamodbIntegration extends js.Object {
  // credentials for an AWS access key integration
  var aws_access_key: js.UndefOr[AwsAccessKey] = js.undefined
}

object DynamodbIntegration {
  @scala.inline
  def apply(aws_access_key: AwsAccessKey = null): DynamodbIntegration = {
    val __obj = js.Dynamic.literal()
    if (aws_access_key != null) __obj.updateDynamic("aws_access_key")(aws_access_key.asInstanceOf[js.Any])
    __obj.asInstanceOf[DynamodbIntegration]
  }
}

