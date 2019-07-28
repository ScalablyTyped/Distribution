package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ParameterNameParameterValue extends js.Object {
  var parameterName: Input[String]
  var parameterValue: Input[String]
}

object Anon_ParameterNameParameterValue {
  @scala.inline
  def apply(parameterName: Input[String], parameterValue: Input[String]): Anon_ParameterNameParameterValue = {
    val __obj = js.Dynamic.literal(parameterName = parameterName.asInstanceOf[js.Any], parameterValue = parameterValue.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ParameterNameParameterValue]
  }
}

