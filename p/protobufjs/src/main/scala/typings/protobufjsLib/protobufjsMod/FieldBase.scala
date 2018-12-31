package typings
package protobufjsLib.protobufjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protobufjs", "FieldBase")
@js.native
class FieldBase protected () extends ReflectionObject {
  /**
    * Not an actual constructor. Use {@link Field} instead.
    * @param name Unique name within its namespace
    * @param id Unique id within its namespace
    * @param type Value type
    * @param [rule="optional"] Field rule
    * @param [extend] Extended type if different from parent
    * @param [options] Declared options
    * @param [comment] Comment associated with this field
    */
  def this(name: java.lang.String, id: scala.Double, `type`: java.lang.String) = this()
  def this(name: java.lang.String, id: scala.Double, `type`: java.lang.String, rule: java.lang.String) = this()
  def this(name: java.lang.String, id: scala.Double, `type`: java.lang.String, rule: org.scalablytyped.runtime.StringDictionary[js.Any]) = this()
  def this(name: java.lang.String, id: scala.Double, `type`: java.lang.String, rule: java.lang.String, extend: java.lang.String) = this()
  def this(name: java.lang.String, id: scala.Double, `type`: java.lang.String, rule: java.lang.String, extend: org.scalablytyped.runtime.StringDictionary[js.Any]) = this()
  def this(name: java.lang.String, id: scala.Double, `type`: java.lang.String, rule: org.scalablytyped.runtime.StringDictionary[js.Any], extend: java.lang.String) = this()
  def this(name: java.lang.String, id: scala.Double, `type`: java.lang.String, rule: org.scalablytyped.runtime.StringDictionary[js.Any], extend: org.scalablytyped.runtime.StringDictionary[js.Any]) = this()
  def this(name: java.lang.String, id: scala.Double, `type`: java.lang.String, rule: java.lang.String, extend: java.lang.String, options: org.scalablytyped.runtime.StringDictionary[js.Any]) = this()
  def this(name: java.lang.String, id: scala.Double, `type`: java.lang.String, rule: java.lang.String, extend: org.scalablytyped.runtime.StringDictionary[js.Any], options: org.scalablytyped.runtime.StringDictionary[js.Any]) = this()
  def this(name: java.lang.String, id: scala.Double, `type`: java.lang.String, rule: org.scalablytyped.runtime.StringDictionary[js.Any], extend: java.lang.String, options: org.scalablytyped.runtime.StringDictionary[js.Any]) = this()
  def this(name: java.lang.String, id: scala.Double, `type`: java.lang.String, rule: org.scalablytyped.runtime.StringDictionary[js.Any], extend: org.scalablytyped.runtime.StringDictionary[js.Any], options: org.scalablytyped.runtime.StringDictionary[js.Any]) = this()
  def this(name: java.lang.String, id: scala.Double, `type`: java.lang.String, rule: java.lang.String, extend: java.lang.String, options: org.scalablytyped.runtime.StringDictionary[js.Any], comment: java.lang.String) = this()
  def this(name: java.lang.String, id: scala.Double, `type`: java.lang.String, rule: java.lang.String, extend: org.scalablytyped.runtime.StringDictionary[js.Any], options: org.scalablytyped.runtime.StringDictionary[js.Any], comment: java.lang.String) = this()
  def this(name: java.lang.String, id: scala.Double, `type`: java.lang.String, rule: org.scalablytyped.runtime.StringDictionary[js.Any], extend: java.lang.String, options: org.scalablytyped.runtime.StringDictionary[js.Any], comment: java.lang.String) = this()
  def this(name: java.lang.String, id: scala.Double, `type`: java.lang.String, rule: org.scalablytyped.runtime.StringDictionary[js.Any], extend: org.scalablytyped.runtime.StringDictionary[js.Any], options: org.scalablytyped.runtime.StringDictionary[js.Any], comment: java.lang.String) = this()
  /** Whether this field's value is a buffer. */
  var bytes: scala.Boolean = js.native
  /** Sister-field within the declaring namespace if an extended field. */
  var declaringField: Field | scala.Null = js.native
  /** The field's default value on prototypes. */
  var defaultValue: js.Any = js.native
  /** Extended type if different from parent. */
  var extend: js.UndefOr[java.lang.String] = js.native
  /** Sister-field within the extended type if a declaring extension field. */
  var extensionField: Field | scala.Null = js.native
  /** Unique field id. */
  var id: scala.Double = js.native
  /** Whether this field's value should be treated as a long. */
  var long: scala.Boolean = js.native
  /** Whether this field is a map or not. */
  var map: scala.Boolean = js.native
  /** Message this field belongs to. */
  var message: Type | scala.Null = js.native
  /** Whether this field is optional. */
  var optional: scala.Boolean = js.native
  /** OneOf this field belongs to, if any, */
  var partOf: OneOf | scala.Null = js.native
  /** Whether this field is repeated. */
  var repeated: scala.Boolean = js.native
  /** Whether this field is required. */
  var required: scala.Boolean = js.native
  /** Resolved type if not a basic type. */
  var resolvedType: Type | Enum | scala.Null = js.native
  /** Field rule, if any. */
  var rule: js.UndefOr[java.lang.String] = js.native
  /** Field type. */
  var `type`: java.lang.String = js.native
  /** The field type's default value. */
  var typeDefault: js.Any = js.native
  def toJSON(toJSONOptions: IToJSONOptions): IField = js.native
}

