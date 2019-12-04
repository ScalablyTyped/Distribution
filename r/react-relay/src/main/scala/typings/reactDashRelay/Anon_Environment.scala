package typings.reactDashRelay

import typings.reactDashRelay.libRelayDashExperimentalUseRefetchableFragmentNodeMod.Action
import typings.relayDashRuntime.libStoreRelayStoreTypesMod.Environment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Environment extends Action {
  var environment: Environment
  var fragmentIdentifier: String
  var `type`: String
}

object Anon_Environment {
  @scala.inline
  def apply(environment: Environment, fragmentIdentifier: String, `type`: String): Anon_Environment = {
    val __obj = js.Dynamic.literal(environment = environment.asInstanceOf[js.Any], fragmentIdentifier = fragmentIdentifier.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Environment]
  }
}

