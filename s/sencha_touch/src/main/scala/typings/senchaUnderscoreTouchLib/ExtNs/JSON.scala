package typings
package senchaUnderscoreTouchLib.ExtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Ext.JSON")
@js.native
class JSON () extends js.Object

@JSGlobal("Ext.JSON")
@js.native
object JSON extends js.Object {
  /** [Method] Decodes parses a JSON string to an object
  		* @param json String The JSON string.
  		* @param safe Boolean Whether to return null or throw an exception if the JSON is invalid.
  		* @returns Object/null The resulting object.
  		*/
  def decode(): js.Any = js.native
  def decode(json: java.lang.String): js.Any = js.native
  def decode(json: java.lang.String, safe: scala.Boolean): js.Any = js.native
  /** [Method] Encodes an Object Array or other value
  		* @param o Object The variable to encode.
  		* @returns String The JSON string.
  		*/
  def encode(): java.lang.String = js.native
  def encode(o: js.Any): java.lang.String = js.native
  /** [Method] Encodes a Date
  		* @param d Date The Date to encode.
  		* @returns String The string literal to use in a JSON string.
  		*/
  def encodeDate(): java.lang.String = js.native
  def encodeDate(d: js.Any): java.lang.String = js.native
}

