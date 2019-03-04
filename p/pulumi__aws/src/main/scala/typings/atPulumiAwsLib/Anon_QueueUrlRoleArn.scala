package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_QueueUrlRoleArn extends js.Object {
  var queueUrl: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var roleArn: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var useBase64: atPulumiPulumiLib.outputMod.Input[scala.Boolean]
}

object Anon_QueueUrlRoleArn {
  @scala.inline
  def apply(
    queueUrl: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    roleArn: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    useBase64: atPulumiPulumiLib.outputMod.Input[scala.Boolean]
  ): Anon_QueueUrlRoleArn = {
    val __obj = js.Dynamic.literal(queueUrl = queueUrl.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any], useBase64 = useBase64.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_QueueUrlRoleArn]
  }
}

