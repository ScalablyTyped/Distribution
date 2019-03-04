package typings
package relayDashRuntimeLib.relayDashRuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CRelayContext[TEnvironment] extends js.Object {
  var environment: TEnvironment
  var variables: Variables
}

object CRelayContext {
  @scala.inline
  def apply[TEnvironment](environment: TEnvironment, variables: Variables): CRelayContext[TEnvironment] = {
    val __obj = js.Dynamic.literal(environment = environment.asInstanceOf[js.Any], variables = variables)
  
    __obj.asInstanceOf[CRelayContext[TEnvironment]]
  }
}

