package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IdLogStreamArnRoleArn extends js.Object {
  var id: js.UndefOr[Input[String]] = js.undefined
  var logStreamArn: Input[String]
  var roleArn: Input[String]
}

object Anon_IdLogStreamArnRoleArn {
  @scala.inline
  def apply(logStreamArn: Input[String], roleArn: Input[String], id: Input[String] = null): Anon_IdLogStreamArnRoleArn = {
    val __obj = js.Dynamic.literal(logStreamArn = logStreamArn.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_IdLogStreamArnRoleArn]
  }
}

