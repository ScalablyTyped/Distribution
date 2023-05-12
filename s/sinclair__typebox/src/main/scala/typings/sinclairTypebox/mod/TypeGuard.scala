package typings.sinclairTypebox.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TypeGuard {
  
  @JSImport("@sinclair/typebox", "TypeGuard")
  @js.native
  val ^ : js.Any = js.native
  
  /** Returns true if the given schema is TAny */
  inline def TAny(schema: Any): /* is @sinclair/typebox.@sinclair/typebox.TAny */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("TAny")(schema.asInstanceOf[js.Any]).asInstanceOf[/* is @sinclair/typebox.@sinclair/typebox.TAny */ Boolean]
  
  /** Returns true if the given schema is TArray */
  inline def TArray(schema: Any): /* is @sinclair/typebox.@sinclair/typebox.TArray<@sinclair/typebox.@sinclair/typebox.TSchema> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("TArray")(schema.asInstanceOf[js.Any]).asInstanceOf[/* is @sinclair/typebox.@sinclair/typebox.TArray<@sinclair/typebox.@sinclair/typebox.TSchema> */ Boolean]
  
  /** Returns true if the given schema is TBigInt */
  inline def TBigInt(schema: Any): /* is @sinclair/typebox.@sinclair/typebox.TBigInt */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("TBigInt")(schema.asInstanceOf[js.Any]).asInstanceOf[/* is @sinclair/typebox.@sinclair/typebox.TBigInt */ Boolean]
  
  /** Returns true if the given schema is TBoolean */
  inline def TBoolean(schema: Any): /* is @sinclair/typebox.@sinclair/typebox.TBoolean */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("TBoolean")(schema.asInstanceOf[js.Any]).asInstanceOf[/* is @sinclair/typebox.@sinclair/typebox.TBoolean */ Boolean]
  
  /** Returns true if the given schema is TConstructor */
  inline def TConstructor(schema: Any): /* is @sinclair/typebox.@sinclair/typebox.TConstructor<std.Array<@sinclair/typebox.@sinclair/typebox.TSchema>, @sinclair/typebox.@sinclair/typebox.TSchema> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("TConstructor")(schema.asInstanceOf[js.Any]).asInstanceOf[/* is @sinclair/typebox.@sinclair/typebox.TConstructor<std.Array<@sinclair/typebox.@sinclair/typebox.TSchema>, @sinclair/typebox.@sinclair/typebox.TSchema> */ Boolean]
  
  /** Returns true if the given schema is TDate */
  inline def TDate(schema: Any): /* is @sinclair/typebox.@sinclair/typebox.TDate */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("TDate")(schema.asInstanceOf[js.Any]).asInstanceOf[/* is @sinclair/typebox.@sinclair/typebox.TDate */ Boolean]
  
  /** Returns true if the given schema is TFunction */
  inline def TFunction(schema: Any): /* is @sinclair/typebox.@sinclair/typebox.TFunction<std.Array<@sinclair/typebox.@sinclair/typebox.TSchema>, @sinclair/typebox.@sinclair/typebox.TSchema> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("TFunction")(schema.asInstanceOf[js.Any]).asInstanceOf[/* is @sinclair/typebox.@sinclair/typebox.TFunction<std.Array<@sinclair/typebox.@sinclair/typebox.TSchema>, @sinclair/typebox.@sinclair/typebox.TSchema> */ Boolean]
  
  /** Returns true if the given schema is TInteger */
  inline def TInteger(schema: Any): /* is @sinclair/typebox.@sinclair/typebox.TInteger */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("TInteger")(schema.asInstanceOf[js.Any]).asInstanceOf[/* is @sinclair/typebox.@sinclair/typebox.TInteger */ Boolean]
  
  /** Returns true if the given schema is TIntersect */
  inline def TIntersect(schema: Any): /* is @sinclair/typebox.@sinclair/typebox.TIntersect<std.Array<@sinclair/typebox.@sinclair/typebox.TSchema>> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("TIntersect")(schema.asInstanceOf[js.Any]).asInstanceOf[/* is @sinclair/typebox.@sinclair/typebox.TIntersect<std.Array<@sinclair/typebox.@sinclair/typebox.TSchema>> */ Boolean]
  
  /** Returns true if the given schema is TKind */
  inline def TKind(schema: Any): /* is std.Record<symbol | string, unknown> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("TKind")(schema.asInstanceOf[js.Any]).asInstanceOf[/* is std.Record<symbol | string, unknown> */ Boolean]
  
  /** Returns true if the given schema is TLiteral */
  inline def TLiteral(schema: Any): /* is @sinclair/typebox.@sinclair/typebox.TLiteral<@sinclair/typebox.@sinclair/typebox.TLiteralValue> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("TLiteral")(schema.asInstanceOf[js.Any]).asInstanceOf[/* is @sinclair/typebox.@sinclair/typebox.TLiteral<@sinclair/typebox.@sinclair/typebox.TLiteralValue> */ Boolean]
  
  /** Returns true if the given schema is TLiteral<boolean> */
  inline def TLiteralBoolean(schema: Any): /* is @sinclair/typebox.@sinclair/typebox.TLiteral<boolean> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("TLiteralBoolean")(schema.asInstanceOf[js.Any]).asInstanceOf[/* is @sinclair/typebox.@sinclair/typebox.TLiteral<boolean> */ Boolean]
  
  /** Returns true if the given schema is TLiteral<number> */
  inline def TLiteralNumber(schema: Any): /* is @sinclair/typebox.@sinclair/typebox.TLiteral<number> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("TLiteralNumber")(schema.asInstanceOf[js.Any]).asInstanceOf[/* is @sinclair/typebox.@sinclair/typebox.TLiteral<number> */ Boolean]
  
  /** Returns true if the given schema is TLiteral<string> */
  inline def TLiteralString(schema: Any): /* is @sinclair/typebox.@sinclair/typebox.TLiteral<string> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("TLiteralString")(schema.asInstanceOf[js.Any]).asInstanceOf[/* is @sinclair/typebox.@sinclair/typebox.TLiteral<string> */ Boolean]
  
  /** Returns true if the given schema is TNever */
  inline def TNever(schema: Any): /* is @sinclair/typebox.@sinclair/typebox.TNever */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("TNever")(schema.asInstanceOf[js.Any]).asInstanceOf[/* is @sinclair/typebox.@sinclair/typebox.TNever */ Boolean]
  
  /** Returns true if the given schema is TNot */
  inline def TNot(schema: Any): /* is @sinclair/typebox.@sinclair/typebox.TNot<@sinclair/typebox.@sinclair/typebox.TSchema, @sinclair/typebox.@sinclair/typebox.TSchema> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("TNot")(schema.asInstanceOf[js.Any]).asInstanceOf[/* is @sinclair/typebox.@sinclair/typebox.TNot<@sinclair/typebox.@sinclair/typebox.TSchema, @sinclair/typebox.@sinclair/typebox.TSchema> */ Boolean]
  
  /** Returns true if the given schema is TNull */
  inline def TNull(schema: Any): /* is @sinclair/typebox.@sinclair/typebox.TNull */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("TNull")(schema.asInstanceOf[js.Any]).asInstanceOf[/* is @sinclair/typebox.@sinclair/typebox.TNull */ Boolean]
  
  /** Returns true if the given schema is TNumber */
  inline def TNumber(schema: Any): /* is @sinclair/typebox.@sinclair/typebox.TNumber */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("TNumber")(schema.asInstanceOf[js.Any]).asInstanceOf[/* is @sinclair/typebox.@sinclair/typebox.TNumber */ Boolean]
  
  /** Returns true if the given schema is TObject */
  inline def TObject(schema: Any): /* is @sinclair/typebox.@sinclair/typebox.TObject<@sinclair/typebox.@sinclair/typebox.TProperties> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("TObject")(schema.asInstanceOf[js.Any]).asInstanceOf[/* is @sinclair/typebox.@sinclair/typebox.TObject<@sinclair/typebox.@sinclair/typebox.TProperties> */ Boolean]
  
  /** Returns true if this schema has the Optional modifier */
  inline def TOptional[T /* <: TSchema */](schema: T): /* is @sinclair/typebox.@sinclair/typebox.TOptional<T> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("TOptional")(schema.asInstanceOf[js.Any]).asInstanceOf[/* is @sinclair/typebox.@sinclair/typebox.TOptional<T> */ Boolean]
  
  /** Returns true if the given schema is TPromise */
  inline def TPromise(schema: Any): /* is @sinclair/typebox.@sinclair/typebox.TPromise<@sinclair/typebox.@sinclair/typebox.TSchema> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("TPromise")(schema.asInstanceOf[js.Any]).asInstanceOf[/* is @sinclair/typebox.@sinclair/typebox.TPromise<@sinclair/typebox.@sinclair/typebox.TSchema> */ Boolean]
  
  /** Returns true if this schema has the Readonly modifier */
  inline def TReadonly[T /* <: TSchema */](schema: T): /* is @sinclair/typebox.@sinclair/typebox.TReadonly<T> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("TReadonly")(schema.asInstanceOf[js.Any]).asInstanceOf[/* is @sinclair/typebox.@sinclair/typebox.TReadonly<T> */ Boolean]
  
  /** Returns true if this schema has the ReadonlyOptional modifier */
  inline def TReadonlyOptional[T /* <: TSchema */](schema: T): /* is @sinclair/typebox.@sinclair/typebox.TReadonlyOptional<T> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("TReadonlyOptional")(schema.asInstanceOf[js.Any]).asInstanceOf[/* is @sinclair/typebox.@sinclair/typebox.TReadonlyOptional<T> */ Boolean]
  
  /** Returns true if the given schema is TRecord */
  inline def TRecord(schema: Any): /* is @sinclair/typebox.@sinclair/typebox.TRecord<@sinclair/typebox.@sinclair/typebox.RecordKey, @sinclair/typebox.@sinclair/typebox.TSchema> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("TRecord")(schema.asInstanceOf[js.Any]).asInstanceOf[/* is @sinclair/typebox.@sinclair/typebox.TRecord<@sinclair/typebox.@sinclair/typebox.RecordKey, @sinclair/typebox.@sinclair/typebox.TSchema> */ Boolean]
  
  /** Returns true if the given schema is TRef */
  inline def TRef(schema: Any): /* is @sinclair/typebox.@sinclair/typebox.TRef<@sinclair/typebox.@sinclair/typebox.TSchema> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("TRef")(schema.asInstanceOf[js.Any]).asInstanceOf[/* is @sinclair/typebox.@sinclair/typebox.TRef<@sinclair/typebox.@sinclair/typebox.TSchema> */ Boolean]
  
  /** Returns true if the given schema is TSchema */
  inline def TSchema(schema: Any): /* is @sinclair/typebox.@sinclair/typebox.TSchema */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("TSchema")(schema.asInstanceOf[js.Any]).asInstanceOf[/* is @sinclair/typebox.@sinclair/typebox.TSchema */ Boolean]
  
  /** Returns true if the given schema is TString */
  inline def TString(schema: Any): /* is @sinclair/typebox.@sinclair/typebox.TString */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("TString")(schema.asInstanceOf[js.Any]).asInstanceOf[/* is @sinclair/typebox.@sinclair/typebox.TString */ Boolean]
  
  /** Returns true if the given schema is TSymbol */
  inline def TSymbol(schema: Any): /* is @sinclair/typebox.@sinclair/typebox.TSymbol */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("TSymbol")(schema.asInstanceOf[js.Any]).asInstanceOf[/* is @sinclair/typebox.@sinclair/typebox.TSymbol */ Boolean]
  
  /** Returns true if the given schema is TTemplateLiteral */
  inline def TTemplateLiteral(schema: Any): /* is @sinclair/typebox.@sinclair/typebox.TTemplateLiteral<std.Array<@sinclair/typebox.@sinclair/typebox.TTemplateLiteralKind>> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("TTemplateLiteral")(schema.asInstanceOf[js.Any]).asInstanceOf[/* is @sinclair/typebox.@sinclair/typebox.TTemplateLiteral<std.Array<@sinclair/typebox.@sinclair/typebox.TTemplateLiteralKind>> */ Boolean]
  
  /** Returns true if the given schema is TThis */
  inline def TThis(schema: Any): /* is @sinclair/typebox.@sinclair/typebox.TThis */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("TThis")(schema.asInstanceOf[js.Any]).asInstanceOf[/* is @sinclair/typebox.@sinclair/typebox.TThis */ Boolean]
  
  /** Returns true if the given schema is TTuple */
  inline def TTuple(schema: Any): /* is @sinclair/typebox.@sinclair/typebox.TTuple<std.Array<@sinclair/typebox.@sinclair/typebox.TSchema>> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("TTuple")(schema.asInstanceOf[js.Any]).asInstanceOf[/* is @sinclair/typebox.@sinclair/typebox.TTuple<std.Array<@sinclair/typebox.@sinclair/typebox.TSchema>> */ Boolean]
  
  /** Returns true if the given schema is TUint8Array */
  inline def TUint8Array(schema: Any): /* is @sinclair/typebox.@sinclair/typebox.TUint8Array */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("TUint8Array")(schema.asInstanceOf[js.Any]).asInstanceOf[/* is @sinclair/typebox.@sinclair/typebox.TUint8Array */ Boolean]
  
  /** Returns true if the given schema is TUndefined */
  inline def TUndefined(schema: Any): /* is @sinclair/typebox.@sinclair/typebox.TUndefined */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("TUndefined")(schema.asInstanceOf[js.Any]).asInstanceOf[/* is @sinclair/typebox.@sinclair/typebox.TUndefined */ Boolean]
  
  /** Returns true if the given schema is TUnion */
  inline def TUnion(schema: Any): /* is @sinclair/typebox.@sinclair/typebox.TUnion<std.Array<@sinclair/typebox.@sinclair/typebox.TSchema>> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("TUnion")(schema.asInstanceOf[js.Any]).asInstanceOf[/* is @sinclair/typebox.@sinclair/typebox.TUnion<std.Array<@sinclair/typebox.@sinclair/typebox.TSchema>> */ Boolean]
  
  /** Returns true if the given schema is TUnion<Literal<string | number>[]> */
  inline def TUnionLiteral(schema: Any): /* is @sinclair/typebox.@sinclair/typebox.TUnion<std.Array<@sinclair/typebox.@sinclair/typebox.TLiteral<@sinclair/typebox.@sinclair/typebox.TLiteralValue>>> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("TUnionLiteral")(schema.asInstanceOf[js.Any]).asInstanceOf[/* is @sinclair/typebox.@sinclair/typebox.TUnion<std.Array<@sinclair/typebox.@sinclair/typebox.TLiteral<@sinclair/typebox.@sinclair/typebox.TLiteralValue>>> */ Boolean]
  
  /** Returns true if the given schema is TUnknown */
  inline def TUnknown(schema: Any): /* is @sinclair/typebox.@sinclair/typebox.TUnknown */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("TUnknown")(schema.asInstanceOf[js.Any]).asInstanceOf[/* is @sinclair/typebox.@sinclair/typebox.TUnknown */ Boolean]
  
  /** Returns true if the given schema is a raw TUnsafe */
  inline def TUnsafe(schema: Any): /* is @sinclair/typebox.@sinclair/typebox.TUnsafe<unknown> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("TUnsafe")(schema.asInstanceOf[js.Any]).asInstanceOf[/* is @sinclair/typebox.@sinclair/typebox.TUnsafe<unknown> */ Boolean]
  
  /** Returns true if the given schema is TVoid */
  inline def TVoid(schema: Any): /* is @sinclair/typebox.@sinclair/typebox.TVoid */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("TVoid")(schema.asInstanceOf[js.Any]).asInstanceOf[/* is @sinclair/typebox.@sinclair/typebox.TVoid */ Boolean]
}
