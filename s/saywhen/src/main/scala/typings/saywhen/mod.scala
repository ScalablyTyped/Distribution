package typings.saywhen

import typings.jasmine.jasmine.Spy
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply[T /* <: Func */](spy: T & Spy[typings.jasmine.jasmine.Func]): CallHandler[T] = ^.asInstanceOf[js.Dynamic].apply(spy.asInstanceOf[js.Any]).asInstanceOf[CallHandler[T]]
  
  @JSImport("saywhen", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def captor[T](): MatcherProxy[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("captor")().asInstanceOf[MatcherProxy[T]]
  inline def captor[T](`val`: T): MatcherProxy[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("captor")(`val`.asInstanceOf[js.Any]).asInstanceOf[MatcherProxy[T]]
  
  inline def is[T](`val`: T): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(`val`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def noConflict(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("noConflict")().asInstanceOf[Unit]
  
  trait CallHandler[T /* <: Func */] extends StObject {
    
    val isCalled: Proxy[T]
    
    def isCalledWith(args: js.Any*): Proxy[T]
  }
  object CallHandler {
    
    inline def apply[T /* <: Func */](isCalled: Proxy[T], isCalledWith: /* repeated */ js.Any => Proxy[T]): CallHandler[T] = {
      val __obj = js.Dynamic.literal(isCalled = isCalled.asInstanceOf[js.Any], isCalledWith = js.Any.fromFunction1(isCalledWith))
      __obj.asInstanceOf[CallHandler[T]]
    }
    
    extension [Self <: CallHandler[?], T /* <: Func */](x: Self & CallHandler[T]) {
      
      inline def setIsCalled(value: Proxy[T]): Self = StObject.set(x, "isCalled", value.asInstanceOf[js.Any])
      
      inline def setIsCalledWith(value: /* repeated */ js.Any => Proxy[T]): Self = StObject.set(x, "isCalledWith", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait Func extends StObject {
    
    def apply(args: js.Any*): js.Any = js.native
  }
  
  @js.native
  trait MatcherProxy[T] extends StObject {
    
    def apply(arg: T): Boolean = js.native
    
    val latest: T = js.native
    
    def values(): js.Array[T] = js.native
  }
  
  trait Proxy[T /* <: Func */] extends StObject {
    
    def `then`(fn: T): Proxy[T]
    
    def thenReturn(`val`: js.Any): Proxy[T]
    
    def thenThrow(err: Error): Proxy[T]
  }
  object Proxy {
    
    inline def apply[T /* <: Func */](`then`: T => Proxy[T], thenReturn: js.Any => Proxy[T], thenThrow: Error => Proxy[T]): Proxy[T] = {
      val __obj = js.Dynamic.literal(thenReturn = js.Any.fromFunction1(thenReturn), thenThrow = js.Any.fromFunction1(thenThrow))
      __obj.updateDynamic("then")(js.Any.fromFunction1(`then`))
      __obj.asInstanceOf[Proxy[T]]
    }
    
    extension [Self <: Proxy[?], T /* <: Func */](x: Self & Proxy[T]) {
      
      inline def setThen(value: T => Proxy[T]): Self = StObject.set(x, "then", js.Any.fromFunction1(value))
      
      inline def setThenReturn(value: js.Any => Proxy[T]): Self = StObject.set(x, "thenReturn", js.Any.fromFunction1(value))
      
      inline def setThenThrow(value: Error => Proxy[T]): Self = StObject.set(x, "thenThrow", js.Any.fromFunction1(value))
    }
  }
}
