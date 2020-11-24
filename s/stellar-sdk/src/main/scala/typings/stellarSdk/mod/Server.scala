package typings.stellarSdk.mod

import typings.stellarSdk.serverMod.Server.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-sdk", "Server")
@js.native
class Server protected ()
  extends typings.stellarSdk.serverMod.Server {
  def this(serverURL: String) = this()
  def this(serverURL: String, opts: Options) = this()
}
