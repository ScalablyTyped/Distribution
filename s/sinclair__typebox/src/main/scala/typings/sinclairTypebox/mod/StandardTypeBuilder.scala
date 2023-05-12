package typings.sinclairTypebox.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@sinclair/typebox", "StandardTypeBuilder")
@js.native
open class StandardTypeBuilder () extends TypeBuilder {
  
  /** `[Standard]` Creates an Any type */
  def Any(): TAny = js.native
  def Any(options: SchemaOptions): TAny = js.native
  
  /** `[Standard]` Creates an Array type */
  def Array[T /* <: TSchema */](items: T): TArray[T] = js.native
  def Array[T /* <: TSchema */](items: T, options: ArrayOptions): TArray[T] = js.native
  
  /** `[Standard]` Creates a Boolean type */
  def Boolean(): TBoolean = js.native
  def Boolean(options: SchemaOptions): TBoolean = js.native
  
  /** `[Standard]` Creates a Composite object type. */
  def Composite[T /* <: js.Array[TObject[TProperties]] */](objects: /* import warning: importer.ImportType#apply c repeated non-array type: T */ js.Array[T]): TComposite[T] = js.native
  def Composite[T /* <: js.Array[TObject[TProperties]] */](
    objects: /* import warning: importer.ImportType#apply c repeated non-array type: T */ js.Array[T],
    options: ObjectOptions
  ): TComposite[T] = js.native
  
  /** `[Standard]` Creates a Enum type */
  def Enum[T /* <: Record[String, String | Double] */](item: T): TEnum[T] = js.native
  def Enum[T /* <: Record[String, String | Double] */](item: T, options: SchemaOptions): TEnum[T] = js.native
  
  /** `[Standard]` Excludes from the left type any type that is not assignable to the right */
  def Exclude[L /* <: TSchema */, R /* <: TSchema */](left: L, right: R): TExclude[L, R] = js.native
  def Exclude[L /* <: TSchema */, R /* <: TSchema */](left: L, right: R, options: SchemaOptions): TExclude[L, R] = js.native
  
  /** `[Standard]` A conditional type expression that will return the true type if the left type extends the right */
  def Extends[L /* <: TSchema */, R /* <: TSchema */, T /* <: TSchema */, U /* <: TSchema */](left: L, right: R, trueType: T, falseType: U): TExtends[L, R, T, U] = js.native
  def Extends[L /* <: TSchema */, R /* <: TSchema */, T /* <: TSchema */, U /* <: TSchema */](left: L, right: R, trueType: T, falseType: U, options: SchemaOptions): TExtends[L, R, T, U] = js.native
  
  /** `[Standard]` Extracts from the left type any type that is assignable to the right */
  def Extract[L /* <: TSchema */, R /* <: TSchema */](left: L, right: R): TExtract[L, R] = js.native
  def Extract[L /* <: TSchema */, R /* <: TSchema */](left: L, right: R, options: SchemaOptions): TExtract[L, R] = js.native
  
  /** `[Standard]` Returns indexed property types for the given keys */
  def Index[T /* <: TSchema */, K /* <: TSchema */](schema: T, key: K): TIndex[T, K] = js.native
  def Index[T /* <: TSchema */, K /* <: TSchema */](schema: T, key: K, options: SchemaOptions): TIndex[T, K] = js.native
  /** `[Standard]` Returns indexed property types for the given keys */
  def Index[T /* <: TSchema */, K /* <: js.Array[/* keyof @sinclair/typebox.@sinclair/typebox.Static<T, []> */ String] */](
    schema: T,
    keys: /* import warning: importer.ImportType#apply c repeated non-array type: K */ js.Array[K]
  ): TIndexReduce[T, Assert[K, js.Array[Key]]] = js.native
  def Index[T /* <: TSchema */, K /* <: js.Array[/* keyof @sinclair/typebox.@sinclair/typebox.Static<T, []> */ String] */](
    schema: T,
    keys: /* import warning: importer.ImportType#apply c repeated non-array type: K */ js.Array[K],
    options: SchemaOptions
  ): TIndexReduce[T, Assert[K, js.Array[Key]]] = js.native
  
  /** `[Standard]` Creates an Integer type */
  def Integer(): TInteger = js.native
  def Integer(options: NumericOptions[Double]): TInteger = js.native
  
  /** `[Standard]` Creates a Intersect type */
  def Intersect(allOf: js.Array[Any]): TNever = js.native
  def Intersect(allOf: js.Array[Any], options: SchemaOptions): TNever = js.native
  def Intersect[T /* <: js.Array[TSchema] */](
    allOf: /* import warning: importer.ImportType#apply c repeated non-array type: T */ js.Array[T],
    options: IntersectOptions
  ): TIntersect[T] = js.native
  /** `[Standard]` Creates a Intersect type */
  @JSName("Intersect")
  def Intersect_T_Any[T /* <: js.Array[TSchema] */](allOf: /* import warning: importer.ImportType#apply c repeated non-array type: T */ js.Array[T]): /* import warning: importer.ImportType#apply Failed type conversion: T[0] */ js.Any = js.native
  @JSName("Intersect")
  def Intersect_T_Any[T /* <: js.Array[TSchema] */](
    allOf: /* import warning: importer.ImportType#apply c repeated non-array type: T */ js.Array[T],
    options: SchemaOptions
  ): /* import warning: importer.ImportType#apply Failed type conversion: T[0] */ js.Any = js.native
  @JSName("Intersect")
  def Intersect_T_TIntersect[T /* <: js.Array[TSchema] */](allOf: /* import warning: importer.ImportType#apply c repeated non-array type: T */ js.Array[T]): TIntersect[T] = js.native
  
  /** `[Standard]` Creates a KeyOf type */
  def KeyOf[T /* <: TSchema */](schema: T): TKeyOf[T] = js.native
  def KeyOf[T /* <: TSchema */](schema: T, options: SchemaOptions): TKeyOf[T] = js.native
  
  /** `[Standard]` Creates a Literal type */
  def Literal(value: String): TLiteral[String] = js.native
  def Literal(value: String, options: SchemaOptions): TLiteral[String] = js.native
  def Literal(value: Boolean): TLiteral[Boolean] = js.native
  def Literal(value: Boolean, options: SchemaOptions): TLiteral[Boolean] = js.native
  def Literal(value: Double): TLiteral[Double] = js.native
  def Literal(value: Double, options: SchemaOptions): TLiteral[Double] = js.native
  
  /** `[Standard]` Creates a Never type */
  def Never(): TNever = js.native
  def Never(options: SchemaOptions): TNever = js.native
  
  /** `[Standard]` Creates a Not type. The first argument is the disallowed type, the second is the allowed. */
  def Not[N /* <: TSchema */, T /* <: TSchema */](not: N, schema: T): TNot[N, T] = js.native
  def Not[N /* <: TSchema */, T /* <: TSchema */](not: N, schema: T, options: SchemaOptions): TNot[N, T] = js.native
  
  /** `[Standard]` Creates a Null type */
  def Null(): TNull = js.native
  def Null(options: SchemaOptions): TNull = js.native
  
  /** `[Standard]` Creates a Number type */
  def Number(): TNumber = js.native
  def Number(options: NumericOptions[Double]): TNumber = js.native
  
  /** `[Standard]` Creates an Object type */
  def Object[T /* <: TProperties */](properties: T): TObject[T] = js.native
  def Object[T /* <: TProperties */](properties: T, options: ObjectOptions): TObject[T] = js.native
  
  /** `[Standard]` Creates a mapped type whose keys are omitted from the given type */
  def Omit[T /* <: TSchema */, K /* <: TUnion[js.Array[TLiteral[String]]] */](schema: T, keys: K): TOmit[
    T, 
    /* import warning: importer.ImportType#apply Failed type conversion: @sinclair/typebox.@sinclair/typebox.TUnionLiteralKeyRest<K>[number] */ js.Any
  ] = js.native
  def Omit[T /* <: TSchema */, K /* <: TUnion[js.Array[TLiteral[String]]] */](schema: T, keys: K, options: SchemaOptions): TOmit[
    T, 
    /* import warning: importer.ImportType#apply Failed type conversion: @sinclair/typebox.@sinclair/typebox.TUnionLiteralKeyRest<K>[number] */ js.Any
  ] = js.native
  /** `[Standard]` Creates a mapped type whose keys are omitted from the given type */
  def Omit[T /* <: TSchema */, K /* <: js.Array[/* keyof @sinclair/typebox.@sinclair/typebox.Static<T, []> */ String] */](
    schema: T,
    keys: /* import warning: importer.ImportType#apply c repeated non-array type: K */ js.Array[K]
  ): TOmit[
    T, 
    /* import warning: importer.ImportType#apply Failed type conversion: K[number] */ js.Any
  ] = js.native
  def Omit[T /* <: TSchema */, K /* <: js.Array[/* keyof @sinclair/typebox.@sinclair/typebox.Static<T, []> */ String] */](
    schema: T,
    keys: /* import warning: importer.ImportType#apply c repeated non-array type: K */ js.Array[K],
    options: SchemaOptions
  ): TOmit[
    T, 
    /* import warning: importer.ImportType#apply Failed type conversion: K[number] */ js.Any
  ] = js.native
  
  /** `[Modifier]` Creates a Optional property */
  def Optional[T /* <: TSchema */](schema: T): TOptional[T] = js.native
  
  /** `[Standard]` Creates a mapped type where all properties are Optional */
  def Partial[T /* <: TSchema */](schema: T): TPartial[T] = js.native
  def Partial[T /* <: TSchema */](schema: T, options: ObjectOptions): TPartial[T] = js.native
  
  /** `[Standard]` Creates a mapped type whose keys are picked from the given type */
  def Pick[T /* <: TSchema */, K /* <: TUnion[js.Array[TLiteral[String]]] */](schema: T, keys: K): TPick[
    T, 
    /* import warning: importer.ImportType#apply Failed type conversion: @sinclair/typebox.@sinclair/typebox.TUnionLiteralKeyRest<K>[number] */ js.Any
  ] = js.native
  def Pick[T /* <: TSchema */, K /* <: TUnion[js.Array[TLiteral[String]]] */](schema: T, keys: K, options: SchemaOptions): TPick[
    T, 
    /* import warning: importer.ImportType#apply Failed type conversion: @sinclair/typebox.@sinclair/typebox.TUnionLiteralKeyRest<K>[number] */ js.Any
  ] = js.native
  /** `[Standard]` Creates a mapped type whose keys are picked from the given type */
  def Pick[T /* <: TSchema */, K /* <: js.Array[/* keyof @sinclair/typebox.@sinclair/typebox.Static<T, []> */ String] */](
    schema: T,
    keys: /* import warning: importer.ImportType#apply c repeated non-array type: K */ js.Array[K]
  ): TPick[
    T, 
    /* import warning: importer.ImportType#apply Failed type conversion: K[number] */ js.Any
  ] = js.native
  def Pick[T /* <: TSchema */, K /* <: js.Array[/* keyof @sinclair/typebox.@sinclair/typebox.Static<T, []> */ String] */](
    schema: T,
    keys: /* import warning: importer.ImportType#apply c repeated non-array type: K */ js.Array[K],
    options: SchemaOptions
  ): TPick[
    T, 
    /* import warning: importer.ImportType#apply Failed type conversion: K[number] */ js.Any
  ] = js.native
  
  /** `[Modifier]` Creates a Readonly object or property */
  def Readonly[T /* <: TSchema */](schema: T): TReadonly[T] = js.native
  
  /** `[Modifier]` Creates a ReadonlyOptional property */
  def ReadonlyOptional[T /* <: TSchema */](schema: T): TReadonlyOptional[T] = js.native
  
  /** `[Standard]` Creates a Record type */
  def Record[T /* <: TSchema */](key: TInteger, schema: T): RecordNumberType[TInteger, T] = js.native
  def Record[T /* <: TSchema */](key: TInteger, schema: T, options: ObjectOptions): RecordNumberType[TInteger, T] = js.native
  def Record[T /* <: TSchema */](key: TNumber, schema: T): RecordNumberType[TNumber, T] = js.native
  def Record[T /* <: TSchema */](key: TNumber, schema: T, options: ObjectOptions): RecordNumberType[TNumber, T] = js.native
  /** `[Standard]` Creates a Record type */
  def Record[K /* <: TString */, T /* <: TSchema */](key: K, schema: T): RecordStringType[K, T] = js.native
  def Record[K /* <: TString */, T /* <: TSchema */](key: K, schema: T, options: ObjectOptions): RecordStringType[K, T] = js.native
  /** `[Standard]` Creates a Record type */
  @JSName("Record")
  def Record_KT_RecordLiteralType[K /* <: TLiteral[String | Double] */, T /* <: TSchema */](key: K, schema: T): RecordLiteralType[K, T] = js.native
  @JSName("Record")
  def Record_KT_RecordLiteralType[K /* <: TLiteral[String | Double] */, T /* <: TSchema */](key: K, schema: T, options: ObjectOptions): RecordLiteralType[K, T] = js.native
  /** `[Standard]` Creates a Record type */
  @JSName("Record")
  def Record_KT_RecordTemplateLiteralType[K /* <: TTemplateLiteral[js.Array[TTemplateLiteralKind]] */, T /* <: TSchema */](key: K, schema: T): RecordTemplateLiteralType[K, T] = js.native
  @JSName("Record")
  def Record_KT_RecordTemplateLiteralType[K /* <: TTemplateLiteral[js.Array[TTemplateLiteralKind]] */, T /* <: TSchema */](key: K, schema: T, options: ObjectOptions): RecordTemplateLiteralType[K, T] = js.native
  /** `[Standard]` Creates a Record type */
  @JSName("Record")
  def Record_KT_RecordUnionLiteralType[K /* <: TUnion[js.Array[TSchema]] */, T /* <: TSchema */](key: K, schema: T): RecordUnionLiteralType[K, T] = js.native
  @JSName("Record")
  def Record_KT_RecordUnionLiteralType[K /* <: TUnion[js.Array[TSchema]] */, T /* <: TSchema */](key: K, schema: T, options: ObjectOptions): RecordUnionLiteralType[K, T] = js.native
  
  /** `[Standard]` Creates a Recursive type */
  def Recursive[T /* <: TSchema */](callback: js.Function1[/* thisType */ TThis, T]): TRecursive[T] = js.native
  def Recursive[T /* <: TSchema */](callback: js.Function1[/* thisType */ TThis, T], options: SchemaOptions): TRecursive[T] = js.native
  
  /** `[Standard]` Creates a Ref type. The referenced type must contain a $id */
  def Ref[T /* <: TSchema */](schema: T): TRef[T] = js.native
  def Ref[T /* <: TSchema */](schema: T, options: SchemaOptions): TRef[T] = js.native
  
  /** `[Standard]` Creates a mapped type where all properties are Required */
  def Required[T /* <: TSchema */](schema: T): TRequired[T] = js.native
  def Required[T /* <: TSchema */](schema: T, options: SchemaOptions): TRequired[T] = js.native
  
  /** `[Standard]` Returns a schema array which allows types to compose with the JavaScript spread operator */
  def Rest[T /* <: TSchema */](schema: T): TRest[T] = js.native
  
  /** `[Standard]` Creates a String type */
  def String(): TString = js.native
  def String(options: StringOptions): TString = js.native
  
  /** `[Experimental]` Creates a template literal type from dsl string */
  def TemplateLiteral[T /* <: String */](dsl: T): TTemplateLiteralDslParser[T] = js.native
  def TemplateLiteral[T /* <: String */](dsl: T, options: SchemaOptions): TTemplateLiteralDslParser[T] = js.native
  /** `[Standard]` Creates a template literal type */
  def TemplateLiteral[T /* <: js.Array[TTemplateLiteralKind] */](kinds: /* import warning: importer.ImportType#apply c repeated non-array type: T */ js.Array[T]): TTemplateLiteral[T] = js.native
  def TemplateLiteral[T /* <: js.Array[TTemplateLiteralKind] */](
    kinds: /* import warning: importer.ImportType#apply c repeated non-array type: T */ js.Array[T],
    options: SchemaOptions
  ): TTemplateLiteral[T] = js.native
  
  /** `[Standard]` Creates a Tuple type */
  def Tuple[T /* <: js.Array[TSchema] */](items: /* import warning: importer.ImportType#apply c repeated non-array type: T */ js.Array[T]): TTuple[T] = js.native
  def Tuple[T /* <: js.Array[TSchema] */](
    items: /* import warning: importer.ImportType#apply c repeated non-array type: T */ js.Array[T],
    options: SchemaOptions
  ): TTuple[T] = js.native
  
  /** `[Standard]` Creates a Union type */
  def Union(anyOf: js.Array[Any]): TNever = js.native
  def Union(anyOf: js.Array[Any], options: SchemaOptions): TNever = js.native
  /** `[Experimental]` Remaps a TemplateLiteral into a Union representation. This function is known to cause TS compiler crashes for finite templates with large generation counts. Use with caution. */
  def Union[T /* <: TTemplateLiteral[js.Array[TTemplateLiteralKind]] */](template: T): TUnionTemplateLiteral[T, Static[T, js.Array[Any]]] = js.native
  /** `[Standard]` Creates a Union type */
  @JSName("Union")
  def Union_T_Any[T /* <: js.Array[TSchema] */](anyOf: /* import warning: importer.ImportType#apply c repeated non-array type: T */ js.Array[T]): /* import warning: importer.ImportType#apply Failed type conversion: T[0] */ js.Any = js.native
  @JSName("Union")
  def Union_T_Any[T /* <: js.Array[TSchema] */](
    anyOf: /* import warning: importer.ImportType#apply c repeated non-array type: T */ js.Array[T],
    options: SchemaOptions
  ): /* import warning: importer.ImportType#apply Failed type conversion: T[0] */ js.Any = js.native
  /** `[Standard]` Creates a Union type */
  @JSName("Union")
  def Union_T_TUnion[T /* <: js.Array[TSchema] */](anyOf: /* import warning: importer.ImportType#apply c repeated non-array type: T */ js.Array[T]): TUnion[T] = js.native
  @JSName("Union")
  def Union_T_TUnion[T /* <: js.Array[TSchema] */](
    anyOf: /* import warning: importer.ImportType#apply c repeated non-array type: T */ js.Array[T],
    options: SchemaOptions
  ): TUnion[T] = js.native
  
  /** `[Standard]` Creates an Unknown type */
  def Unknown(): TUnknown = js.native
  def Unknown(options: SchemaOptions): TUnknown = js.native
  
  /** `[Standard]` Creates a Unsafe type that infers for the generic argument */
  def Unsafe[T](): TUnsafe[T] = js.native
  def Unsafe[T](options: UnsafeOptions): TUnsafe[T] = js.native
}
