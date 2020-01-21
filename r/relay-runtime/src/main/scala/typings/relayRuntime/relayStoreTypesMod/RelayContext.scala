package typings.relayRuntime.relayStoreTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RelayContext extends js.Object {
  var environment: Environment
}

object RelayContext {
  @scala.inline
  def apply(environment: Environment): RelayContext = {
    val __obj = js.Dynamic.literal(environment = environment.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RelayContext]
  }
}

