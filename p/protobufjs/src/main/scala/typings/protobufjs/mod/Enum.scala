package typings.protobufjs.mod

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
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
  def this(name: String) = this()
  def this(name: String, values: StringDictionary[Double]) = this()
  def this(name: String, values: js.UndefOr[scala.Nothing], options: StringDictionary[js.Any]) = this()
  def this(name: String, values: StringDictionary[Double], options: StringDictionary[js.Any]) = this()
  def this(
    name: String,
    values: js.UndefOr[scala.Nothing],
    options: js.UndefOr[scala.Nothing],
    comment: String
  ) = this()
  def this(
    name: String,
    values: js.UndefOr[scala.Nothing],
    options: StringDictionary[js.Any],
    comment: String
  ) = this()
  def this(
    name: String,
    values: StringDictionary[Double],
    options: js.UndefOr[scala.Nothing],
    comment: String
  ) = this()
  def this(name: String, values: StringDictionary[Double], options: StringDictionary[js.Any], comment: String) = this()
  def this(
    name: String,
    values: js.UndefOr[scala.Nothing],
    options: js.UndefOr[scala.Nothing],
    comment: js.UndefOr[scala.Nothing],
    comments: StringDictionary[String]
  ) = this()
  def this(
    name: String,
    values: js.UndefOr[scala.Nothing],
    options: js.UndefOr[scala.Nothing],
    comment: String,
    comments: StringDictionary[String]
  ) = this()
  def this(
    name: String,
    values: js.UndefOr[scala.Nothing],
    options: StringDictionary[js.Any],
    comment: js.UndefOr[scala.Nothing],
    comments: StringDictionary[String]
  ) = this()
  def this(
    name: String,
    values: js.UndefOr[scala.Nothing],
    options: StringDictionary[js.Any],
    comment: String,
    comments: StringDictionary[String]
  ) = this()
  def this(
    name: String,
    values: StringDictionary[Double],
    options: js.UndefOr[scala.Nothing],
    comment: js.UndefOr[scala.Nothing],
    comments: StringDictionary[String]
  ) = this()
  def this(
    name: String,
    values: StringDictionary[Double],
    options: js.UndefOr[scala.Nothing],
    comment: String,
    comments: StringDictionary[String]
  ) = this()
  def this(
    name: String,
    values: StringDictionary[Double],
    options: StringDictionary[js.Any],
    comment: js.UndefOr[scala.Nothing],
    comments: StringDictionary[String]
  ) = this()
  def this(
    name: String,
    values: StringDictionary[Double],
    options: StringDictionary[js.Any],
    comment: String,
    comments: StringDictionary[String]
  ) = this()
  /** Value comment texts, if any. */
  var comments: StringDictionary[String] = js.native
  /** Reserved ranges, if any. */
  var reserved: js.Array[js.Array[Double] | String] = js.native
  /** Enum values by name. */
  var values: StringDictionary[Double] = js.native
  /** Enum values by id. */
  var valuesById: NumberDictionary[String] = js.native
  /**
    * Adds a value to this enum.
    * @param name Value name
    * @param id Value id
    * @param [comment] Comment, if any
    * @returns `this`
    * @throws {TypeError} If arguments are invalid
    * @throws {Error} If there is already a value with this name or id
    */
  def add(name: String, id: Double): Enum = js.native
  def add(name: String, id: Double, comment: String): Enum = js.native
  /**
    * Tests if the specified id is reserved.
    * @param id Id to test
    * @returns `true` if reserved, otherwise `false`
    */
  def isReservedId(id: Double): Boolean = js.native
  /**
    * Tests if the specified name is reserved.
    * @param name Name to test
    * @returns `true` if reserved, otherwise `false`
    */
  def isReservedName(name: String): Boolean = js.native
  /**
    * Removes a value from this enum
    * @param name Value name
    * @returns `this`
    * @throws {TypeError} If arguments are invalid
    * @throws {Error} If `name` is not a name of this enum
    */
  def remove(name: String): Enum = js.native
  def toJSON(toJSONOptions: IToJSONOptions): IEnum = js.native
}

/* static members */
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
  def fromJSON(name: String, json: IEnum): Enum = js.native
}

