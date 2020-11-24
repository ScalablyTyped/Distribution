package typings.srp.mod

import typings.node.Buffer
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("srp", "genKey")
@js.native
object genKey extends js.Object {
  
  def apply(bytes: Double, callback: js.Function2[/* error */ Error, /* key */ Buffer, Unit]): Unit = js.native
  def apply(callback: js.Function2[/* error */ Error, /* key */ Buffer, Unit]): Unit = js.native
}
