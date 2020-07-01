package typings.relayRuntime.relayFeatureFlagsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FeatureFlags extends js.Object {
  var ENABLE_PARTIAL_RENDERING_DEFAULT: Boolean
  var ENABLE_RELAY_CONTAINERS_SUSPENSE: Boolean
  var ENABLE_UNIQUE_MUTATION_ROOT: Boolean
  var ENABLE_VARIABLE_CONNECTION_KEY: Boolean
}

object FeatureFlags {
  @scala.inline
  def apply(
    ENABLE_PARTIAL_RENDERING_DEFAULT: Boolean,
    ENABLE_RELAY_CONTAINERS_SUSPENSE: Boolean,
    ENABLE_UNIQUE_MUTATION_ROOT: Boolean,
    ENABLE_VARIABLE_CONNECTION_KEY: Boolean
  ): FeatureFlags = {
    val __obj = js.Dynamic.literal(ENABLE_PARTIAL_RENDERING_DEFAULT = ENABLE_PARTIAL_RENDERING_DEFAULT.asInstanceOf[js.Any], ENABLE_RELAY_CONTAINERS_SUSPENSE = ENABLE_RELAY_CONTAINERS_SUSPENSE.asInstanceOf[js.Any], ENABLE_UNIQUE_MUTATION_ROOT = ENABLE_UNIQUE_MUTATION_ROOT.asInstanceOf[js.Any], ENABLE_VARIABLE_CONNECTION_KEY = ENABLE_VARIABLE_CONNECTION_KEY.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeatureFlags]
  }
}

