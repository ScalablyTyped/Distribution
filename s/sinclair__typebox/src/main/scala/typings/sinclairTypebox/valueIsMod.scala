package typings.sinclairTypebox

import typings.std.BigInt64Array
import typings.std.BigUint64Array
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object valueIsMod {
  
  object Is {
    
    @JSImport("@sinclair/typebox/value/is", "Is")
    @js.native
    val ^ : js.Any = js.native
    
    inline def Array(value: Any): /* is @sinclair/typebox.@sinclair/typebox/value/is.ArrayType */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("Array")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @sinclair/typebox.@sinclair/typebox/value/is.ArrayType */ Boolean]
    
    inline def Date(value: Any): /* is std.Date */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("Date")(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.Date */ Boolean]
    
    inline def Object(value: Any): /* is @sinclair/typebox.@sinclair/typebox/value/is.ObjectType */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("Object")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @sinclair/typebox.@sinclair/typebox/value/is.ObjectType */ Boolean]
    
    inline def TypedArray(value: Any): /* is @sinclair/typebox.@sinclair/typebox/value/is.TypedArrayType */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("TypedArray")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @sinclair/typebox.@sinclair/typebox/value/is.TypedArrayType */ Boolean]
    
    inline def Value(value: Any): /* is @sinclair/typebox.@sinclair/typebox/value/is.ValueType */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("Value")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @sinclair/typebox.@sinclair/typebox/value/is.ValueType */ Boolean]
  }
  
  type ArrayType = js.Array[Any]
  
  type ObjectType = Record[String | Double | js.Symbol, Any]
  
  type TypedArrayType = js.typedarray.Int8Array | js.typedarray.Uint8Array | js.typedarray.Uint8ClampedArray | js.typedarray.Int16Array | js.typedarray.Uint16Array | js.typedarray.Int32Array | js.typedarray.Uint32Array | js.typedarray.Float32Array | js.typedarray.Float64Array | BigInt64Array | BigUint64Array
  
  type ValueType = js.UndefOr[Null | js.Function | js.Symbol | js.BigInt | Double | Boolean | String]
}
