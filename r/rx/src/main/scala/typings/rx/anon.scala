package typings.rx

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.NumberDictionary
import typings.rx.Rx.IDisposable
import typings.rx.Rx.IPromise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Dictindex[T]
    extends StObject
       with /* index */ NumberDictionary[T] {
    
    var length: Double
  }
  object Dictindex {
    
    inline def apply[T](length: Double): Dictindex[T] = {
      val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dictindex[T]]
    }
    
    extension [Self <: Dictindex[?], T](x: Self & Dictindex[T]) {
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    }
  }
  
  trait GetDisposable extends StObject {
    
    def getDisposable(): IDisposable
  }
  object GetDisposable {
    
    inline def apply(getDisposable: () => IDisposable): GetDisposable = {
      val __obj = js.Dynamic.literal(getDisposable = js.Any.fromFunction0(getDisposable))
      __obj.asInstanceOf[GetDisposable]
    }
    
    extension [Self <: GetDisposable](x: Self) {
      
      inline def setGetDisposable(value: () => IDisposable): Self = StObject.set(x, "getDisposable", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait Instantiable[T]
    extends StObject
       with Instantiable1[
          /* resolver */ js.Function2[
            /* resolvePromise */ js.Function1[/* value */ T, Unit], 
            /* rejectPromise */ js.Function1[/* reason */ js.Any, Unit], 
            Unit
          ], 
          IPromise[T]
        ]
  
  @js.native
  trait InstantiableTPromise[T, TPromise /* <: IPromise[T] */]
    extends StObject
       with Instantiable1[
          /* resolver */ js.Function2[
            /* resolvePromise */ js.Function1[/* value */ T, Unit], 
            /* rejectPromise */ js.Function1[/* reason */ js.Any, Unit], 
            Unit
          ], 
          TPromise
        ]
  
  trait Off extends StObject {
    
    def off(name: String, cb: js.Function1[/* e */ js.Any, js.Any]): Unit
    
    def on(name: String, cb: js.Function1[/* e */ js.Any, js.Any]): Unit
  }
  object Off {
    
    inline def apply(
      off: (String, js.Function1[/* e */ js.Any, js.Any]) => Unit,
      on: (String, js.Function1[/* e */ js.Any, js.Any]) => Unit
    ): Off = {
      val __obj = js.Dynamic.literal(off = js.Any.fromFunction2(off), on = js.Any.fromFunction2(on))
      __obj.asInstanceOf[Off]
    }
    
    extension [Self <: Off](x: Self) {
      
      inline def setOff(value: (String, js.Function1[/* e */ js.Any, js.Any]) => Unit): Self = StObject.set(x, "off", js.Any.fromFunction2(value))
      
      inline def setOn(value: (String, js.Function1[/* e */ js.Any, js.Any]) => Unit): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
    }
  }
}
