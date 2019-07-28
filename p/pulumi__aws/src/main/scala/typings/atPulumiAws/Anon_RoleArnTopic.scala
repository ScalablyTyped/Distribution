package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_RoleArnTopic extends js.Object {
  var roleArn: Input[String]
  var topic: Input[String]
}

object Anon_RoleArnTopic {
  @scala.inline
  def apply(roleArn: Input[String], topic: Input[String]): Anon_RoleArnTopic = {
    val __obj = js.Dynamic.literal(roleArn = roleArn.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_RoleArnTopic]
  }
}

