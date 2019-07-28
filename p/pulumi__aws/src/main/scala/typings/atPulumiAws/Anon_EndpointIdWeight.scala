package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EndpointIdWeight extends js.Object {
  var endpointId: js.UndefOr[Input[String]] = js.undefined
  var weight: js.UndefOr[Input[Double]] = js.undefined
}

object Anon_EndpointIdWeight {
  @scala.inline
  def apply(endpointId: Input[String] = null, weight: Input[Double] = null): Anon_EndpointIdWeight = {
    val __obj = js.Dynamic.literal()
    if (endpointId != null) __obj.updateDynamic("endpointId")(endpointId.asInstanceOf[js.Any])
    if (weight != null) __obj.updateDynamic("weight")(weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_EndpointIdWeight]
  }
}

