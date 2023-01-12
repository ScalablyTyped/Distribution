package typings.sindresorhusIs

import org.scalablytyped.runtime.Instantiable1
import typings.std.BigInt64Array
import typings.std.BigUint64Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesMod {
  
  type Class[T, Arguments /* <: js.Array[Any] */] = Instantiable1[/* arguments_ */ Arguments, T]
  
  /* Rewritten from type alias, can be one of: 
    - typings.sindresorhusIs.sindresorhusIsBooleans.`false`
    - typings.sindresorhusIs.sindresorhusIsInts.`0`
    - typings.sindresorhusIs.sindresorhusIsStrings._empty
    - scala.Null
    - scala.Unit
  */
  type Falsy = js.UndefOr[_Falsy | Null]
  
  @js.native
  trait ObservableLike extends StObject {
    
    def subscribe(observer: js.Function1[/* value */ Any, Unit]): Unit = js.native
  }
  
  type Primitive = js.UndefOr[Null | String | Double | Boolean | js.Symbol | js.BigInt]
  
  type TypedArray = js.typedarray.Int8Array | js.typedarray.Uint8Array | js.typedarray.Uint8ClampedArray | js.typedarray.Int16Array | js.typedarray.Uint16Array | js.typedarray.Int32Array | js.typedarray.Uint32Array | js.typedarray.Float32Array | js.typedarray.Float64Array | BigInt64Array | BigUint64Array
  
  @js.native
  trait WeakRef[T /* <: js.Object */] extends StObject {
    
    def deref(): js.UndefOr[T] = js.native
    
    @JSName(js.Symbol.toStringTag)
    val toStringTag: typings.sindresorhusIs.sindresorhusIsStrings.WeakRef = js.native
  }
  
  trait _Falsy extends StObject
  
  object global {
    
    trait SymbolConstructor extends StObject {
      
      val observable: js.Symbol
    }
    object SymbolConstructor {
      
      inline def apply(observable: js.Symbol): SymbolConstructor = {
        val __obj = js.Dynamic.literal(observable = observable.asInstanceOf[js.Any])
        __obj.asInstanceOf[SymbolConstructor]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: SymbolConstructor] (val x: Self) extends AnyVal {
        
        inline def setObservable(value: js.Symbol): Self = StObject.set(x, "observable", value.asInstanceOf[js.Any])
      }
    }
  }
}
