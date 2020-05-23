package typings.reactAdaptiveHooks.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EffectiveConnectionType extends js.Object {
  var effectiveConnectionType: typings.reactAdaptiveHooks.networkMod.EffectiveConnectionType | Null
  var unsupported: Boolean
}

object EffectiveConnectionType {
  @scala.inline
  def apply(
    unsupported: Boolean,
    effectiveConnectionType: typings.reactAdaptiveHooks.networkMod.EffectiveConnectionType = null
  ): EffectiveConnectionType = {
    val __obj = js.Dynamic.literal(unsupported = unsupported.asInstanceOf[js.Any], effectiveConnectionType = effectiveConnectionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[EffectiveConnectionType]
  }
}

