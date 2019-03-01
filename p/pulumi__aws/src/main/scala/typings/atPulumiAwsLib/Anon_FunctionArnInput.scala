package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FunctionArnInput extends js.Object {
  var functionArn: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object Anon_FunctionArnInput {
  @scala.inline
  def apply(functionArn: atPulumiPulumiLib.outputMod.Input[java.lang.String]): Anon_FunctionArnInput = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("functionArn")(functionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_FunctionArnInput]
  }
}

