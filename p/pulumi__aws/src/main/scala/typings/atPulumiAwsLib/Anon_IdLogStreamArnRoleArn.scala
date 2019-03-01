package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IdLogStreamArnRoleArn extends js.Object {
  var id: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var logStreamArn: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var roleArn: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object Anon_IdLogStreamArnRoleArn {
  @scala.inline
  def apply(
    logStreamArn: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    roleArn: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    id: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): Anon_IdLogStreamArnRoleArn = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("logStreamArn")(logStreamArn.asInstanceOf[js.Any])
    __obj.updateDynamic("roleArn")(roleArn.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_IdLogStreamArnRoleArn]
  }
}

