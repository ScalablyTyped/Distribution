package typings.reactNativeJoi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type ExtensionBoundSchema = typings.reactNativeJoi.mod.Schema with typings.reactNativeJoi.anon.CreateError
  
  type LanguageOptions = java.lang.String | scala.Boolean | scala.Null | (org.scalablytyped.runtime.StringDictionary[
    /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias react-native-joi.react-native-joi.LanguageOptions */ js.Object
  ])
  
  type LazySchema = typings.reactNativeJoi.mod.AnySchema
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactNativeJoi.mod.AnySchema
    - typings.reactNativeJoi.mod.ArraySchema
    - typings.reactNativeJoi.mod.AlternativesSchema
    - typings.reactNativeJoi.mod.BinarySchema
    - typings.reactNativeJoi.mod.BooleanSchema
    - typings.reactNativeJoi.mod.DateSchema
    - typings.reactNativeJoi.mod.FunctionSchema
    - typings.reactNativeJoi.mod.NumberSchema
    - typings.reactNativeJoi.mod.ObjectSchema
    - typings.reactNativeJoi.mod.StringSchema
    - typings.reactNativeJoi.mod.LazySchema
  */
  type Schema = typings.reactNativeJoi.mod._Schema | typings.reactNativeJoi.mod.LazySchema
  
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - scala.Double
    - scala.Boolean
    - js.Object
    - scala.Null
    - typings.reactNativeJoi.mod.Schema
    - typings.reactNativeJoi.mod.SchemaMap
  */
  type SchemaLike = typings.reactNativeJoi.mod._SchemaLike | java.lang.String | scala.Double | scala.Boolean | js.Object | scala.Null | typings.reactNativeJoi.mod.LazySchema
  
  type ValidationErrorFunction = js.Function1[
    /* errors */ js.Array[typings.reactNativeJoi.mod.ValidationErrorItem], 
    java.lang.String | typings.reactNativeJoi.mod.ValidationErrorItem | js.Array[typings.reactNativeJoi.mod.ValidationErrorItem] | typings.std.Error
  ]
  
  @scala.inline
  def allow(value: js.Any, values: js.Any*): typings.reactNativeJoi.mod.Schema = (typings.reactNativeJoi.mod.^.asInstanceOf[js.Dynamic].applyDynamic("allow")(value.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[typings.reactNativeJoi.mod.Schema]
  @scala.inline
  def allow(values: js.Array[_]): typings.reactNativeJoi.mod.Schema = typings.reactNativeJoi.mod.^.asInstanceOf[js.Dynamic].applyDynamic("allow")(values.asInstanceOf[js.Any]).asInstanceOf[typings.reactNativeJoi.mod.Schema]
  
  @scala.inline
  def alt(types: typings.reactNativeJoi.mod.SchemaLike*): typings.reactNativeJoi.mod.AlternativesSchema = typings.reactNativeJoi.mod.^.asInstanceOf[js.Dynamic].applyDynamic("alt")(types.asInstanceOf[js.Any]).asInstanceOf[typings.reactNativeJoi.mod.AlternativesSchema]
  @scala.inline
  def alt(types: js.Array[typings.reactNativeJoi.mod.SchemaLike]): typings.reactNativeJoi.mod.AlternativesSchema = typings.reactNativeJoi.mod.^.asInstanceOf[js.Dynamic].applyDynamic("alt")(types.asInstanceOf[js.Any]).asInstanceOf[typings.reactNativeJoi.mod.AlternativesSchema]
  
  @scala.inline
  def alternatives(types: typings.reactNativeJoi.mod.SchemaLike*): typings.reactNativeJoi.mod.AlternativesSchema = typings.reactNativeJoi.mod.^.asInstanceOf[js.Dynamic].applyDynamic("alternatives")(types.asInstanceOf[js.Any]).asInstanceOf[typings.reactNativeJoi.mod.AlternativesSchema]
  @scala.inline
  def alternatives(types: js.Array[typings.reactNativeJoi.mod.SchemaLike]): typings.reactNativeJoi.mod.AlternativesSchema = typings.reactNativeJoi.mod.^.asInstanceOf[js.Dynamic].applyDynamic("alternatives")(types.asInstanceOf[js.Any]).asInstanceOf[typings.reactNativeJoi.mod.AlternativesSchema]
  
  @scala.inline
  def any(): typings.reactNativeJoi.mod.AnySchema = typings.reactNativeJoi.mod.^.asInstanceOf[js.Dynamic].applyDynamic("any")().asInstanceOf[typings.reactNativeJoi.mod.AnySchema]
  
  @scala.inline
  def array(): typings.reactNativeJoi.mod.ArraySchema = typings.reactNativeJoi.mod.^.asInstanceOf[js.Dynamic].applyDynamic("array")().asInstanceOf[typings.reactNativeJoi.mod.ArraySchema]
  
  @scala.inline
  def assert(value: js.Any, schema: typings.reactNativeJoi.mod.SchemaLike): scala.Unit = (typings.reactNativeJoi.mod.^.asInstanceOf[js.Dynamic].applyDynamic("assert")(value.asInstanceOf[js.Any], schema.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def assert(value: js.Any, schema: typings.reactNativeJoi.mod.SchemaLike, message: java.lang.String): scala.Unit = (typings.reactNativeJoi.mod.^.asInstanceOf[js.Dynamic].applyDynamic("assert")(value.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def assert(value: js.Any, schema: typings.reactNativeJoi.mod.SchemaLike, message: typings.std.Error): scala.Unit = (typings.reactNativeJoi.mod.^.asInstanceOf[js.Dynamic].applyDynamic("assert")(value.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def attempt[T](value: T, schema: typings.reactNativeJoi.mod.SchemaLike): T = (typings.reactNativeJoi.mod.^.asInstanceOf[js.Dynamic].applyDynamic("attempt")(value.asInstanceOf[js.Any], schema.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def attempt[T](value: T, schema: typings.reactNativeJoi.mod.SchemaLike, message: java.lang.String): T = (typings.reactNativeJoi.mod.^.asInstanceOf[js.Dynamic].applyDynamic("attempt")(value.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def attempt[T](value: T, schema: typings.reactNativeJoi.mod.SchemaLike, message: typings.std.Error): T = (typings.reactNativeJoi.mod.^.asInstanceOf[js.Dynamic].applyDynamic("attempt")(value.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @scala.inline
  def binary(): typings.reactNativeJoi.mod.BinarySchema = typings.reactNativeJoi.mod.^.asInstanceOf[js.Dynamic].applyDynamic("binary")().asInstanceOf[typings.reactNativeJoi.mod.BinarySchema]
  
  @scala.inline
  def bool(): typings.reactNativeJoi.mod.BooleanSchema = typings.reactNativeJoi.mod.^.asInstanceOf[js.Dynamic].applyDynamic("bool")().asInstanceOf[typings.reactNativeJoi.mod.BooleanSchema]
  
  @scala.inline
  def boolean(): typings.reactNativeJoi.mod.BooleanSchema = typings.reactNativeJoi.mod.^.asInstanceOf[js.Dynamic].applyDynamic("boolean")().asInstanceOf[typings.reactNativeJoi.mod.BooleanSchema]
  
  @scala.inline
  def compile(schema: typings.reactNativeJoi.mod.SchemaLike): typings.reactNativeJoi.mod.Schema = typings.reactNativeJoi.mod.^.asInstanceOf[js.Dynamic].applyDynamic("compile")(schema.asInstanceOf[js.Any]).asInstanceOf[typings.reactNativeJoi.mod.Schema]
  
  @scala.inline
  def concat[T](schema: T): T = typings.reactNativeJoi.mod.^.asInstanceOf[js.Dynamic].applyDynamic("concat")(schema.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def date(): typings.reactNativeJoi.mod.DateSchema = typings.reactNativeJoi.mod.^.asInstanceOf[js.Dynamic].applyDynamic("date")().asInstanceOf[typings.reactNativeJoi.mod.DateSchema]
  
  @scala.inline
  def describe(schema: typings.reactNativeJoi.mod.Schema): typings.reactNativeJoi.mod.Description_ = typings.reactNativeJoi.mod.^.asInstanceOf[js.Dynamic].applyDynamic("describe")(schema.asInstanceOf[js.Any]).asInstanceOf[typings.reactNativeJoi.mod.Description_]
  
  @scala.inline
  def description(desc: java.lang.String): typings.reactNativeJoi.mod.Schema = typings.reactNativeJoi.mod.^.asInstanceOf[js.Dynamic].applyDynamic("description")(desc.asInstanceOf[js.Any]).asInstanceOf[typings.reactNativeJoi.mod.Schema]
  
  @scala.inline
  def disallow(value: js.Any, values: js.Any*): typings.reactNativeJoi.mod.Schema = (typings.reactNativeJoi.mod.^.asInstanceOf[js.Dynamic].applyDynamic("disallow")(value.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[typings.reactNativeJoi.mod.Schema]
  @scala.inline
  def disallow(values: js.Array[_]): typings.reactNativeJoi.mod.Schema = typings.reactNativeJoi.mod.^.asInstanceOf[js.Dynamic].applyDynamic("disallow")(values.asInstanceOf[js.Any]).asInstanceOf[typings.reactNativeJoi.mod.Schema]
  
  @scala.inline
  def empty(): typings.reactNativeJoi.mod.Schema = typings.reactNativeJoi.mod.^.asInstanceOf[js.Dynamic].applyDynamic("empty")().asInstanceOf[typings.reactNativeJoi.mod.Schema]
  @scala.inline
  def empty(schema: js.Any): typings.reactNativeJoi.mod.Schema = typings.reactNativeJoi.mod.^.asInstanceOf[js.Dynamic].applyDynamic("empty")(schema.asInstanceOf[js.Any]).asInstanceOf[typings.reactNativeJoi.mod.Schema]
  
  @scala.inline
  def equal(value: js.Any, values: js.Any*): typings.reactNativeJoi.mod.Schema = (typings.reactNativeJoi.mod.^.asInstanceOf[js.Dynamic].applyDynamic("equal")(value.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[typings.reactNativeJoi.mod.Schema]
  @scala.inline
  def equal(values: js.Array[_]): typings.reactNativeJoi.mod.Schema = typings.reactNativeJoi.mod.^.asInstanceOf[js.Dynamic].applyDynamic("equal")(values.asInstanceOf[js.Any]).asInstanceOf[typings.reactNativeJoi.mod.Schema]
  
  @scala.inline
  def example(value: js.Any): typings.reactNativeJoi.mod.Schema = typings.reactNativeJoi.mod.^.asInstanceOf[js.Dynamic].applyDynamic("example")(value.asInstanceOf[js.Any]).asInstanceOf[typings.reactNativeJoi.mod.Schema]
  
  @scala.inline
  def exist(): typings.reactNativeJoi.mod.Schema = typings.reactNativeJoi.mod.^.asInstanceOf[js.Dynamic].applyDynamic("exist")().asInstanceOf[typings.reactNativeJoi.mod.Schema]
  
  @scala.inline
  def extend(
    extension: js.Array[typings.reactNativeJoi.mod.Extension],
    extensions: (typings.reactNativeJoi.mod.Extension | js.Array[typings.reactNativeJoi.mod.Extension])*
  ): js.Any = (typings.reactNativeJoi.mod.^.asInstanceOf[js.Dynamic].applyDynamic("extend")(extension.asInstanceOf[js.Any], extensions.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def extend(
    extension: typings.reactNativeJoi.mod.Extension,
    extensions: (typings.reactNativeJoi.mod.Extension | js.Array[typings.reactNativeJoi.mod.Extension])*
  ): js.Any = (typings.reactNativeJoi.mod.^.asInstanceOf[js.Dynamic].applyDynamic("extend")(extension.asInstanceOf[js.Any], extensions.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def forbidden(): typings.reactNativeJoi.mod.Schema = typings.reactNativeJoi.mod.^.asInstanceOf[js.Dynamic].applyDynamic("forbidden")().asInstanceOf[typings.reactNativeJoi.mod.Schema]
  
  @scala.inline
  def func(): typings.reactNativeJoi.mod.FunctionSchema = typings.reactNativeJoi.mod.^.asInstanceOf[js.Dynamic].applyDynamic("func")().asInstanceOf[typings.reactNativeJoi.mod.FunctionSchema]
  
  @scala.inline
  def invalid(value: js.Any, values: js.Any*): typings.reactNativeJoi.mod.Schema = (typings.reactNativeJoi.mod.^.asInstanceOf[js.Dynamic].applyDynamic("invalid")(value.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[typings.reactNativeJoi.mod.Schema]
  @scala.inline
  def invalid(values: js.Array[_]): typings.reactNativeJoi.mod.Schema = typings.reactNativeJoi.mod.^.asInstanceOf[js.Dynamic].applyDynamic("invalid")(values.asInstanceOf[js.Any]).asInstanceOf[typings.reactNativeJoi.mod.Schema]
  
  @scala.inline
  def isRef(ref: js.Any): /* is react-native-joi.react-native-joi.Reference */ scala.Boolean = typings.reactNativeJoi.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isRef")(ref.asInstanceOf[js.Any]).asInstanceOf[/* is react-native-joi.react-native-joi.Reference */ scala.Boolean]
  
  @scala.inline
  def label(name: java.lang.String): typings.reactNativeJoi.mod.Schema = typings.reactNativeJoi.mod.^.asInstanceOf[js.Dynamic].applyDynamic("label")(name.asInstanceOf[js.Any]).asInstanceOf[typings.reactNativeJoi.mod.Schema]
  
  @scala.inline
  def `lazy`(cb: js.Function0[typings.reactNativeJoi.mod.Schema]): typings.reactNativeJoi.mod.LazySchema = typings.reactNativeJoi.mod.^.asInstanceOf[js.Dynamic].applyDynamic("lazy")(cb.asInstanceOf[js.Any]).asInstanceOf[typings.reactNativeJoi.mod.LazySchema]
  @scala.inline
  def `lazy`(
    cb: js.Function0[typings.reactNativeJoi.mod.Schema],
    options: typings.reactNativeJoi.mod.LazyOptions
  ): typings.reactNativeJoi.mod.LazySchema = (typings.reactNativeJoi.mod.^.asInstanceOf[js.Dynamic].applyDynamic("lazy")(cb.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.reactNativeJoi.mod.LazySchema]
  
  @scala.inline
  def meta(meta: js.Object): typings.reactNativeJoi.mod.Schema = typings.reactNativeJoi.mod.^.asInstanceOf[js.Dynamic].applyDynamic("meta")(meta.asInstanceOf[js.Any]).asInstanceOf[typings.reactNativeJoi.mod.Schema]
  
  @scala.inline
  def not(value: js.Any, values: js.Any*): typings.reactNativeJoi.mod.Schema = (typings.reactNativeJoi.mod.^.asInstanceOf[js.Dynamic].applyDynamic("not")(value.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[typings.reactNativeJoi.mod.Schema]
  @scala.inline
  def not(values: js.Array[_]): typings.reactNativeJoi.mod.Schema = typings.reactNativeJoi.mod.^.asInstanceOf[js.Dynamic].applyDynamic("not")(values.asInstanceOf[js.Any]).asInstanceOf[typings.reactNativeJoi.mod.Schema]
  
  @scala.inline
  def notes(notes: java.lang.String): typings.reactNativeJoi.mod.Schema = typings.reactNativeJoi.mod.^.asInstanceOf[js.Dynamic].applyDynamic("notes")(notes.asInstanceOf[js.Any]).asInstanceOf[typings.reactNativeJoi.mod.Schema]
  @scala.inline
  def notes(notes: js.Array[java.lang.String]): typings.reactNativeJoi.mod.Schema = typings.reactNativeJoi.mod.^.asInstanceOf[js.Dynamic].applyDynamic("notes")(notes.asInstanceOf[js.Any]).asInstanceOf[typings.reactNativeJoi.mod.Schema]
  
  @scala.inline
  def number(): typings.reactNativeJoi.mod.NumberSchema = typings.reactNativeJoi.mod.^.asInstanceOf[js.Dynamic].applyDynamic("number")().asInstanceOf[typings.reactNativeJoi.mod.NumberSchema]
  
  @scala.inline
  def `object`(): typings.reactNativeJoi.mod.ObjectSchema = typings.reactNativeJoi.mod.^.asInstanceOf[js.Dynamic].applyDynamic("object")().asInstanceOf[typings.reactNativeJoi.mod.ObjectSchema]
  @scala.inline
  def `object`(schema: typings.reactNativeJoi.mod.SchemaMap): typings.reactNativeJoi.mod.ObjectSchema = typings.reactNativeJoi.mod.^.asInstanceOf[js.Dynamic].applyDynamic("object")(schema.asInstanceOf[js.Any]).asInstanceOf[typings.reactNativeJoi.mod.ObjectSchema]
  
  @scala.inline
  def only(value: js.Any, values: js.Any*): typings.reactNativeJoi.mod.Schema = (typings.reactNativeJoi.mod.^.asInstanceOf[js.Dynamic].applyDynamic("only")(value.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[typings.reactNativeJoi.mod.Schema]
  @scala.inline
  def only(values: js.Array[_]): typings.reactNativeJoi.mod.Schema = typings.reactNativeJoi.mod.^.asInstanceOf[js.Dynamic].applyDynamic("only")(values.asInstanceOf[js.Any]).asInstanceOf[typings.reactNativeJoi.mod.Schema]
  
  @scala.inline
  def optional(): typings.reactNativeJoi.mod.Schema = typings.reactNativeJoi.mod.^.asInstanceOf[js.Dynamic].applyDynamic("optional")().asInstanceOf[typings.reactNativeJoi.mod.Schema]
  
  @scala.inline
  def options(options: typings.reactNativeJoi.mod.ValidationOptions): typings.reactNativeJoi.mod.Schema = typings.reactNativeJoi.mod.^.asInstanceOf[js.Dynamic].applyDynamic("options")(options.asInstanceOf[js.Any]).asInstanceOf[typings.reactNativeJoi.mod.Schema]
  
  @scala.inline
  def raw(): typings.reactNativeJoi.mod.Schema = typings.reactNativeJoi.mod.^.asInstanceOf[js.Dynamic].applyDynamic("raw")().asInstanceOf[typings.reactNativeJoi.mod.Schema]
  @scala.inline
  def raw(isRaw: scala.Boolean): typings.reactNativeJoi.mod.Schema = typings.reactNativeJoi.mod.^.asInstanceOf[js.Dynamic].applyDynamic("raw")(isRaw.asInstanceOf[js.Any]).asInstanceOf[typings.reactNativeJoi.mod.Schema]
  
  @scala.inline
  def reach(schema: typings.reactNativeJoi.mod.ObjectSchema, path: java.lang.String): typings.reactNativeJoi.mod.Schema = (typings.reactNativeJoi.mod.^.asInstanceOf[js.Dynamic].applyDynamic("reach")(schema.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[typings.reactNativeJoi.mod.Schema]
  @scala.inline
  def reach(schema: typings.reactNativeJoi.mod.ObjectSchema, path: js.Array[java.lang.String]): typings.reactNativeJoi.mod.Schema = (typings.reactNativeJoi.mod.^.asInstanceOf[js.Dynamic].applyDynamic("reach")(schema.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[typings.reactNativeJoi.mod.Schema]
  
  @scala.inline
  def ref(key: java.lang.String): typings.reactNativeJoi.mod.Reference = typings.reactNativeJoi.mod.^.asInstanceOf[js.Dynamic].applyDynamic("ref")(key.asInstanceOf[js.Any]).asInstanceOf[typings.reactNativeJoi.mod.Reference]
  @scala.inline
  def ref(key: java.lang.String, options: typings.reactNativeJoi.mod.ReferenceOptions): typings.reactNativeJoi.mod.Reference = (typings.reactNativeJoi.mod.^.asInstanceOf[js.Dynamic].applyDynamic("ref")(key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.reactNativeJoi.mod.Reference]
  
  @scala.inline
  def required(): typings.reactNativeJoi.mod.Schema = typings.reactNativeJoi.mod.^.asInstanceOf[js.Dynamic].applyDynamic("required")().asInstanceOf[typings.reactNativeJoi.mod.Schema]
  
  @scala.inline
  def strict(): typings.reactNativeJoi.mod.Schema = typings.reactNativeJoi.mod.^.asInstanceOf[js.Dynamic].applyDynamic("strict")().asInstanceOf[typings.reactNativeJoi.mod.Schema]
  @scala.inline
  def strict(isStrict: scala.Boolean): typings.reactNativeJoi.mod.Schema = typings.reactNativeJoi.mod.^.asInstanceOf[js.Dynamic].applyDynamic("strict")(isStrict.asInstanceOf[js.Any]).asInstanceOf[typings.reactNativeJoi.mod.Schema]
  
  @scala.inline
  def string(): typings.reactNativeJoi.mod.StringSchema = typings.reactNativeJoi.mod.^.asInstanceOf[js.Dynamic].applyDynamic("string")().asInstanceOf[typings.reactNativeJoi.mod.StringSchema]
  
  @scala.inline
  def strip(): typings.reactNativeJoi.mod.Schema = typings.reactNativeJoi.mod.^.asInstanceOf[js.Dynamic].applyDynamic("strip")().asInstanceOf[typings.reactNativeJoi.mod.Schema]
  
  @scala.inline
  def symbol(): typings.reactNativeJoi.mod.SymbolSchema = typings.reactNativeJoi.mod.^.asInstanceOf[js.Dynamic].applyDynamic("symbol")().asInstanceOf[typings.reactNativeJoi.mod.SymbolSchema]
  
  @scala.inline
  def tags(notes: java.lang.String): typings.reactNativeJoi.mod.Schema = typings.reactNativeJoi.mod.^.asInstanceOf[js.Dynamic].applyDynamic("tags")(notes.asInstanceOf[js.Any]).asInstanceOf[typings.reactNativeJoi.mod.Schema]
  @scala.inline
  def tags(notes: js.Array[java.lang.String]): typings.reactNativeJoi.mod.Schema = typings.reactNativeJoi.mod.^.asInstanceOf[js.Dynamic].applyDynamic("tags")(notes.asInstanceOf[js.Any]).asInstanceOf[typings.reactNativeJoi.mod.Schema]
  
  @scala.inline
  def unit(name: java.lang.String): typings.reactNativeJoi.mod.Schema = typings.reactNativeJoi.mod.^.asInstanceOf[js.Dynamic].applyDynamic("unit")(name.asInstanceOf[js.Any]).asInstanceOf[typings.reactNativeJoi.mod.Schema]
  
  @scala.inline
  def valid(value: js.Any, values: js.Any*): typings.reactNativeJoi.mod.Schema = (typings.reactNativeJoi.mod.^.asInstanceOf[js.Dynamic].applyDynamic("valid")(value.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[typings.reactNativeJoi.mod.Schema]
  @scala.inline
  def valid(values: js.Array[_]): typings.reactNativeJoi.mod.Schema = typings.reactNativeJoi.mod.^.asInstanceOf[js.Dynamic].applyDynamic("valid")(values.asInstanceOf[js.Any]).asInstanceOf[typings.reactNativeJoi.mod.Schema]
  
  @scala.inline
  def validate[T](value: T, schema: typings.reactNativeJoi.mod.SchemaLike): typings.reactNativeJoi.mod.ValidationResult[T] = (typings.reactNativeJoi.mod.^.asInstanceOf[js.Dynamic].applyDynamic("validate")(value.asInstanceOf[js.Any], schema.asInstanceOf[js.Any])).asInstanceOf[typings.reactNativeJoi.mod.ValidationResult[T]]
  @scala.inline
  def validate[T](
    value: T,
    schema: typings.reactNativeJoi.mod.SchemaLike,
    options: typings.reactNativeJoi.mod.ValidationOptions
  ): typings.reactNativeJoi.mod.ValidationResult[T] = (typings.reactNativeJoi.mod.^.asInstanceOf[js.Dynamic].applyDynamic("validate")(value.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.reactNativeJoi.mod.ValidationResult[T]]
  @scala.inline
  def validate[T, R](
    value: T,
    schema: typings.reactNativeJoi.mod.SchemaLike,
    callback: js.Function2[/* err */ typings.reactNativeJoi.mod.ValidationError, /* value */ T, R]
  ): R = (typings.reactNativeJoi.mod.^.asInstanceOf[js.Dynamic].applyDynamic("validate")(value.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[R]
  @scala.inline
  def validate[T, R](
    value: T,
    schema: typings.reactNativeJoi.mod.SchemaLike,
    options: typings.reactNativeJoi.mod.ValidationOptions,
    callback: js.Function2[/* err */ typings.reactNativeJoi.mod.ValidationError, /* value */ T, R]
  ): R = (typings.reactNativeJoi.mod.^.asInstanceOf[js.Dynamic].applyDynamic("validate")(value.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[R]
  
  @scala.inline
  def version: java.lang.String = typings.reactNativeJoi.mod.^.asInstanceOf[js.Dynamic].selectDynamic("version").asInstanceOf[java.lang.String]
  
  @scala.inline
  def when(ref: java.lang.String, options: typings.reactNativeJoi.mod.WhenOptions): typings.reactNativeJoi.mod.AlternativesSchema = (typings.reactNativeJoi.mod.^.asInstanceOf[js.Dynamic].applyDynamic("when")(ref.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.reactNativeJoi.mod.AlternativesSchema]
  @scala.inline
  def when(ref: typings.reactNativeJoi.mod.Reference, options: typings.reactNativeJoi.mod.WhenOptions): typings.reactNativeJoi.mod.AlternativesSchema = (typings.reactNativeJoi.mod.^.asInstanceOf[js.Dynamic].applyDynamic("when")(ref.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.reactNativeJoi.mod.AlternativesSchema]
  @scala.inline
  def when(ref: typings.reactNativeJoi.mod.Schema, options: typings.reactNativeJoi.mod.WhenSchemaOptions): typings.reactNativeJoi.mod.AlternativesSchema = (typings.reactNativeJoi.mod.^.asInstanceOf[js.Dynamic].applyDynamic("when")(ref.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.reactNativeJoi.mod.AlternativesSchema]
}
