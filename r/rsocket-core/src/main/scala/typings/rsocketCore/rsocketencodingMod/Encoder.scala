package typings.rsocketCore.rsocketencodingMod

import typings.node.Buffer
import typings.rsocketTypes.reactiveSocketTypesMod.Encodable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Encoder[T /* <: Encodable */] extends js.Object {
  
  def byteLength(value: Encodable): Double = js.native
  
  def decode(buffer: Buffer, start: Double, end: Double): T = js.native
  
  def encode(value: Encodable, buffer: Buffer, start: Double, end: Double): Double = js.native
}
object Encoder {
  
  @scala.inline
  def apply[T /* <: Encodable */](
    byteLength: Encodable => Double,
    decode: (Buffer, Double, Double) => T,
    encode: (Encodable, Buffer, Double, Double) => Double
  ): Encoder[T] = {
    val __obj = js.Dynamic.literal(byteLength = js.Any.fromFunction1(byteLength), decode = js.Any.fromFunction3(decode), encode = js.Any.fromFunction4(encode))
    __obj.asInstanceOf[Encoder[T]]
  }
  
  @scala.inline
  implicit class EncoderOps[Self <: Encoder[_], T /* <: Encodable */] (val x: Self with Encoder[T]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setByteLength(value: Encodable => Double): Self = this.set("byteLength", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDecode(value: (Buffer, Double, Double) => T): Self = this.set("decode", js.Any.fromFunction3(value))
    
    @scala.inline
    def setEncode(value: (Encodable, Buffer, Double, Double) => Double): Self = this.set("encode", js.Any.fromFunction4(value))
  }
}
