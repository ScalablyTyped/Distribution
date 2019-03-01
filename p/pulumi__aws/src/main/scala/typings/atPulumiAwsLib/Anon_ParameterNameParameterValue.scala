package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ParameterNameParameterValue extends js.Object {
  var parameterName: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var parameterValue: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object Anon_ParameterNameParameterValue {
  @scala.inline
  def apply(
    parameterName: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    parameterValue: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  ): Anon_ParameterNameParameterValue = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("parameterName")(parameterName.asInstanceOf[js.Any])
    __obj.updateDynamic("parameterValue")(parameterValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ParameterNameParameterValue]
  }
}

