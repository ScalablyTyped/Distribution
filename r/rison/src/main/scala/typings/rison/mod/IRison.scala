package typings.rison.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IRison extends js.Object {
  
  /**
    * Parses a Rison string into a javascript structure.
    * @param encoded Encoded string.
    * @returns {} Resulting array or object.
    */
  def decode[T](encoded: String): T = js.native
  
  /**
    * Parses a A-Rison string into a javascript array.
    * @param encoded Encoded string.
    * @returns {} Resulting array.
    */
  def decode_array[T](encoded: String): js.Array[T] = js.native
  
  /**
    * Parses a O-Rison string into a javascript object.
    * @param encoded Encoded string.
    * @returns {} Resulting object.
    */
  def decode_object[T](encoded: String): T = js.native
  
  /**
    * Rison-encodes a javascript structure.
    * @param obj Object to encode.
    * @returns {} Encoded string.
    */
  def encode(obj: js.Any): String = js.native
  
  /**
    * Rison-encodes a javascript array without surrounding parens (A-Rison).
    * @param obj Object to encode.
    * @returns {} Encoded string.
    */
  def encode_array[T](arr: js.Array[T]): String = js.native
  
  /**
    * Rison-encodes a javascript object without surrounding parens (O-Rison).
    * @param obj Object to encode.
    * @returns {} Encoded string.
    */
  def encode_object[T](obj: T): String = js.native
  
  /**
    * Rison-encodes and then url-escapes a javascript structure.
    * @param obj Object to encode.
    * @returns {} Encoded string.
    */
  def encode_uri(obj: js.Any): String = js.native
}
object IRison {
  
  @scala.inline
  def apply(
    decode: String => js.Any,
    decode_array: String => js.Array[js.Any],
    decode_object: String => js.Any,
    encode: js.Any => String,
    encode_array: js.Array[js.Any] => String,
    encode_object: js.Any => String,
    encode_uri: js.Any => String
  ): IRison = {
    val __obj = js.Dynamic.literal(decode = js.Any.fromFunction1(decode), decode_array = js.Any.fromFunction1(decode_array), decode_object = js.Any.fromFunction1(decode_object), encode = js.Any.fromFunction1(encode), encode_array = js.Any.fromFunction1(encode_array), encode_object = js.Any.fromFunction1(encode_object), encode_uri = js.Any.fromFunction1(encode_uri))
    __obj.asInstanceOf[IRison]
  }
  
  @scala.inline
  implicit class IRisonOps[Self <: IRison] (val x: Self) extends AnyVal {
    
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
    def setDecode(value: String => js.Any): Self = this.set("decode", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDecode_array(value: String => js.Array[js.Any]): Self = this.set("decode_array", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDecode_object(value: String => js.Any): Self = this.set("decode_object", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEncode(value: js.Any => String): Self = this.set("encode", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEncode_array(value: js.Array[js.Any] => String): Self = this.set("encode_array", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEncode_object(value: js.Any => String): Self = this.set("encode_object", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEncode_uri(value: js.Any => String): Self = this.set("encode_uri", js.Any.fromFunction1(value))
  }
}
