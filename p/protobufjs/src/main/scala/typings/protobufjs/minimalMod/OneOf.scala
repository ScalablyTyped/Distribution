package typings.protobufjs.minimalMod

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.protobufjsMod.IOneOf
import typings.protobufjs.protobufjsMod.OneOfDecorator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protobufjs/minimal", "OneOf")
@js.native
class OneOf protected ()
  extends typings.protobufjs.protobufjsMod.OneOf {
  /**
    * Constructs a new oneof instance.
    * @param name Oneof name
    * @param [fieldNames] Field names
    * @param [options] Declared options
    * @param [comment] Comment associated with this field
    */
  def this(name: String) = this()
  def this(name: String, fieldNames: js.Array[String]) = this()
  def this(name: String, fieldNames: StringDictionary[js.Any]) = this()
  def this(name: String, fieldNames: js.Array[String], options: StringDictionary[js.Any]) = this()
  def this(name: String, fieldNames: StringDictionary[js.Any], options: StringDictionary[js.Any]) = this()
  def this(name: String, fieldNames: js.Array[String], options: StringDictionary[js.Any], comment: String) = this()
  def this(
    name: String,
    fieldNames: StringDictionary[js.Any],
    options: StringDictionary[js.Any],
    comment: String
  ) = this()
}

/* static members */
@JSImport("protobufjs/minimal", "OneOf")
@js.native
object OneOf extends js.Object {
  /**
    * OneOf decorator (TypeScript).
    * @param fieldNames Field names
    * @returns Decorator function
    */
  def d[T /* <: String */](fieldNames: String*): OneOfDecorator = js.native
  /**
    * Constructs a oneof from a oneof descriptor.
    * @param name Oneof name
    * @param json Oneof descriptor
    * @returns Created oneof
    * @throws {TypeError} If arguments are invalid
    */
  def fromJSON(name: String, json: IOneOf): typings.protobufjs.protobufjsMod.OneOf = js.native
}

