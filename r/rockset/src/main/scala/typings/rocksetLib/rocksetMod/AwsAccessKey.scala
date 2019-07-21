package typings
package rocksetLib.rocksetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AwsAccessKey extends js.Object {
  // AWS access key ID
  var aws_access_key_id: java.lang.String
  // AWS secret access key
  var aws_secret_access_key: java.lang.String
}

object AwsAccessKey {
  @scala.inline
  def apply(aws_access_key_id: java.lang.String, aws_secret_access_key: java.lang.String): AwsAccessKey = {
    val __obj = js.Dynamic.literal(aws_access_key_id = aws_access_key_id, aws_secret_access_key = aws_secret_access_key)
  
    __obj.asInstanceOf[AwsAccessKey]
  }
}

