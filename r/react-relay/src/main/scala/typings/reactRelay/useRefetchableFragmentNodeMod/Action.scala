package typings.reactRelay.useRefetchableFragmentNodeMod

import typings.reactRelay.reactRelayStrings.refetch
import typings.reactRelay.reactRelayStrings.reset
import typings.relayRuntime.relayRuntimeTypesMod.Variables
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.reactRelay.anon.Environment
  - typings.reactRelay.anon.RefetchVariables
*/
trait Action extends js.Object
object Action {
  
  @scala.inline
  def Environment(
    environment: typings.relayRuntime.relayStoreTypesMod.Environment,
    fragmentIdentifier: String,
    `type`: reset
  ): Action = {
    val __obj = js.Dynamic.literal(environment = environment.asInstanceOf[js.Any], fragmentIdentifier = fragmentIdentifier.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action]
  }
  
  @scala.inline
  def RefetchVariables(refetchVariables: Variables, `type`: refetch): Action = {
    val __obj = js.Dynamic.literal(refetchVariables = refetchVariables.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action]
  }
}
