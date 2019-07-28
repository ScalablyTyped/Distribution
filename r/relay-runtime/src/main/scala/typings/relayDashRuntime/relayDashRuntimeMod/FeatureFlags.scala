package typings.relayDashRuntime.relayDashRuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// ./utils/RelayFeatureFlags
trait FeatureFlags extends js.Object {
  var ENABLE_VARIABLE_CONNECTION_KEY: Boolean
}

object FeatureFlags {
  @scala.inline
  def apply(ENABLE_VARIABLE_CONNECTION_KEY: Boolean): FeatureFlags = {
    val __obj = js.Dynamic.literal(ENABLE_VARIABLE_CONNECTION_KEY = ENABLE_VARIABLE_CONNECTION_KEY)
  
    __obj.asInstanceOf[FeatureFlags]
  }
}

