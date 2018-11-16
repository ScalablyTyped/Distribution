package typings
package stompitLib.stompitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stompit", "ConnectFailover")
@js.native
class ConnectFailover ()
  extends stompitLib.libConnectFailoverMod.namespaced {
  def this(servers: java.lang.String) = this()
  def this(servers: js.Array[stompitLib.libConnectMod.connectNs.ConnectOptions]) = this()
  def this(servers: java.lang.String, options: stompitLib.libConnectFailoverMod.ConnectFailoverNs.ConnectFailoverOptions) = this()
  def this(servers: js.Array[stompitLib.libConnectMod.connectNs.ConnectOptions], options: stompitLib.libConnectFailoverMod.ConnectFailoverNs.ConnectFailoverOptions) = this()
}

