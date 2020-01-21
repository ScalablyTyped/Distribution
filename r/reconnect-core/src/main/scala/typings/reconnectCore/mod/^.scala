package typings.reconnectCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("reconnect-core", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply[ArgType, ConnectionType](cf: ConnectFunction[ArgType, ConnectionType]): CustomModule[ArgType, ConnectionType] = js.native
}

