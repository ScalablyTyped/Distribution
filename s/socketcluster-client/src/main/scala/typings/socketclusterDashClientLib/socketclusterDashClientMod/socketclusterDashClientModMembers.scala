package typings
package socketclusterDashClientLib.socketclusterDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("socketcluster-client", JSImport.Namespace)
@js.native
object socketclusterDashClientModMembers extends js.Object {
  val version: java.lang.String = js.native
  def connect(): SCClientSocket = js.native
  def connect(options: socketclusterDashClientLib.libScclientsocketMod.SCClientSocketNs.ClientOptions): SCClientSocket = js.native
  def create(): SCClientSocket = js.native
  def create(options: socketclusterDashClientLib.libScclientsocketMod.SCClientSocketNs.ClientOptions): SCClientSocket = js.native
  def destroy(socket: SCClientSocket): scala.Unit = js.native
}

