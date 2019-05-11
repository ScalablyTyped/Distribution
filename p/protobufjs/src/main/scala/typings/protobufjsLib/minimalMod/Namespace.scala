package typings
package protobufjsLib.minimalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protobufjs/minimal", "Namespace")
@js.native
class Namespace protected ()
  extends protobufjsLib.protobufjsMod.Namespace {
  /**
    * Constructs a new namespace instance.
    * @param name Namespace name
    * @param [options] Declared options
    */
  def this(name: java.lang.String) = this()
  def this(name: java.lang.String, options: org.scalablytyped.runtime.StringDictionary[js.Any]) = this()
}

/* static members */
@JSImport("protobufjs/minimal", "Namespace")
@js.native
object Namespace extends js.Object {
  /**
    * Converts an array of reflection objects to JSON.
    * @param array Object array
    * @param [toJSONOptions] JSON conversion options
    * @returns JSON object or `undefined` when array is empty
    */
  def arrayToJSON(array: js.Array[protobufjsLib.protobufjsMod.ReflectionObject]): js.UndefOr[org.scalablytyped.runtime.StringDictionary[_]] = js.native
  def arrayToJSON(
    array: js.Array[protobufjsLib.protobufjsMod.ReflectionObject],
    toJSONOptions: protobufjsLib.protobufjsMod.IToJSONOptions
  ): js.UndefOr[org.scalablytyped.runtime.StringDictionary[_]] = js.native
  /**
    * Constructs a namespace from JSON.
    * @param name Namespace name
    * @param json JSON object
    * @returns Created namespace
    * @throws {TypeError} If arguments are invalid
    */
  def fromJSON(name: java.lang.String, json: org.scalablytyped.runtime.StringDictionary[js.Any]): protobufjsLib.protobufjsMod.Namespace = js.native
  /**
    * Tests if the specified id is reserved.
    * @param reserved Array of reserved ranges and names
    * @param id Id to test
    * @returns `true` if reserved, otherwise `false`
    */
  def isReservedId(reserved: js.Array[js.Array[scala.Double] | java.lang.String], id: scala.Double): scala.Boolean = js.native
  def isReservedId(reserved: js.UndefOr[scala.Nothing], id: scala.Double): scala.Boolean = js.native
  /**
    * Tests if the specified name is reserved.
    * @param reserved Array of reserved ranges and names
    * @param name Name to test
    * @returns `true` if reserved, otherwise `false`
    */
  def isReservedName(reserved: js.Array[js.Array[scala.Double] | java.lang.String], name: java.lang.String): scala.Boolean = js.native
  def isReservedName(reserved: js.UndefOr[scala.Nothing], name: java.lang.String): scala.Boolean = js.native
}

