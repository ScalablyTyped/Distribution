package typings
package scDashBrokerLib.scDashBrokerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sc-broker", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def createClient(): SCBrokerClient = js.native
  def createClient(options: SCBrokerClientOptions): SCBrokerClient = js.native
  def createServer(): SCBrokerServer = js.native
  def createServer(options: SCBrokerServerOptions): SCBrokerServer = js.native
}

