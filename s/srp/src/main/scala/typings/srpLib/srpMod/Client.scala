package typings
package srpLib.srpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("srp", "Client")
@js.native
class Client protected () extends js.Object {
  def this(params: Params, salt: nodeLib.Buffer, identity: nodeLib.Buffer, password: nodeLib.Buffer, secret1: nodeLib.Buffer) = this()
  def checkM2(M2: nodeLib.Buffer): scala.Unit = js.native
  def computeA(): nodeLib.Buffer = js.native
  def computeK(): nodeLib.Buffer = js.native
  def computeM1(): nodeLib.Buffer = js.native
  def setB(B: nodeLib.Buffer): scala.Unit = js.native
}

