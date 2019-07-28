package typings.rlp

import typings.node.Buffer
import typings.rlp.distTypesMod.Decoded
import typings.rlp.distTypesMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rlp", JSImport.Namespace)
@js.native
object rlpMod extends js.Object {
  def decode(input: js.Array[Buffer]): js.Array[Buffer] = js.native
  def decode(input: js.Array[Buffer], stream: Boolean): js.Array[Buffer] = js.native
  def decode(input: Buffer): Buffer = js.native
  def decode(input: Buffer, stream: Boolean): Buffer = js.native
  def decode(input: Input): js.Array[Buffer] | Buffer | Decoded = js.native
  def decode(input: Input, stream: Boolean): js.Array[Buffer] | Buffer | Decoded = js.native
  def encode(input: Input): Buffer = js.native
  def getLength(input: Input): Buffer | Double = js.native
}

