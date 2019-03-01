package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AdditionalVersionWeightsKey extends js.Object {
  var additionalVersionWeights: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[
      org.scalablytyped.runtime.StringDictionary[atPulumiPulumiLib.outputMod.Input[scala.Double]]
    ]
  ] = js.undefined
}

object Anon_AdditionalVersionWeightsKey {
  @scala.inline
  def apply(
    additionalVersionWeights: atPulumiPulumiLib.outputMod.Input[
      org.scalablytyped.runtime.StringDictionary[atPulumiPulumiLib.outputMod.Input[scala.Double]]
    ] = null
  ): Anon_AdditionalVersionWeightsKey = {
    val __obj = js.Dynamic.literal()
    if (additionalVersionWeights != null) __obj.updateDynamic("additionalVersionWeights")(additionalVersionWeights.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AdditionalVersionWeightsKey]
  }
}

