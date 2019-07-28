package typings.stompit.stompitMod

import typings.stompit.libConnectFailoverMod.ConnectFailoverOptions
import typings.stompit.libConnectMod.ConnectOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stompit", "ConnectFailover")
@js.native
class ConnectFailover ()
  extends typings.stompit.libConnectFailoverMod.^ {
  def this(servers: String) = this()
  def this(servers: js.Array[ConnectOptions]) = this()
  def this(servers: String, options: ConnectFailoverOptions) = this()
  def this(servers: js.Array[ConnectOptions], options: ConnectFailoverOptions) = this()
}

