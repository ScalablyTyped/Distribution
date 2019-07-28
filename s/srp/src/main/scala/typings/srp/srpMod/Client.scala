package typings.srp.srpMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("srp", "Client")
@js.native
class Client protected () extends js.Object {
  def this(params: Params, salt: Buffer, identity: Buffer, password: Buffer, secret1: Buffer) = this()
  def checkM2(M2: Buffer): Unit = js.native
  def computeA(): Buffer = js.native
  def computeK(): Buffer = js.native
  def computeM1(): Buffer = js.native
  def setB(B: Buffer): Unit = js.native
}

