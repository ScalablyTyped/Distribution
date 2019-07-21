package typings
package rocksetLib.rocksetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AwsRole extends js.Object {
  // ARN of rockset-role created in your account
  var aws_role_arn: java.lang.String
}

object AwsRole {
  @scala.inline
  def apply(aws_role_arn: java.lang.String): AwsRole = {
    val __obj = js.Dynamic.literal(aws_role_arn = aws_role_arn)
  
    __obj.asInstanceOf[AwsRole]
  }
}

