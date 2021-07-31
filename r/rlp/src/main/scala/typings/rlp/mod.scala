package typings.rlp

import typings.node.Buffer
import typings.rlp.typesMod.Decoded
import typings.rlp.typesMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rlp", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def decode(input: js.Array[Buffer]): js.Array[Buffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(input.asInstanceOf[js.Any]).asInstanceOf[js.Array[Buffer]]
  @scala.inline
  def decode(input: js.Array[Buffer], stream: Boolean): js.Array[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(input.asInstanceOf[js.Any], stream.asInstanceOf[js.Any])).asInstanceOf[js.Array[Buffer]]
  @scala.inline
  def decode(input: Buffer): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(input.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  @scala.inline
  def decode(input: Buffer, stream: Boolean): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(input.asInstanceOf[js.Any], stream.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  @scala.inline
  def decode(input: Input): js.Array[Buffer] | Buffer | Decoded = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(input.asInstanceOf[js.Any]).asInstanceOf[js.Array[Buffer] | Buffer | Decoded]
  @scala.inline
  def decode(input: Input, stream: Boolean): js.Array[Buffer] | Buffer | Decoded = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(input.asInstanceOf[js.Any], stream.asInstanceOf[js.Any])).asInstanceOf[js.Array[Buffer] | Buffer | Decoded]
  
  @scala.inline
  def encode(input: Input): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(input.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  @scala.inline
  def getLength(input: Input): Buffer | Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getLength")(input.asInstanceOf[js.Any]).asInstanceOf[Buffer | Double]
}
