package typings.atPulumiAws

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AdditionalVersionWeights extends js.Object {
  var additionalVersionWeights: js.UndefOr[StringDictionary[Double]] = js.undefined
}

object Anon_AdditionalVersionWeights {
  @scala.inline
  def apply(additionalVersionWeights: StringDictionary[Double] = null): Anon_AdditionalVersionWeights = {
    val __obj = js.Dynamic.literal()
    if (additionalVersionWeights != null) __obj.updateDynamic("additionalVersionWeights")(additionalVersionWeights)
    __obj.asInstanceOf[Anon_AdditionalVersionWeights]
  }
}

