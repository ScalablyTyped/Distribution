package typings.relayDashRuntime.libStoreRelayStoreTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RelayContext extends js.Object {
  var environment: Environment
}

object RelayContext {
  @scala.inline
  def apply(environment: Environment): RelayContext = {
    val __obj = js.Dynamic.literal(environment = environment)
  
    __obj.asInstanceOf[RelayContext]
  }
}

