package typings.rockset.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AwsRole extends js.Object {
  // ARN of rockset-role created in your account
  var aws_role_arn: String
}

object AwsRole {
  @scala.inline
  def apply(aws_role_arn: String): AwsRole = {
    val __obj = js.Dynamic.literal(aws_role_arn = aws_role_arn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AwsRole]
  }
}

