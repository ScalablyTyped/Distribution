package typings.relayDashRuntime.libStoreRelayStoreTypesMod

import typings.relayDashRuntime.libUtilRelayRuntimeTypesMod.Variables
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RelayContext extends js.Object {
  var environment: Environment
  var variables: Variables
}

object RelayContext {
  @scala.inline
  def apply(environment: Environment, variables: Variables): RelayContext = {
    val __obj = js.Dynamic.literal(environment = environment, variables = variables)
  
    __obj.asInstanceOf[RelayContext]
  }
}

