package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_QueueUrl extends js.Object {
  var queueUrl: java.lang.String
  var roleArn: java.lang.String
  var useBase64: scala.Boolean
}

object Anon_QueueUrl {
  @scala.inline
  def apply(queueUrl: java.lang.String, roleArn: java.lang.String, useBase64: scala.Boolean): Anon_QueueUrl = {
    val __obj = js.Dynamic.literal(queueUrl = queueUrl, roleArn = roleArn, useBase64 = useBase64)
  
    __obj.asInstanceOf[Anon_QueueUrl]
  }
}

