package typings.sinclairTypebox

import typings.sinclairTypebox.anon.Path
import typings.sinclairTypebox.anon.PathType
import typings.sinclairTypebox.anon.Type
import typings.sinclairTypebox.errorsErrorsMod.ValueError
import typings.sinclairTypebox.mod.Static
import typings.sinclairTypebox.mod.TObject
import typings.sinclairTypebox.mod.TSchema
import typings.sinclairTypebox.mod.TUnion
import typings.sinclairTypebox.valueMutateMod.Mutable
import typings.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object valueMod {
  
  @JSImport("@sinclair/typebox/value", "Delete")
  @js.native
  val Delete: TObject[PathType] = js.native
  
  @JSImport("@sinclair/typebox/value", "Edit")
  @js.native
  val Edit: TUnion[js.Tuple3[TObject[Path], TObject[Type], TObject[PathType]]] = js.native
  
  @JSImport("@sinclair/typebox/value", "Insert")
  @js.native
  val Insert: TObject[Path] = js.native
  
  @JSImport("@sinclair/typebox/value", "Update")
  @js.native
  val Update: TObject[Type] = js.native
  
  object Value {
    
    @JSImport("@sinclair/typebox/value", "Value")
    @js.native
    val ^ : js.Any = js.native
    
    /** Casts a value into a given type. The return value will retain as much information of the original value as possible. Cast will convert string, number, boolean and date values if a reasonable conversion is possible. */
    inline def Cast[T /* <: TSchema */](schema: T, value: Any): Static[T, js.Array[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("Cast")(schema.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Static[T, js.Array[Any]]]
    /** Casts a value into a given type. The return value will retain as much information of the original value as possible. Cast will convert string, number, boolean and date values if a reasonable conversion is possible. */
    inline def Cast[T /* <: TSchema */, R /* <: js.Array[TSchema] */](
      schema: T,
      references: /* import warning: importer.ImportType#apply c repeated non-array type: R */ js.Array[R],
      value: Any
    ): Static[T, js.Array[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("Cast")(schema.asInstanceOf[js.Any], references.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Static[T, js.Array[Any]]]
    
    /** Returns true if the value matches the given type. */
    inline def Check[T /* <: TSchema */](schema: T, value: Any): /* is @sinclair/typebox.@sinclair/typebox.Static<T, []> */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("Check")(schema.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[/* is @sinclair/typebox.@sinclair/typebox.Static<T, []> */ Boolean]
    /** Returns true if the value matches the given type. */
    inline def Check[T /* <: TSchema */, R /* <: js.Array[TSchema] */](
      schema: T,
      references: /* import warning: importer.ImportType#apply c repeated non-array type: R */ js.Array[R],
      value: Any
    ): /* is @sinclair/typebox.@sinclair/typebox.Static<T, []> */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("Check")(schema.asInstanceOf[js.Any], references.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[/* is @sinclair/typebox.@sinclair/typebox.Static<T, []> */ Boolean]
    
    /** Returns a structural clone of the given value */
    inline def Clone[T](value: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("Clone")(value.asInstanceOf[js.Any]).asInstanceOf[T]
    
    /** Converts any type mismatched values to their target type if a conversion is possible. */
    inline def Convert[T /* <: TSchema */](schema: T, value: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("Convert")(schema.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Any]
    /** Converts any type mismatched values to their target type if a conversion is possible. */
    inline def Convert[T /* <: TSchema */, R /* <: js.Array[TSchema] */](
      schema: T,
      references: /* import warning: importer.ImportType#apply c repeated non-array type: R */ js.Array[R],
      value: Any
    ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("Convert")(schema.asInstanceOf[js.Any], references.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    /** Creates a value from the given type */
    inline def Create[T /* <: TSchema */](schema: T): Static[T, js.Array[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("Create")(schema.asInstanceOf[js.Any]).asInstanceOf[Static[T, js.Array[Any]]]
    /** Creates a value from the given type */
    inline def Create[T /* <: TSchema */, R /* <: js.Array[TSchema] */](
      schema: T,
      references: /* import warning: importer.ImportType#apply c repeated non-array type: R */ js.Array[R]
    ): Static[T, js.Array[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("Create")(schema.asInstanceOf[js.Any], references.asInstanceOf[js.Any])).asInstanceOf[Static[T, js.Array[Any]]]
    
    /** Returns edits to transform the current value into the next value */
    inline def Diff(current: Any, next: Any): js.Array[typings.sinclairTypebox.valueDeltaMod.Edit] = (^.asInstanceOf[js.Dynamic].applyDynamic("Diff")(current.asInstanceOf[js.Any], next.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.sinclairTypebox.valueDeltaMod.Edit]]
    
    /** Returns true if left and right values are structurally equal */
    inline def Equal[T](left: T, right: Any): /* is T */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("Equal")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[/* is T */ Boolean]
    
    /** Returns an iterator for each error in this value. */
    inline def Errors[T /* <: TSchema */](schema: T, value: Any): typings.sinclairTypebox.errorsMod.ValueErrorIterator = (^.asInstanceOf[js.Dynamic].applyDynamic("Errors")(schema.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[typings.sinclairTypebox.errorsMod.ValueErrorIterator]
    /** Returns an iterator for each error in this value. */
    inline def Errors[T /* <: TSchema */, R /* <: js.Array[TSchema] */](
      schema: T,
      references: /* import warning: importer.ImportType#apply c repeated non-array type: R */ js.Array[R],
      value: Any
    ): typings.sinclairTypebox.errorsMod.ValueErrorIterator = (^.asInstanceOf[js.Dynamic].applyDynamic("Errors")(schema.asInstanceOf[js.Any], references.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[typings.sinclairTypebox.errorsMod.ValueErrorIterator]
    
    /** Returns a FNV1A-64 non cryptographic hash of the given value */
    inline def Hash(value: Any): js.BigInt = ^.asInstanceOf[js.Dynamic].applyDynamic("Hash")(value.asInstanceOf[js.Any]).asInstanceOf[js.BigInt]
    
    /** Performs a deep mutable value assignment while retaining internal references. */
    inline def Mutate(current: Mutable, next: Mutable): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Mutate")(current.asInstanceOf[js.Any], next.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** Returns a new value with edits applied to the given value */
    inline def Patch[T](current: Any, edits: js.Array[typings.sinclairTypebox.valueDeltaMod.Edit]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("Patch")(current.asInstanceOf[js.Any], edits.asInstanceOf[js.Any])).asInstanceOf[T]
  }
  
  @JSImport("@sinclair/typebox/value", "ValueErrorIterator")
  @js.native
  open class ValueErrorIterator protected ()
    extends typings.sinclairTypebox.errorsMod.ValueErrorIterator {
    def this(iterator: IterableIterator[ValueError]) = this()
  }
  
  @JSImport("@sinclair/typebox/value", "ValueErrorType")
  @js.native
  object ValueErrorType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.sinclairTypebox.errorsErrorsMod.ValueErrorType & Double] = js.native
    
    /* 0 */ val Array: typings.sinclairTypebox.errorsErrorsMod.ValueErrorType.Array & Double = js.native
    
    /* 2 */ val ArrayMaxItems: typings.sinclairTypebox.errorsErrorsMod.ValueErrorType.ArrayMaxItems & Double = js.native
    
    /* 1 */ val ArrayMinItems: typings.sinclairTypebox.errorsErrorsMod.ValueErrorType.ArrayMinItems & Double = js.native
    
    /* 3 */ val ArrayUniqueItems: typings.sinclairTypebox.errorsErrorsMod.ValueErrorType.ArrayUniqueItems & Double = js.native
    
    /* 4 */ val BigInt: typings.sinclairTypebox.errorsErrorsMod.ValueErrorType.BigInt & Double = js.native
    
    /* 7 */ val BigIntExclusiveMaximum: typings.sinclairTypebox.errorsErrorsMod.ValueErrorType.BigIntExclusiveMaximum & Double = js.native
    
    /* 6 */ val BigIntExclusiveMinimum: typings.sinclairTypebox.errorsErrorsMod.ValueErrorType.BigIntExclusiveMinimum & Double = js.native
    
    /* 9 */ val BigIntMaximum: typings.sinclairTypebox.errorsErrorsMod.ValueErrorType.BigIntMaximum & Double = js.native
    
    /* 8 */ val BigIntMinimum: typings.sinclairTypebox.errorsErrorsMod.ValueErrorType.BigIntMinimum & Double = js.native
    
    /* 5 */ val BigIntMultipleOf: typings.sinclairTypebox.errorsErrorsMod.ValueErrorType.BigIntMultipleOf & Double = js.native
    
    /* 10 */ val Boolean: typings.sinclairTypebox.errorsErrorsMod.ValueErrorType.Boolean & Double = js.native
    
    /* 58 */ val Custom: typings.sinclairTypebox.errorsErrorsMod.ValueErrorType.Custom & Double = js.native
    
    /* 11 */ val Date: typings.sinclairTypebox.errorsErrorsMod.ValueErrorType.Date & Double = js.native
    
    /* 13 */ val DateExclusiveMaximumTimestamp: typings.sinclairTypebox.errorsErrorsMod.ValueErrorType.DateExclusiveMaximumTimestamp & Double = js.native
    
    /* 12 */ val DateExclusiveMinimumTimestamp: typings.sinclairTypebox.errorsErrorsMod.ValueErrorType.DateExclusiveMinimumTimestamp & Double = js.native
    
    /* 15 */ val DateMaximumTimestamp: typings.sinclairTypebox.errorsErrorsMod.ValueErrorType.DateMaximumTimestamp & Double = js.native
    
    /* 14 */ val DateMinimumTimestamp: typings.sinclairTypebox.errorsErrorsMod.ValueErrorType.DateMinimumTimestamp & Double = js.native
    
    /* 16 */ val Function: typings.sinclairTypebox.errorsErrorsMod.ValueErrorType.Function & Double = js.native
    
    /* 17 */ val Integer: typings.sinclairTypebox.errorsErrorsMod.ValueErrorType.Integer & Double = js.native
    
    /* 20 */ val IntegerExclusiveMaximum: typings.sinclairTypebox.errorsErrorsMod.ValueErrorType.IntegerExclusiveMaximum & Double = js.native
    
    /* 19 */ val IntegerExclusiveMinimum: typings.sinclairTypebox.errorsErrorsMod.ValueErrorType.IntegerExclusiveMinimum & Double = js.native
    
    /* 22 */ val IntegerMaximum: typings.sinclairTypebox.errorsErrorsMod.ValueErrorType.IntegerMaximum & Double = js.native
    
    /* 21 */ val IntegerMinimum: typings.sinclairTypebox.errorsErrorsMod.ValueErrorType.IntegerMinimum & Double = js.native
    
    /* 18 */ val IntegerMultipleOf: typings.sinclairTypebox.errorsErrorsMod.ValueErrorType.IntegerMultipleOf & Double = js.native
    
    /* 23 */ val Intersect: typings.sinclairTypebox.errorsErrorsMod.ValueErrorType.Intersect & Double = js.native
    
    /* 24 */ val IntersectUnevaluatedProperties: typings.sinclairTypebox.errorsErrorsMod.ValueErrorType.IntersectUnevaluatedProperties & Double = js.native
    
    /* 25 */ val Literal: typings.sinclairTypebox.errorsErrorsMod.ValueErrorType.Literal & Double = js.native
    
    /* 26 */ val Never: typings.sinclairTypebox.errorsErrorsMod.ValueErrorType.Never & Double = js.native
    
    /* 27 */ val Not: typings.sinclairTypebox.errorsErrorsMod.ValueErrorType.Not & Double = js.native
    
    /* 28 */ val Null: typings.sinclairTypebox.errorsErrorsMod.ValueErrorType.Null & Double = js.native
    
    /* 29 */ val Number: typings.sinclairTypebox.errorsErrorsMod.ValueErrorType.Number & Double = js.native
    
    /* 32 */ val NumberExclusiveMaximum: typings.sinclairTypebox.errorsErrorsMod.ValueErrorType.NumberExclusiveMaximum & Double = js.native
    
    /* 31 */ val NumberExclusiveMinimum: typings.sinclairTypebox.errorsErrorsMod.ValueErrorType.NumberExclusiveMinimum & Double = js.native
    
    /* 34 */ val NumberMaximum: typings.sinclairTypebox.errorsErrorsMod.ValueErrorType.NumberMaximum & Double = js.native
    
    /* 33 */ val NumberMinumum: typings.sinclairTypebox.errorsErrorsMod.ValueErrorType.NumberMinumum & Double = js.native
    
    /* 30 */ val NumberMultipleOf: typings.sinclairTypebox.errorsErrorsMod.ValueErrorType.NumberMultipleOf & Double = js.native
    
    /* 35 */ val Object: typings.sinclairTypebox.errorsErrorsMod.ValueErrorType.Object & Double = js.native
    
    /* 38 */ val ObjectAdditionalProperties: typings.sinclairTypebox.errorsErrorsMod.ValueErrorType.ObjectAdditionalProperties & Double = js.native
    
    /* 37 */ val ObjectMaxProperties: typings.sinclairTypebox.errorsErrorsMod.ValueErrorType.ObjectMaxProperties & Double = js.native
    
    /* 36 */ val ObjectMinProperties: typings.sinclairTypebox.errorsErrorsMod.ValueErrorType.ObjectMinProperties & Double = js.native
    
    /* 39 */ val ObjectRequiredProperties: typings.sinclairTypebox.errorsErrorsMod.ValueErrorType.ObjectRequiredProperties & Double = js.native
    
    /* 40 */ val Promise: typings.sinclairTypebox.errorsErrorsMod.ValueErrorType.Promise & Double = js.native
    
    /* 41 */ val RecordKeyNumeric: typings.sinclairTypebox.errorsErrorsMod.ValueErrorType.RecordKeyNumeric & Double = js.native
    
    /* 42 */ val RecordKeyString: typings.sinclairTypebox.errorsErrorsMod.ValueErrorType.RecordKeyString & Double = js.native
    
    /* 43 */ val String: typings.sinclairTypebox.errorsErrorsMod.ValueErrorType.String & Double = js.native
    
    /* 48 */ val StringFormat: typings.sinclairTypebox.errorsErrorsMod.ValueErrorType.StringFormat & Double = js.native
    
    /* 47 */ val StringFormatUnknown: typings.sinclairTypebox.errorsErrorsMod.ValueErrorType.StringFormatUnknown & Double = js.native
    
    /* 45 */ val StringMaxLength: typings.sinclairTypebox.errorsErrorsMod.ValueErrorType.StringMaxLength & Double = js.native
    
    /* 44 */ val StringMinLength: typings.sinclairTypebox.errorsErrorsMod.ValueErrorType.StringMinLength & Double = js.native
    
    /* 46 */ val StringPattern: typings.sinclairTypebox.errorsErrorsMod.ValueErrorType.StringPattern & Double = js.native
    
    /* 49 */ val Symbol: typings.sinclairTypebox.errorsErrorsMod.ValueErrorType.Symbol & Double = js.native
    
    /* 51 */ val TupleLength: typings.sinclairTypebox.errorsErrorsMod.ValueErrorType.TupleLength & Double = js.native
    
    /* 50 */ val TupleZeroLength: typings.sinclairTypebox.errorsErrorsMod.ValueErrorType.TupleZeroLength & Double = js.native
    
    /* 54 */ val Uint8Array: typings.sinclairTypebox.errorsErrorsMod.ValueErrorType.Uint8Array & Double = js.native
    
    /* 56 */ val Uint8ArrayMaxByteLength: typings.sinclairTypebox.errorsErrorsMod.ValueErrorType.Uint8ArrayMaxByteLength & Double = js.native
    
    /* 55 */ val Uint8ArrayMinByteLength: typings.sinclairTypebox.errorsErrorsMod.ValueErrorType.Uint8ArrayMinByteLength & Double = js.native
    
    /* 52 */ val Undefined: typings.sinclairTypebox.errorsErrorsMod.ValueErrorType.Undefined & Double = js.native
    
    /* 53 */ val Union: typings.sinclairTypebox.errorsErrorsMod.ValueErrorType.Union & Double = js.native
    
    /* 57 */ val Void: typings.sinclairTypebox.errorsErrorsMod.ValueErrorType.Void & Double = js.native
  }
  
  object ValueHash {
    
    @JSImport("@sinclair/typebox/value", "ValueHash")
    @js.native
    val ^ : js.Any = js.native
    
    /** Creates a FNV1A-64 non cryptographic hash of the given value */
    inline def Create(value: Any): js.BigInt = ^.asInstanceOf[js.Dynamic].applyDynamic("Create")(value.asInstanceOf[js.Any]).asInstanceOf[js.BigInt]
  }
  
  object ValuePointer {
    
    @JSImport("@sinclair/typebox/value", "ValuePointer")
    @js.native
    val ^ : js.Any = js.native
    
    /** Deletes a value at the given pointer */
    inline def Delete(value: Any, pointer: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Delete")(value.asInstanceOf[js.Any], pointer.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** Formats the given pointer into navigable key components */
    inline def Format(pointer: String): IterableIterator[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("Format")(pointer.asInstanceOf[js.Any]).asInstanceOf[IterableIterator[String]]
    
    /** Gets the value at the given pointer */
    inline def Get(value: Any, pointer: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("Get")(value.asInstanceOf[js.Any], pointer.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    /** Returns true if a value exists at the given pointer */
    inline def Has(value: Any, pointer: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("Has")(value.asInstanceOf[js.Any], pointer.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /** Sets the value at the given pointer. If the value at the pointer does not exist it is created */
    inline def Set(value: Any, pointer: String, update: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Set")(value.asInstanceOf[js.Any], pointer.asInstanceOf[js.Any], update.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  @JSImport("@sinclair/typebox/value", "ValuePointerRootDeleteError")
  @js.native
  open class ValuePointerRootDeleteError protected ()
    extends typings.sinclairTypebox.valuePointerMod.ValuePointerRootDeleteError {
    def this(value: Any, path: String) = this()
  }
  
  @JSImport("@sinclair/typebox/value", "ValuePointerRootSetError")
  @js.native
  open class ValuePointerRootSetError protected ()
    extends typings.sinclairTypebox.valuePointerMod.ValuePointerRootSetError {
    def this(value: Any, path: String, update: Any) = this()
  }
}
