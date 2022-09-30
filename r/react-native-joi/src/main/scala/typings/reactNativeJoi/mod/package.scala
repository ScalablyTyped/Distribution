package typings.reactNativeJoi.mod

import org.scalablytyped.runtime.StringDictionary
import typings.reactNativeJoi.anon.CreateError
import typings.reactNativeJoi.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def allow(value: Any, values: Any*): Schema = ^.asInstanceOf[js.Dynamic].applyDynamic("allow")(scala.List(value.asInstanceOf[js.Any]).`++`(values.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Schema]
inline def allow(values: js.Array[Any]): Schema = ^.asInstanceOf[js.Dynamic].applyDynamic("allow")(values.asInstanceOf[js.Any]).asInstanceOf[Schema]

inline def alt(types: SchemaLike*): AlternativesSchema = ^.asInstanceOf[js.Dynamic].applyDynamic("alt")(types.asInstanceOf[Seq[js.Any]]*).asInstanceOf[AlternativesSchema]
inline def alt(types: js.Array[SchemaLike]): AlternativesSchema = ^.asInstanceOf[js.Dynamic].applyDynamic("alt")(types.asInstanceOf[js.Any]).asInstanceOf[AlternativesSchema]

inline def alternatives(types: SchemaLike*): AlternativesSchema = ^.asInstanceOf[js.Dynamic].applyDynamic("alternatives")(types.asInstanceOf[Seq[js.Any]]*).asInstanceOf[AlternativesSchema]
inline def alternatives(types: js.Array[SchemaLike]): AlternativesSchema = ^.asInstanceOf[js.Dynamic].applyDynamic("alternatives")(types.asInstanceOf[js.Any]).asInstanceOf[AlternativesSchema]

inline def any(): AnySchema = ^.asInstanceOf[js.Dynamic].applyDynamic("any")().asInstanceOf[AnySchema]

inline def array(): ArraySchema = ^.asInstanceOf[js.Dynamic].applyDynamic("array")().asInstanceOf[ArraySchema]

inline def assert(value: Any, schema: SchemaLike): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assert")(value.asInstanceOf[js.Any], schema.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assert(value: Any, schema: SchemaLike, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assert")(value.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assert(value: Any, schema: SchemaLike, message: js.Error): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assert")(value.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def attempt[T](value: T, schema: SchemaLike): T = (^.asInstanceOf[js.Dynamic].applyDynamic("attempt")(value.asInstanceOf[js.Any], schema.asInstanceOf[js.Any])).asInstanceOf[T]
inline def attempt[T](value: T, schema: SchemaLike, message: String): T = (^.asInstanceOf[js.Dynamic].applyDynamic("attempt")(value.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[T]
inline def attempt[T](value: T, schema: SchemaLike, message: js.Error): T = (^.asInstanceOf[js.Dynamic].applyDynamic("attempt")(value.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[T]

inline def binary(): BinarySchema = ^.asInstanceOf[js.Dynamic].applyDynamic("binary")().asInstanceOf[BinarySchema]

inline def bool(): BooleanSchema = ^.asInstanceOf[js.Dynamic].applyDynamic("bool")().asInstanceOf[BooleanSchema]

inline def boolean(): BooleanSchema = ^.asInstanceOf[js.Dynamic].applyDynamic("boolean")().asInstanceOf[BooleanSchema]

inline def compile(schema: SchemaLike): Schema = ^.asInstanceOf[js.Dynamic].applyDynamic("compile")(schema.asInstanceOf[js.Any]).asInstanceOf[Schema]

inline def concat[T](schema: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("concat")(schema.asInstanceOf[js.Any]).asInstanceOf[T]

inline def date(): DateSchema = ^.asInstanceOf[js.Dynamic].applyDynamic("date")().asInstanceOf[DateSchema]

inline def describe(schema: Schema): Description_ = ^.asInstanceOf[js.Dynamic].applyDynamic("describe")(schema.asInstanceOf[js.Any]).asInstanceOf[Description_]

inline def description(desc: String): Schema = ^.asInstanceOf[js.Dynamic].applyDynamic("description")(desc.asInstanceOf[js.Any]).asInstanceOf[Schema]

inline def disallow(value: Any, values: Any*): Schema = ^.asInstanceOf[js.Dynamic].applyDynamic("disallow")(scala.List(value.asInstanceOf[js.Any]).`++`(values.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Schema]
inline def disallow(values: js.Array[Any]): Schema = ^.asInstanceOf[js.Dynamic].applyDynamic("disallow")(values.asInstanceOf[js.Any]).asInstanceOf[Schema]

inline def empty(): Schema = ^.asInstanceOf[js.Dynamic].applyDynamic("empty")().asInstanceOf[Schema]
inline def empty(schema: Any): Schema = ^.asInstanceOf[js.Dynamic].applyDynamic("empty")(schema.asInstanceOf[js.Any]).asInstanceOf[Schema]

inline def equal(value: Any, values: Any*): Schema = ^.asInstanceOf[js.Dynamic].applyDynamic("equal")(scala.List(value.asInstanceOf[js.Any]).`++`(values.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Schema]
inline def equal(values: js.Array[Any]): Schema = ^.asInstanceOf[js.Dynamic].applyDynamic("equal")(values.asInstanceOf[js.Any]).asInstanceOf[Schema]

inline def example(value: Any): Schema = ^.asInstanceOf[js.Dynamic].applyDynamic("example")(value.asInstanceOf[js.Any]).asInstanceOf[Schema]

inline def exist(): Schema = ^.asInstanceOf[js.Dynamic].applyDynamic("exist")().asInstanceOf[Schema]

inline def extend(`extension`: js.Array[Extension], extensions: (Extension | js.Array[Extension])*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(scala.List(`extension`.asInstanceOf[js.Any]).`++`(extensions.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Any]
inline def extend(`extension`: Extension, extensions: (Extension | js.Array[Extension])*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(scala.List(`extension`.asInstanceOf[js.Any]).`++`(extensions.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Any]

inline def forbidden(): Schema = ^.asInstanceOf[js.Dynamic].applyDynamic("forbidden")().asInstanceOf[Schema]

inline def func(): FunctionSchema = ^.asInstanceOf[js.Dynamic].applyDynamic("func")().asInstanceOf[FunctionSchema]

inline def invalid(value: Any, values: Any*): Schema = ^.asInstanceOf[js.Dynamic].applyDynamic("invalid")(scala.List(value.asInstanceOf[js.Any]).`++`(values.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Schema]
inline def invalid(values: js.Array[Any]): Schema = ^.asInstanceOf[js.Dynamic].applyDynamic("invalid")(values.asInstanceOf[js.Any]).asInstanceOf[Schema]

inline def isRef(ref: Any): /* is react-native-joi.react-native-joi.Reference */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRef")(ref.asInstanceOf[js.Any]).asInstanceOf[/* is react-native-joi.react-native-joi.Reference */ Boolean]

inline def label(name: String): Schema = ^.asInstanceOf[js.Dynamic].applyDynamic("label")(name.asInstanceOf[js.Any]).asInstanceOf[Schema]

inline def `lazy`(cb: js.Function0[Schema]): LazySchema = ^.asInstanceOf[js.Dynamic].applyDynamic("lazy")(cb.asInstanceOf[js.Any]).asInstanceOf[LazySchema]
inline def `lazy`(cb: js.Function0[Schema], options: LazyOptions): LazySchema = (^.asInstanceOf[js.Dynamic].applyDynamic("lazy")(cb.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[LazySchema]

inline def meta(meta: js.Object): Schema = ^.asInstanceOf[js.Dynamic].applyDynamic("meta")(meta.asInstanceOf[js.Any]).asInstanceOf[Schema]

inline def not(value: Any, values: Any*): Schema = ^.asInstanceOf[js.Dynamic].applyDynamic("not")(scala.List(value.asInstanceOf[js.Any]).`++`(values.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Schema]
inline def not(values: js.Array[Any]): Schema = ^.asInstanceOf[js.Dynamic].applyDynamic("not")(values.asInstanceOf[js.Any]).asInstanceOf[Schema]

inline def notes(notes: String): Schema = ^.asInstanceOf[js.Dynamic].applyDynamic("notes")(notes.asInstanceOf[js.Any]).asInstanceOf[Schema]
inline def notes(notes: js.Array[String]): Schema = ^.asInstanceOf[js.Dynamic].applyDynamic("notes")(notes.asInstanceOf[js.Any]).asInstanceOf[Schema]

inline def number(): NumberSchema = ^.asInstanceOf[js.Dynamic].applyDynamic("number")().asInstanceOf[NumberSchema]

inline def `object`(): ObjectSchema = ^.asInstanceOf[js.Dynamic].applyDynamic("object")().asInstanceOf[ObjectSchema]
inline def `object`(schema: SchemaMap): ObjectSchema = ^.asInstanceOf[js.Dynamic].applyDynamic("object")(schema.asInstanceOf[js.Any]).asInstanceOf[ObjectSchema]

inline def only(value: Any, values: Any*): Schema = ^.asInstanceOf[js.Dynamic].applyDynamic("only")(scala.List(value.asInstanceOf[js.Any]).`++`(values.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Schema]
inline def only(values: js.Array[Any]): Schema = ^.asInstanceOf[js.Dynamic].applyDynamic("only")(values.asInstanceOf[js.Any]).asInstanceOf[Schema]

inline def optional(): Schema = ^.asInstanceOf[js.Dynamic].applyDynamic("optional")().asInstanceOf[Schema]

inline def options(options: ValidationOptions): Schema = ^.asInstanceOf[js.Dynamic].applyDynamic("options")(options.asInstanceOf[js.Any]).asInstanceOf[Schema]

inline def raw(): Schema = ^.asInstanceOf[js.Dynamic].applyDynamic("raw")().asInstanceOf[Schema]
inline def raw(isRaw: Boolean): Schema = ^.asInstanceOf[js.Dynamic].applyDynamic("raw")(isRaw.asInstanceOf[js.Any]).asInstanceOf[Schema]

inline def reach(schema: ObjectSchema, path: String): Schema = (^.asInstanceOf[js.Dynamic].applyDynamic("reach")(schema.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[Schema]
inline def reach(schema: ObjectSchema, path: js.Array[String]): Schema = (^.asInstanceOf[js.Dynamic].applyDynamic("reach")(schema.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[Schema]

inline def ref(key: String): Reference = ^.asInstanceOf[js.Dynamic].applyDynamic("ref")(key.asInstanceOf[js.Any]).asInstanceOf[Reference]
inline def ref(key: String, options: ReferenceOptions): Reference = (^.asInstanceOf[js.Dynamic].applyDynamic("ref")(key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Reference]

inline def required(): Schema = ^.asInstanceOf[js.Dynamic].applyDynamic("required")().asInstanceOf[Schema]

inline def strict(): Schema = ^.asInstanceOf[js.Dynamic].applyDynamic("strict")().asInstanceOf[Schema]
inline def strict(isStrict: Boolean): Schema = ^.asInstanceOf[js.Dynamic].applyDynamic("strict")(isStrict.asInstanceOf[js.Any]).asInstanceOf[Schema]

inline def string(): StringSchema = ^.asInstanceOf[js.Dynamic].applyDynamic("string")().asInstanceOf[StringSchema]

inline def strip(): Schema = ^.asInstanceOf[js.Dynamic].applyDynamic("strip")().asInstanceOf[Schema]

inline def symbol(): SymbolSchema = ^.asInstanceOf[js.Dynamic].applyDynamic("symbol")().asInstanceOf[SymbolSchema]

inline def tags(notes: String): Schema = ^.asInstanceOf[js.Dynamic].applyDynamic("tags")(notes.asInstanceOf[js.Any]).asInstanceOf[Schema]
inline def tags(notes: js.Array[String]): Schema = ^.asInstanceOf[js.Dynamic].applyDynamic("tags")(notes.asInstanceOf[js.Any]).asInstanceOf[Schema]

inline def unit(name: String): Schema = ^.asInstanceOf[js.Dynamic].applyDynamic("unit")(name.asInstanceOf[js.Any]).asInstanceOf[Schema]

inline def valid(value: Any, values: Any*): Schema = ^.asInstanceOf[js.Dynamic].applyDynamic("valid")(scala.List(value.asInstanceOf[js.Any]).`++`(values.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Schema]
inline def valid(values: js.Array[Any]): Schema = ^.asInstanceOf[js.Dynamic].applyDynamic("valid")(values.asInstanceOf[js.Any]).asInstanceOf[Schema]

inline def validate[T](value: T, schema: SchemaLike): ValidationResult[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("validate")(value.asInstanceOf[js.Any], schema.asInstanceOf[js.Any])).asInstanceOf[ValidationResult[T]]
inline def validate[T](value: T, schema: SchemaLike, options: ValidationOptions): ValidationResult[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("validate")(value.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ValidationResult[T]]
inline def validate[T, R](value: T, schema: SchemaLike, callback: js.Function2[/* err */ ValidationError, /* value */ T, R]): R = (^.asInstanceOf[js.Dynamic].applyDynamic("validate")(value.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[R]
inline def validate[T, R](
  value: T,
  schema: SchemaLike,
  options: ValidationOptions,
  callback: js.Function2[/* err */ ValidationError, /* value */ T, R]
): R = (^.asInstanceOf[js.Dynamic].applyDynamic("validate")(value.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[R]

inline def version: String = ^.asInstanceOf[js.Dynamic].selectDynamic("version").asInstanceOf[String]

inline def when(ref: String, options: WhenOptions): AlternativesSchema = (^.asInstanceOf[js.Dynamic].applyDynamic("when")(ref.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AlternativesSchema]
inline def when(ref: Reference, options: WhenOptions): AlternativesSchema = (^.asInstanceOf[js.Dynamic].applyDynamic("when")(ref.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AlternativesSchema]
inline def when(ref: Schema, options: WhenSchemaOptions): AlternativesSchema = (^.asInstanceOf[js.Dynamic].applyDynamic("when")(ref.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AlternativesSchema]

type ExtensionBoundSchema = Schema & CreateError

type LanguageOptions = String | Boolean | Null | StringDictionary[Any]

type LazySchema = AnySchema

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
type Schema = _Schema | LazySchema

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - scala.Double
  - scala.Boolean
  - js.Object
  - scala.Null
  - typings.reactNativeJoi.mod.Schema
  - typings.reactNativeJoi.mod.SchemaMap
*/
type SchemaLike = _SchemaLike | String | Double | Boolean | js.Object | Null | LazySchema

type ValidationErrorFunction = js.Function1[
/* errors */ js.Array[ValidationErrorItem], 
String | ValidationErrorItem | js.Array[ValidationErrorItem] | js.Error]
