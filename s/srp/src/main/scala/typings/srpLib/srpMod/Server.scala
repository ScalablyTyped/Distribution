package typings
package srpLib.srpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("srp", "Server")
@js.native
class Server protected ()
  extends srpLib.srpMod.SRPNs.Server {
  def this(params: srpLib.srpMod.SRPNs.Params, verifier: nodeLib.Buffer, secret2: nodeLib.Buffer) = this()
  /* CompleteClass */
  override def checkM1(M1: nodeLib.Buffer): nodeLib.Buffer = js.native
  /* CompleteClass */
  override def computeB(): nodeLib.Buffer = js.native
  /* CompleteClass */
  override def computeK(): nodeLib.Buffer = js.native
  /* CompleteClass */
  override def setA(A: nodeLib.Buffer): scala.Unit = js.native
}

