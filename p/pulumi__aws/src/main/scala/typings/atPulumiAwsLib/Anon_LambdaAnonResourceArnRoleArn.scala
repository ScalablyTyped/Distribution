package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_LambdaAnonResourceArnRoleArn extends js.Object {
  var lambda: atPulumiPulumiLib.outputMod.Input[Anon_ResourceArnRoleArn]
}

object Anon_LambdaAnonResourceArnRoleArn {
  @scala.inline
  def apply(lambda: atPulumiPulumiLib.outputMod.Input[Anon_ResourceArnRoleArn]): Anon_LambdaAnonResourceArnRoleArn = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("lambda")(lambda.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_LambdaAnonResourceArnRoleArn]
  }
}

