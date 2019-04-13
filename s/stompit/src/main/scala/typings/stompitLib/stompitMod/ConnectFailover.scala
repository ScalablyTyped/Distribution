package typings
package stompitLib.stompitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stompit", "ConnectFailover")
@js.native
class ConnectFailover ()
  extends stompitLib.libConnectFailoverMod.^ {
  def this(servers: java.lang.String) = this()
  def this(servers: js.Array[stompitLib.libConnectMod.ConnectOptions]) = this()
  def this(servers: java.lang.String, options: stompitLib.libConnectFailoverMod.ConnectFailoverOptions) = this()
  def this(servers: js.Array[stompitLib.libConnectMod.ConnectOptions], options: stompitLib.libConnectFailoverMod.ConnectFailoverOptions) = this()
}

