package typings.reactNativeFetchBlob.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Decode extends js.Object {
  def decode(input: String): String = js.native
  def encode(input: String): String = js.native
}

object Decode {
  @scala.inline
  def apply(decode: String => String, encode: String => String): Decode = {
    val __obj = js.Dynamic.literal(decode = js.Any.fromFunction1(decode), encode = js.Any.fromFunction1(encode))
    __obj.asInstanceOf[Decode]
  }
  @scala.inline
  implicit class DecodeOps[Self <: Decode] (val x: Self) extends AnyVal {
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
    def setDecode(value: String => String): Self = this.set("decode", js.Any.fromFunction1(value))
    @scala.inline
    def setEncode(value: String => String): Self = this.set("encode", js.Any.fromFunction1(value))
  }
  
}

