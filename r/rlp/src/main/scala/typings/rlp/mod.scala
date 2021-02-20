package typings.rlp

import typings.node.Buffer
import typings.rlp.typesMod.Decoded
import typings.rlp.typesMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rlp", "decode")
  @js.native
  def decode(input: js.Array[Buffer]): js.Array[Buffer] = js.native
  @JSImport("rlp", "decode")
  @js.native
  def decode(input: js.Array[Buffer], stream: Boolean): js.Array[Buffer] = js.native
  @JSImport("rlp", "decode")
  @js.native
  def decode(input: Buffer): Buffer = js.native
  @JSImport("rlp", "decode")
  @js.native
  def decode(input: Buffer, stream: Boolean): Buffer = js.native
  @JSImport("rlp", "decode")
  @js.native
  def decode(input: Input): js.Array[Buffer] | Buffer | Decoded = js.native
  @JSImport("rlp", "decode")
  @js.native
  def decode(input: Input, stream: Boolean): js.Array[Buffer] | Buffer | Decoded = js.native
  
  @JSImport("rlp", "encode")
  @js.native
  def encode(input: Input): Buffer = js.native
  
  @JSImport("rlp", "getLength")
  @js.native
  def getLength(input: Input): Buffer | Double = js.native
}
