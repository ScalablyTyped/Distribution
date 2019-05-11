package typings
package protobufjsLib.lightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protobufjs/light", "Enum")
@js.native
class Enum protected ()
  extends protobufjsLib.protobufjsMod.Enum {
  /**
    * Constructs a new enum instance.
    * @param name Unique name within its namespace
    * @param [values] Enum values as an object, by name
    * @param [options] Declared options
    * @param [comment] The comment for this enum
    * @param [comments] The value comments for this enum
    */
  def this(name: java.lang.String) = this()
  def this(name: java.lang.String, values: org.scalablytyped.runtime.StringDictionary[scala.Double]) = this()
  def this(name: java.lang.String, values: org.scalablytyped.runtime.StringDictionary[scala.Double], options: org.scalablytyped.runtime.StringDictionary[js.Any]) = this()
  def this(name: java.lang.String, values: org.scalablytyped.runtime.StringDictionary[scala.Double], options: org.scalablytyped.runtime.StringDictionary[js.Any], comment: java.lang.String) = this()
  def this(name: java.lang.String, values: org.scalablytyped.runtime.StringDictionary[scala.Double], options: org.scalablytyped.runtime.StringDictionary[js.Any], comment: java.lang.String, comments: org.scalablytyped.runtime.StringDictionary[java.lang.String]) = this()
}

/* static members */
@JSImport("protobufjs/light", "Enum")
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

