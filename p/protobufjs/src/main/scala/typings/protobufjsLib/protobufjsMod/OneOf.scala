package typings
package protobufjsLib.protobufjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protobufjs", "OneOf")
@js.native
class OneOf protected () extends ReflectionObject {
  /**
       * Constructs a new oneof instance.
       * @param name Oneof name
       * @param [fieldNames] Field names
       * @param [options] Declared options
       * @param [comment] Comment associated with this field
       */
  def this(name: java.lang.String) = this()
  /**
       * Constructs a new oneof instance.
       * @param name Oneof name
       * @param [fieldNames] Field names
       * @param [options] Declared options
       * @param [comment] Comment associated with this field
       */
  def this(name: java.lang.String, fieldNames: js.Array[java.lang.String]) = this()
  /**
       * Constructs a new oneof instance.
       * @param name Oneof name
       * @param [fieldNames] Field names
       * @param [options] Declared options
       * @param [comment] Comment associated with this field
       */
  def this(name: java.lang.String, fieldNames: org.scalablytyped.runtime.StringDictionary[js.Any]) = this()
  /**
       * Constructs a new oneof instance.
       * @param name Oneof name
       * @param [fieldNames] Field names
       * @param [options] Declared options
       * @param [comment] Comment associated with this field
       */
  def this(name: java.lang.String, fieldNames: js.Array[java.lang.String], options: org.scalablytyped.runtime.StringDictionary[js.Any]) = this()
  /**
       * Constructs a new oneof instance.
       * @param name Oneof name
       * @param [fieldNames] Field names
       * @param [options] Declared options
       * @param [comment] Comment associated with this field
       */
  def this(name: java.lang.String, fieldNames: org.scalablytyped.runtime.StringDictionary[js.Any], options: org.scalablytyped.runtime.StringDictionary[js.Any]) = this()
  /**
       * Constructs a new oneof instance.
       * @param name Oneof name
       * @param [fieldNames] Field names
       * @param [options] Declared options
       * @param [comment] Comment associated with this field
       */
  def this(name: java.lang.String, fieldNames: js.Array[java.lang.String], options: org.scalablytyped.runtime.StringDictionary[js.Any], comment: java.lang.String) = this()
  /**
       * Constructs a new oneof instance.
       * @param name Oneof name
       * @param [fieldNames] Field names
       * @param [options] Declared options
       * @param [comment] Comment associated with this field
       */
  def this(name: java.lang.String, fieldNames: org.scalablytyped.runtime.StringDictionary[js.Any], options: org.scalablytyped.runtime.StringDictionary[js.Any], comment: java.lang.String) = this()
  /** Fields that belong to this oneof as an array for iteration. */
  val fieldsArray: js.Array[Field] = js.native
  /** Field names that belong to this oneof. */
  var oneof: js.Array[java.lang.String] = js.native
  /**
       * Adds a field to this oneof and removes it from its current parent, if any.
       * @param field Field to add
       * @returns `this`
       */
  def add(field: Field): OneOf = js.native
  /**
       * Removes a field from this oneof and puts it back to the oneof's parent.
       * @param field Field to remove
       * @returns `this`
       */
  def remove(field: Field): OneOf = js.native
  /**
       * Converts this oneof to a oneof descriptor.
       * @param [toJSONOptions] JSON conversion options
       * @returns Oneof descriptor
       */
  def toJSON(toJSONOptions: IToJSONOptions): IOneOf = js.native
}

@JSImport("protobufjs", "OneOf")
@js.native
object OneOf extends js.Object {
  /**
       * OneOf decorator (TypeScript).
       * @param fieldNames Field names
       * @returns Decorator function
       */
  def d[T /* <: java.lang.String */](fieldNames: java.lang.String*): protobufjsLib.OneOfDecorator = js.native
  /**
       * Constructs a oneof from a oneof descriptor.
       * @param name Oneof name
       * @param json Oneof descriptor
       * @returns Created oneof
       * @throws {TypeError} If arguments are invalid
       */
  def fromJSON(name: java.lang.String, json: protobufjsLib.protobufjsMod.IOneOf): protobufjsLib.protobufjsMod.OneOf = js.native
}

