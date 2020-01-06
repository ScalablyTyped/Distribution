package typings.atPulumiAws.typesInputMod.lambda

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AliasRoutingConfig extends js.Object {
  /**
    * A map that defines the proportion of events that should be sent to different versions of a lambda function.
    */
  var additionalVersionWeights: js.UndefOr[Input[StringDictionary[Input[Double]]]] = js.native
}

object AliasRoutingConfig {
  @scala.inline
  def apply(additionalVersionWeights: Input[StringDictionary[Input[Double]]] = null): AliasRoutingConfig = {
    val __obj = js.Dynamic.literal()
    if (additionalVersionWeights != null) __obj.updateDynamic("additionalVersionWeights")(additionalVersionWeights.asInstanceOf[js.Any])
    __obj.asInstanceOf[AliasRoutingConfig]
  }
}

