package typings.rison.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRison extends js.Object {
  /**
    * Parses a Rison string into a javascript structure.
    * @param encoded Encoded string.
    * @returns {} Resulting array or object.
    */
  def decode[T](encoded: String): T
  /**
    * Parses a A-Rison string into a javascript array.
    * @param encoded Encoded string.
    * @returns {} Resulting array.
    */
  def decode_array[T](encoded: String): js.Array[T]
  /**
    * Parses a O-Rison string into a javascript object.
    * @param encoded Encoded string.
    * @returns {} Resulting object.
    */
  def decode_object[T](encoded: String): T
  /**
    * Rison-encodes a javascript structure.
    * @param obj Object to encode.
    * @returns {} Encoded string.
    */
  def encode(obj: js.Any): String
  /**
    * Rison-encodes a javascript array without surrounding parens (A-Rison).
    * @param obj Object to encode.
    * @returns {} Encoded string.
    */
  def encode_array[T](arr: js.Array[T]): String
  /**
    * Rison-encodes a javascript object without surrounding parens (O-Rison).
    * @param obj Object to encode.
    * @returns {} Encoded string.
    */
  def encode_object[T](obj: T): String
  /**
    * Rison-encodes and then url-escapes a javascript structure.
    * @param obj Object to encode.
    * @returns {} Encoded string.
    */
  def encode_uri(obj: js.Any): String
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
}

