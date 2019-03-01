package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_KinesisStreamArnRoleArn extends js.Object {
  var kinesisStreamArn: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var roleArn: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object Anon_KinesisStreamArnRoleArn {
  @scala.inline
  def apply(
    kinesisStreamArn: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    roleArn: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  ): Anon_KinesisStreamArnRoleArn = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("kinesisStreamArn")(kinesisStreamArn.asInstanceOf[js.Any])
    __obj.updateDynamic("roleArn")(roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_KinesisStreamArnRoleArn]
  }
}

