package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EnabledProcessorsAnonParametersType extends js.Object {
  var enabled: js.UndefOr[Input[Boolean]] = js.undefined
  var processors: js.UndefOr[Input[js.Array[Input[Anon_ParametersType]]]] = js.undefined
}

object Anon_EnabledProcessorsAnonParametersType {
  @scala.inline
  def apply(enabled: Input[Boolean] = null, processors: Input[js.Array[Input[Anon_ParametersType]]] = null): Anon_EnabledProcessorsAnonParametersType = {
    val __obj = js.Dynamic.literal()
    if (enabled != null) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (processors != null) __obj.updateDynamic("processors")(processors.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_EnabledProcessorsAnonParametersType]
  }
}

