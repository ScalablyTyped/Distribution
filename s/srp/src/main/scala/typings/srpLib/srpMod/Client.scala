package typings
package srpLib.srpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("srp", "Client")
@js.native
class Client protected ()
  extends srpLib.srpMod.SRPNs.Client {
  def this(params: srpLib.srpMod.SRPNs.Params, salt: nodeLib.Buffer, identity: nodeLib.Buffer, password: nodeLib.Buffer, secret1: nodeLib.Buffer) = this()
  /* CompleteClass */
  override def checkM2(M2: nodeLib.Buffer): scala.Unit = js.native
  /* CompleteClass */
  override def computeA(): nodeLib.Buffer = js.native
  /* CompleteClass */
  override def computeK(): nodeLib.Buffer = js.native
  /* CompleteClass */
  override def computeM1(): nodeLib.Buffer = js.native
  /* CompleteClass */
  override def setB(B: nodeLib.Buffer): scala.Unit = js.native
}

