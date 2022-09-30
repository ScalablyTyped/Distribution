package typings.sinclairTypebox.mod

import typings.sinclairTypebox.sinclairTypeboxStrings.params
import typings.sinclairTypebox.sinclairTypeboxStrings.static
import typings.std.Omit
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@sinclair/typebox", "TypeBuilder")
@js.native
open class TypeBuilder () extends StObject {
  
  /** Creates a any type */
  def Any(): TAny = js.native
  def Any(options: SchemaOptions): TAny = js.native
  
  /** Creates a array type */
  def Array[T /* <: TSchema */](items: T): TArray[T] = js.native
  def Array[T /* <: TSchema */](items: T, options: ArrayOptions): TArray[T] = js.native
  
  /** Creates a boolean type */
  def Boolean(): TBoolean = js.native
  def Boolean(options: SchemaOptions): TBoolean = js.native
  
  /** Clones the given value */
  /* protected */ def Clone(value: Any): Any = js.native
  
  /** Creates a constructor type */
  def Constructor[T /* <: TTuple[js.Array[TSchema]] */, U /* <: TSchema */](parameters: T, returns: U): TConstructor[TupleToArray[T], U] = js.native
  def Constructor[T /* <: TTuple[js.Array[TSchema]] */, U /* <: TSchema */](parameters: T, returns: U, options: SchemaOptions): TConstructor[TupleToArray[T], U] = js.native
  /** Creates a constructor type */
  def Constructor[T /* <: js.Array[TSchema] */, U /* <: TSchema */](
    parameters: /* import warning: importer.ImportType#apply c repeated non-array type: T */ js.Array[T],
    returns: U
  ): TConstructor[T, U] = js.native
  def Constructor[T /* <: js.Array[TSchema] */, U /* <: TSchema */](
    parameters: /* import warning: importer.ImportType#apply c repeated non-array type: T */ js.Array[T],
    returns: U,
    options: SchemaOptions
  ): TConstructor[T, U] = js.native
  
  /** Creates a tuple type from this constructors parameters */
  def ConstructorParameters[T /* <: TConstructor[js.Array[Any], Any] */](schema: T): TConstructorParameters[T] = js.native
  def ConstructorParameters[T /* <: TConstructor[js.Array[Any], Any] */](schema: T, options: SchemaOptions): TConstructorParameters[T] = js.native
  
  /** Use this function to return TSchema with static and params omitted */
  /* protected */ def Create[T](schema: Omit[T, static | params]): T = js.native
  
  /** Creates a enum type */
  def Enum[T /* <: Record[String, String | Double] */](item: T): TEnum[T] = js.native
  def Enum[T /* <: Record[String, String | Double] */](item: T, options: SchemaOptions): TEnum[T] = js.native
  
  /** Creates a function type */
  def Function[T /* <: TTuple[js.Array[TSchema]] */, U /* <: TSchema */](parameters: T, returns: U): TFunction[TupleToArray[T], U] = js.native
  def Function[T /* <: TTuple[js.Array[TSchema]] */, U /* <: TSchema */](parameters: T, returns: U, options: SchemaOptions): TFunction[TupleToArray[T], U] = js.native
  /** Creates a function type */
  def Function[T /* <: js.Array[TSchema] */, U /* <: TSchema */](
    parameters: /* import warning: importer.ImportType#apply c repeated non-array type: T */ js.Array[T],
    returns: U
  ): TFunction[T, U] = js.native
  def Function[T /* <: js.Array[TSchema] */, U /* <: TSchema */](
    parameters: /* import warning: importer.ImportType#apply c repeated non-array type: T */ js.Array[T],
    returns: U,
    options: SchemaOptions
  ): TFunction[T, U] = js.native
  
  /** Creates a type from this constructors instance type */
  def InstanceType[T /* <: TConstructor[js.Array[Any], Any] */](schema: T): TInstanceType[T] = js.native
  def InstanceType[T /* <: TConstructor[js.Array[Any], Any] */](schema: T, options: SchemaOptions): TInstanceType[T] = js.native
  
  /** Creates a integer type */
  def Integer(): TInteger = js.native
  def Integer(options: NumericOptions): TInteger = js.native
  
  /** Creates a intersect type. */
  def Intersect[T /* <: js.Array[TObject[TProperties]] */](objects: /* import warning: importer.ImportType#apply c repeated non-array type: T */ js.Array[T]): TIntersect[T] = js.native
  def Intersect[T /* <: js.Array[TObject[TProperties]] */](
    objects: /* import warning: importer.ImportType#apply c repeated non-array type: T */ js.Array[T],
    options: ObjectOptions
  ): TIntersect[T] = js.native
  
  /** Creates a keyof type */
  def KeyOf[T /* <: TObject[TProperties] */](`object`: T): TKeyOf[T] = js.native
  def KeyOf[T /* <: TObject[TProperties] */](`object`: T, options: SchemaOptions): TKeyOf[T] = js.native
  
  /** Creates a literal type. */
  def Literal(value: String): TLiteral[String] = js.native
  def Literal(value: String, options: SchemaOptions): TLiteral[String] = js.native
  def Literal(value: Boolean): TLiteral[Boolean] = js.native
  def Literal(value: Boolean, options: SchemaOptions): TLiteral[Boolean] = js.native
  def Literal(value: Double): TLiteral[Double] = js.native
  def Literal(value: Double, options: SchemaOptions): TLiteral[Double] = js.native
  
  /** Creates a never type */
  def Never(): TNever = js.native
  def Never(options: SchemaOptions): TNever = js.native
  
  /** Creates a null type */
  def Null(): TNull = js.native
  def Null(options: SchemaOptions): TNull = js.native
  
  /** Creates a number type */
  def Number(): TNumber = js.native
  def Number(options: NumericOptions): TNumber = js.native
  
  /** Creates an object type with the given properties */
  def Object[T /* <: TProperties */](properties: T): TObject[T] = js.native
  def Object[T /* <: TProperties */](properties: T, options: ObjectOptions): TObject[T] = js.native
  
  /** Creates a new object whose properties are omitted from the given object */
  def Omit[T /* <: TObject[TProperties] */, K /* <: TUnion[js.Array[TLiteral[String]]] */](schema: T, keys: K): TOmit[T, UnionStringLiteralToTuple[K]] = js.native
  def Omit[T /* <: TObject[TProperties] */, K /* <: TUnion[js.Array[TLiteral[String]]] */](schema: T, keys: K, options: ObjectOptions): TOmit[T, UnionStringLiteralToTuple[K]] = js.native
  /** Creates a new object whose properties are omitted from the given object */
  def Omit[T /* <: TObject[TProperties] */, K /* <: js.Array[ObjectPropertyKeys[T]] */](
    schema: T,
    keys: /* import warning: importer.ImportType#apply c repeated non-array type: K */ js.Array[K]
  ): TOmit[T, K] = js.native
  def Omit[T /* <: TObject[TProperties] */, K /* <: js.Array[ObjectPropertyKeys[T]] */](
    schema: T,
    keys: /* import warning: importer.ImportType#apply c repeated non-array type: K */ js.Array[K],
    options: ObjectOptions
  ): TOmit[T, K] = js.native
  
  /** Creates a optional property */
  def Optional[T /* <: TSchema */](item: T): TOptional[T] = js.native
  
  /** Creates a tuple type from this functions parameters */
  def Parameters[T /* <: TFunction[js.Array[Any], Any] */](schema: T): TParameters[T] = js.native
  def Parameters[T /* <: TFunction[js.Array[Any], Any] */](schema: T, options: SchemaOptions): TParameters[T] = js.native
  
  /** Creates an object type whose properties are all optional */
  def Partial[T /* <: TObject[TProperties] */](schema: T): TPartial[T] = js.native
  def Partial[T /* <: TObject[TProperties] */](schema: T, options: ObjectOptions): TPartial[T] = js.native
  
  /** Creates a object whose properties are picked from the given object */
  def Pick[T /* <: TObject[TProperties] */, K /* <: TUnion[js.Array[TLiteral[String]]] */](schema: T, keys: K): TPick[T, UnionStringLiteralToTuple[K]] = js.native
  def Pick[T /* <: TObject[TProperties] */, K /* <: TUnion[js.Array[TLiteral[String]]] */](schema: T, keys: K, options: ObjectOptions): TPick[T, UnionStringLiteralToTuple[K]] = js.native
  /** Creates a object whose properties are picked from the given object */
  def Pick[T /* <: TObject[TProperties] */, K /* <: js.Array[ObjectPropertyKeys[T]] */](
    schema: T,
    keys: /* import warning: importer.ImportType#apply c repeated non-array type: K */ js.Array[K]
  ): TPick[T, K] = js.native
  def Pick[T /* <: TObject[TProperties] */, K /* <: js.Array[ObjectPropertyKeys[T]] */](
    schema: T,
    keys: /* import warning: importer.ImportType#apply c repeated non-array type: K */ js.Array[K],
    options: ObjectOptions
  ): TPick[T, K] = js.native
  
  /** Creates a promise type. This type cannot be represented in schema. */
  def Promise[T /* <: TSchema */](item: T): TPromise[T] = js.native
  def Promise[T /* <: TSchema */](item: T, options: SchemaOptions): TPromise[T] = js.native
  
  /** Creates a readonly property */
  def Readonly[T /* <: TSchema */](item: T): TReadonly[T] = js.native
  
  /** Creates a readonly optional property */
  def ReadonlyOptional[T /* <: TSchema */](item: T): TReadonlyOptional[T] = js.native
  
  def Record[T /* <: TSchema */](key: TNumber, schema: T): TRecord[TNumber, T] = js.native
  def Record[T /* <: TSchema */](key: TNumber, schema: T, options: ObjectOptions): TRecord[TNumber, T] = js.native
  /** Creates a record type */
  def Record[T /* <: TSchema */](key: TString[String], schema: T): TRecord[TString[String], T] = js.native
  def Record[T /* <: TSchema */](key: TString[String], schema: T, options: ObjectOptions): TRecord[TString[String], T] = js.native
  /** Creates an object whose properties are derived from the given string literal union. */
  def Record[K /* <: TUnion[js.Array[TLiteral[TLiteralValue]]] */, T /* <: TSchema */](key: K, schema: T): TObject[TRecordProperties[K, T]] = js.native
  def Record[K /* <: TUnion[js.Array[TLiteral[TLiteralValue]]] */, T /* <: TSchema */](key: K, schema: T, options: ObjectOptions): TObject[TRecordProperties[K, T]] = js.native
  
  /** Creates a recursive object type */
  def Recursive[T /* <: TSchema */](callback: js.Function1[/* self */ TSelf, T]): TRecursive[T] = js.native
  def Recursive[T /* <: TSchema */](callback: js.Function1[/* self */ TSelf, T], options: SchemaOptions): TRecursive[T] = js.native
  
  /** Creates a reference schema */
  def Ref[T /* <: TSchema */](schema: T): TRef[T] = js.native
  def Ref[T /* <: TSchema */](schema: T, options: SchemaOptions): TRef[T] = js.native
  
  /** Creates a string type from a regular expression */
  def RegEx(regex: js.RegExp): TString[String] = js.native
  def RegEx(regex: js.RegExp, options: SchemaOptions): TString[String] = js.native
  
  /** Creates an object type whose properties are all required */
  def Required[T /* <: TObject[TProperties] */](schema: T): TRequired[T] = js.native
  def Required[T /* <: TObject[TProperties] */](schema: T, options: SchemaOptions): TRequired[T] = js.native
  
  /** Creates a type from this functions return type */
  def ReturnType[T /* <: TFunction[js.Array[Any], Any] */](schema: T): TReturnType[T] = js.native
  def ReturnType[T /* <: TFunction[js.Array[Any], Any] */](schema: T, options: SchemaOptions): TReturnType[T] = js.native
  
  /** Removes Kind and Modifier symbol property keys from this schema */
  def Strict[T /* <: TSchema */](schema: T): T = js.native
  
  /** Creates a string type */
  def String[Format /* <: java.lang.String */](): TString[Format] = js.native
  def String[Format /* <: java.lang.String */](options: StringOptions[StringFormatOption | Format]): TString[Format] = js.native
  
  /** Creates a tuple type */
  def Tuple[T /* <: js.Array[TSchema] */](items: /* import warning: importer.ImportType#apply c repeated non-array type: T */ js.Array[T]): TTuple[T] = js.native
  def Tuple[T /* <: js.Array[TSchema] */](
    items: /* import warning: importer.ImportType#apply c repeated non-array type: T */ js.Array[T],
    options: SchemaOptions
  ): TTuple[T] = js.native
  
  /** Creates a Uint8Array type */
  def Uint8Array(): TUint8Array = js.native
  def Uint8Array(options: Uint8ArrayOptions): TUint8Array = js.native
  
  /** Creates a undefined type */
  def Undefined(): TUndefined = js.native
  def Undefined(options: SchemaOptions): TUndefined = js.native
  
  /** Creates a union type */
  def Union(items: js.Array[Any]): TNever = js.native
  def Union(items: js.Array[Any], options: SchemaOptions): TNever = js.native
  @JSName("Union")
  def Union_T_TUnion[T /* <: js.Array[TSchema] */](items: /* import warning: importer.ImportType#apply c repeated non-array type: T */ js.Array[T]): TUnion[T] = js.native
  @JSName("Union")
  def Union_T_TUnion[T /* <: js.Array[TSchema] */](
    items: /* import warning: importer.ImportType#apply c repeated non-array type: T */ js.Array[T],
    options: SchemaOptions
  ): TUnion[T] = js.native
  
  /** Creates an unknown type */
  def Unknown(): TUnknown = js.native
  def Unknown(options: SchemaOptions): TUnknown = js.native
  
  /** Creates a user defined schema that infers as type T  */
  def Unsafe[T](): TUnsafe[T] = js.native
  def Unsafe[T](options: UnsafeOptions): TUnsafe[T] = js.native
  
  /** Creates a void type */
  def Void(): TVoid = js.native
  def Void(options: SchemaOptions): TVoid = js.native
}
