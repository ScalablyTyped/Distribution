package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EnabledProcessorsAnonParametersType extends js.Object {
  var enabled: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  var processors: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[Anon_ParametersType]]]
  ] = js.undefined
}

object Anon_EnabledProcessorsAnonParametersType {
  @scala.inline
  def apply(
    enabled: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    processors: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[Anon_ParametersType]]] = null
  ): Anon_EnabledProcessorsAnonParametersType = {
    val __obj = js.Dynamic.literal()
    if (enabled != null) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (processors != null) __obj.updateDynamic("processors")(processors.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_EnabledProcessorsAnonParametersType]
  }
}

