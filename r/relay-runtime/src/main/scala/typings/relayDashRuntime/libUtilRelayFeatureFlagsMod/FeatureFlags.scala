package typings.relayDashRuntime.libUtilRelayFeatureFlagsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FeatureFlags extends js.Object {
  var ENABLE_CONNECTION_RESOLVERS: Boolean
  var ENABLE_PARTIAL_RENDERING_DEFAULT: Boolean
  var ENABLE_VARIABLE_CONNECTION_KEY: Boolean
  var USE_RECORD_SOURCE_MAP_IMPL: Boolean
}

object FeatureFlags {
  @scala.inline
  def apply(
    ENABLE_CONNECTION_RESOLVERS: Boolean,
    ENABLE_PARTIAL_RENDERING_DEFAULT: Boolean,
    ENABLE_VARIABLE_CONNECTION_KEY: Boolean,
    USE_RECORD_SOURCE_MAP_IMPL: Boolean
  ): FeatureFlags = {
    val __obj = js.Dynamic.literal(ENABLE_CONNECTION_RESOLVERS = ENABLE_CONNECTION_RESOLVERS.asInstanceOf[js.Any], ENABLE_PARTIAL_RENDERING_DEFAULT = ENABLE_PARTIAL_RENDERING_DEFAULT.asInstanceOf[js.Any], ENABLE_VARIABLE_CONNECTION_KEY = ENABLE_VARIABLE_CONNECTION_KEY.asInstanceOf[js.Any], USE_RECORD_SOURCE_MAP_IMPL = USE_RECORD_SOURCE_MAP_IMPL.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FeatureFlags]
  }
}

