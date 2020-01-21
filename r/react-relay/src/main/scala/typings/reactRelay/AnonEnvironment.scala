package typings.reactRelay

import typings.reactRelay.useRefetchableFragmentNodeMod.Action
import typings.relayRuntime.relayStoreTypesMod.Environment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEnvironment extends Action {
  var environment: Environment
  var fragmentIdentifier: String
  var `type`: String
}

object AnonEnvironment {
  @scala.inline
  def apply(environment: Environment, fragmentIdentifier: String, `type`: String): AnonEnvironment = {
    val __obj = js.Dynamic.literal(environment = environment.asInstanceOf[js.Any], fragmentIdentifier = fragmentIdentifier.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEnvironment]
  }
}

