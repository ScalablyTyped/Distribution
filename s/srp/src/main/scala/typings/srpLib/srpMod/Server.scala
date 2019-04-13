package typings
package srpLib.srpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("srp", "Server")
@js.native
class Server protected () extends js.Object {
  def this(params: Params, verifier: nodeLib.Buffer, secret2: nodeLib.Buffer) = this()
  def checkM1(M1: nodeLib.Buffer): nodeLib.Buffer = js.native
  def computeB(): nodeLib.Buffer = js.native
  def computeK(): nodeLib.Buffer = js.native
  def setA(A: nodeLib.Buffer): scala.Unit = js.native
}

