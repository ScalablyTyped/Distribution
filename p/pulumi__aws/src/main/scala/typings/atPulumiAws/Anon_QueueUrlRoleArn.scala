package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_QueueUrlRoleArn extends js.Object {
  var queueUrl: Input[String]
  var roleArn: Input[String]
  var useBase64: Input[Boolean]
}

object Anon_QueueUrlRoleArn {
  @scala.inline
  def apply(queueUrl: Input[String], roleArn: Input[String], useBase64: Input[Boolean]): Anon_QueueUrlRoleArn = {
    val __obj = js.Dynamic.literal(queueUrl = queueUrl.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any], useBase64 = useBase64.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_QueueUrlRoleArn]
  }
}

