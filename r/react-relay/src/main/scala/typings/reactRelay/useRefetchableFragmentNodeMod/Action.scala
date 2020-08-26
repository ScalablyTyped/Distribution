package typings.reactRelay.useRefetchableFragmentNodeMod

import typings.relayRuntime.relayRuntimeTypesMod.Variables
import typings.relayRuntime.relayStoreTypesMod.Environment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.reactRelay.anon.Environment
  - typings.reactRelay.anon.FetchPolicy
*/
trait Action extends js.Object

object Action {
  @scala.inline
  def Environment(
    environment: typings.relayRuntime.relayStoreTypesMod.Environment,
    fragmentIdentifier: String,
    `type`: String
  ): Action = {
    val __obj = js.Dynamic.literal(environment = environment.asInstanceOf[js.Any], fragmentIdentifier = fragmentIdentifier.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action]
  }
  @scala.inline
  def FetchPolicy(environment: Environment, refetchVariables: Variables, `type`: String): Action = {
    val __obj = js.Dynamic.literal(environment = environment.asInstanceOf[js.Any], refetchVariables = refetchVariables.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action]
  }
}

