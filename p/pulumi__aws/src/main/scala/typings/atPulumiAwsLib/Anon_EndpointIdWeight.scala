package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EndpointIdWeight extends js.Object {
  var endpointId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var weight: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
}

object Anon_EndpointIdWeight {
  @scala.inline
  def apply(
    endpointId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    weight: atPulumiPulumiLib.outputMod.Input[scala.Double] = null
  ): Anon_EndpointIdWeight = {
    val __obj = js.Dynamic.literal()
    if (endpointId != null) __obj.updateDynamic("endpointId")(endpointId.asInstanceOf[js.Any])
    if (weight != null) __obj.updateDynamic("weight")(weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_EndpointIdWeight]
  }
}

