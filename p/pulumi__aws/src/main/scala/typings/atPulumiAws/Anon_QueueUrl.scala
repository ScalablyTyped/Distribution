package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_QueueUrl extends js.Object {
  var queueUrl: String
  var roleArn: String
  var useBase64: Boolean
}

object Anon_QueueUrl {
  @scala.inline
  def apply(queueUrl: String, roleArn: String, useBase64: Boolean): Anon_QueueUrl = {
    val __obj = js.Dynamic.literal(queueUrl = queueUrl, roleArn = roleArn, useBase64 = useBase64)
  
    __obj.asInstanceOf[Anon_QueueUrl]
  }
}

