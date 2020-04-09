package typings.reactAdaptiveHooks

import typings.reactAdaptiveHooks.networkMod.EffectiveConnectionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEffectiveConnectionType extends js.Object {
  var effectiveConnectionType: EffectiveConnectionType | Null
  var unsupported: Boolean
}

object AnonEffectiveConnectionType {
  @scala.inline
  def apply(unsupported: Boolean, effectiveConnectionType: EffectiveConnectionType = null): AnonEffectiveConnectionType = {
    val __obj = js.Dynamic.literal(unsupported = unsupported.asInstanceOf[js.Any])
    if (effectiveConnectionType != null) __obj.updateDynamic("effectiveConnectionType")(effectiveConnectionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEffectiveConnectionType]
  }
}

