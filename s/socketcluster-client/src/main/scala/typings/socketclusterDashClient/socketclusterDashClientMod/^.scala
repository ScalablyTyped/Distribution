package typings.socketclusterDashClient.socketclusterDashClientMod

import typings.socketclusterDashClient.libScclientsocketMod.ClientOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("socketcluster-client", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val version: String = js.native
  def connect(): SCClientSocket = js.native
  def connect(options: ClientOptions): SCClientSocket = js.native
  def create(): SCClientSocket = js.native
  def create(options: ClientOptions): SCClientSocket = js.native
  def destroy(socket: SCClientSocket): Unit = js.native
}

