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

