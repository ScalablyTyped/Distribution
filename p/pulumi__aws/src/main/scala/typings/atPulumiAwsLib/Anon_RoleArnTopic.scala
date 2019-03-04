package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_RoleArnTopic extends js.Object {
  var roleArn: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var topic: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object Anon_RoleArnTopic {
  @scala.inline
  def apply(
    roleArn: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    topic: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  ): Anon_RoleArnTopic = {
    val __obj = js.Dynamic.literal(roleArn = roleArn.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_RoleArnTopic]
  }
}

