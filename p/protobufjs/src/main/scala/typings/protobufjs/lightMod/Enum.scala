package typings.protobufjs.lightMod

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IEnum
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("protobufjs/light", "Enum")
@js.native
class Enum protected ()
  extends typings.protobufjs.mod.Enum {
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
  def this(name: String, values: StringDictionary[Double], options: StringDictionary[js.Any]) = this()
  def this(name: String, values: Unit, options: StringDictionary[js.Any]) = this()
  def this(name: String, values: StringDictionary[Double], options: StringDictionary[js.Any], comment: String) = this()
  def this(name: String, values: StringDictionary[Double], options: Unit, comment: String) = this()
  def this(name: String, values: Unit, options: StringDictionary[js.Any], comment: String) = this()
  def this(name: String, values: Unit, options: Unit, comment: String) = this()
  def this(
    name: String,
    values: StringDictionary[Double],
    options: StringDictionary[js.Any],
    comment: String,
    comments: StringDictionary[String]
  ) = this()
  def this(
    name: String,
    values: StringDictionary[Double],
    options: StringDictionary[js.Any],
    comment: Unit,
    comments: StringDictionary[String]
  ) = this()
  def this(
    name: String,
    values: StringDictionary[Double],
    options: Unit,
    comment: String,
    comments: StringDictionary[String]
  ) = this()
  def this(
    name: String,
    values: StringDictionary[Double],
    options: Unit,
    comment: Unit,
    comments: StringDictionary[String]
  ) = this()
  def this(
    name: String,
    values: Unit,
    options: StringDictionary[js.Any],
    comment: String,
    comments: StringDictionary[String]
  ) = this()
  def this(
    name: String,
    values: Unit,
    options: StringDictionary[js.Any],
    comment: Unit,
    comments: StringDictionary[String]
  ) = this()
  def this(name: String, values: Unit, options: Unit, comment: String, comments: StringDictionary[String]) = this()
  def this(name: String, values: Unit, options: Unit, comment: Unit, comments: StringDictionary[String]) = this()
}
/* static members */
object Enum {
  
  @JSImport("protobufjs/light", "Enum")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Constructs an enum from an enum descriptor.
    * @param name Enum name
    * @param json Enum descriptor
    * @returns Created enum
    * @throws {TypeError} If arguments are invalid
    */
  @scala.inline
  def fromJSON(name: String, json: IEnum): typings.protobufjs.mod.Enum = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(name.asInstanceOf[js.Any], json.asInstanceOf[js.Any])).asInstanceOf[typings.protobufjs.mod.Enum]
}
