package typings
package srpLib.srpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("srp", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def computeVerifier(params: Params, salt: nodeLib.Buffer, I: nodeLib.Buffer, P: nodeLib.Buffer): nodeLib.Buffer = js.native
  def genKey(
    bytes: scala.Double,
    callback: js.Function2[/* error */ stdLib.Error, /* key */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def genKey(callback: js.Function2[/* error */ stdLib.Error, /* key */ nodeLib.Buffer, scala.Unit]): scala.Unit = js.native
}

