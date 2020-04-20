package typings.rockset.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AwsAccessKey extends js.Object {
  // AWS access key ID
  var aws_access_key_id: String
  // AWS secret access key
  var aws_secret_access_key: String
}

object AwsAccessKey {
  @scala.inline
  def apply(aws_access_key_id: String, aws_secret_access_key: String): AwsAccessKey = {
    val __obj = js.Dynamic.literal(aws_access_key_id = aws_access_key_id.asInstanceOf[js.Any], aws_secret_access_key = aws_secret_access_key.asInstanceOf[js.Any])
    __obj.asInstanceOf[AwsAccessKey]
  }
}

