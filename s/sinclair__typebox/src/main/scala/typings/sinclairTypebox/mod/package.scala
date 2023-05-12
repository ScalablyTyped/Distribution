package typings.sinclairTypebox.mod

import typings.sinclairTypebox.anon.`0`
import typings.sinclairTypebox.anon.`1`
import typings.sinclairTypebox.mod.^
import typings.sinclairTypebox.sinclairTypeboxBooleans.`false`
import typings.std.Omit
import typings.std.Partial
import typings.std.Pick
import typings.std.Record
import typings.std.Required
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def Hint: js.Symbol = ^.asInstanceOf[js.Dynamic].selectDynamic("Hint").asInstanceOf[js.Symbol]

inline def Kind: js.Symbol = ^.asInstanceOf[js.Dynamic].selectDynamic("Kind").asInstanceOf[js.Symbol]

inline def Modifier: js.Symbol = ^.asInstanceOf[js.Dynamic].selectDynamic("Modifier").asInstanceOf[js.Symbol]

inline def PatternBoolean: /* "(true|false)" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("PatternBoolean").asInstanceOf[/* "(true|false)" */ String]

inline def PatternBooleanExact: String = ^.asInstanceOf[js.Dynamic].selectDynamic("PatternBooleanExact").asInstanceOf[String]

inline def PatternNumber: /* "(0|[1-9][0-9]*)" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("PatternNumber").asInstanceOf[/* "(0|[1-9][0-9]*)" */ String]

inline def PatternNumberExact: String = ^.asInstanceOf[js.Dynamic].selectDynamic("PatternNumberExact").asInstanceOf[String]

inline def PatternString: /* "(.*)" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("PatternString").asInstanceOf[/* "(.*)" */ String]

inline def PatternStringExact: String = ^.asInstanceOf[js.Dynamic].selectDynamic("PatternStringExact").asInstanceOf[String]

inline def StandardType: StandardTypeBuilder = ^.asInstanceOf[js.Dynamic].selectDynamic("StandardType").asInstanceOf[StandardTypeBuilder]

inline def Type: ExtendedTypeBuilder = ^.asInstanceOf[js.Dynamic].selectDynamic("Type").asInstanceOf[ExtendedTypeBuilder]

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  T extends E ? T : never
  }}}
  */
type Assert[T, E] = T

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  T extends @sinclair/typebox.@sinclair/typebox.TProperties ? T : @sinclair/typebox.@sinclair/typebox.TProperties
  }}}
  */
type AssertProperties[T] = T

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  T extends E ? T : []
  }}}
  */
type AssertRest[T, E /* <: js.Array[TSchema] */] = T

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  T extends E ? T : @sinclair/typebox.@sinclair/typebox.TNever
  }}}
  */
type AssertType[T, E /* <: TSchema */] = T

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  T extends [infer L, ...infer R] ? L extends D ? @sinclair/typebox.@sinclair/typebox.Discard<R, D> : [L, ...@sinclair/typebox.@sinclair/typebox.Discard<R, D>] : []
  }}}
  */
type Discard[T /* <: js.Array[Any] */, D /* <: Any */] = js.Array[Any]

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  T extends [] ? [] : T extends [infer L] ? [...@sinclair/typebox.@sinclair/typebox.Flat<L>] : T extends [infer L, ...infer R] ? [...@sinclair/typebox.@sinclair/typebox.Flat<L>, ...@sinclair/typebox.@sinclair/typebox.Flat<R>] : [T]
  }}}
  */
type Flat[T] = js.Array[Any]

type FormatRegistryValidationFunction = js.Function1[/* value */ String, Boolean]

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  T extends [] ? @sinclair/typebox.@sinclair/typebox.TNever : T extends [@sinclair/typebox.@sinclair/typebox.TSchema] ? @sinclair/typebox.@sinclair/typebox.AssertType<T[0], @sinclair/typebox.@sinclair/typebox.TSchema> : @sinclair/typebox.@sinclair/typebox.TIntersect<T>
  }}}
  */
type IntersectType[T /* <: js.Array[TSchema] */] = TNever

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  T extends @sinclair/typebox.@sinclair/typebox.TTemplateLiteral<infer U> ? @sinclair/typebox.@sinclair/typebox.IsTemplateLiteralFiniteArray<U> : false
  }}}
  */
type IsTemplateLiteralFinite[T] = `false`

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  T extends [infer L, ...infer R] ? @sinclair/typebox.@sinclair/typebox.IsTemplateLiteralFiniteCheck<L> extends false ? false : @sinclair/typebox.@sinclair/typebox.IsTemplateLiteralFiniteArray<@sinclair/typebox.@sinclair/typebox.Assert<R, std.Array<@sinclair/typebox.@sinclair/typebox.TTemplateLiteralKind>>> : true
  }}}
  */
type IsTemplateLiteralFiniteArray[T /* <: js.Array[TTemplateLiteralKind] */] = `false`

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  T extends @sinclair/typebox.@sinclair/typebox.TTemplateLiteral<infer U> ? @sinclair/typebox.@sinclair/typebox.IsTemplateLiteralFiniteArray<@sinclair/typebox.@sinclair/typebox.Assert<U, std.Array<@sinclair/typebox.@sinclair/typebox.TTemplateLiteralKind>>> : T extends @sinclair/typebox.@sinclair/typebox.TUnion<infer U> ? @sinclair/typebox.@sinclair/typebox.IsTemplateLiteralFiniteArray<@sinclair/typebox.@sinclair/typebox.Assert<U, std.Array<@sinclair/typebox.@sinclair/typebox.TTemplateLiteralKind>>> : T extends @sinclair/typebox.@sinclair/typebox.TString ? false : T extends @sinclair/typebox.@sinclair/typebox.TBoolean ? false : T extends @sinclair/typebox.@sinclair/typebox.TNumber ? false : T extends @sinclair/typebox.@sinclair/typebox.TInteger ? false : T extends @sinclair/typebox.@sinclair/typebox.TBigInt ? false : T extends @sinclair/typebox.@sinclair/typebox.TLiteral<@sinclair/typebox.@sinclair/typebox.TLiteralValue> ? true : false
  }}}
  */
type IsTemplateLiteralFiniteCheck[T] = `false`

type Key = String | Double

type OptionalPropertyKeys[T /* <: TProperties */] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: T[K] extends / * Inlined @sinclair/typebox.@sinclair/typebox.TOptional<@sinclair/typebox.@sinclair/typebox.TSchema> * /
{[Modifier] : string | undefined, [Hint] : string | undefined,   params :std.Array<unknown>,   static :unknown,   $schema :string | undefined,   $id :string | undefined,   title :string | undefined,   description :string | undefined,   default :any | undefined,   examples :any | undefined, [prop: string] : any, [Kind] : string, [Modifier] : 'Optional'}? K : never}[keyof T] */ js.Any

type PropertiesReduce[T /* <: TProperties */, P /* <: js.Array[Any] */] = PropertiesReducer[
T, 
/* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: @sinclair/typebox.@sinclair/typebox.Static<T[K], P>} */ js.Any]

type PropertiesReducer[T /* <: TProperties */, R /* <: Record[/* keyof any */ String, Any] */] = Evaluate[
(Partial[Pick[R, ReadonlyOptionalPropertyKeys[T]]]) & (Pick[R, ReadonlyPropertyKeys[T]]) & (Partial[Pick[R, OptionalPropertyKeys[T]]]) & (Required[Pick[R, RequiredPropertyKeys[T]]])]

type ReadonlyOptionalPropertyKeys[T /* <: TProperties */] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: T[K] extends / * Inlined @sinclair/typebox.@sinclair/typebox.TReadonlyOptional<@sinclair/typebox.@sinclair/typebox.TSchema> * /
{[Modifier] : string | undefined, [Hint] : string | undefined,   params :std.Array<unknown>,   static :unknown,   $schema :string | undefined,   $id :string | undefined,   title :string | undefined,   description :string | undefined,   default :any | undefined,   examples :any | undefined, [prop: string] : any, [Kind] : string, [Modifier] : 'ReadonlyOptional'}? K : never}[keyof T] */ js.Any

type ReadonlyPropertyKeys[T /* <: TProperties */] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: T[K] extends / * Inlined @sinclair/typebox.@sinclair/typebox.TReadonly<@sinclair/typebox.@sinclair/typebox.TSchema> * /
{[Modifier] : string | undefined, [Hint] : string | undefined,   params :std.Array<unknown>,   static :unknown,   $schema :string | undefined,   $id :string | undefined,   title :string | undefined,   description :string | undefined,   default :any | undefined,   examples :any | undefined, [prop: string] : any, [Kind] : string, [Modifier] : 'Readonly'}? K : never}[keyof T] */ js.Any

/* Rewritten from type alias, can be one of: 
  - typings.sinclairTypebox.mod.TUnion[js.Array[typings.sinclairTypebox.mod.TLiteral[java.lang.String | scala.Double]]]
  - typings.sinclairTypebox.mod.TLiteral[java.lang.String | scala.Double]
  - typings.sinclairTypebox.mod.TTemplateLiteral[js.Array[typings.sinclairTypebox.mod.TTemplateLiteralKind]]
  - typings.sinclairTypebox.mod.TInteger
  - typings.sinclairTypebox.mod.TNumber
  - typings.sinclairTypebox.mod.TString
*/
type RecordKey = _RecordKey | (TUnion[js.Array[TLiteral[String | Double]]]) | (TLiteral[String | Double]) | TTemplateLiteral[js.Array[TTemplateLiteralKind]]

type RecordLiteralType[K /* <: TLiteral[String | Double] */, T /* <: TSchema */] = Ensure[
TObject[
  /* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in K['const'] ]: T} */ js.Any
]]

type RecordNumberType[K /* <: TInteger | TNumber */, T /* <: TSchema */] = Ensure[TRecord[K, T]]

type RecordStringType[K /* <: TString */, T /* <: TSchema */] = Ensure[TRecord[K, T]]

type RecordTemplateLiteralObjectType[K /* <: TTemplateLiteral[js.Array[TTemplateLiteralKind]] */, T /* <: TSchema */] = Ensure[
TObject[
  Evaluate[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ _ in @sinclair/typebox.@sinclair/typebox.Static<K, []> ]: T} */ js.Any
  ]
]]

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  @sinclair/typebox.@sinclair/typebox.IsTemplateLiteralFinite<K> extends true ? @sinclair/typebox.@sinclair/typebox.RecordTemplateLiteralObjectType<K, T> : @sinclair/typebox.@sinclair/typebox.TRecord<K, T>
  }}}
  */
type RecordTemplateLiteralType[K /* <: TTemplateLiteral[js.Array[TTemplateLiteralKind]] */, T /* <: TSchema */] = TRecord[K, T]

type RequiredPropertyKeys[T /* <: TProperties */] = /* keyof std.Omit<T, @sinclair/typebox.@sinclair/typebox.ReadonlyOptionalPropertyKeys<T> | @sinclair/typebox.@sinclair/typebox.ReadonlyPropertyKeys<T> | @sinclair/typebox.@sinclair/typebox.OptionalPropertyKeys<T>> */ String

type Static[T /* <: TSchema */, P /* <: js.Array[Any] */] = /* import warning: importer.ImportType#apply Failed type conversion: T & @sinclair/typebox.anon.Params<P>['static'] */ js.Any

type SymbolValue = js.UndefOr[String | Double]

type TAdditionalProperties = js.UndefOr[TSchema | Boolean]

/* Rewritten from type alias, can be one of: 
  - typings.sinclairTypebox.mod.TSchema
  - typings.sinclairTypebox.mod.TAny
  - typings.sinclairTypebox.mod.TArray[typings.sinclairTypebox.mod.TSchema]
  - typings.sinclairTypebox.mod.TBigInt
  - typings.sinclairTypebox.mod.TBoolean
  - typings.sinclairTypebox.mod.TConstructor[js.Array[typings.sinclairTypebox.mod.TSchema], typings.sinclairTypebox.mod.TSchema]
  - typings.sinclairTypebox.mod.TDate
  - typings.sinclairTypebox.mod.TEnum[typings.std.Record[java.lang.String, java.lang.String | scala.Double]]
  - typings.sinclairTypebox.mod.TFunction[js.Array[typings.sinclairTypebox.mod.TSchema], typings.sinclairTypebox.mod.TSchema]
  - typings.sinclairTypebox.mod.TInteger
  - typings.sinclairTypebox.mod.TIntersect[js.Array[typings.sinclairTypebox.mod.TSchema]]
  - typings.sinclairTypebox.mod.TLiteral[typings.sinclairTypebox.mod.TLiteralValue]
  - typings.sinclairTypebox.mod.TNot[typings.sinclairTypebox.mod.TSchema, typings.sinclairTypebox.mod.TSchema]
  - typings.sinclairTypebox.mod.TNull
  - typings.sinclairTypebox.mod.TNumber
  - typings.sinclairTypebox.mod.TObject[typings.sinclairTypebox.mod.TProperties]
  - typings.sinclairTypebox.mod.TPromise[typings.sinclairTypebox.mod.TSchema]
  - typings.sinclairTypebox.mod.TRecord[typings.sinclairTypebox.mod.RecordKey, typings.sinclairTypebox.mod.TSchema]
  - typings.sinclairTypebox.mod.TRef[typings.sinclairTypebox.mod.TSchema]
  - typings.sinclairTypebox.mod.TString
  - typings.sinclairTypebox.mod.TSymbol
  - typings.sinclairTypebox.mod.TTemplateLiteral[js.Array[typings.sinclairTypebox.mod.TTemplateLiteralKind]]
  - typings.sinclairTypebox.mod.TThis
  - typings.sinclairTypebox.mod.TTuple[js.Array[typings.sinclairTypebox.mod.TSchema]]
  - typings.sinclairTypebox.mod.TUndefined
  - typings.sinclairTypebox.mod.TUnion[js.Array[typings.sinclairTypebox.mod.TSchema]]
  - typings.sinclairTypebox.mod.TUint8Array
  - typings.sinclairTypebox.mod.TUnknown
  - typings.sinclairTypebox.mod.TVoid
*/
type TAnySchema = _TAnySchema | TArray[TSchema] | (TConstructor[js.Array[TSchema], TSchema]) | (TEnum[Record[String, String | Double]]) | (TFunction[js.Array[TSchema], TSchema]) | TIntersect[js.Array[TSchema]] | TLiteral[TLiteralValue] | (TNot[TSchema, TSchema]) | TObject[TProperties] | TPromise[TSchema] | (TRecord[RecordKey, TSchema]) | TRef[TSchema] | TTemplateLiteral[js.Array[TTemplateLiteralKind]] | TTuple[js.Array[TSchema]] | TUnion[js.Array[TSchema]]

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  @sinclair/typebox.@sinclair/typebox.TIntersect<T> extends infer R ? @sinclair/typebox.@sinclair/typebox.TObject<@sinclair/typebox.@sinclair/typebox.TCompositeSelect<@sinclair/typebox.@sinclair/typebox.Assert<R, @sinclair/typebox.@sinclair/typebox.TIntersect<std.Array<@sinclair/typebox.@sinclair/typebox.TObject<@sinclair/typebox.@sinclair/typebox.TProperties>>>>>> : @sinclair/typebox.@sinclair/typebox.TObject<{}>
  }}}
  */
type TComposite[T /* <: js.Array[TObject[TProperties]] */] = TObject[js.Object]

type TConstructorParameterArray[T /* <: js.Array[TSchema] */, P /* <: js.Array[Any] */] = /* import warning: importer.ImportType#apply c repeated non-array type: {[ K in keyof T ]: @sinclair/typebox.@sinclair/typebox.Static<@sinclair/typebox.@sinclair/typebox.AssertType<T[K], @sinclair/typebox.@sinclair/typebox.TSchema>, P>} */ js.Array[
/* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: @sinclair/typebox.@sinclair/typebox.Static<@sinclair/typebox.@sinclair/typebox.AssertType<T[K], @sinclair/typebox.@sinclair/typebox.TSchema>, P>} */ js.Any]

type TConstructorParameters[T /* <: TConstructor[js.Array[TSchema], TSchema] */] = TTuple[
/* import warning: importer.ImportType#apply Failed type conversion: T['parameters'] */ js.Any]

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  T extends @sinclair/typebox.@sinclair/typebox.TTemplateLiteral<std.Array<@sinclair/typebox.@sinclair/typebox.TTemplateLiteralKind>> ? @sinclair/typebox.@sinclair/typebox.TExcludeTemplateLiteral<T, U> : T extends @sinclair/typebox.@sinclair/typebox.TUnion<infer S> ? @sinclair/typebox.@sinclair/typebox.TExcludeArray<S, U> : T extends U ? @sinclair/typebox.@sinclair/typebox.TNever : T
  }}}
  */
type TExclude[T /* <: TSchema */, U /* <: TSchema */] = T

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  @sinclair/typebox.@sinclair/typebox.AssertRest<@sinclair/typebox.@sinclair/typebox.UnionToTuple<{[ K in keyof T ]: @sinclair/typebox.@sinclair/typebox.Static<@sinclair/typebox.@sinclair/typebox.AssertType<T[K], @sinclair/typebox.@sinclair/typebox.TSchema>, []> extends @sinclair/typebox.@sinclair/typebox.Static<U, []>? never : T[K]}[number], @sinclair/typebox.@sinclair/typebox.UnionLast<{[ K in keyof T ]: @sinclair/typebox.@sinclair/typebox.Static<@sinclair/typebox.@sinclair/typebox.AssertType<T[K], @sinclair/typebox.@sinclair/typebox.TSchema>, []> extends @sinclair/typebox.@sinclair/typebox.Static<U, []>? never : T[K]}[number]>>, std.Array<@sinclair/typebox.@sinclair/typebox.TSchema>> extends infer R ? @sinclair/typebox.@sinclair/typebox.UnionType<@sinclair/typebox.@sinclair/typebox.AssertRest<R, std.Array<@sinclair/typebox.@sinclair/typebox.TSchema>>> : never
  }}}
  */
type TExcludeArray[T /* <: js.Array[TSchema] */, U /* <: TSchema */] = TNever

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  std.Exclude<@sinclair/typebox.@sinclair/typebox.Static<T, []>, @sinclair/typebox.@sinclair/typebox.Static<U, []>> extends infer S ? @sinclair/typebox.@sinclair/typebox.TExcludeTemplateLiteralResult<@sinclair/typebox.@sinclair/typebox.Assert<S, string>> : never
  }}}
  */
type TExcludeTemplateLiteral[T /* <: TTemplateLiteral[js.Array[TTemplateLiteralKind]] */, U /* <: TSchema */] = TNever

type TExcludeTemplateLiteralResult[T /* <: String */] = UnionType[
AssertRest[
  UnionToTuple[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K in T ]: @sinclair/typebox.@sinclair/typebox.TLiteral<K>}[T] */ js.Any, 
    UnionLast[
      /* import warning: importer.ImportType#apply Failed type conversion: {[ K in T ]: @sinclair/typebox.@sinclair/typebox.TLiteral<K>}[T] */ js.Any
    ]
  ], 
  js.Array[TSchema]
]]

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  @sinclair/typebox.@sinclair/typebox.Static<L, []> extends @sinclair/typebox.@sinclair/typebox.Static<R, []> ? T : U extends infer O ? @sinclair/typebox.@sinclair/typebox.UnionToTuple<O, @sinclair/typebox.@sinclair/typebox.UnionLast<O>> extends [infer X, infer Y] ? @sinclair/typebox.@sinclair/typebox.TUnion<[@sinclair/typebox.@sinclair/typebox.AssertType<X, @sinclair/typebox.@sinclair/typebox.TSchema>, @sinclair/typebox.@sinclair/typebox.AssertType<Y, @sinclair/typebox.@sinclair/typebox.TSchema>]> : @sinclair/typebox.@sinclair/typebox.AssertType<O, @sinclair/typebox.@sinclair/typebox.TSchema> : never
  }}}
  */
type TExtends[L /* <: TSchema */, R /* <: TSchema */, T /* <: TSchema */, U /* <: TSchema */] = TNever

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  T extends @sinclair/typebox.@sinclair/typebox.TTemplateLiteral<std.Array<@sinclair/typebox.@sinclair/typebox.TTemplateLiteralKind>> ? @sinclair/typebox.@sinclair/typebox.TExtractTemplateLiteral<T, U> : T extends @sinclair/typebox.@sinclair/typebox.TUnion<infer S> ? @sinclair/typebox.@sinclair/typebox.TExtractArray<S, U> : T extends U ? T : T
  }}}
  */
type TExtract[T /* <: TSchema */, U /* <: TSchema */] = T

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  @sinclair/typebox.@sinclair/typebox.AssertRest<@sinclair/typebox.@sinclair/typebox.UnionToTuple<{[ K in keyof T ]: @sinclair/typebox.@sinclair/typebox.Static<@sinclair/typebox.@sinclair/typebox.AssertType<T[K], @sinclair/typebox.@sinclair/typebox.TSchema>, []> extends @sinclair/typebox.@sinclair/typebox.Static<U, []>? T[K] : never}[number], @sinclair/typebox.@sinclair/typebox.UnionLast<{[ K in keyof T ]: @sinclair/typebox.@sinclair/typebox.Static<@sinclair/typebox.@sinclair/typebox.AssertType<T[K], @sinclair/typebox.@sinclair/typebox.TSchema>, []> extends @sinclair/typebox.@sinclair/typebox.Static<U, []>? T[K] : never}[number]>>, std.Array<@sinclair/typebox.@sinclair/typebox.TSchema>> extends infer R ? @sinclair/typebox.@sinclair/typebox.UnionType<@sinclair/typebox.@sinclair/typebox.AssertRest<R, std.Array<@sinclair/typebox.@sinclair/typebox.TSchema>>> : never
  }}}
  */
type TExtractArray[T /* <: js.Array[TSchema] */, U /* <: TSchema */] = TNever

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  std.Extract<@sinclair/typebox.@sinclair/typebox.Static<T, []>, @sinclair/typebox.@sinclair/typebox.Static<U, []>> extends infer S ? @sinclair/typebox.@sinclair/typebox.TExtractTemplateLiteralResult<@sinclair/typebox.@sinclair/typebox.Assert<S, string>> : never
  }}}
  */
type TExtractTemplateLiteral[T /* <: TTemplateLiteral[js.Array[TTemplateLiteralKind]] */, U /* <: TSchema */] = TNever

type TExtractTemplateLiteralResult[T /* <: String */] = UnionType[
AssertRest[
  UnionToTuple[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K in T ]: @sinclair/typebox.@sinclair/typebox.TLiteral<K>}[T] */ js.Any, 
    UnionLast[
      /* import warning: importer.ImportType#apply Failed type conversion: {[ K in T ]: @sinclair/typebox.@sinclair/typebox.TLiteral<K>}[T] */ js.Any
    ]
  ], 
  js.Array[TSchema]
]]

type TFunctionParameters[T /* <: js.Array[TSchema] */, P /* <: js.Array[Any] */] = /* import warning: importer.ImportType#apply c repeated non-array type: {[ K in keyof T ]: @sinclair/typebox.@sinclair/typebox.Static<@sinclair/typebox.@sinclair/typebox.AssertType<T[K], @sinclair/typebox.@sinclair/typebox.TSchema>, P>} */ js.Array[
/* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: @sinclair/typebox.@sinclair/typebox.Static<@sinclair/typebox.@sinclair/typebox.AssertType<T[K], @sinclair/typebox.@sinclair/typebox.TSchema>, P>} */ js.Any]

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  [T, K] extends [@sinclair/typebox.@sinclair/typebox.TTuple<std.Array<@sinclair/typebox.@sinclair/typebox.TSchema>>, @sinclair/typebox.@sinclair/typebox.TNumber] ? @sinclair/typebox.@sinclair/typebox.UnionType<@sinclair/typebox.@sinclair/typebox.Assert<T['items'], std.Array<@sinclair/typebox.@sinclair/typebox.TSchema>>> : [T, K] extends [@sinclair/typebox.@sinclair/typebox.TArray<@sinclair/typebox.@sinclair/typebox.TSchema>, @sinclair/typebox.@sinclair/typebox.TNumber] ? @sinclair/typebox.@sinclair/typebox.AssertType<T['items'], @sinclair/typebox.@sinclair/typebox.TSchema> : K extends @sinclair/typebox.@sinclair/typebox.TTemplateLiteral<std.Array<@sinclair/typebox.@sinclair/typebox.TTemplateLiteralKind>> ? @sinclair/typebox.@sinclair/typebox.TIndexReduce<T, @sinclair/typebox.@sinclair/typebox.TTemplateLiteralKeyRest<K>> : K extends @sinclair/typebox.@sinclair/typebox.TUnion<std.Array<@sinclair/typebox.@sinclair/typebox.TLiteral<@sinclair/typebox.@sinclair/typebox.Key>>> ? @sinclair/typebox.@sinclair/typebox.TIndexReduce<T, @sinclair/typebox.@sinclair/typebox.TUnionLiteralKeyRest<K>> : K extends @sinclair/typebox.@sinclair/typebox.TLiteral<@sinclair/typebox.@sinclair/typebox.Key> ? @sinclair/typebox.@sinclair/typebox.TIndexReduce<T, [K['const']]> : @sinclair/typebox.@sinclair/typebox.TNever
  }}}
  */
type TIndex[T /* <: TSchema */, K /* <: TSchema */] = TNever

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  K extends keyof T ? [T[K]] : []
  }}}
  */
type TIndexProperty[T /* <: TProperties */, K /* <: Key */] = js.Array[
/* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any]

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  T extends @sinclair/typebox.@sinclair/typebox.TRecursive<infer S> ? @sinclair/typebox.@sinclair/typebox.TIndexReduce<S, K> : T extends @sinclair/typebox.@sinclair/typebox.TIntersect<std.Array<@sinclair/typebox.@sinclair/typebox.TSchema>> ? @sinclair/typebox.@sinclair/typebox.UnionType<@sinclair/typebox.@sinclair/typebox.Flat<@sinclair/typebox.@sinclair/typebox.TIndexRestMany<T, K>>> : T extends @sinclair/typebox.@sinclair/typebox.TUnion<std.Array<@sinclair/typebox.@sinclair/typebox.TSchema>> ? @sinclair/typebox.@sinclair/typebox.UnionType<@sinclair/typebox.@sinclair/typebox.Flat<@sinclair/typebox.@sinclair/typebox.TIndexRestMany<T, K>>> : T extends @sinclair/typebox.@sinclair/typebox.TObject<@sinclair/typebox.@sinclair/typebox.TProperties> ? @sinclair/typebox.@sinclair/typebox.UnionType<@sinclair/typebox.@sinclair/typebox.Flat<@sinclair/typebox.@sinclair/typebox.TIndexRestMany<T, K>>> : T extends @sinclair/typebox.@sinclair/typebox.TTuple<std.Array<@sinclair/typebox.@sinclair/typebox.TSchema>> ? @sinclair/typebox.@sinclair/typebox.UnionType<@sinclair/typebox.@sinclair/typebox.Flat<@sinclair/typebox.@sinclair/typebox.TIndexRestMany<T, K>>> : @sinclair/typebox.@sinclair/typebox.TNever
  }}}
  */
type TIndexReduce[T /* <: TSchema */, K /* <: js.Array[Key] */] = TNever

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  T extends [infer L, ...infer R] ? [@sinclair/typebox.@sinclair/typebox.TIndexType<@sinclair/typebox.@sinclair/typebox.AssertType<L, @sinclair/typebox.@sinclair/typebox.TSchema>, K>, ...@sinclair/typebox.@sinclair/typebox.TIndexRest<@sinclair/typebox.@sinclair/typebox.AssertRest<R, std.Array<@sinclair/typebox.@sinclair/typebox.TSchema>>, K>] : []
  }}}
  */
type TIndexRest[T /* <: js.Array[TSchema] */, K /* <: Key */] = js.Array[Any]

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  K extends [infer L, ...infer R] ? [@sinclair/typebox.@sinclair/typebox.TIndexType<T, @sinclair/typebox.@sinclair/typebox.Assert<L, @sinclair/typebox.@sinclair/typebox.Key>>, ...@sinclair/typebox.@sinclair/typebox.TIndexRestMany<T, @sinclair/typebox.@sinclair/typebox.Assert<R, std.Array<@sinclair/typebox.@sinclair/typebox.Key>>>] : []
  }}}
  */
type TIndexRestMany[T /* <: TSchema */, K /* <: js.Array[Key] */] = js.Array[Any]

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  K extends keyof T ? [T[K]] : []
  }}}
  */
type TIndexTuple[T /* <: js.Array[TSchema] */, K /* <: Key */] = js.Array[
/* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any]

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  T extends @sinclair/typebox.@sinclair/typebox.TRecursive<infer S> ? @sinclair/typebox.@sinclair/typebox.TIndexType<S, K> : T extends @sinclair/typebox.@sinclair/typebox.TIntersect<infer S> ? @sinclair/typebox.@sinclair/typebox.IntersectType<@sinclair/typebox.@sinclair/typebox.AssertRest<@sinclair/typebox.@sinclair/typebox.Discard<@sinclair/typebox.@sinclair/typebox.Flat<@sinclair/typebox.@sinclair/typebox.TIndexRest<S, K>>, @sinclair/typebox.@sinclair/typebox.TNever>, std.Array<@sinclair/typebox.@sinclair/typebox.TSchema>>> : T extends @sinclair/typebox.@sinclair/typebox.TUnion<infer S> ? @sinclair/typebox.@sinclair/typebox.UnionType<@sinclair/typebox.@sinclair/typebox.AssertRest<@sinclair/typebox.@sinclair/typebox.Flat<@sinclair/typebox.@sinclair/typebox.TIndexRest<S, K>>, std.Array<@sinclair/typebox.@sinclair/typebox.TSchema>>> : T extends @sinclair/typebox.@sinclair/typebox.TObject<infer S> ? @sinclair/typebox.@sinclair/typebox.UnionType<@sinclair/typebox.@sinclair/typebox.AssertRest<@sinclair/typebox.@sinclair/typebox.Flat<@sinclair/typebox.@sinclair/typebox.TIndexProperty<S, K>>, std.Array<@sinclair/typebox.@sinclair/typebox.TSchema>>> : T extends @sinclair/typebox.@sinclair/typebox.TTuple<infer S> ? @sinclair/typebox.@sinclair/typebox.UnionType<@sinclair/typebox.@sinclair/typebox.AssertRest<@sinclair/typebox.@sinclair/typebox.Flat<@sinclair/typebox.@sinclair/typebox.TIndexTuple<S, K>>, std.Array<@sinclair/typebox.@sinclair/typebox.TSchema>>> : []
  }}}
  */
type TIndexType[T /* <: TSchema */, K /* <: Key */] = TNever

type TInstanceType[T /* <: TConstructor[js.Array[TSchema], TSchema] */] = /* import warning: importer.ImportType#apply Failed type conversion: T['returns'] */ js.Any

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  T extends @sinclair/typebox.@sinclair/typebox.TRecursive<infer S> ? @sinclair/typebox.@sinclair/typebox.TKeyOfProperties<S> : T extends @sinclair/typebox.@sinclair/typebox.TIntersect<std.Array<@sinclair/typebox.@sinclair/typebox.TSchema>> ? @sinclair/typebox.@sinclair/typebox.TKeyOfProperties<T> : T extends @sinclair/typebox.@sinclair/typebox.TUnion<std.Array<@sinclair/typebox.@sinclair/typebox.TSchema>> ? @sinclair/typebox.@sinclair/typebox.TKeyOfProperties<T> : T extends @sinclair/typebox.@sinclair/typebox.TObject<@sinclair/typebox.@sinclair/typebox.TProperties> ? @sinclair/typebox.@sinclair/typebox.TKeyOfProperties<T> : T extends @sinclair/typebox.@sinclair/typebox.TTuple<infer K> ? @sinclair/typebox.@sinclair/typebox.TKeyOfIndices<K> : T extends @sinclair/typebox.@sinclair/typebox.TArray<@sinclair/typebox.@sinclair/typebox.TSchema> ? [@sinclair/typebox.@sinclair/typebox.TNumber] : T extends @sinclair/typebox.@sinclair/typebox.TRecord<infer K, @sinclair/typebox.@sinclair/typebox.TSchema> ? [K] : [] extends infer R ? @sinclair/typebox.@sinclair/typebox.UnionType<@sinclair/typebox.@sinclair/typebox.AssertRest<R, std.Array<@sinclair/typebox.@sinclair/typebox.TSchema>>> : never
  }}}
  */
type TKeyOf[T /* <: TSchema */] = TNever

type TKeyOfIndices[T /* <: js.Array[TSchema] */] = AssertRest[
/* import warning: importer.ImportType#apply Failed type conversion: @sinclair/typebox.@sinclair/typebox.TKeyOfIndicesArray<T> extends infer R ? {[ K in keyof R ]: @sinclair/typebox.@sinclair/typebox.TLiteral<@sinclair/typebox.@sinclair/typebox.Assert<R[K], @sinclair/typebox.@sinclair/typebox.TLiteralValue>>} : [] */ js.Any, 
js.Array[TSchema]]

type TKeyOfIndicesArray[T /* <: js.Array[TSchema] */] = UnionToTuple[/* keyof T */ String, UnionLast[/* keyof T */ String]]

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  @sinclair/typebox.@sinclair/typebox.Static<T, []> extends infer S ? @sinclair/typebox.@sinclair/typebox.UnionToTuple<{[ K in keyof S ]: @sinclair/typebox.@sinclair/typebox.TLiteral<@sinclair/typebox.@sinclair/typebox.Assert<K, @sinclair/typebox.@sinclair/typebox.TLiteralValue>>}[keyof S], @sinclair/typebox.@sinclair/typebox.UnionLast<{[ K in keyof S ]: @sinclair/typebox.@sinclair/typebox.TLiteral<@sinclair/typebox.@sinclair/typebox.Assert<K, @sinclair/typebox.@sinclair/typebox.TLiteralValue>>}[keyof S]>> : []
  }}}
  */
type TKeyOfProperties[T /* <: TSchema */] = js.Array[Any]

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  T extends [infer L, ...infer R] ? [@sinclair/typebox.@sinclair/typebox.Assert<L, @sinclair/typebox.@sinclair/typebox.TLiteral<string | number>>['const'], ...@sinclair/typebox.@sinclair/typebox.TLiteralUnionReduce<@sinclair/typebox.@sinclair/typebox.Assert<R, std.Array<@sinclair/typebox.@sinclair/typebox.TLiteral<string | number>>>>] : []
  }}}
  */
type TLiteralUnionReduce[T /* <: js.Array[TLiteral[String | Double]] */] = js.Array[Any]

type TLiteralValue = String | Double | Boolean

type TOmitArray[T /* <: js.Array[TSchema] */, K /* <: /* keyof any */ String */] = AssertRest[
/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in keyof T ]: @sinclair/typebox.@sinclair/typebox.TOmit<@sinclair/typebox.@sinclair/typebox.AssertType<T[K2], @sinclair/typebox.@sinclair/typebox.TSchema>, K>} */ js.Any, 
js.Array[TSchema]]

type TOmitProperties[T /* <: TProperties */, K /* <: /* keyof any */ String */] = Evaluate[AssertProperties[Omit[T, K]]]

type TOptional[T /* <: TSchema */] = T & `0`

type TParameters[T /* <: TFunction[js.Array[TSchema], TSchema] */] = Ensure[
TTuple[
  /* import warning: importer.ImportType#apply Failed type conversion: T['parameters'] */ js.Any
]]

type TPartialArray[T /* <: js.Array[TSchema] */] = AssertRest[
/* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: @sinclair/typebox.@sinclair/typebox.TPartial<@sinclair/typebox.@sinclair/typebox.AssertType<T[K], @sinclair/typebox.@sinclair/typebox.TSchema>>} */ js.Any, 
js.Array[TSchema]]

type TPartialObjectArray[T /* <: js.Array[TObject[TProperties]] */] = AssertRest[
/* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: @sinclair/typebox.@sinclair/typebox.TPartial<@sinclair/typebox.@sinclair/typebox.AssertType<T[K], @sinclair/typebox.@sinclair/typebox.TObject<@sinclair/typebox.@sinclair/typebox.TProperties>>>} */ js.Any, 
js.Array[TObject[TProperties]]]

type TPartialProperties[T /* <: TProperties */] = Evaluate[
AssertProperties[
  /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: T[K] extends @sinclair/typebox.@sinclair/typebox.TReadonlyOptional<infer U>? @sinclair/typebox.@sinclair/typebox.TReadonlyOptional<U> : T[K] extends @sinclair/typebox.@sinclair/typebox.TReadonly<infer U>? @sinclair/typebox.@sinclair/typebox.TReadonlyOptional<U> : T[K] extends @sinclair/typebox.@sinclair/typebox.TOptional<infer U>? @sinclair/typebox.@sinclair/typebox.TOptional<U> : @sinclair/typebox.@sinclair/typebox.TOptional<T[K]>} */ js.Any
]]

type TProperties = Record[/* keyof any */ String, TSchema]

type TReadonly[T /* <: TSchema */] = T & typings.sinclairTypebox.anon.Modifier

type TReadonlyOptional[T /* <: TSchema */] = T & `1`

/** 
NOTE: Rewritten from type alias:
{{{
type TRecursiveReduce = @sinclair/typebox.@sinclair/typebox.Static<T, [@sinclair/typebox.@sinclair/typebox.TRecursiveReduce<T>]>
}}}
to avoid circular code involving: 
- @sinclair/typebox.@sinclair/typebox.TRecursiveReduce
*/
type TRecursiveReduce[T /* <: TSchema */] = Static[T, js.Array[Any]]

type TRequiredArray[T /* <: js.Array[TSchema] */] = AssertRest[
/* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: @sinclair/typebox.@sinclair/typebox.TRequired<@sinclair/typebox.@sinclair/typebox.AssertType<T[K], @sinclair/typebox.@sinclair/typebox.TSchema>>} */ js.Any, 
js.Array[TSchema]]

type TRequiredProperties[T /* <: TProperties */] = Evaluate[
AssertProperties[
  /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: T[K] extends @sinclair/typebox.@sinclair/typebox.TReadonlyOptional<infer U>? @sinclair/typebox.@sinclair/typebox.TReadonly<U> : T[K] extends @sinclair/typebox.@sinclair/typebox.TReadonly<infer U>? @sinclair/typebox.@sinclair/typebox.TReadonly<U> : T[K] extends @sinclair/typebox.@sinclair/typebox.TOptional<infer U>? U : T[K]} */ js.Any
]]

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  T extends @sinclair/typebox.@sinclair/typebox.TTuple<infer R> ? @sinclair/typebox.@sinclair/typebox.Assert<R, std.Array<@sinclair/typebox.@sinclair/typebox.TSchema>> : @sinclair/typebox.@sinclair/typebox.Assert<[T], std.Array<@sinclair/typebox.@sinclair/typebox.TSchema>>
  }}}
  */
type TRest[T /* <: TSchema */] = js.Array[T]

type TReturnType[T /* <: TFunction[js.Array[TSchema], TSchema] */] = /* import warning: importer.ImportType#apply Failed type conversion: T['returns'] */ js.Any

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  T extends @sinclair/typebox.@sinclair/typebox.TUnion<infer U> ? {[ K in keyof U ]: @sinclair/typebox.@sinclair/typebox.TTemplateLiteralUnion<@sinclair/typebox.@sinclair/typebox.Assert<[U[K]], std.Array<@sinclair/typebox.@sinclair/typebox.TTemplateLiteralKind>>, Acc>}[number] : T extends @sinclair/typebox.@sinclair/typebox.TTemplateLiteral<std.Array<@sinclair/typebox.@sinclair/typebox.TTemplateLiteralKind>> ? / * template literal string: ${Static<T>} * / string : T extends @sinclair/typebox.@sinclair/typebox.TLiteral<infer U> ? / * template literal string: ${U} * / string : T extends @sinclair/typebox.@sinclair/typebox.TString ? / * template literal string: ${string} * / string : T extends @sinclair/typebox.@sinclair/typebox.TNumber ? / * template literal string: ${number} * / string : T extends @sinclair/typebox.@sinclair/typebox.TBigInt ? / * template literal string: ${bigint} * / string : T extends @sinclair/typebox.@sinclair/typebox.TBoolean ? / * template literal string: ${boolean} * / string : never
  }}}
  */
type TTemplateLiteralConst[T, Acc /* <: String */] = /* template literal string: ${Static<T>} */ String

type TTemplateLiteralDslParser[T /* <: String */] = Ensure[
TTemplateLiteral[Assert[TTemplateLiteralDslParserTemplate[T], js.Array[TTemplateLiteralKind]]]]

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  T extends / * template literal string: {${inferL}}${inferR} * / string ? [@sinclair/typebox.@sinclair/typebox.TTemplateLiteralDslParserTerminal</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify L * / any>, ...@sinclair/typebox.@sinclair/typebox.TTemplateLiteralDslParserTemplate</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify R * / any>] : T extends / * template literal string: ${inferL}$${inferR} * / string ? [@sinclair/typebox.@sinclair/typebox.TLiteral</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify L * / any>, ...@sinclair/typebox.@sinclair/typebox.TTemplateLiteralDslParserTemplate</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify R * / any>] : T extends / * template literal string: ${inferL} * / string ? [@sinclair/typebox.@sinclair/typebox.TLiteral</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify L * / any>] : []
  }}}
  */
type TTemplateLiteralDslParserTemplate[T /* <: String */] = js.Array[
TLiteral[
  /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify L */ Any
]]

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  T extends 'boolean' ? @sinclair/typebox.@sinclair/typebox.TBoolean : T extends 'bigint' ? @sinclair/typebox.@sinclair/typebox.TBigInt : T extends 'number' ? @sinclair/typebox.@sinclair/typebox.TNumber : T extends 'string' ? @sinclair/typebox.@sinclair/typebox.TString : @sinclair/typebox.@sinclair/typebox.TTemplateLiteralDslParserUnion<T>
  }}}
  */
type TTemplateLiteralDslParserTerminal[T /* <: String */] = TBoolean

type TTemplateLiteralDslParserUnion[T /* <: String */] = UnionType[TTemplateLiteralDslParserUnionLiteral[T]]

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  T extends / * template literal string: ${inferL}|${inferR} * / string ? [@sinclair/typebox.@sinclair/typebox.TLiteral<@sinclair/typebox.@sinclair/typebox.Trim</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify L * / any>>, ...@sinclair/typebox.@sinclair/typebox.TTemplateLiteralDslParserUnionLiteral</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify R * / any>] : T extends / * template literal string: ${inferL} * / string ? [@sinclair/typebox.@sinclair/typebox.TLiteral<@sinclair/typebox.@sinclair/typebox.Trim</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify L * / any>>] : []
  }}}
  */
type TTemplateLiteralDslParserUnionLiteral[T /* <: String */] = js.Array[
TLiteral[
  Trim[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify L */ Any
  ]
]]

type TTemplateLiteralKeyRest[T /* <: TTemplateLiteral[js.Array[TTemplateLiteralKind]] */] = Assert[
UnionToTuple[Static[T, js.Array[Any]], UnionLast[Static[T, js.Array[Any]]]], 
js.Array[Key]]

/** 
NOTE: Rewritten from type alias:
{{{
type TTemplateLiteralKind = @sinclair/typebox.@sinclair/typebox.TUnion<std.Array<@sinclair/typebox.@sinclair/typebox.TSchema>> | @sinclair/typebox.@sinclair/typebox.TLiteral<@sinclair/typebox.@sinclair/typebox.TLiteralValue> | @sinclair/typebox.@sinclair/typebox.TInteger | @sinclair/typebox.@sinclair/typebox.TTemplateLiteral<std.Array<@sinclair/typebox.@sinclair/typebox.TTemplateLiteralKind>> | @sinclair/typebox.@sinclair/typebox.TNumber | @sinclair/typebox.@sinclair/typebox.TBigInt | @sinclair/typebox.@sinclair/typebox.TString | @sinclair/typebox.@sinclair/typebox.TBoolean | @sinclair/typebox.@sinclair/typebox.TNever
}}}
to avoid circular code involving: 
- @sinclair/typebox.@sinclair/typebox.RecordKey
- @sinclair/typebox.@sinclair/typebox.TAnySchema
- @sinclair/typebox.@sinclair/typebox.TTemplateLiteralDslParser
- @sinclair/typebox.@sinclair/typebox.TTemplateLiteralKind
*/
/* Rewritten from type alias, can be one of: 
  - typings.sinclairTypebox.mod.TUnion[js.Array[typings.sinclairTypebox.mod.TSchema]]
  - typings.sinclairTypebox.mod.TLiteral[typings.sinclairTypebox.mod.TLiteralValue]
  - typings.sinclairTypebox.mod.TInteger
  - typings.sinclairTypebox.mod.TTemplateLiteral[js.Array[scala.Any]]
  - typings.sinclairTypebox.mod.TNumber
  - typings.sinclairTypebox.mod.TBigInt
  - typings.sinclairTypebox.mod.TString
  - typings.sinclairTypebox.mod.TBoolean
  - typings.sinclairTypebox.mod.TNever
*/
type TTemplateLiteralKind = _TTemplateLiteralKind | TUnion[js.Array[TSchema]] | TLiteral[TLiteralValue] | TTemplateLiteral[js.Array[Any]]

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  T extends [infer L, ...infer R] ? / * template literal string: ${TTemplateLiteralConst<L,Acc>}${TTemplateLiteralUnion<Assert<R,TTemplateLiteralKind[]>,Acc>} * / string : Acc
  }}}
  */
type TTemplateLiteralUnion[T /* <: js.Array[TTemplateLiteralKind] */, Acc /* <: String */] = Acc

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  T extends [infer L, ...infer R] ? [@sinclair/typebox.@sinclair/typebox.Static<@sinclair/typebox.@sinclair/typebox.AssertType<L, @sinclair/typebox.@sinclair/typebox.TSchema>, P>, ...@sinclair/typebox.@sinclair/typebox.TTupleInfer<@sinclair/typebox.@sinclair/typebox.AssertRest<R, std.Array<@sinclair/typebox.@sinclair/typebox.TSchema>>, P>] : []
  }}}
  */
type TTupleInfer[T /* <: js.Array[TSchema] */, P /* <: js.Array[Any] */] = js.Array[Any]

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  T extends @sinclair/typebox.@sinclair/typebox.TTuple<infer R> ? @sinclair/typebox.@sinclair/typebox.AssertRest<R, std.Array<@sinclair/typebox.@sinclair/typebox.TSchema>> : never
  }}}
  */
type TTupleIntoArray[T /* <: TTuple[js.Array[TSchema]] */] = js.Array[Any]

type TUnevaluatedProperties = js.UndefOr[TSchema | Boolean]

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  T extends @sinclair/typebox.@sinclair/typebox.TUnion<infer S> ? @sinclair/typebox.@sinclair/typebox.TLiteralUnionReduce<@sinclair/typebox.@sinclair/typebox.Assert<S, std.Array<@sinclair/typebox.@sinclair/typebox.TLiteral<string | number>>>> : []
  }}}
  */
type TUnionLiteralKeyRest[T /* <: TUnion[js.Array[TLiteral[String | Double]]] */] = js.Array[Any]

type TUnionTemplateLiteral[T /* <: TTemplateLiteral[js.Array[TTemplateLiteralKind]] */, S /* <: String */] = Ensure[
UnionType[
  Assert[
    UnionToTuple[
      /* import warning: importer.ImportType#apply Failed type conversion: {[ K in S ]: @sinclair/typebox.@sinclair/typebox.TLiteral<K>}[S] */ js.Any, 
      UnionLast[
        /* import warning: importer.ImportType#apply Failed type conversion: {[ K in S ]: @sinclair/typebox.@sinclair/typebox.TLiteral<K>}[S] */ js.Any
      ]
    ], 
    js.Array[TLiteral[TLiteralValue]]
  ]
]]

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  T extends / * template literal string: ${ }${inferU} * / string ? @sinclair/typebox.@sinclair/typebox.Trim</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify U * / any> : T extends / * template literal string: ${inferU}${ } * / string ? @sinclair/typebox.@sinclair/typebox.Trim</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify U * / any> : T
  }}}
  */
type Trim[T] = T

type TupleToUnion[T /* <: js.Array[Any] */] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: T[K]}[number] */ js.Any

type TypeRegistryValidationFunction[TSchema] = js.Function2[/* schema */ TSchema, /* value */ Any, Boolean]

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  [U] extends [never] ? [] : [...@sinclair/typebox.@sinclair/typebox.UnionToTuple<std.Exclude<U, L>, @sinclair/typebox.@sinclair/typebox.UnionLast<std.Exclude<U, L>>>, L]
  }}}
  */
type UnionToTuple[U, L] = js.Array[Any]

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  T extends [] ? @sinclair/typebox.@sinclair/typebox.TNever : T extends [@sinclair/typebox.@sinclair/typebox.TSchema] ? @sinclair/typebox.@sinclair/typebox.AssertType<T[0], @sinclair/typebox.@sinclair/typebox.TSchema> : @sinclair/typebox.@sinclair/typebox.TUnion<T>
  }}}
  */
type UnionType[T /* <: js.Array[TSchema] */] = TNever
