package typings.rx

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.NumberDictionary
import typings.rx.Rx.IDisposable
import typings.rx.Rx.IPromise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Dictindex[T] extends /* index */ NumberDictionary[T] {
    
    var length: Double = js.native
  }
  object Dictindex {
    
    @scala.inline
    def apply[T](length: Double): Dictindex[T] = {
      val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dictindex[T]]
    }
    
    @scala.inline
    implicit class DictindexMutableBuilder[Self <: Dictindex[_], T] (val x: Self with Dictindex[T]) extends AnyVal {
      
      @scala.inline
      def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GetDisposable extends StObject {
    
    def getDisposable(): IDisposable = js.native
  }
  object GetDisposable {
    
    @scala.inline
    def apply(getDisposable: () => IDisposable): GetDisposable = {
      val __obj = js.Dynamic.literal(getDisposable = js.Any.fromFunction0(getDisposable))
      __obj.asInstanceOf[GetDisposable]
    }
    
    @scala.inline
    implicit class GetDisposableMutableBuilder[Self <: GetDisposable] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetDisposable(value: () => IDisposable): Self = StObject.set(x, "getDisposable", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait Instantiable[T]
    extends Instantiable1[
          /* resolver */ js.Function2[
            /* resolvePromise */ js.Function1[/* value */ T, Unit], 
            /* rejectPromise */ js.Function1[/* reason */ js.Any, Unit], 
            Unit
          ], 
          IPromise[T]
        ]
  
  @js.native
  trait InstantiableTPromise[T, TPromise /* <: IPromise[T] */]
    extends Instantiable1[
          /* resolver */ js.Function2[
            /* resolvePromise */ js.Function1[/* value */ T, Unit], 
            /* rejectPromise */ js.Function1[/* reason */ js.Any, Unit], 
            Unit
          ], 
          TPromise
        ]
  
  @js.native
  trait Off extends StObject {
    
    def off(name: String, cb: js.Function1[/* e */ js.Any, _]): Unit = js.native
    
    def on(name: String, cb: js.Function1[/* e */ js.Any, _]): Unit = js.native
  }
  object Off {
    
    @scala.inline
    def apply(
      off: (String, js.Function1[/* e */ js.Any, _]) => Unit,
      on: (String, js.Function1[/* e */ js.Any, _]) => Unit
    ): Off = {
      val __obj = js.Dynamic.literal(off = js.Any.fromFunction2(off), on = js.Any.fromFunction2(on))
      __obj.asInstanceOf[Off]
    }
    
    @scala.inline
    implicit class OffMutableBuilder[Self <: Off] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOff(value: (String, js.Function1[/* e */ js.Any, _]) => Unit): Self = StObject.set(x, "off", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOn(value: (String, js.Function1[/* e */ js.Any, _]) => Unit): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
    }
  }
}
