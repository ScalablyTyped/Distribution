package typings.rsocketDashCore.rSocketEncodingMod

import typings.node.Buffer
import typings.rsocketDashTypes.reactiveSocketTypesMod.Encodable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Encoder[T /* <: Encodable */] extends js.Object {
  def byteLength(value: Encodable): Double
  def decode(buffer: Buffer, start: Double, end: Double): T
  def encode(value: Encodable, buffer: Buffer, start: Double, end: Double): Double
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
}

