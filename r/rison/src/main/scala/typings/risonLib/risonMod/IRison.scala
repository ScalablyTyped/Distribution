package typings
package risonLib.risonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRison extends js.Object {
  /**
    * Parses a Rison string into a javascript structure.
    * @param encoded Encoded string.
    * @returns {} Resulting array or object.
    */
  def decode[T](encoded: java.lang.String): T
  /**
    * Parses a A-Rison string into a javascript array.
    * @param encoded Encoded string.
    * @returns {} Resulting array.
    */
  def decode_array[T](encoded: java.lang.String): js.Array[T]
  /**
    * Parses a O-Rison string into a javascript object.
    * @param encoded Encoded string.
    * @returns {} Resulting object.
    */
  def decode_object[T](encoded: java.lang.String): T
  /**
    * Rison-encodes a javascript structure.
    * @param obj Object to encode.
    * @returns {} Encoded string.
    */
  def encode(obj: js.Any): java.lang.String
  /**
    * Rison-encodes a javascript array without surrounding parens (A-Rison).
    * @param obj Object to encode.
    * @returns {} Encoded string.
    */
  def encode_array[T](arr: js.Array[T]): java.lang.String
  /**
    * Rison-encodes a javascript object without surrounding parens (O-Rison).
    * @param obj Object to encode.
    * @returns {} Encoded string.
    */
  def encode_object[T](obj: T): java.lang.String
  /**
    * Rison-encodes and then url-escapes a javascript structure.
    * @param obj Object to encode.
    * @returns {} Encoded string.
    */
  def encode_uri(obj: js.Any): java.lang.String
}

object IRison {
  @scala.inline
  def apply(
    decode: js.Function1[java.lang.String, js.Any],
    decode_array: js.Function1[java.lang.String, js.Array[js.Any]],
    decode_object: js.Function1[java.lang.String, js.Any],
    encode: js.Function1[js.Any, java.lang.String],
    encode_array: js.Function1[js.Array[js.Any], java.lang.String],
    encode_object: js.Function1[js.Any, java.lang.String],
    encode_uri: js.Function1[js.Any, java.lang.String]
  ): IRison = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("decode")(decode)
    __obj.updateDynamic("decode_array")(decode_array)
    __obj.updateDynamic("decode_object")(decode_object)
    __obj.updateDynamic("encode")(encode)
    __obj.updateDynamic("encode_array")(encode_array)
    __obj.updateDynamic("encode_object")(encode_object)
    __obj.updateDynamic("encode_uri")(encode_uri)
    __obj.asInstanceOf[IRison]
  }
}

