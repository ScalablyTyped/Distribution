package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ParametersType extends js.Object {
  var parameters: js.UndefOr[Input[js.Array[Input[Anon_ParameterNameParameterValue]]]] = js.undefined
  var `type`: Input[String]
}

object Anon_ParametersType {
  @scala.inline
  def apply(`type`: Input[String], parameters: Input[js.Array[Input[Anon_ParameterNameParameterValue]]] = null): Anon_ParametersType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (parameters != null) __obj.updateDynamic("parameters")(parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ParametersType]
  }
}

