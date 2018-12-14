package typings
package protobufjsLib.protobufjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protobufjs", "Enum")
@js.native
class Enum protected () extends ReflectionObject {
  /**
       * Constructs a new enum instance.
       * @param name Unique name within its namespace
       * @param [values] Enum values as an object, by name
       * @param [options] Declared options
       * @param [comment] The comment for this enum
       * @param [comments] The value comments for this enum
       */
  def this(name: java.lang.String) = this()
  /**
       * Constructs a new enum instance.
       * @param name Unique name within its namespace
       * @param [values] Enum values as an object, by name
       * @param [options] Declared options
       * @param [comment] The comment for this enum
       * @param [comments] The value comments for this enum
       */
  def this(name: java.lang.String, values: org.scalablytyped.runtime.StringDictionary[scala.Double]) = this()
  /**
       * Constructs a new enum instance.
       * @param name Unique name within its namespace
       * @param [values] Enum values as an object, by name
       * @param [options] Declared options
       * @param [comment] The comment for this enum
       * @param [comments] The value comments for this enum
       */
  def this(name: java.lang.String, values: org.scalablytyped.runtime.StringDictionary[scala.Double], options: org.scalablytyped.runtime.StringDictionary[js.Any]) = this()
  /**
       * Constructs a new enum instance.
       * @param name Unique name within its namespace
       * @param [values] Enum values as an object, by name
       * @param [options] Declared options
       * @param [comment] The comment for this enum
       * @param [comments] The value comments for this enum
       */
  def this(name: java.lang.String, values: org.scalablytyped.runtime.StringDictionary[scala.Double], options: org.scalablytyped.runtime.StringDictionary[js.Any], comment: java.lang.String) = this()
  /**
       * Constructs a new enum instance.
       * @param name Unique name within its namespace
       * @param [values] Enum values as an object, by name
       * @param [options] Declared options
       * @param [comment] The comment for this enum
       * @param [comments] The value comments for this enum
       */
  def this(name: java.lang.String, values: org.scalablytyped.runtime.StringDictionary[scala.Double], options: org.scalablytyped.runtime.StringDictionary[js.Any], comment: java.lang.String, comments: org.scalablytyped.runtime.StringDictionary[java.lang.String]) = this()
  /** Value comment texts, if any. */
  var comments: org.scalablytyped.runtime.StringDictionary[java.lang.String] = js.native
  /** Reserved ranges, if any. */
  var reserved: js.Array[js.Array[scala.Double] | java.lang.String] = js.native
  /** Enum values by name. */
  var values: org.scalablytyped.runtime.StringDictionary[scala.Double] = js.native
  /** Enum values by id. */
  var valuesById: org.scalablytyped.runtime.NumberDictionary[java.lang.String] = js.native
  /**
       * Adds a value to this enum.
       * @param name Value name
       * @param id Value id
       * @param [comment] Comment, if any
       * @returns `this`
       * @throws {TypeError} If arguments are invalid
       * @throws {Error} If there is already a value with this name or id
       */
  def add(name: java.lang.String, id: scala.Double): Enum = js.native
  /**
       * Adds a value to this enum.
       * @param name Value name
       * @param id Value id
       * @param [comment] Comment, if any
       * @returns `this`
       * @throws {TypeError} If arguments are invalid
       * @throws {Error} If there is already a value with this name or id
       */
  def add(name: java.lang.String, id: scala.Double, comment: java.lang.String): Enum = js.native
  /**
       * Tests if the specified id is reserved.
       * @param id Id to test
       * @returns `true` if reserved, otherwise `false`
       */
  def isReservedId(id: scala.Double): scala.Boolean = js.native
  /**
       * Tests if the specified name is reserved.
       * @param name Name to test
       * @returns `true` if reserved, otherwise `false`
       */
  def isReservedName(name: java.lang.String): scala.Boolean = js.native
  /**
       * Removes a value from this enum
       * @param name Value name
       * @returns `this`
       * @throws {TypeError} If arguments are invalid
       * @throws {Error} If `name` is not a name of this enum
       */
  def remove(name: java.lang.String): Enum = js.native
  /**
       * Converts this enum to an enum descriptor.
       * @param [toJSONOptions] JSON conversion options
       * @returns Enum descriptor
       */
  def toJSON(toJSONOptions: IToJSONOptions): IEnum = js.native
}

@JSImport("protobufjs", "Enum")
@js.native
object Enum extends js.Object {
  /**
       * Constructs an enum from an enum descriptor.
       * @param name Enum name
       * @param json Enum descriptor
       * @returns Created enum
       * @throws {TypeError} If arguments are invalid
       */
  def fromJSON(name: java.lang.String, json: protobufjsLib.protobufjsMod.IEnum): protobufjsLib.protobufjsMod.Enum = js.native
}

