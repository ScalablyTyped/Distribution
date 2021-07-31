package typings.saywhen

import typings.jasmine.jasmine.Spy
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply[T /* <: Func */](spy: T & Spy[typings.jasmine.jasmine.Func]): CallHandler[T] = ^.asInstanceOf[js.Dynamic].apply(spy.asInstanceOf[js.Any]).asInstanceOf[CallHandler[T]]
  
  @JSImport("saywhen", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def captor[T](): MatcherProxy[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("captor")().asInstanceOf[MatcherProxy[T]]
  @scala.inline
  def captor[T](`val`: T): MatcherProxy[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("captor")(`val`.asInstanceOf[js.Any]).asInstanceOf[MatcherProxy[T]]
  
  @scala.inline
  def is[T](`val`: T): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(`val`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def noConflict(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("noConflict")().asInstanceOf[Unit]
  
  trait CallHandler[T /* <: Func */] extends StObject {
    
    val isCalled: Proxy[T]
    
    def isCalledWith(args: js.Any*): Proxy[T]
  }
  object CallHandler {
    
    @scala.inline
    def apply[T /* <: Func */](isCalled: Proxy[T], isCalledWith: /* repeated */ js.Any => Proxy[T]): CallHandler[T] = {
      val __obj = js.Dynamic.literal(isCalled = isCalled.asInstanceOf[js.Any], isCalledWith = js.Any.fromFunction1(isCalledWith))
      __obj.asInstanceOf[CallHandler[T]]
    }
    
    @scala.inline
    implicit class CallHandlerMutableBuilder[Self <: CallHandler[?], T /* <: Func */] (val x: Self & CallHandler[T]) extends AnyVal {
      
      @scala.inline
      def setIsCalled(value: Proxy[T]): Self = StObject.set(x, "isCalled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsCalledWith(value: /* repeated */ js.Any => Proxy[T]): Self = StObject.set(x, "isCalledWith", js.Any.fromFunction1(value))
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
    
    @scala.inline
    def apply[T /* <: Func */](`then`: T => Proxy[T], thenReturn: js.Any => Proxy[T], thenThrow: Error => Proxy[T]): Proxy[T] = {
      val __obj = js.Dynamic.literal(thenReturn = js.Any.fromFunction1(thenReturn), thenThrow = js.Any.fromFunction1(thenThrow))
      __obj.updateDynamic("then")(js.Any.fromFunction1(`then`))
      __obj.asInstanceOf[Proxy[T]]
    }
    
    @scala.inline
    implicit class ProxyMutableBuilder[Self <: Proxy[?], T /* <: Func */] (val x: Self & Proxy[T]) extends AnyVal {
      
      @scala.inline
      def setThen(value: T => Proxy[T]): Self = StObject.set(x, "then", js.Any.fromFunction1(value))
      
      @scala.inline
      def setThenReturn(value: js.Any => Proxy[T]): Self = StObject.set(x, "thenReturn", js.Any.fromFunction1(value))
      
      @scala.inline
      def setThenThrow(value: Error => Proxy[T]): Self = StObject.set(x, "thenThrow", js.Any.fromFunction1(value))
    }
  }
}
