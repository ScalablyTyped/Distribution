package typings.sinclairTypebox

import typings.sinclairTypebox.mod.TSchema
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object guardMod {
  
  object TypeGuard {
    
    @JSImport("@sinclair/typebox/guard", "TypeGuard")
    @js.native
    val ^ : js.Any = js.native
    
    /** Asserts if this schema and associated references are valid. */
    inline def Assert[T /* <: TSchema */](schema: T): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("Assert")(schema.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def Assert[T /* <: TSchema */](schema: T, references: js.Array[TSchema]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Assert")(schema.asInstanceOf[js.Any], references.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** Returns true if the given schema is TAny */
    inline def TAny(schema: Any): /* is @sinclair/typebox.@sinclair/typebox.TAny */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("TAny")(schema.asInstanceOf[js.Any]).asInstanceOf[/* is @sinclair/typebox.@sinclair/typebox.TAny */ Boolean]
    
    /** Returns true if the given schema is TArray */
    inline def TArray(schema: Any): /* is @sinclair/typebox.@sinclair/typebox.TArray<@sinclair/typebox.@sinclair/typebox.TSchema> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("TArray")(schema.asInstanceOf[js.Any]).asInstanceOf[/* is @sinclair/typebox.@sinclair/typebox.TArray<@sinclair/typebox.@sinclair/typebox.TSchema> */ Boolean]
    
    /** Returns true if the given schema is TBoolean */
    inline def TBoolean(schema: Any): /* is @sinclair/typebox.@sinclair/typebox.TBoolean */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("TBoolean")(schema.asInstanceOf[js.Any]).asInstanceOf[/* is @sinclair/typebox.@sinclair/typebox.TBoolean */ Boolean]
    
    /** Returns true if the given schema is TConstructor */
    inline def TConstructor(schema: Any): /* is @sinclair/typebox.@sinclair/typebox.TConstructor<std.Array<@sinclair/typebox.@sinclair/typebox.TSchema>, @sinclair/typebox.@sinclair/typebox.TSchema> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("TConstructor")(schema.asInstanceOf[js.Any]).asInstanceOf[/* is @sinclair/typebox.@sinclair/typebox.TConstructor<std.Array<@sinclair/typebox.@sinclair/typebox.TSchema>, @sinclair/typebox.@sinclair/typebox.TSchema> */ Boolean]
    
    /** Returns true if the given schema is TFunction */
    inline def TFunction(schema: Any): /* is @sinclair/typebox.@sinclair/typebox.TFunction<std.Array<@sinclair/typebox.@sinclair/typebox.TSchema>, @sinclair/typebox.@sinclair/typebox.TSchema> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("TFunction")(schema.asInstanceOf[js.Any]).asInstanceOf[/* is @sinclair/typebox.@sinclair/typebox.TFunction<std.Array<@sinclair/typebox.@sinclair/typebox.TSchema>, @sinclair/typebox.@sinclair/typebox.TSchema> */ Boolean]
    
    /** Returns true if the given schema is TInteger */
    inline def TInteger(schema: Any): /* is @sinclair/typebox.@sinclair/typebox.TInteger */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("TInteger")(schema.asInstanceOf[js.Any]).asInstanceOf[/* is @sinclair/typebox.@sinclair/typebox.TInteger */ Boolean]
    
    /** Returns true if the given schema is TLiteral */
    inline def TLiteral(schema: Any): /* is @sinclair/typebox.@sinclair/typebox.TLiteral<@sinclair/typebox.@sinclair/typebox.TLiteralValue> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("TLiteral")(schema.asInstanceOf[js.Any]).asInstanceOf[/* is @sinclair/typebox.@sinclair/typebox.TLiteral<@sinclair/typebox.@sinclair/typebox.TLiteralValue> */ Boolean]
    
    /** Returns true if the given schema is TNever */
    inline def TNever(schema: Any): /* is @sinclair/typebox.@sinclair/typebox.TNever */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("TNever")(schema.asInstanceOf[js.Any]).asInstanceOf[/* is @sinclair/typebox.@sinclair/typebox.TNever */ Boolean]
    
    /** Returns true if the given schema is TNull */
    inline def TNull(schema: Any): /* is @sinclair/typebox.@sinclair/typebox.TNull */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("TNull")(schema.asInstanceOf[js.Any]).asInstanceOf[/* is @sinclair/typebox.@sinclair/typebox.TNull */ Boolean]
    
    /** Returns true if the given schema is TNumber */
    inline def TNumber(schema: Any): /* is @sinclair/typebox.@sinclair/typebox.TNumber */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("TNumber")(schema.asInstanceOf[js.Any]).asInstanceOf[/* is @sinclair/typebox.@sinclair/typebox.TNumber */ Boolean]
    
    /** Returns true if the given schema is TObject */
    inline def TObject(schema: Any): /* is @sinclair/typebox.@sinclair/typebox.TObject<@sinclair/typebox.@sinclair/typebox.TProperties> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("TObject")(schema.asInstanceOf[js.Any]).asInstanceOf[/* is @sinclair/typebox.@sinclair/typebox.TObject<@sinclair/typebox.@sinclair/typebox.TProperties> */ Boolean]
    
    /** Returns true if the given schema is TPromise */
    inline def TPromise(schema: Any): /* is @sinclair/typebox.@sinclair/typebox.TPromise<@sinclair/typebox.@sinclair/typebox.TSchema> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("TPromise")(schema.asInstanceOf[js.Any]).asInstanceOf[/* is @sinclair/typebox.@sinclair/typebox.TPromise<@sinclair/typebox.@sinclair/typebox.TSchema> */ Boolean]
    
    /** Returns true if the given schema is TRecord */
    inline def TRecord(schema: Any): /* is @sinclair/typebox.@sinclair/typebox.TRecord<@sinclair/typebox.@sinclair/typebox.TRecordKey, @sinclair/typebox.@sinclair/typebox.TSchema> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("TRecord")(schema.asInstanceOf[js.Any]).asInstanceOf[/* is @sinclair/typebox.@sinclair/typebox.TRecord<@sinclair/typebox.@sinclair/typebox.TRecordKey, @sinclair/typebox.@sinclair/typebox.TSchema> */ Boolean]
    
    /** Returns true if the given schema is TRef */
    inline def TRef(schema: Any): /* is @sinclair/typebox.@sinclair/typebox.TRef<@sinclair/typebox.@sinclair/typebox.TSchema> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("TRef")(schema.asInstanceOf[js.Any]).asInstanceOf[/* is @sinclair/typebox.@sinclair/typebox.TRef<@sinclair/typebox.@sinclair/typebox.TSchema> */ Boolean]
    
    /** Returns true if the given schema is TSchema */
    inline def TSchema(schema: Any): /* is @sinclair/typebox.@sinclair/typebox.TSchema */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("TSchema")(schema.asInstanceOf[js.Any]).asInstanceOf[/* is @sinclair/typebox.@sinclair/typebox.TSchema */ Boolean]
    
    /** Returns true if the given schema is TSelf */
    inline def TSelf(schema: Any): /* is @sinclair/typebox.@sinclair/typebox.TSelf */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("TSelf")(schema.asInstanceOf[js.Any]).asInstanceOf[/* is @sinclair/typebox.@sinclair/typebox.TSelf */ Boolean]
    
    /** Returns true if the given schema is TString */
    inline def TString(schema: Any): /* is @sinclair/typebox.@sinclair/typebox.TString<string> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("TString")(schema.asInstanceOf[js.Any]).asInstanceOf[/* is @sinclair/typebox.@sinclair/typebox.TString<string> */ Boolean]
    
    /** Returns true if the given schema is TTuple */
    inline def TTuple(schema: Any): /* is @sinclair/typebox.@sinclair/typebox.TTuple<std.Array<@sinclair/typebox.@sinclair/typebox.TSchema>> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("TTuple")(schema.asInstanceOf[js.Any]).asInstanceOf[/* is @sinclair/typebox.@sinclair/typebox.TTuple<std.Array<@sinclair/typebox.@sinclair/typebox.TSchema>> */ Boolean]
    
    /** Returns true if the given schema is TUint8Array */
    inline def TUint8Array(schema: Any): /* is @sinclair/typebox.@sinclair/typebox.TUint8Array */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("TUint8Array")(schema.asInstanceOf[js.Any]).asInstanceOf[/* is @sinclair/typebox.@sinclair/typebox.TUint8Array */ Boolean]
    
    /** Returns true if the given schema is TUndefined */
    inline def TUndefined(schema: Any): /* is @sinclair/typebox.@sinclair/typebox.TUndefined */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("TUndefined")(schema.asInstanceOf[js.Any]).asInstanceOf[/* is @sinclair/typebox.@sinclair/typebox.TUndefined */ Boolean]
    
    /** Returns true if the given schema is TUnion */
    inline def TUnion(schema: Any): /* is @sinclair/typebox.@sinclair/typebox.TUnion<std.Array<@sinclair/typebox.@sinclair/typebox.TSchema>> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("TUnion")(schema.asInstanceOf[js.Any]).asInstanceOf[/* is @sinclair/typebox.@sinclair/typebox.TUnion<std.Array<@sinclair/typebox.@sinclair/typebox.TSchema>> */ Boolean]
    
    /** Returns true if the given schema is TUnknown */
    inline def TUnknown(schema: Any): /* is @sinclair/typebox.@sinclair/typebox.TUnknown */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("TUnknown")(schema.asInstanceOf[js.Any]).asInstanceOf[/* is @sinclair/typebox.@sinclair/typebox.TUnknown */ Boolean]
    
    /** Returns true if the given schema is TVoid */
    inline def TVoid(schema: Any): /* is @sinclair/typebox.@sinclair/typebox.TVoid */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("TVoid")(schema.asInstanceOf[js.Any]).asInstanceOf[/* is @sinclair/typebox.@sinclair/typebox.TVoid */ Boolean]
  }
  
  @JSImport("@sinclair/typebox/guard", "TypeGuardInvalidTypeError")
  @js.native
  open class TypeGuardInvalidTypeError protected ()
    extends typings.sinclairTypebox.guardGuardMod.TypeGuardInvalidTypeError {
    def this(schema: Any) = this()
  }
}
