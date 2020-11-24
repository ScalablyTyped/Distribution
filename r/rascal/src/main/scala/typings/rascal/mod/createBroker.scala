package typings.rascal.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rascal", "createBroker")
@js.native
object createBroker extends js.Object {
  
  def apply(config: BrokerConfig, components: js.Any, next: CreateCb): Unit = js.native
  def apply(config: BrokerConfig, next: CreateCb): Unit = js.native
}
