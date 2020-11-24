package typings.stompit.connectFailoverMod

import typings.stompit.connectMod.ConnectOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stompit/lib/ConnectFailover", JSImport.Namespace)
@js.native
class ^ () extends ConnectFailover {
  def this(servers: String) = this()
  def this(servers: js.Array[ConnectOptions]) = this()
  def this(servers: js.UndefOr[scala.Nothing], options: ConnectFailoverOptions) = this()
  def this(servers: String, options: ConnectFailoverOptions) = this()
  def this(servers: js.Array[ConnectOptions], options: ConnectFailoverOptions) = this()
}
