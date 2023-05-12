package typings.staticKdtree

import typings.ndarray.mod.Data
import typings.ndarray.mod.NdArray
import typings.staticKdtree.mod.ISerialized
import typings.staticKdtree.mod.TupleOf
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait D
    extends StObject
       with ISerialized[Any] {
    
    var d: Double
  }
  object D {
    
    inline def apply(d: Double): D = {
      val __obj = js.Dynamic.literal(d = d.asInstanceOf[js.Any])
      __obj.asInstanceOf[D]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: D] (val x: Self) extends AnyVal {
      
      inline def setD(value: Double): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FnCall extends StObject {
    
    def apply[D /* <: Data[Any] */](data: D): NdArray[D] = js.native
    def apply[D /* <: Data[Any] */](data: D, shape: js.Array[Double]): NdArray[D] = js.native
    def apply[D /* <: Data[Any] */](data: D, shape: js.Array[Double], stride: js.Array[Double]): NdArray[D] = js.native
    def apply[D /* <: Data[Any] */](data: D, shape: js.Array[Double], stride: js.Array[Double], offset: Double): NdArray[D] = js.native
    def apply[D /* <: Data[Any] */](data: D, shape: js.Array[Double], stride: Unit, offset: Double): NdArray[D] = js.native
    def apply[D /* <: Data[Any] */](data: D, shape: Unit, stride: js.Array[Double]): NdArray[D] = js.native
    def apply[D /* <: Data[Any] */](data: D, shape: Unit, stride: js.Array[Double], offset: Double): NdArray[D] = js.native
    def apply[D /* <: Data[Any] */](data: D, shape: Unit, stride: Unit, offset: Double): NdArray[D] = js.native
  }
  
  trait I[D /* <: Double */]
    extends StObject
       with ISerialized[D] {
    
    var i: js.Array[Double]
    
    var p: js.Array[TupleOf[Double, D]]
  }
  object I {
    
    inline def apply[D /* <: Double */](i: js.Array[Double], p: js.Array[TupleOf[Double, D]]): I[D] = {
      val __obj = js.Dynamic.literal(i = i.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any])
      __obj.asInstanceOf[I[D]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: I[?], D /* <: Double */] (val x: Self & I[D]) extends AnyVal {
      
      inline def setI(value: js.Array[Double]): Self = StObject.set(x, "i", value.asInstanceOf[js.Any])
      
      inline def setIVarargs(value: Double*): Self = StObject.set(x, "i", js.Array(value*))
      
      inline def setP(value: js.Array[TupleOf[Double, D]]): Self = StObject.set(x, "p", value.asInstanceOf[js.Any])
      
      inline def setPVarargs(value: (TupleOf[Double, D])*): Self = StObject.set(x, "p", js.Array(value*))
    }
  }
}
