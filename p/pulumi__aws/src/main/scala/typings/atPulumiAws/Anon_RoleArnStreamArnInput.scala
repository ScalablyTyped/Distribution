package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_RoleArnStreamArnInput extends js.Object {
  var roleArn: Input[String]
  var streamArn: Input[String]
}

object Anon_RoleArnStreamArnInput {
  @scala.inline
  def apply(roleArn: Input[String], streamArn: Input[String]): Anon_RoleArnStreamArnInput = {
    val __obj = js.Dynamic.literal(roleArn = roleArn.asInstanceOf[js.Any], streamArn = streamArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_RoleArnStreamArnInput]
  }
}

