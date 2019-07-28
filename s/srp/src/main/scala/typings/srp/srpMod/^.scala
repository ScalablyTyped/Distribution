package typings.srp.srpMod

import typings.node.Buffer
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("srp", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def computeVerifier(params: Params, salt: Buffer, I: Buffer, P: Buffer): Buffer = js.native
  def genKey(bytes: Double, callback: js.Function2[/* error */ Error, /* key */ Buffer, Unit]): Unit = js.native
  def genKey(callback: js.Function2[/* error */ Error, /* key */ Buffer, Unit]): Unit = js.native
}

