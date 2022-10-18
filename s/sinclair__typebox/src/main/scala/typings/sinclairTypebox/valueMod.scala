package typings.sinclairTypebox

import typings.sinclairTypebox.errorsErrorsMod.ValueError
import typings.sinclairTypebox.mod.Static
import typings.sinclairTypebox.mod.TSchema
import typings.sinclairTypebox.valueDeltaMod.Edit
import typings.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object valueMod {
  
  object Value {
    
    @JSImport("@sinclair/typebox/value", "Value")
    @js.native
    val ^ : js.Any = js.native
    
    /** Casts a value into a given type. The return value will retain as much information of the original value as possible. Cast will convert string, number and boolean values if a reasonable conversion is possible. */
    inline def Cast[T /* <: TSchema */](schema: T, value: Any): Static[T, js.Array[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("Cast")(schema.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Static[T, js.Array[Any]]]
    /** Casts a value into a given type. The return value will retain as much information of the original value as possible. Cast will convert string, number and boolean values if a reasonable conversion is possible. */
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
    
    /** Creates a value from the given type */
    inline def Create[T /* <: TSchema */](schema: T): Static[T, js.Array[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("Create")(schema.asInstanceOf[js.Any]).asInstanceOf[Static[T, js.Array[Any]]]
    /** Creates a value from the given type */
    inline def Create[T /* <: TSchema */, R /* <: js.Array[TSchema] */](
      schema: T,
      references: /* import warning: importer.ImportType#apply c repeated non-array type: R */ js.Array[R]
    ): Static[T, js.Array[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("Create")(schema.asInstanceOf[js.Any], references.asInstanceOf[js.Any])).asInstanceOf[Static[T, js.Array[Any]]]
    
    /** Returns edits to transform the current value into the next value */
    inline def Diff[T](current: T, next: T): js.Array[Edit[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("Diff")(current.asInstanceOf[js.Any], next.asInstanceOf[js.Any])).asInstanceOf[js.Array[Edit[T]]]
    
    /** Returns true if left and right values are structurally equal */
    inline def Equal[T](left: T, right: Any): /* is T */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("Equal")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[/* is T */ Boolean]
    
    /** Returns an iterator for each error in this value. */
    inline def Errors[T /* <: TSchema */](schema: T, value: Any): IterableIterator[ValueError] = (^.asInstanceOf[js.Dynamic].applyDynamic("Errors")(schema.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[IterableIterator[ValueError]]
    /** Returns an iterator for each error in this value. */
    inline def Errors[T /* <: TSchema */, R /* <: js.Array[TSchema] */](
      schema: T,
      references: /* import warning: importer.ImportType#apply c repeated non-array type: R */ js.Array[R],
      value: Any
    ): IterableIterator[ValueError] = (^.asInstanceOf[js.Dynamic].applyDynamic("Errors")(schema.asInstanceOf[js.Any], references.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[IterableIterator[ValueError]]
    
    /** Returns a new value with edits applied to the given value */
    inline def Patch[T](current: T, edits: js.Array[Edit[T]]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("Patch")(current.asInstanceOf[js.Any], edits.asInstanceOf[js.Any])).asInstanceOf[T]
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
    
    /* 4 */ val Boolean: typings.sinclairTypebox.errorsErrorsMod.ValueErrorType.Boolean & Double = js.native
    
    /* 5 */ val Function: typings.sinclairTypebox.errorsErrorsMod.ValueErrorType.Function & Double = js.native
    
    /* 6 */ val Integer: typings.sinclairTypebox.errorsErrorsMod.ValueErrorType.Integer & Double = js.native
    
    /* 9 */ val IntegerExclusiveMaximum: typings.sinclairTypebox.errorsErrorsMod.ValueErrorType.IntegerExclusiveMaximum & Double = js.native
    
    /* 8 */ val IntegerExclusiveMinimum: typings.sinclairTypebox.errorsErrorsMod.ValueErrorType.IntegerExclusiveMinimum & Double = js.native
    
    /* 11 */ val IntegerMaximum: typings.sinclairTypebox.errorsErrorsMod.ValueErrorType.IntegerMaximum & Double = js.native
    
    /* 10 */ val IntegerMinimum: typings.sinclairTypebox.errorsErrorsMod.ValueErrorType.IntegerMinimum & Double = js.native
    
    /* 7 */ val IntegerMultipleOf: typings.sinclairTypebox.errorsErrorsMod.ValueErrorType.IntegerMultipleOf & Double = js.native
    
    /* 12 */ val Literal: typings.sinclairTypebox.errorsErrorsMod.ValueErrorType.Literal & Double = js.native
    
    /* 13 */ val Never: typings.sinclairTypebox.errorsErrorsMod.ValueErrorType.Never & Double = js.native
    
    /* 14 */ val Null: typings.sinclairTypebox.errorsErrorsMod.ValueErrorType.Null & Double = js.native
    
    /* 15 */ val Number: typings.sinclairTypebox.errorsErrorsMod.ValueErrorType.Number & Double = js.native
    
    /* 18 */ val NumberExclusiveMaximum: typings.sinclairTypebox.errorsErrorsMod.ValueErrorType.NumberExclusiveMaximum & Double = js.native
    
    /* 17 */ val NumberExclusiveMinimum: typings.sinclairTypebox.errorsErrorsMod.ValueErrorType.NumberExclusiveMinimum & Double = js.native
    
    /* 20 */ val NumberMaximum: typings.sinclairTypebox.errorsErrorsMod.ValueErrorType.NumberMaximum & Double = js.native
    
    /* 19 */ val NumberMinumum: typings.sinclairTypebox.errorsErrorsMod.ValueErrorType.NumberMinumum & Double = js.native
    
    /* 16 */ val NumberMultipleOf: typings.sinclairTypebox.errorsErrorsMod.ValueErrorType.NumberMultipleOf & Double = js.native
    
    /* 21 */ val Object: typings.sinclairTypebox.errorsErrorsMod.ValueErrorType.Object & Double = js.native
    
    /* 24 */ val ObjectAdditionalProperties: typings.sinclairTypebox.errorsErrorsMod.ValueErrorType.ObjectAdditionalProperties & Double = js.native
    
    /* 23 */ val ObjectMaxProperties: typings.sinclairTypebox.errorsErrorsMod.ValueErrorType.ObjectMaxProperties & Double = js.native
    
    /* 22 */ val ObjectMinProperties: typings.sinclairTypebox.errorsErrorsMod.ValueErrorType.ObjectMinProperties & Double = js.native
    
    /* 25 */ val Promise: typings.sinclairTypebox.errorsErrorsMod.ValueErrorType.Promise & Double = js.native
    
    /* 26 */ val RecordKeyNumeric: typings.sinclairTypebox.errorsErrorsMod.ValueErrorType.RecordKeyNumeric & Double = js.native
    
    /* 27 */ val RecordKeyString: typings.sinclairTypebox.errorsErrorsMod.ValueErrorType.RecordKeyString & Double = js.native
    
    /* 28 */ val String: typings.sinclairTypebox.errorsErrorsMod.ValueErrorType.String & Double = js.native
    
    /* 33 */ val StringFormat: typings.sinclairTypebox.errorsErrorsMod.ValueErrorType.StringFormat & Double = js.native
    
    /* 32 */ val StringFormatUnknown: typings.sinclairTypebox.errorsErrorsMod.ValueErrorType.StringFormatUnknown & Double = js.native
    
    /* 30 */ val StringMaxLength: typings.sinclairTypebox.errorsErrorsMod.ValueErrorType.StringMaxLength & Double = js.native
    
    /* 29 */ val StringMinLength: typings.sinclairTypebox.errorsErrorsMod.ValueErrorType.StringMinLength & Double = js.native
    
    /* 31 */ val StringPattern: typings.sinclairTypebox.errorsErrorsMod.ValueErrorType.StringPattern & Double = js.native
    
    /* 35 */ val TupleLength: typings.sinclairTypebox.errorsErrorsMod.ValueErrorType.TupleLength & Double = js.native
    
    /* 34 */ val TupleZeroLength: typings.sinclairTypebox.errorsErrorsMod.ValueErrorType.TupleZeroLength & Double = js.native
    
    /* 38 */ val Uint8Array: typings.sinclairTypebox.errorsErrorsMod.ValueErrorType.Uint8Array & Double = js.native
    
    /* 40 */ val Uint8ArrayMaxByteLength: typings.sinclairTypebox.errorsErrorsMod.ValueErrorType.Uint8ArrayMaxByteLength & Double = js.native
    
    /* 39 */ val Uint8ArrayMinByteLength: typings.sinclairTypebox.errorsErrorsMod.ValueErrorType.Uint8ArrayMinByteLength & Double = js.native
    
    /* 36 */ val Undefined: typings.sinclairTypebox.errorsErrorsMod.ValueErrorType.Undefined & Double = js.native
    
    /* 37 */ val Union: typings.sinclairTypebox.errorsErrorsMod.ValueErrorType.Union & Double = js.native
    
    /* 41 */ val Void: typings.sinclairTypebox.errorsErrorsMod.ValueErrorType.Void & Double = js.native
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
