package typings.rxLite

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.NumberDictionary
import typings.rxCore.Rx.IDisposable
import typings.rxCore.Rx.IPromise
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Dictindex[?], T] (val x: Self & Dictindex[T]) extends AnyVal {
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GetDisposable] (val x: Self) extends AnyVal {
      
      inline def setGetDisposable(value: () => IDisposable): Self = StObject.set(x, "getDisposable", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait Instantiable[T, TPromise /* <: IPromise[T] */]
    extends StObject
       with Instantiable1[
          /* resolver */ js.Function2[
            /* resolvePromise */ js.Function1[/* value */ T, Unit], 
            /* rejectPromise */ js.Function1[/* reason */ Any, Unit], 
            Unit
          ], 
          TPromise
        ]
  
  @js.native
  trait InstantiableIPromise[T]
    extends StObject
       with Instantiable1[
          /* resolver */ js.Function2[
            /* resolvePromise */ js.Function1[/* value */ T, Unit], 
            /* rejectPromise */ js.Function1[/* reason */ Any, Unit], 
            Unit
          ], 
          IPromise[T]
        ]
}
