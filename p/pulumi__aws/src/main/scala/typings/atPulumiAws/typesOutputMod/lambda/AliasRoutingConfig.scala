package typings.atPulumiAws.typesOutputMod.lambda

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AliasRoutingConfig extends js.Object {
  /**
    * A map that defines the proportion of events that should be sent to different versions of a lambda function.
    */
  var additionalVersionWeights: js.UndefOr[StringDictionary[Double]] = js.undefined
}

object AliasRoutingConfig {
  @scala.inline
  def apply(additionalVersionWeights: StringDictionary[Double] = null): AliasRoutingConfig = {
    val __obj = js.Dynamic.literal()
    if (additionalVersionWeights != null) __obj.updateDynamic("additionalVersionWeights")(additionalVersionWeights)
    __obj.asInstanceOf[AliasRoutingConfig]
  }
}

