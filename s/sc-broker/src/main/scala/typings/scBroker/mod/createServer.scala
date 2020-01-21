package typings.scBroker.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sc-broker", "createServer")
@js.native
object createServer extends js.Object {
  def apply(): SCBrokerServer = js.native
  def apply(options: SCBrokerServerOptions): SCBrokerServer = js.native
}

