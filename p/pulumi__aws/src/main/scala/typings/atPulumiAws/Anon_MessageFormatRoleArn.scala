package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MessageFormatRoleArn extends js.Object {
  var messageFormat: js.UndefOr[Input[String]] = js.undefined
  var roleArn: Input[String]
  var targetArn: Input[String]
}

object Anon_MessageFormatRoleArn {
  @scala.inline
  def apply(roleArn: Input[String], targetArn: Input[String], messageFormat: Input[String] = null): Anon_MessageFormatRoleArn = {
    val __obj = js.Dynamic.literal(roleArn = roleArn.asInstanceOf[js.Any], targetArn = targetArn.asInstanceOf[js.Any])
    if (messageFormat != null) __obj.updateDynamic("messageFormat")(messageFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_MessageFormatRoleArn]
  }
}

