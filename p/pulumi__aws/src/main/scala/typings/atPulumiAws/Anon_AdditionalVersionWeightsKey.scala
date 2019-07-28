package typings.atPulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AdditionalVersionWeightsKey extends js.Object {
  var additionalVersionWeights: js.UndefOr[Input[StringDictionary[Input[Double]]]] = js.undefined
}

object Anon_AdditionalVersionWeightsKey {
  @scala.inline
  def apply(additionalVersionWeights: Input[StringDictionary[Input[Double]]] = null): Anon_AdditionalVersionWeightsKey = {
    val __obj = js.Dynamic.literal()
    if (additionalVersionWeights != null) __obj.updateDynamic("additionalVersionWeights")(additionalVersionWeights.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AdditionalVersionWeightsKey]
  }
}

