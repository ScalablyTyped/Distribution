package typings
package protobufjsLib.minimalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protobufjs/minimal", "OneOf")
@js.native
class OneOf protected ()
  extends protobufjsLib.protobufjsMod.OneOf {
  /**
    * Constructs a new oneof instance.
    * @param name Oneof name
    * @param [fieldNames] Field names
    * @param [options] Declared options
    * @param [comment] Comment associated with this field
    */
  def this(name: java.lang.String) = this()
  def this(name: java.lang.String, fieldNames: js.Array[java.lang.String]) = this()
  def this(name: java.lang.String, fieldNames: org.scalablytyped.runtime.StringDictionary[js.Any]) = this()
  def this(name: java.lang.String, fieldNames: js.Array[java.lang.String], options: org.scalablytyped.runtime.StringDictionary[js.Any]) = this()
  def this(name: java.lang.String, fieldNames: org.scalablytyped.runtime.StringDictionary[js.Any], options: org.scalablytyped.runtime.StringDictionary[js.Any]) = this()
  def this(name: java.lang.String, fieldNames: js.Array[java.lang.String], options: org.scalablytyped.runtime.StringDictionary[js.Any], comment: java.lang.String) = this()
  def this(name: java.lang.String, fieldNames: org.scalablytyped.runtime.StringDictionary[js.Any], options: org.scalablytyped.runtime.StringDictionary[js.Any], comment: java.lang.String) = this()
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
  def d[T /* <: java.lang.String */](fieldNames: java.lang.String*): protobufjsLib.protobufjsMod.OneOfDecorator = js.native
  /**
    * Constructs a oneof from a oneof descriptor.
    * @param name Oneof name
    * @param json Oneof descriptor
    * @returns Created oneof
    * @throws {TypeError} If arguments are invalid
    */
  def fromJSON(name: java.lang.String, json: protobufjsLib.protobufjsMod.IOneOf): protobufjsLib.protobufjsMod.OneOf = js.native
}

